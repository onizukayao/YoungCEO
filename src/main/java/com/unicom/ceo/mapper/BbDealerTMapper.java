package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbDealerT;
import com.unicom.ceo.model.BbDealerTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbDealerTMapper {
    int countByExample(BbDealerTExample example);

    int deleteByExample(BbDealerTExample example);

    int deleteByPrimaryKey(String dealer_id);

    int insert(BbDealerT record);

    int insertSelective(BbDealerT record);

    List<BbDealerT> selectByExample(BbDealerTExample example);

    BbDealerT selectByPrimaryKey(String dealer_id);

    int updateByExampleSelective(@Param("record") BbDealerT record, @Param("example") BbDealerTExample example);

    int updateByExample(@Param("record") BbDealerT record, @Param("example") BbDealerTExample example);

    int updateByPrimaryKeySelective(BbDealerT record);

    int updateByPrimaryKey(BbDealerT record);
}