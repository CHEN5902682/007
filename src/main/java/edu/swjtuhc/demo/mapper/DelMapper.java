package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.SysUser;

@Mapper
public interface DelMapper {
	public SysUser selectUserByUsername(String username);
	public int delUser(SysUser user);
}
