package com.bobo.cms.dao;

import com.bobo.cms.domain.Channel;

public interface ChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Channel record);

    int insertSelective(Channel record);

    Channel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Channel record);

    int updateByPrimaryKey(Channel record);
}