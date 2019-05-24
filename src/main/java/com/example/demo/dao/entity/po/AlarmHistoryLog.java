package com.example.demo.dao.entity.po;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import javax.annotation.Generated;




public class AlarmHistoryLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String alarm_time;
    private String alarm_reason;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlarm_time() {
        return alarm_time;
    }

    public void setAlarm_time(String alarm_time) {
        this.alarm_time = alarm_time;
    }

    public String getAlarm_reason()
    {
        return alarm_reason;
    }

    public void setAlarm_reason(String alarm_reason)
    {
        this.alarm_reason=alarm_reason;
    }


}
