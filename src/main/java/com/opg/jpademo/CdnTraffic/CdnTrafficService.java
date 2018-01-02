package com.opg.jpademo.CdnTraffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

}
