package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProManageImg;
import zty.entity.ProManageImgExample;

public interface ProManageImgMapper {
    long countByExample(ProManageImgExample example);

    int deleteByExample(ProManageImgExample example);

    int insert(ProManageImg record);

    int insertSelective(ProManageImg record);

    List<ProManageImg> selectByExample(ProManageImgExample example);

    int updateByExampleSelective(@Param("record") ProManageImg record, @Param("example") ProManageImgExample example);

    int updateByExample(@Param("record") ProManageImg record, @Param("example") ProManageImgExample example);
}