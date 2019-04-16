package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProStoreHot;
import zty.entity.ProStoreHotExample;

public interface ProStoreHotMapper {
    long countByExample(ProStoreHotExample example);

    int deleteByExample(ProStoreHotExample example);

    int insert(ProStoreHot record);

    int insertSelective(ProStoreHot record);

    List<ProStoreHot> selectByExample(ProStoreHotExample example);

    int updateByExampleSelective(@Param("record") ProStoreHot record, @Param("example") ProStoreHotExample example);

    int updateByExample(@Param("record") ProStoreHot record, @Param("example") ProStoreHotExample example);
}