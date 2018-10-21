/**
 * 
 */
package com.unicom.ceo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.ceo.service.BbBuildingIinfoTService;

/**
 * @ClassName:	BbBuildingInfoTController
 * 	  @author:	ink
 *		@Desc:	
 * 		@Date:	2018年10月21日 下午5:38:27
 */
@EnableAutoConfiguration
@RestController
@RequestMapping(value="/building")
public class BbBuildingInfoTController {

	@Autowired
	private BbBuildingIinfoTService
}
