package com.unicom.ceo.mapper;

import com.unicom.ceo.model.BbCellT;
import com.unicom.ceo.model.BbCellTExample;
import com.unicom.ceo.model.BbCellTKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbCellTMapper {
    int countByExample(BbCellTExample example);

    int deleteByExample(BbCellTExample example);

    int deleteByPrimaryKey(BbCellTKey key);

    int insert(BbCellT record);

    int insertSelective(BbCellT record);

    List<BbCellT> selectByExample(BbCellTExample example);

    BbCellT selectByPrimaryKey(BbCellTKey key);

    int updateByExampleSelective(@Param("record") BbCellT record, @Param("example") BbCellTExample example);

    int updateByExample(@Param("record") BbCellT record, @Param("example") BbCellTExample example);

    int updateByPrimaryKeySelective(BbCellT record);

    int updateByPrimaryKey(BbCellT record);
}