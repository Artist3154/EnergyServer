package com.example.demo.dao.entity.po;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class DeviceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;
    private String current;
    private String voltage;
    private String power;
    private String energy;
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

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getVoltage()
    {
        return voltage;
    }

    public void setVoltage(String voltage)
    {
        this.voltage=voltage;
    }

    public String getPower()
    {
        return power;
    }

    public void setPower(String power)
    {
        this.power=power;
    }

    public String getEnergy()
    {
        return energy;
    }

    public void setEnergy(String energy)
    {
        this.energy=energy;
    }


}
