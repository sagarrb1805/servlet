package bookstrore.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class User {
	@Id
	private int id;
	private String userName;
	
//	@OneToOne
//	private Books book;
	
	@OneToMany
	private List<Books> books = new ArrayList<Books>();
	
	
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	
//	public Books getBook() {
//		return book;
//	}
//	public void setBook(Books book) {
//		this.book = book;
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", book=" + books + "]";
	}
	
	
	

}
