package com.ytrj.hardwaredata.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ytrj_app_dianyuan_info
 * @author 
 */
public class DianyuanInfo implements Serializable {
    /**
     * 唯一主键
     */
    private Long id;

    /**
     * 设备IMIE
     */
    private String imei;

    /**
     * A相电压
     */
    private Integer voltageA;

    /**
     * B相电压
     */
    private Integer voltageB;

    /**
     * C相电压
     */
    private Integer voltageC;

    /**
     * A相电流
     */
    private Integer electricityA;

    /**
     * B相电流
     */
    private Integer electricityB;

    /**
     * C相电流
     */
    private Integer electricityC;

    /**
     * 1路漏电流
     */
    private Integer electricLeakage1;

    /**
     * 2路漏电流
     */
    private Integer electricLeakage2;

    /**
     * 3路漏电流
     */
    private Integer electricLeakage3;

    /**
     * 4路漏电流
     */
    private Integer electricLeakage4;

    /**
     * 1路温度
     */
    private Integer temperature1;

    /**
     * 2路温度
     */
    private Integer temperature2;

    /**
     * 3路温度
     */
    private Integer temperature3;

    /**
     * 4路温度
     */
    private Integer temperature4;

    /**
     * 故障电弧（拉弧次数）
     */
    private Integer arcFault;

    /**
     * 绝缘电阻（MΩ）
     */
    private Integer resistance;

    /**
     * 设备是否在线
     */
    private Integer online;

    /**
     * 数据更新时间
     */
    private Date dataTime;

    /**
     * 创建角色
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新角色
     */
    private Date updateUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Integer getVoltageA() {
        return voltageA;
    }

    public void setVoltageA(Integer voltageA) {
        this.voltageA = voltageA;
    }

    public Integer getVoltageB() {
        return voltageB;
    }

    public void setVoltageB(Integer voltageB) {
        this.voltageB = voltageB;
    }

    public Integer getVoltageC() {
        return voltageC;
    }

    public void setVoltageC(Integer voltageC) {
        this.voltageC = voltageC;
    }

    public Integer getElectricityA() {
        return electricityA;
    }

    public void setElectricityA(Integer electricityA) {
        this.electricityA = electricityA;
    }

    public Integer getElectricityB() {
        return electricityB;
    }

    public void setElectricityB(Integer electricityB) {
        this.electricityB = electricityB;
    }

    public Integer getElectricityC() {
        return electricityC;
    }

    public void setElectricityC(Integer electricityC) {
        this.electricityC = electricityC;
    }

    public Integer getElectricLeakage1() {
        return electricLeakage1;
    }

    public void setElectricLeakage1(Integer electricLeakage1) {
        this.electricLeakage1 = electricLeakage1;
    }

    public Integer getElectricLeakage2() {
        return electricLeakage2;
    }

    public void setElectricLeakage2(Integer electricLeakage2) {
        this.electricLeakage2 = electricLeakage2;
    }

    public Integer getElectricLeakage3() {
        return electricLeakage3;
    }

    public void setElectricLeakage3(Integer electricLeakage3) {
        this.electricLeakage3 = electricLeakage3;
    }

    public Integer getElectricLeakage4() {
        return electricLeakage4;
    }

    public void setElectricLeakage4(Integer electricLeakage4) {
        this.electricLeakage4 = electricLeakage4;
    }

    public Integer getTemperature1() {
        return temperature1;
    }

    public void setTemperature1(Integer temperature1) {
        this.temperature1 = temperature1;
    }

    public Integer getTemperature2() {
        return temperature2;
    }

    public void setTemperature2(Integer temperature2) {
        this.temperature2 = temperature2;
    }

    public Integer getTemperature3() {
        return temperature3;
    }

    public void setTemperature3(Integer temperature3) {
        this.temperature3 = temperature3;
    }

    public Integer getTemperature4() {
        return temperature4;
    }

    public void setTemperature4(Integer temperature4) {
        this.temperature4 = temperature4;
    }

    public Integer getArcFault() {
        return arcFault;
    }

    public void setArcFault(Integer arcFault) {
        this.arcFault = arcFault;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Date updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DianyuanInfo other = (DianyuanInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImei() == null ? other.getImei() == null : this.getImei().equals(other.getImei()))
            && (this.getVoltageA() == null ? other.getVoltageA() == null : this.getVoltageA().equals(other.getVoltageA()))
            && (this.getVoltageB() == null ? other.getVoltageB() == null : this.getVoltageB().equals(other.getVoltageB()))
            && (this.getVoltageC() == null ? other.getVoltageC() == null : this.getVoltageC().equals(other.getVoltageC()))
            && (this.getElectricityA() == null ? other.getElectricityA() == null : this.getElectricityA().equals(other.getElectricityA()))
            && (this.getElectricityB() == null ? other.getElectricityB() == null : this.getElectricityB().equals(other.getElectricityB()))
            && (this.getElectricityC() == null ? other.getElectricityC() == null : this.getElectricityC().equals(other.getElectricityC()))
            && (this.getElectricLeakage1() == null ? other.getElectricLeakage1() == null : this.getElectricLeakage1().equals(other.getElectricLeakage1()))
            && (this.getElectricLeakage2() == null ? other.getElectricLeakage2() == null : this.getElectricLeakage2().equals(other.getElectricLeakage2()))
            && (this.getElectricLeakage3() == null ? other.getElectricLeakage3() == null : this.getElectricLeakage3().equals(other.getElectricLeakage3()))
            && (this.getElectricLeakage4() == null ? other.getElectricLeakage4() == null : this.getElectricLeakage4().equals(other.getElectricLeakage4()))
            && (this.getTemperature1() == null ? other.getTemperature1() == null : this.getTemperature1().equals(other.getTemperature1()))
            && (this.getTemperature2() == null ? other.getTemperature2() == null : this.getTemperature2().equals(other.getTemperature2()))
            && (this.getTemperature3() == null ? other.getTemperature3() == null : this.getTemperature3().equals(other.getTemperature3()))
            && (this.getTemperature4() == null ? other.getTemperature4() == null : this.getTemperature4().equals(other.getTemperature4()))
            && (this.getArcFault() == null ? other.getArcFault() == null : this.getArcFault().equals(other.getArcFault()))
            && (this.getResistance() == null ? other.getResistance() == null : this.getResistance().equals(other.getResistance()))
            && (this.getOnline() == null ? other.getOnline() == null : this.getOnline().equals(other.getOnline()))
            && (this.getDataTime() == null ? other.getDataTime() == null : this.getDataTime().equals(other.getDataTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImei() == null) ? 0 : getImei().hashCode());
        result = prime * result + ((getVoltageA() == null) ? 0 : getVoltageA().hashCode());
        result = prime * result + ((getVoltageB() == null) ? 0 : getVoltageB().hashCode());
        result = prime * result + ((getVoltageC() == null) ? 0 : getVoltageC().hashCode());
        result = prime * result + ((getElectricityA() == null) ? 0 : getElectricityA().hashCode());
        result = prime * result + ((getElectricityB() == null) ? 0 : getElectricityB().hashCode());
        result = prime * result + ((getElectricityC() == null) ? 0 : getElectricityC().hashCode());
        result = prime * result + ((getElectricLeakage1() == null) ? 0 : getElectricLeakage1().hashCode());
        result = prime * result + ((getElectricLeakage2() == null) ? 0 : getElectricLeakage2().hashCode());
        result = prime * result + ((getElectricLeakage3() == null) ? 0 : getElectricLeakage3().hashCode());
        result = prime * result + ((getElectricLeakage4() == null) ? 0 : getElectricLeakage4().hashCode());
        result = prime * result + ((getTemperature1() == null) ? 0 : getTemperature1().hashCode());
        result = prime * result + ((getTemperature2() == null) ? 0 : getTemperature2().hashCode());
        result = prime * result + ((getTemperature3() == null) ? 0 : getTemperature3().hashCode());
        result = prime * result + ((getTemperature4() == null) ? 0 : getTemperature4().hashCode());
        result = prime * result + ((getArcFault() == null) ? 0 : getArcFault().hashCode());
        result = prime * result + ((getResistance() == null) ? 0 : getResistance().hashCode());
        result = prime * result + ((getOnline() == null) ? 0 : getOnline().hashCode());
        result = prime * result + ((getDataTime() == null) ? 0 : getDataTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imei=").append(imei);
        sb.append(", voltageA=").append(voltageA);
        sb.append(", voltageB=").append(voltageB);
        sb.append(", voltageC=").append(voltageC);
        sb.append(", electricityA=").append(electricityA);
        sb.append(", electricityB=").append(electricityB);
        sb.append(", electricityC=").append(electricityC);
        sb.append(", electricLeakage1=").append(electricLeakage1);
        sb.append(", electricLeakage2=").append(electricLeakage2);
        sb.append(", electricLeakage3=").append(electricLeakage3);
        sb.append(", electricLeakage4=").append(electricLeakage4);
        sb.append(", temperature1=").append(temperature1);
        sb.append(", temperature2=").append(temperature2);
        sb.append(", temperature3=").append(temperature3);
        sb.append(", temperature4=").append(temperature4);
        sb.append(", arcFault=").append(arcFault);
        sb.append(", resistance=").append(resistance);
        sb.append(", online=").append(online);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}