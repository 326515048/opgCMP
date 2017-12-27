package com.opg.jpademo.company2domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by fan.shijun on 2017-12-04.
 */
public interface CompanyDomainRepository extends JpaRepository<CompanyDomain, Long> {
}
