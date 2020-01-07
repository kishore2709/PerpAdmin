
package com.springapp.modules.system.service.impl.perp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.pool2.impl.AbandonedConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.modules.security.repository.perp.RegistrationItemsRepository;
import com.springapp.modules.system.domain.perp.RegistrationItems;


@Service("registrationItemService")
public class RegistrationItemsService {
    @Autowired
    private RegistrationItemsRepository registrationItemsRepository;


	 public RegistrationItems findByTrackingNo(Integer trackingNo) {
	        return registrationItemsRepository.findByTrackingNo(trackingNo);
	    }
	 
	 public List<RegistrationItems> findAll(Integer trackingNo) {
		 
		 List<RegistrationItems> registrationItems = new ArrayList<>();
	         registrationItemsRepository.findAll()
	         .forEach(registrationItems:: add);
	         return registrationItems;
	    }


		public boolean addRegistrationItems(RegistrationItems registrationItems) {
			// TODO Auto-generated method stub
			RegistrationItems save = registrationItemsRepository.save(registrationItems);

		        return save != null;
		}

}
