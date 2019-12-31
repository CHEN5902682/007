package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Discuss;


@Mapper
public interface DiscussMapper {
	
	public Discuss selectusername(String content);
	public int addcontent(Discuss dis);
}
