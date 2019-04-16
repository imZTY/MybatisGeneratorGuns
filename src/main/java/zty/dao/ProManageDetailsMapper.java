package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageDetails;
import zty.entity.ProManageDetailsExample;

public interface ProManageDetailsMapper {
    long countByExample(ProManageDetailsExample example);

    int deleteByExample(ProManageDetailsExample example);

    int insert(ProManageDetails record);

    int insertSelective(ProManageDetails record);

    List<ProManageDetails> selectByExampleWithBLOBs(ProManageDetailsExample example);

    List<ProManageDetails> selectByExample(ProManageDetailsExample example);

    int updateByExampleSelective(@Param("record") ProManageDetails record, @Param("example") ProManageDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") ProManageDetails record, @Param("example") ProManageDetailsExample example);

    int updateByExample(@Param("record") ProManageDetails record, @Param("example") ProManageDetailsExample example);
}