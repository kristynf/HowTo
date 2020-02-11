package com.kristyn.howto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/embedding")
    public String embedding() {
        return "embedding";
    }
    @RequestMapping("/microtomy")
    public String microtomy() {
        return "microtomy";
    }
    @RequestMapping("/dogwalking")
    public String dogwalking() {
        return "dogwalking";
    }

}
