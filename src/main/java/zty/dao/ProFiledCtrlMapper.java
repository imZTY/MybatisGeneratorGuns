package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProFiledCtrl;
import zty.entity.ProFiledCtrlExample;

public interface ProFiledCtrlMapper {
    long countByExample(ProFiledCtrlExample example);

    int deleteByExample(ProFiledCtrlExample example);

    int insert(ProFiledCtrl record);

    int insertSelective(ProFiledCtrl record);

    List<ProFiledCtrl> selectByExample(ProFiledCtrlExample example);

    int updateByExampleSelective(@Param("record") ProFiledCtrl record, @Param("example") ProFiledCtrlExample example);

    int updateByExample(@Param("record") ProFiledCtrl record, @Param("example") ProFiledCtrlExample example);
}