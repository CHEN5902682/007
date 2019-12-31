package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Discuss;
import edu.swjtuhc.demo.service.DiscussService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class DiscussController {
	@Autowired
	DiscussService discussService;
	
	@RequestMapping("/communicate")
	public JSONObject communicate(@RequestBody Discuss dis) {
		JSONObject result = new JSONObject();
		
		int i = discussService.communicate(dis);
		result.put("state", i);
		return result;
	}
}
