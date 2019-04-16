package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageImgHisVersion;
import zty.entity.ProManageImgHisVersionExample;

public interface ProManageImgHisVersionMapper {
    long countByExample(ProManageImgHisVersionExample example);

    int deleteByExample(ProManageImgHisVersionExample example);

    int insert(ProManageImgHisVersion record);

    int insertSelective(ProManageImgHisVersion record);

    List<ProManageImgHisVersion> selectByExample(ProManageImgHisVersionExample example);

    int updateByExampleSelective(@Param("record") ProManageImgHisVersion record, @Param("example") ProManageImgHisVersionExample example);

    int updateByExample(@Param("record") ProManageImgHisVersion record, @Param("example") ProManageImgHisVersionExample example);
}