package eu.arcangelovicedomini.javaforum.api.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForumController {

    @RequestMapping(value = "/forum/{forumId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getForum(@PathVariable(value = "forumId") Long forumId) {

    }
}
