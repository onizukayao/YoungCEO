package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbProjectsInfoT;
import com.unicom.ceo.model.BbProjectsInfoTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbProjectsInfoTMapper {
    int countByExample(BbProjectsInfoTExample example);

    int deleteByExample(BbProjectsInfoTExample example);

    int deleteByPrimaryKey(String project_id);

    int insert(BbProjectsInfoT record);

    int insertSelective(BbProjectsInfoT record);

    List<BbProjectsInfoT> selectByExample(BbProjectsInfoTExample example);

    BbProjectsInfoT selectByPrimaryKey(String project_id);

    int updateByExampleSelective(@Param("record") BbProjectsInfoT record, @Param("example") BbProjectsInfoTExample example);

    int updateByExample(@Param("record") BbProjectsInfoT record, @Param("example") BbProjectsInfoTExample example);

    int updateByPrimaryKeySelective(BbProjectsInfoT record);

    int updateByPrimaryKey(BbProjectsInfoT record);
}