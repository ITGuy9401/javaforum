package eu.arcangelovicedomini.javaforum.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import eu.arcangelovicedomini.javaforum.core.exception.JFException;
import eu.arcangelovicedomini.javaforum.core.services.ForumService;
import eu.arcangelovicedomini.javaforum.webapp.utils.Util;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller("homeController")
@Path("/")
public class HomeController {
	
	@Autowired
	private ForumService forumService;
	
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}
	
	@GET
	@Path("forum")
    public Map<String, Object> getForumData() throws JFException {
        try {
			Map<String, Object> result = new HashMap<>();
	        forumService.getDetailForum(0L);
	        return result;
        } catch (Throwable th) {
        	throw Util.resolveException(th);
        }
    }
}