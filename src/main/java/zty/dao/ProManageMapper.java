package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManage;
import zty.entity.ProManageExample;

public interface ProManageMapper {
    long countByExample(ProManageExample example);

    int deleteByExample(ProManageExample example);

    int insert(ProManage record);

    int insertSelective(ProManage record);

    List<ProManage> selectByExample(ProManageExample example);

    int updateByExampleSelective(@Param("record") ProManage record, @Param("example") ProManageExample example);

    int updateByExample(@Param("record") ProManage record, @Param("example") ProManageExample example);
}