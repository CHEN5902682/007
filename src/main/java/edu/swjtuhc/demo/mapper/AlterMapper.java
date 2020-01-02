package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface AlterMapper {

public SysUser selectUserByUsername(String username);
	
	

	public int updateUserPwdByUid(SysUser user);
}
