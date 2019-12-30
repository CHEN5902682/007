package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.DelService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/del")
public class DelController {
	
	@Autowired
	DelService delService;
	@RequestMapping("/deluser")
	public JSONObject delete(@RequestBody SysUser user) {
		JSONObject result = new JSONObject();
		
//		调用Service
		int i = delService.delUser(user);
		result.put("state", i);
		
		
		return result;
	}
}
