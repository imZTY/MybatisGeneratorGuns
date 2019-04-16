package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProConfig;
import zty.entity.ProConfigExample;

public interface ProConfigMapper {
    long countByExample(ProConfigExample example);

    int deleteByExample(ProConfigExample example);

    int insert(ProConfig record);

    int insertSelective(ProConfig record);

    List<ProConfig> selectByExample(ProConfigExample example);

    int updateByExampleSelective(@Param("record") ProConfig record, @Param("example") ProConfigExample example);

    int updateByExample(@Param("record") ProConfig record, @Param("example") ProConfigExample example);
}