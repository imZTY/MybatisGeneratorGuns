package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageGroups;
import zty.entity.ProManageGroupsExample;

public interface ProManageGroupsMapper {
    long countByExample(ProManageGroupsExample example);

    int deleteByExample(ProManageGroupsExample example);

    int insert(ProManageGroups record);

    int insertSelective(ProManageGroups record);

    List<ProManageGroups> selectByExample(ProManageGroupsExample example);

    int updateByExampleSelective(@Param("record") ProManageGroups record, @Param("example") ProManageGroupsExample example);

    int updateByExample(@Param("record") ProManageGroups record, @Param("example") ProManageGroupsExample example);
}