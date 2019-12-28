package edu.swjtuhc.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.Movie;
import edu.swjtuhc.demo.service.MovieService;



@RestController
@RequestMapping("/movies")
public class MovieCintroller {

	@Autowired
	MovieService moieService;
	@RequestMapping("/getList")
	public List<Movie> getList(){
		return moieService.getMovieList();
	}
}
