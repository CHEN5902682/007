package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.AlterService;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/alter")
public class AlterController {
	
	@Autowired
	AlterService alterService;
	
	@RequestMapping("/alters")
	public JSONObject alter(@RequestBody SysUser user){
		JSONObject result = new JSONObject();
		if(user!=null && user.getPassword()!=null){
			int res = alterService.alter(user);
			if(res>0){
				result.put(1,"修改成功");
			}else{
				result.put(0,"修改失败");
			}
		}else{
			result.put(-1,"待修改的密码不能为空");
		}
		return result;
	}
	
}
