package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.LoginMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginMapper loginMapper;

	@Override
	public Boolean login(SysUser user) {
		// TODO Auto-generated method stub
		//根据用户名查询用户
				SysUser sysUser = loginMapper.selectUserByUsername(user.getUsername());
				//查找不到用户 或 输入密码与用户密码不匹配 返回false
				//查找到用户  且  输入密码与用户密码匹配 返回true
				if(sysUser!=null && user.getPassword().equals(sysUser.getPassword())){
					return true;
				}
				return false;
	}
	
}
