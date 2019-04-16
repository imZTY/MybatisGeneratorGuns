package zty.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zty.entity.ProProducts;
import zty.entity.ProProductsExample;

public interface ProProductsMapper {
    long countByExample(ProProductsExample example);

    int deleteByExample(ProProductsExample example);

    int insert(ProProducts record);

    int insertSelective(ProProducts record);

    List<ProProducts> selectByExample(ProProductsExample example);

    int updateByExampleSelective(@Param("record") ProProducts record, @Param("example") ProProductsExample example);

    int updateByExample(@Param("record") ProProducts record, @Param("example") ProProductsExample example);
}