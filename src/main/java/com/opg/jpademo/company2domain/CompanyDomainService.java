package com.opg.jpademo.company2domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Controller
//@EnableAutoConfiguration
public class CompanyDomainService {

    @Autowired
    CompanyDomainRepository userRepository;

    @RequestMapping("/companyDomain2")
    public String login(Model model) {
        return "/companyDomain2";
    }

    @RequestMapping(value = "/companyDomain/save", method = RequestMethod.POST)
    @ResponseBody
    public CompanyDomain save(@RequestBody CompanyDomain companyDomain) {
        return userRepository.save(companyDomain);
    }

    @RequestMapping(value = "/companyDomain/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody CompanyDomain companyDomain) {
        userRepository.delete(companyDomain);
        return "{}";
    }

    @RequestMapping("/companyDomain/all")
    @ResponseBody
    public List<CompanyDomain> all() {
        return userRepository.findAll();
    }

}
