
package com.springapp.modules.security.repository.perp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springapp.modules.system.domain.perp.RegistrationItems;

@Repository
public interface RegistrationItemsRepository extends JpaRepository<RegistrationItems, Long> {
	
	RegistrationItems findByTrackingNo(Integer trackingNo);
	

}
