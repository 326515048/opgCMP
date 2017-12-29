package com.opg.jpademo.company2domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Entity
public class CompanyDomain {
    @Id
    @GeneratedValue
    private Long companyDomainID;
    private String domainName;
    private String domainType;
    private String userName;

    public CompanyDomain(){
    }

    public CompanyDomain(Long companyDomainID, String domainName, String domainType, String userName) {
        this.companyDomainID = companyDomainID;
        this.domainName = domainName;
        this.domainType = domainType;
        this.userName = userName;
    }

    public Long getCompanyDomainID() {
        return companyDomainID;
    }

    public void setCompanyDomainID(Long companyDomainID) {
        this.companyDomainID = companyDomainID;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
