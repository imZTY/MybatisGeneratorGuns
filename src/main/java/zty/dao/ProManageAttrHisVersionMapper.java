package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageAttrHisVersion;
import zty.entity.ProManageAttrHisVersionExample;

public interface ProManageAttrHisVersionMapper {
    long countByExample(ProManageAttrHisVersionExample example);

    int deleteByExample(ProManageAttrHisVersionExample example);

    int insert(ProManageAttrHisVersion record);

    int insertSelective(ProManageAttrHisVersion record);

    List<ProManageAttrHisVersion> selectByExample(ProManageAttrHisVersionExample example);

    int updateByExampleSelective(@Param("record") ProManageAttrHisVersion record, @Param("example") ProManageAttrHisVersionExample example);

    int updateByExample(@Param("record") ProManageAttrHisVersion record, @Param("example") ProManageAttrHisVersionExample example);
}