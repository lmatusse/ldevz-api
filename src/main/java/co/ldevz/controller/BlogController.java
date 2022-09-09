package co.ldevz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.ldevz.model.Blog;
import co.ldevz.service.BlogService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BlogController {
	
@Autowired
private BlogService blogService;
@CrossOrigin
@RequestMapping(method=RequestMethod.GET,path="blog/{user}")
public List<Blog> getAll(@PathVariable String user) {
	return blogService.findAll();
}
@CrossOrigin
@DeleteMapping(path="blog/{id}")
public ResponseEntity<Void> deleteBlog(@PathVariable long id){
	Blog blog= blogService.deleteBlog(id);
	if(blog==null) {
		return ResponseEntity.noContent().build();
	}
	return ResponseEntity.notFound().build();
}
}
