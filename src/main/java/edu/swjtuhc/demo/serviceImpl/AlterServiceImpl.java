package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.AlterMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.service.AlterService;

@Service
public class AlterServiceImpl implements AlterService{

	@Autowired
	AlterMapper alterMapper;
	
	
	@Override
	public int alter(SysUser user) {
		// TODO Auto-generated method stub
		return alterMapper.updateUserPwdByUid(user);
	}

}
