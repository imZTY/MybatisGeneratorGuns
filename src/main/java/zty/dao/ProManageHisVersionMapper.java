package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageHisVersion;
import zty.entity.ProManageHisVersionExample;

public interface ProManageHisVersionMapper {
    long countByExample(ProManageHisVersionExample example);

    int deleteByExample(ProManageHisVersionExample example);

    int insert(ProManageHisVersion record);

    int insertSelective(ProManageHisVersion record);

    List<ProManageHisVersion> selectByExample(ProManageHisVersionExample example);

    int updateByExampleSelective(@Param("record") ProManageHisVersion record, @Param("example") ProManageHisVersionExample example);

    int updateByExample(@Param("record") ProManageHisVersion record, @Param("example") ProManageHisVersionExample example);
}