package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface LoginMapper {

	public SysUser selectUserByUsername(String username);
	public int insertUser(SysUser user);
}
