package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbBuildingInfoT;
import com.unicom.ceo.model.BbBuildingInfoTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbBuildingInfoTMapper {
    int countByExample(BbBuildingInfoTExample example);

    int deleteByExample(BbBuildingInfoTExample example);

    int deleteByPrimaryKey(String building_no);

    int insert(BbBuildingInfoT record);

    int insertSelective(BbBuildingInfoT record);

    List<BbBuildingInfoT> selectByExample(BbBuildingInfoTExample example);

    BbBuildingInfoT selectByPrimaryKey(String building_no);

    int updateByExampleSelective(@Param("record") BbBuildingInfoT record, @Param("example") BbBuildingInfoTExample example);

    int updateByExample(@Param("record") BbBuildingInfoT record, @Param("example") BbBuildingInfoTExample example);

    int updateByPrimaryKeySelective(BbBuildingInfoT record);

    int updateByPrimaryKey(BbBuildingInfoT record);
}