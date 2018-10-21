package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbUserT;
import com.unicom.ceo.model.BbUserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbUserTMapper {
    int countByExample(BbUserTExample example);

    int deleteByExample(BbUserTExample example);

    int deleteByPrimaryKey(String user_id);

    int insert(BbUserT record);

    int insertSelective(BbUserT record);

    List<BbUserT> selectByExample(BbUserTExample example);

    BbUserT selectByPrimaryKey(String user_id);

    int updateByExampleSelective(@Param("record") BbUserT record, @Param("example") BbUserTExample example);

    int updateByExample(@Param("record") BbUserT record, @Param("example") BbUserTExample example);

    int updateByPrimaryKeySelective(BbUserT record);

    int updateByPrimaryKey(BbUserT record);
}