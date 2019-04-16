package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProTransaction;
import zty.entity.ProTransactionExample;

public interface ProTransactionMapper {
    long countByExample(ProTransactionExample example);

    int deleteByExample(ProTransactionExample example);

    int insert(ProTransaction record);

    int insertSelective(ProTransaction record);

    List<ProTransaction> selectByExample(ProTransactionExample example);

    int updateByExampleSelective(@Param("record") ProTransaction record, @Param("example") ProTransactionExample example);

    int updateByExample(@Param("record") ProTransaction record, @Param("example") ProTransactionExample example);
}