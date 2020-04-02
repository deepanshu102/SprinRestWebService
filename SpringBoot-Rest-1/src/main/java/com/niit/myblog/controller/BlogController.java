package com.niit.myblog.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.myblog.model.Blog;
import com.niit.myblog.model.BlogMockedData;

@RestController
public class BlogController {
	BlogMockedData blogMockedData = BlogMockedData.getInstance();
//	@RequestMapping("/")
//	public String index()
//	{
//		return "Welcome to BlogController";
//	}

	@GetMapping("/blog")
	public List<Blog> index() {

		return blogMockedData.fetchBlogs();
	}

	@GetMapping("/blog/{id}")
	public Blog show(@PathVariable String id) {

		int blogId = Integer.parseInt(id);

		return blogMockedData.getBlogById(blogId);
	}

	@PostMapping("/blog/search")
	public List<Blog> search(@RequestBody Map<String, String> body) {
		String searchTerm = body.get("text");
		
		System.out.println(body.get("text"));
		return blogMockedData.searchBlogs(searchTerm);
	}
}
