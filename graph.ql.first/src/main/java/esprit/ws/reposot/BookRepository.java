package esprit.ws.reposot;

import java.util.ArrayList;
import java.util.List;

import esprit.ws.entities.Author;
import esprit.ws.entities.Book;

public class BookRepository {
	private  List<Book> listBook;
	public   AuthorRepository authRepo= new AuthorRepository();
	public BookRepository() {
		listBook=new ArrayList<Book>();
		listBook.add(new Book(1, "book 1", this.authRepo.getAuthorById(123) ,"40","40"));
		listBook.add(new Book(2, "book 2", this.authRepo.getAuthorById(456) ,"10","40"));
	}
	
    public List<Book> getListBook() {
		return listBook;
    }
    //function to add a product
    //verify if the given category exist in the list or not
    public boolean addBook(Book p){
		int idAuth=p.getAuthor().getId();
		Author author=authRepo.getAuthorById(idAuth);
		if(author!=null){
			p.setAuthor(author);
			return listBook.add(p);}
		return false;
	}
    //function to return the list of product by Category
    public List<Book> getBookByAuthorId(int id) {
		List<Book> list=new ArrayList<Book>();
		for(Book p:listBook){
			if(p.getAuthor().getId()==id)
				list.add(p);
		}
		return list;
	}
    //update Product
    public boolean updateBook(Book book){
 		for (Book p: listBook)
 		{
 			if(p.getId()==book.getId())
 			{
 				p.setTitle(book.getTitle());
 				p.setAuthor(book.getAuthor());
 				p.setDateCreation(book.getDateCreation());
 				p.setAbstractBook(book.getAbstractBook());
 				return true;
 			}
 		}
 		return false;
 	}
    
    public void deleteBook(int id){
    		Book p = this.getBookById(id);
    		this.listBook.remove(p);
    		
    	
	}
    public Book getBookById(int id)
	{
		for (Book p:listBook)
		{if (p.getId() ==id)
			
		return p;
		
		}
		return null;
		
		}

}
