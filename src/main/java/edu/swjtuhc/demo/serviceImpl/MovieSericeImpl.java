package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.MovieMapper;
import edu.swjtuhc.demo.model.Movie;
import edu.swjtuhc.demo.service.MovieService;

@Service
public class MovieSericeImpl implements MovieService{

	@Autowired
	MovieMapper movieMapper;
	
	@Override
	public List<Movie> getMovieList() {
		// TODO Auto-generated method stub
		return movieMapper.selectAllMovies();
	}

}
