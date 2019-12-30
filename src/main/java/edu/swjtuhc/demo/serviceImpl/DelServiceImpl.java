package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.DelMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.DelService;

@Service
public class DelServiceImpl implements DelService{

	
	@Autowired
	DelMapper delMapper;
	@Override
	public int delUser(SysUser user) {
		// TODO Auto-generated method stub
		SysUser u0 = delMapper.selectUserByUsername(user.getUsername());
		System.out.println(user);
		int i = -1;
		if(u0==null) {
			
			i = 1;
		}else {
			
			i = delMapper.delUser(user);
			i=i+1;
		}
		
		return i;
		
	}
	
}
