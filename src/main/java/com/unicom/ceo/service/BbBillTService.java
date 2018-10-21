/**
 * 
 */
package com.unicom.ceo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicom.ceo.mapper.BbBillTMapper;
import com.unicom.ceo.model.BbBillT;
import com.unicom.ceo.model.BbBillTExample;

/**
 * @ClassName:	BbBillTService
 * 	  @author:	ink
 *		@Desc:	
 * 		@Date:	2018年10月21日 下午4:51:37
 */
@Service
public class BbBillTService {

	/**
	 * @ClassName:	BbBillTServiceImpl
	 * 	  @author:	ink
	 *		@Desc:	
	 * 		@Date:	2018年10月21日 下午5:50:10
	 */
	public interface BbBillTServiceImpl {

	}

	@Autowired
	private BbBillTMapper BbBillTMapper;
	private BbBillTExample BbBillTExample;
	
	public List<BbBillT> getAll(){
		return BbBillTMapper.selectByExample(BbBillTExample);
	}
}
