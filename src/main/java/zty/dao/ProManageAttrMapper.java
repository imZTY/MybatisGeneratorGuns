package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageAttr;
import zty.entity.ProManageAttrExample;

public interface ProManageAttrMapper {
    long countByExample(ProManageAttrExample example);

    int deleteByExample(ProManageAttrExample example);

    int insert(ProManageAttr record);

    int insertSelective(ProManageAttr record);

    List<ProManageAttr> selectByExample(ProManageAttrExample example);

    int updateByExampleSelective(@Param("record") ProManageAttr record, @Param("example") ProManageAttrExample example);

    int updateByExample(@Param("record") ProManageAttr record, @Param("example") ProManageAttrExample example);
}