package com.opg.jpademo.CdnTraffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Controller
//@EnableAutoConfiguration
public class CdnTrafficService {

    @Autowired
    CdnTrafficRepository cdnTrafficRepository;

    @RequestMapping(value = "/cdnTraffic/save", method = RequestMethod.POST)
    @ResponseBody
    public CdnTraffic save(@RequestBody CdnTraffic cdnTraffic) {
        return cdnTrafficRepository.save(cdnTraffic);
    }

    @RequestMapping(value = "/cdnTraffic/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody CdnTraffic cdnTraffic) {
        cdnTrafficRepository.delete(cdnTraffic);
        return "{}";
    }

    @RequestMapping("/cdnTraffic/all")
    @ResponseBody
    public List<CdnTraffic> all() {
        return cdnTrafficRepository.findAll();
    }

    @RequestMapping(value = "/cdnTraffic/testadd", method = RequestMethod.GET)
    @ResponseBody
    public String testadd() {
        long utctime1 = 1506787200;
        Random ran1 = new Random(100);
        for (int i = 0; i < 1000; i++) {
            CdnTraffic cdnTraffic = new CdnTraffic();
            cdnTraffic.setCdnCompany("azure");
            cdnTraffic.setDomainName("live.a");
            cdnTraffic.setTrafficID(null);
            cdnTraffic.setTrafficUtcTime(String.valueOf(utctime1));
            cdnTraffic.setTrafficValue(ran1.nextInt(100));
            cdnTrafficRepository.save(cdnTraffic);
            utctime1 = utctime1 + 3600;
        }
        return "OK";
    }
}
