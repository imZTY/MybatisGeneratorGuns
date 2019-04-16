package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProStore;
import zty.entity.ProStoreExample;

public interface ProStoreMapper {
    long countByExample(ProStoreExample example);

    int deleteByExample(ProStoreExample example);

    int insert(ProStore record);

    int insertSelective(ProStore record);

    List<ProStore> selectByExample(ProStoreExample example);

    int updateByExampleSelective(@Param("record") ProStore record, @Param("example") ProStoreExample example);

    int updateByExample(@Param("record") ProStore record, @Param("example") ProStoreExample example);
}