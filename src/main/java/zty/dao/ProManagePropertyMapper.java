package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageProperty;
import zty.entity.ProManagePropertyExample;

public interface ProManagePropertyMapper {
    long countByExample(ProManagePropertyExample example);

    int deleteByExample(ProManagePropertyExample example);

    int insert(ProManageProperty record);

    int insertSelective(ProManageProperty record);

    List<ProManageProperty> selectByExample(ProManagePropertyExample example);

    int updateByExampleSelective(@Param("record") ProManageProperty record, @Param("example") ProManagePropertyExample example);

    int updateByExample(@Param("record") ProManageProperty record, @Param("example") ProManagePropertyExample example);
}