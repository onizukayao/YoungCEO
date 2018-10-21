package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbBillT;
import com.unicom.ceo.model.BbBillTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbBillTMapper {
    int countByExample(BbBillTExample example);

    int deleteByExample(BbBillTExample example);

    int deleteByPrimaryKey(String user_id);

    int insert(BbBillT record);

    int insertSelective(BbBillT record);

    List<BbBillT> selectByExample(BbBillTExample example);

    BbBillT selectByPrimaryKey(String user_id);

    int updateByExampleSelective(@Param("record") BbBillT record, @Param("example") BbBillTExample example);

    int updateByExample(@Param("record") BbBillT record, @Param("example") BbBillTExample example);

    int updateByPrimaryKeySelective(BbBillT record);

    int updateByPrimaryKey(BbBillT record);
}