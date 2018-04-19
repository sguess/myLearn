package com.sguess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
public class HomeCtrl {
	Logger LOG = LoggerFactory.getLogger(HomeCtrl.class);
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
    	LOG.info("----------------->{}",new Date());
        return "pages/main";
    }

    @RequestMapping(value = "/a", method = RequestMethod.GET)
    public ModelAndView  homePage2() throws IOException {
    	ModelAndView result = new ModelAndView("pages/main");
    	LOG.info("----------------2->{}",new Date());
        return result;
    }

    @RequestMapping(value = "/b", method = RequestMethod.GET)
    public String navigatorDownloadDetailsHis() {
    	LOG.info("----------------3-->{}",new Date());
        return "templates/pages/main";
    }
    @RequestMapping("/greeting")
    public String greeting(String name, Model m){
        m.addAttribute("name",name);
        return "main";
    }
}