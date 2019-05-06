package com.springapp.modules.security.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.modules.system.service.impl.perp.RegistrationItemsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/registrations", produces = APPLICATION_JSON_VALUE)
@Slf4j
public class PerpController {

	@Autowired
	RegistrationItemsService registrationItemsService;

	@RequestMapping(path = "/1", method = GET)
	public List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		return list;
	}

	@RequestMapping(value = "/trackingNo/{trackingno}", method = GET)
	public ResponseEntity<?> getCertificateNoByTracking(@PathVariable("trackingno") Integer trackingno) {

		HashMap<String, Object> map = new HashMap<>();
		map.put("certificateNo", registrationItemsService.findByTrackingNo(trackingno).getCertificateNo());
		map.put("ExpirationDate", registrationItemsService.findByTrackingNo(trackingno).getExpirationDate());
		map.put("RegitemTypes", registrationItemsService.findByTrackingNo(trackingno).getRegitemTypes().getDisplay());
		map.put("RegitemSubtypes",
				registrationItemsService.findByTrackingNo(trackingno).getRegitemSubtypes().getDisplay());
//		
//		if (
//				registrationItemsService.findByTrackingNo(trackingno).getRegitemSubsubtypes().getDisplay() != null) {
//			map.put("RegitemSubSubtypes",
//					registrationItemsService.findByTrackingNo(trackingno).getRegitemSubsubtypes().getDisplay());
//		}

		return ResponseEntity.ok(map);
	}

}
