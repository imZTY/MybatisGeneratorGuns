package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageTemporary;
import zty.entity.ProManageTemporaryExample;

public interface ProManageTemporaryMapper {
    long countByExample(ProManageTemporaryExample example);

    int deleteByExample(ProManageTemporaryExample example);

    int insert(ProManageTemporary record);

    int insertSelective(ProManageTemporary record);

    List<ProManageTemporary> selectByExample(ProManageTemporaryExample example);

    int updateByExampleSelective(@Param("record") ProManageTemporary record, @Param("example") ProManageTemporaryExample example);

    int updateByExample(@Param("record") ProManageTemporary record, @Param("example") ProManageTemporaryExample example);
}