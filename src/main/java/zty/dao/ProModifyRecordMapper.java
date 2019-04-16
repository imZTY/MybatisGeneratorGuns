package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProModifyRecord;
import zty.entity.ProModifyRecordExample;

public interface ProModifyRecordMapper {
    long countByExample(ProModifyRecordExample example);

    int deleteByExample(ProModifyRecordExample example);

    int insert(ProModifyRecord record);

    int insertSelective(ProModifyRecord record);

    List<ProModifyRecord> selectByExample(ProModifyRecordExample example);

    int updateByExampleSelective(@Param("record") ProModifyRecord record, @Param("example") ProModifyRecordExample example);

    int updateByExample(@Param("record") ProModifyRecord record, @Param("example") ProModifyRecordExample example);
}