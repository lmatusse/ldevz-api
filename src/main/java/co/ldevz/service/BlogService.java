package co.ldevz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import co.ldevz.model.Blog;

@Service
public class BlogService {
private static List <Blog> blogs = new ArrayList<>();
private static Long idCounter=0L;

static {
	blogs.add(new Blog(idCounter++,"Data Analitcs", "Data analytics ou análise de dados, é o processo de explorar, transformar e analisar informações para identificar tendências e padrões que revelam insights significativos que dão suporte à tomada de "
			+ "decisões. Uma estratégia moderna de analytics permite que os sistemas e as organizações ajam com base em análises automatizadas em tempo real, garantindo resultados impactantes e imediatos.",new Date() ,"Tecnologia"));
	
}

		public List<Blog> findAll(){
	return blogs;
}
		public Blog findById(long id) {
			for(Blog blog:blogs) {
				if(blog.getId()==id) {
					return blog;
				}
			}
			return null;
		}
		public Blog deleteBlog(long id) {
			Blog blog=findById(id);
			if(blog==null) {
				return null;
			}
			if(blogs.remove(blog)) {
				return blog;
			}
			return null;
		}

}
