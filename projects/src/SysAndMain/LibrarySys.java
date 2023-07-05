/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SysAndMain;

import Is_A.AllBooks;
import Is_A.EBooks;
import Is_A.PhysicalBooks;
import java.util.TreeSet;

/**
 *
 * @author zeynepucuncuoglu
 */
public class LibrarySys {

    public static TreeSet<AllBooks> booksarr;
    
    public static boolean SearchBook(String isbn) {
        for (AllBooks x : booksarr) {
            if (x.checkBookIsbn(isbn)) {
                return true;
            }

        }
        return false;
    }

    public static AllBooks SearchedBook(String isbn) {
        for (AllBooks x : booksarr) {
            String isbnObj = x.getIsbn();
            if(isbnObj.equalsIgnoreCase(isbn)){
                return x;
            }
        }
        return null;
    }

    public static String displayBooks() {
        String display = "";

        for (AllBooks x : booksarr) {
            display += x.toString() + "\n";
        }
        return display;
    }

    public static void deleteBooks(String isbn) {
        for (AllBooks x : booksarr) {
            if (x.getIsbn().equalsIgnoreCase(isbn)) {
                booksarr.remove(x);
            }
        }
    }

    public static boolean addPhysicalBook(String isbn,String title, String author,int yearPublished,String placeinlib,int numOfCopies,String condition) {
        if (SearchBook(isbn)) {
            return false;
        } else {
            PhysicalBooks x=new PhysicalBooks(isbn,title,author,yearPublished,placeinlib,numOfCopies,condition);
            booksarr.add(x);
            return true;
            
        }
    }

    public static boolean addEbook(String isbn,String title,String author,int yearPublished, String link,String database) {
        
        if (SearchBook(isbn)) {
            return false;
        } else {
            EBooks x=new EBooks(title,author,yearPublished,isbn,link,database);
            booksarr.add(x);
            return true;
        }
        
  
    }
 
    public void calculateDaysAllowedToBorrow(){
        for(AllBooks x : booksarr){
             x.calculateAllowedDaystoBorrowBook();
        }
        
    }
    
}

