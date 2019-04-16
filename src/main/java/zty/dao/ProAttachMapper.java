package zty.dao;

import zty.entity.ProAttach;

public interface ProAttachMapper {
    int insert(ProAttach record);

    int insertSelective(ProAttach record);
}