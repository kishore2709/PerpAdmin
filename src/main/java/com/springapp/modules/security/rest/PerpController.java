package com.springapp.modules.security.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.springapp.modules.security.exception.RegistrationItemsException;
import com.springapp.modules.system.domain.perp.RegistrationItems;
import com.springapp.modules.system.domain.perp.RegitemSubsubtypes;
import com.springapp.modules.system.domain.perp.RegitemSubtypes;
import com.springapp.modules.system.service.impl.perp.RegistrationItemsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/registrations", produces = APPLICATION_JSON_VALUE)
@Slf4j
public class PerpController {

	@Autowired
	RegistrationItemsService registrationItemsService;

	@RequestMapping(value = "/trackingno/{trackingno}", method = GET)
	public ResponseEntity<?> getCertificateNoByTracking(@PathVariable("trackingno") Integer trackingno)
			throws RegistrationItemsException {

		RegistrationItems regItems = registrationItemsService.findByTrackingNo(trackingno);
		if (regItems == null) {
			throw new RegistrationItemsException("Tracking Number not found");

		}
		HashMap<String, Object> map = new HashMap<>();
		map.put("trackingNo", regItems.getTrackingNo());

		map.put("certificateNo", regItems.getCertificateNo());
		map.put("ExpirationDate", regItems.getExpirationDate());
		map.put("regitemtype", regItems.getRegitemTypes().getUid());
		map.put("regitemSubtype", regItems.getRegitemSubtypes().getUid());

		if (regItems.getRegitemSubsubtypes() != null) {
			map.put("regitemSubsubtype", regItems.getRegitemSubsubtypes().getUid());
		}
		return ResponseEntity.ok(map);
	}

	@RequestMapping(value = "/updateRegDetails/{trackingno}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateRegistrationDetailsByTracking(@PathVariable("trackingno") Integer trackingno,
			@Valid @RequestBody JSONObject registrationItems) {
		RegistrationItems regItems = registrationItemsService.findByTrackingNo(trackingno);

		log.info(" Before { RegSubtype: " + regItems.getRegitemSubtypes().getDisplay());
		if (regItems.getRegitemSubsubtypes() != null) {
			log.info(" RegSubSubType: " + regItems.getRegitemSubsubtypes().getDisplay() + " }");
		}
		// setting regitemsubtypes
		if (registrationItems.getString("regitemSubtypes") != null) {

			RegitemSubtypes rsubtype = new RegitemSubtypes();
			rsubtype.setUid(Integer.parseInt(registrationItems.getString("regitemSubtypes")));
			regItems.setRegitemSubtypes(rsubtype);
		}
		// setting regitemsub subtypes
		if (registrationItems.getString("regitemSubsubtypes") != null) {
			if (!registrationItems.getString("regitemSubsubtypes").trim().isEmpty()) {
				RegitemSubsubtypes rsubsubtype = new RegitemSubsubtypes();
				if(registrationItems.getString("regitemSubsubtypes").equals("null")) {
					regItems.setRegitemSubsubtypes(null);
				}
				else {
				rsubsubtype.setUid(Integer.parseInt(registrationItems.getString("regitemSubsubtypes")));
				regItems.setRegitemSubsubtypes(rsubsubtype);
				}
			}
		}

		// updating both the details
		registrationItemsService.addRegistrationItems(regItems);

		RegistrationItems updatedRegItems = registrationItemsService.findByTrackingNo(trackingno);

		HashMap<String, Object> map = new HashMap<>();
		map.put("trackingNo", updatedRegItems.getTrackingNo());
		map.put("certificateNo", updatedRegItems.getCertificateNo());
		map.put("ExpirationDate", updatedRegItems.getExpirationDate());
		map.put("regitemTypes", updatedRegItems.getRegitemTypes().getUid());
		map.put("regitemSubtypes", updatedRegItems.getRegitemSubtypes().getUid());

		if (updatedRegItems.getRegitemSubsubtypes() != null) {
			map.put("regitemSubsubtypes", updatedRegItems.getRegitemSubsubtypes().getUid());
		}

		return ResponseEntity.ok(map);

	}

}
