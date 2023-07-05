/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Has_A.Members;
import java.util.ArrayList;

/**
 *
 * @author zeynepucuncuoglu
 */
public abstract class AllBooks {

    protected String title;
    protected String author;
    protected int yearPublished;
    protected String isbn;
    protected ArrayList<Members> members;
    protected int dayAllowedToBorrow;
    
    public AllBooks(String title, String author,int yearPublished, String isbn) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.members = (ArrayList<Members>)members.clone();
        
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    


    public void setDayAllowedToBorrow(int dayAllowedToBorrow) {
        this.dayAllowedToBorrow = dayAllowedToBorrow;
    }

   
    
    public boolean checkBookIsbn(String isbn) {
        if (this.isbn.equalsIgnoreCase(isbn)) {
            return true;
        } 
            return false; 
    }
    
     public void addMember(String nameSurname, int id) {
        Members x= new Members(nameSurname,id);
        members.add(x);
    }
    
    public abstract void calculateAllowedDaystoBorrowBook();

    @Override
    public String toString() {
        return "Book Info:\n" 
                + "Title:" + title + "\nAuthor:" + author + "\nYear Published:" + yearPublished + 
                "\nIsbn:" + isbn + "\nPeople who have borrowed the book:" + members.toString()+
                "\nDays Allowed to Borrow:"+dayAllowedToBorrow;
    }
    
    

}

