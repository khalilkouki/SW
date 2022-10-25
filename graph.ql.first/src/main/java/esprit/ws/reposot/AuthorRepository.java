package esprit.ws.reposot;

import java.util.ArrayList;
import java.util.List;

import esprit.ws.entities.Author;

public class AuthorRepository {
	
	private  List<Author> listAuthor;
	
	
	public AuthorRepository()
	{
		listAuthor=new ArrayList<Author>();
		listAuthor.add(new Author(123, "Category1", "author@mail"));
		listAuthor.add(new Author(456, "Category 2","author@mail"));
	}
	//create student
	public Author createAuthor(Author s) {
		this.listAuthor.add(s);
		return s;
	}
	
	public List<Author>getListAuthor()
	{return listAuthor;}

	
	public Author getAuthorById(int id)
	{
		for (Author S:listAuthor)
		{if (S.getId()==id)
			
		return S;
		
		}
		return null;
		
		}
	public void deleteAuthor(int id) {
		Author c = this.getAuthorById(id);
		this.listAuthor.remove(c);
		
	}
	public void updateAuthor(Author c) {
		for(Author c2:this.listAuthor) {
			
			if(c2.getId()==c.getId()) {
				
				c2.setId(c.getId());
				c2.setName(c.getName());
				c2.setEmail(c.getEmail());
				
			}
		}
	
	}
	
	
}
