package eu.arcangelovicedomini.javaforum.webapp.controller;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller("homeController")
public class HomeController {
    public Map<String, Object> getForumData(){
        Map<String, Object> result = new HashMap<>();
    }
}