/**
 * 
 */
package com.unicom.ceo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.ceo.model.BbBillT;
import com.unicom.ceo.service.BbBillTService;

/**
 * @ClassName:	BbBillTController
 * 	  @author:	ink
 *		@Desc:	
 * 		@Date:	2018年10月21日 下午5:02:37
 */
@EnableAutoConfiguration
@RestController
@RequestMapping(value="/bill")
public class BbBillTController {

	@Autowired
	private BbBillTService BbBillTService;
		
	@RequestMapping(value="/getall")
	public List<BbBillT> getBbBillTs(){
		return BbBillTService.getAll();
	}
}
