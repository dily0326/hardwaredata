package com.ytrj.hardwaredata.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ytrj_app_yangan_info
 * @author 
 */
public class YanganInfo implements Serializable {
    /**
     * 唯一主键
     */
    private Long id;

    /**
     * 信号量 范围 0-31
     */
    private Integer signalQuality;

    /**
     * 电量
     */
    private Integer electricQuantity;

    /**
     * 设备状态 0正常 1报警 2故障
     */
    private Integer deviceState;

    /**
     * 原设备上传的数据
     */
    private String message;

    /**
     * 数据上传时间
     */
    private Date dataUpdateTime;

    /**
     * 数据上传的时间戳
     */
    private Date dataTimestamp;

    /**
     * 数据类型 0心跳 1状态更新
     */
    private Integer dataStream;

    /**
     * 设备在线状态 0离线 1上线
     */
    private Integer deviceOnline;

    /**
     * 设备ID
     */
    private String deviceid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSignalQuality() {
        return signalQuality;
    }

    public void setSignalQuality(Integer signalQuality) {
        this.signalQuality = signalQuality;
    }

    public Integer getElectricQuantity() {
        return electricQuantity;
    }

    public void setElectricQuantity(Integer electricQuantity) {
        this.electricQuantity = electricQuantity;
    }

    public Integer getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(Integer deviceState) {
        this.deviceState = deviceState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDataUpdateTime() {
        return dataUpdateTime;
    }

    public void setDataUpdateTime(Date dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }

    public Date getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(Date dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    public Integer getDataStream() {
        return dataStream;
    }

    public void setDataStream(Integer dataStream) {
        this.dataStream = dataStream;
    }

    public Integer getDeviceOnline() {
        return deviceOnline;
    }

    public void setDeviceOnline(Integer deviceOnline) {
        this.deviceOnline = deviceOnline;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
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
        YanganInfo other = (YanganInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSignalQuality() == null ? other.getSignalQuality() == null : this.getSignalQuality().equals(other.getSignalQuality()))
            && (this.getElectricQuantity() == null ? other.getElectricQuantity() == null : this.getElectricQuantity().equals(other.getElectricQuantity()))
            && (this.getDeviceState() == null ? other.getDeviceState() == null : this.getDeviceState().equals(other.getDeviceState()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getDataUpdateTime() == null ? other.getDataUpdateTime() == null : this.getDataUpdateTime().equals(other.getDataUpdateTime()))
            && (this.getDataTimestamp() == null ? other.getDataTimestamp() == null : this.getDataTimestamp().equals(other.getDataTimestamp()))
            && (this.getDataStream() == null ? other.getDataStream() == null : this.getDataStream().equals(other.getDataStream()))
            && (this.getDeviceOnline() == null ? other.getDeviceOnline() == null : this.getDeviceOnline().equals(other.getDeviceOnline()))
            && (this.getDeviceid() == null ? other.getDeviceid() == null : this.getDeviceid().equals(other.getDeviceid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSignalQuality() == null) ? 0 : getSignalQuality().hashCode());
        result = prime * result + ((getElectricQuantity() == null) ? 0 : getElectricQuantity().hashCode());
        result = prime * result + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getDataUpdateTime() == null) ? 0 : getDataUpdateTime().hashCode());
        result = prime * result + ((getDataTimestamp() == null) ? 0 : getDataTimestamp().hashCode());
        result = prime * result + ((getDataStream() == null) ? 0 : getDataStream().hashCode());
        result = prime * result + ((getDeviceOnline() == null) ? 0 : getDeviceOnline().hashCode());
        result = prime * result + ((getDeviceid() == null) ? 0 : getDeviceid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", signalQuality=").append(signalQuality);
        sb.append(", electricQuantity=").append(electricQuantity);
        sb.append(", deviceState=").append(deviceState);
        sb.append(", message=").append(message);
        sb.append(", dataUpdateTime=").append(dataUpdateTime);
        sb.append(", dataTimestamp=").append(dataTimestamp);
        sb.append(", dataStream=").append(dataStream);
        sb.append(", deviceOnline=").append(deviceOnline);
        sb.append(", deviceid=").append(deviceid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}