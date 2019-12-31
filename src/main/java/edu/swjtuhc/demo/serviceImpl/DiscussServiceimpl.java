package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.DiscussMapper;
import edu.swjtuhc.demo.model.Discuss;
import edu.swjtuhc.demo.service.DiscussService;


@Service
public class DiscussServiceimpl implements DiscussService{

	@Autowired
	DiscussMapper discussMapper;
	
	
	@Override
	public int communicate(Discuss dis) {
		// TODO Auto-generated method stub
		
		Discuss d0 =discussMapper.selectusername(dis.getContent());
		int i = -1;
		if (d0==null) {
			i = discussMapper.addcontent(dis);
		}else {
			i = 2;
		}
		return i;
	}
	
	
}