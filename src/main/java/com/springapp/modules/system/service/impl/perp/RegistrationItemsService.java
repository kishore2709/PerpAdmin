
package com.springapp.modules.system.service.impl.perp;

import java.util.List;
import java.util.Optional;

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

		public boolean addRegistrationItems(RegistrationItems registrationItems) {
			// TODO Auto-generated method stub
			RegistrationItems save = registrationItemsRepository.save(registrationItems);

		        return save != null;
		}

}
