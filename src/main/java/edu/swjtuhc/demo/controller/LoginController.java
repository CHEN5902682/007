package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.LoginService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	@RequestMapping("/logins")
	public JSONObject login(@RequestBody SysUser lgoin){
		JSONObject result = new JSONObject();
		if(lgoin!=null && lgoin.getUsername()!=null && lgoin.getPassword()!=null){
			Boolean login = loginService.login(lgoin);
			if(login){
				result.put(1,"登陆成功");
			}else{
				result.put(0,"密码或用户名错误");
			}
		}else{
			result.put(-1,"用户名或者密码不能为空");
		}
		return result;
	}
}
