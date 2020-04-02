# SpringBoot-Rest-1

> WebService using Spring-Boot 

## Dependencies 
 
> 	1. Web
 	
> 	2. JPA
 	
> 	3. MySql
 	 
> 	4. Dev Tools

> ## Controller [com.niit.myblog.controller]
1. Create a Class BlogController

> it is used for Fetch,Save,Update & Delete blogs

1. Create Class **BlogController**

```	
	@RestController
   	class BlogController
     	{
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
	public Blog show(@PathVariable String id) 
	{
	
		int blogId = Integer.parseInt(id);
		
		return blogMockedData.getBlogById(blogId);
	}
	
	@PostMapping("/blog/search")
	public List<Blog> search(@RequestBody Map<String, String> body) {
		String searchTerm = body.get("text");
		return blogMockedData.searchBlogs(searchTerm);
	}
}

```


## POJO [com.niit.myblog.model]

>> 1. Create a Class **Blog**
 
 ```
public class Blog {
	
	private int id;
	private String title;
	private String content;
	
	//Getter/setter 
	//Default and Parameterised Constructor
	//toString()
}

```
 
>>  2. create class BlogMockedData
 
```
public class BlogMockedData
{
	 //list of blog posts
    private List<Blog> blogs;

    private static BlogMockedData instance = null;
    
      public static BlogMockedData getInstance(){
         if(instance == null){
             instance = new BlogMockedData();
         }
         return instance;
    }
    
    public BlogMockedData()
    public List<Blog> fetchBlogs()
    
     // return blog by id
    public Blog getBlogById(int id)
    
     public List<Blog> searchBlogs(String searchTerm)
     
      // create blog
    public Blog createBlog(int id, String title, String content)
 // update blog
    public Blog updateBlog(int id, String title, String content)
    
    // delete blog by id
    public boolean delete(int id)
}


 
```

