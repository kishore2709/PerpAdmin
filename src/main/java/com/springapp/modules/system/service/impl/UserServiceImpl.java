package com.springapp.modules.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.exception.EntityExistException;
import com.springapp.exception.EntityNotFoundException;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.system.domain.perp.Users;
import com.springapp.modules.system.service.UserService;
import com.springapp.modules.system.service.dto.UserDTO;
import com.springapp.modules.system.service.mapper.UserMapper;
import com.springapp.utils.ValidationUtil;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

   //@Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO findById(int id) {
        Optional<Users> user = userRepository.findById(id);
        ValidationUtil.isNull(user,"User","id",id);
        return userMapper.toDto(user.get());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserDTO create(Users resources) {

        if(userRepository.findByUsername(resources.getUsername())!=null){
            throw new EntityExistException(Users.class,"username",resources.getUsername());
        }
/*
        if(userRepository.findByEmail(resources.getEmail())!=null){
            throw new EntityExistException(Users.class,"email",resources.getEmail());
        }
*/
        //
        resources.setPassword("e10adc3949ba59abbe56e057f20f883e");
        return userMapper.toDto(userRepository.save(resources));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(Users resources) {
        Optional<Users> userOptional = userRepository.findById(resources.getUsersUid());
        ValidationUtil.isNull(userOptional,"User","id",resources.getUsersUid());

        Users user = userOptional.get();

        Optional<Users> userOptional1 = userRepository.findByUsername(user.getUsername());
        Users user1 = userOptional1.get();
        //Have to work on this........!!
        Users user2 = userRepository.findByEmail((new ArrayList<>(user.getEmail())).get(0).getEmailAddress());

        if(user1 !=null&&!user.getUsersUid().equals(user1.getUsersUid())){
            throw new EntityExistException(Users.class,"username",resources.getUsername());
        }

        if(user2!=null&&!user.getUsersUid().equals(user2.getUsersUid())){
            throw new EntityExistException(Users.class,"email",resources.getEmail());
        }

        user.setUsername(resources.getUsername());
        user.setEmail(resources.getEmail());
        //user.setEnabled(resources.getEnabled());
        //user.setRoles(resources.getRoles());
       // user.setDept(resources.getDept());
       // user.setJob(resources.getJob());
        user.setPhone(resources.getPhone());
        userRepository.save(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public Users findByName(String userName) {
    	Users user = null;
        if(ValidationUtil.isEmail(userName)){
            user = userRepository.findByEmail(userName);
        } else {
      
            user = userRepository.findByUsername(userName)
                    .orElseThrow(() -> 
                            new UsernameNotFoundException("User not found with username : " + userName)
            );
        }

        if (user == null) {
            throw new EntityNotFoundException(Users.class, "name", userName);
        } else {
            return user;
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updatePass(String username, String pass) {
        userRepository.updatePass(username,pass,new Date());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateAvatar(String username, String url) {
        //userRepository.updateAvatar(username,url);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateEmail(String username, String email) {
        userRepository.updateEmail(username,email);
    }
}
