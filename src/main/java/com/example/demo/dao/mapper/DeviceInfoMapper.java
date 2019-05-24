package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.po.DeviceInfo;
import com.example.demo.dao.util.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceInfoMapper extends BaseMapper<DeviceInfo> {
    public int insertOrUpdate(DeviceInfo deviceinfo);
}

