package com.example.demo.web.controller;

import com.example.demo.commom.constant.result.BaseResp;
import com.example.demo.commom.constant.result.ResultStatus;
import com.example.demo.dao.entity.po.AlarmHistoryLog;
import com.example.demo.dao.entity.po.DeviceInfo;
import com.example.demo.dao.entity.po.DevicePropHistoryLog;
import com.example.demo.dao.mapper.AlarmHistoryLogMapper;
import com.example.demo.dao.mapper.DeviceInfoMapper;
import com.example.demo.dao.mapper.DevicePropHistoryLogMapper;
import com.example.demo.service.AlarmHistoryLogService;
import com.example.demo.service.AliyunDeviceService;
import com.example.demo.service.DeviceInfoService;
import com.example.demo.service.DevicePropHistoryLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Set;

//@Controller标记一个类是Controller，控制器Controller负责处理DispatcherServlet分发的请求，它把用户请求的数据经过业务处理层处理之后装成一个Model，再把该model返回进行展示
//@Autowired 按照类型装配依赖对象
//@RequestMapping 一个用于处理请求地址映射的注解value：指定请求的实际地址；method：指定请求的method类型
//@RwsponseBody 该注解将Controller的方法返回的对象为json格式

@Controller
public class TestController {
    @Autowired
    private AlarmHistoryLogMapper testMapper;
    @Autowired
    private DeviceInfoMapper testMapper1;
    @Autowired
    private DevicePropHistoryLogMapper testMapper2;

    @Autowired
    public DeviceInfoService deviceInfoService;

    @Autowired
    public DevicePropHistoryLogService devicePropHistoryLogService;

    @Autowired
    public AlarmHistoryLogService alarmHistoryLogService;


    @Autowired
    public AliyunDeviceService aliyunDeviceService;

   /* @RequestMapping("/")
    public String index()
        {
            return "Greeting from Spring Boot";
        }
    */

        //获取设备属性(当前温湿度及报警阀值及设备在线状态)
        @RequestMapping(value = "/api/v1/device/queryDeviceProp",method = RequestMethod.GET)
        public @ResponseBody
        BaseResp<DeviceInfo> queryDeviceProp(String deviceName) {
            DeviceInfo deviceInfo=deviceInfoService.getDeviceInfoByDeviceName(deviceName);
        return new BaseResp<>(ResultStatus.SUCCESS,deviceInfo);
    }

    //查询所有设备名
    @RequestMapping(value = "/api/v1/device/listDeviceName",method = RequestMethod.GET)
    public @ResponseBody  BaseResp listDeviceNames() {
        Set<String> deviceNames=deviceInfoService.listDeviceNames();
        return new BaseResp<>(ResultStatus.SUCCESS,deviceNames);
    }


   @RequestMapping(value="/hello",method= RequestMethod.GET)
   public @ResponseBody Object hello()
   {
       List<AlarmHistoryLog> testModels=testMapper.selectAll();
       return testModels;
    }

    @RequestMapping(value="/rua",method= RequestMethod.GET)
    public @ResponseBody Object rua()
    {
        List<DeviceInfo> testModels=testMapper1.selectAll();
        return testModels;
    }

    @RequestMapping(value="/qqq",method= RequestMethod.GET)
    public @ResponseBody Object qqq()
    {
        List<DevicePropHistoryLog> testModels=testMapper2.selectAll();
        return testModels;
    }


}
