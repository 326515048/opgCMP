package com.opg.jpademo.CdnTraffic;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Entity
public class CdnTraffic {
    @Id
    @GenericGenerator(name = "my-uuid", strategy = "uuid")
    @GeneratedValue(generator = "my-uuid")
    private String trafficID;
    private String trafficUtcTime;
    private String domainName;
    private double trafficValue;
    private String cdnCompany;

    public CdnTraffic(){
    }

    public CdnTraffic(String trafficID, String trafficUtcTime, String domainName, double trafficValue, String cdnCompany) {
        this.trafficID = trafficID;
        this.trafficUtcTime = trafficUtcTime;
        this.domainName = domainName;
        this.trafficValue = trafficValue;
        this.cdnCompany = cdnCompany;
    }

    public String getTrafficID() {
        return trafficID;
    }

    public void setTrafficID(String trafficID) {
        this.trafficID = trafficID;
    }

    public String getTrafficUtcTime() {
        return trafficUtcTime;
    }

    public void setTrafficUtcTime(String trafficUtcTime) {
        this.trafficUtcTime = trafficUtcTime;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public double getTrafficValue() {
        return trafficValue;
    }

    public void setTrafficValue(double trafficValue) {
        this.trafficValue = trafficValue;
    }

    public String getCdnCompany() {
        return cdnCompany;
    }

    public void setCdnCompany(String cdnCompany) {
        this.cdnCompany = cdnCompany;
    }
}
