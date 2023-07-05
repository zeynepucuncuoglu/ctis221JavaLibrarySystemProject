/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

import Interface.ReplaceInterface;
import java.util.ArrayList;

/**
 *
 * @author zeynepucuncuoglu
 */

public class PhysicalBooks extends AllBooks implements ReplaceInterface{
   
    private String placeLib;
   
    private int numOfCopies;
    private String condition;
    //private ArrayList<PhysicalBooks> copies = new ArrayList();
    
    
    public PhysicalBooks(String isbn,String title, String author,int yearPublished,String placeinlib,int numOfCopies,String condition){
        super(title,author,yearPublished,isbn);
        this.placeLib=placeLib;
        this.condition=condition;
        
    }
    
   

    @Override
    public void calculateAllowedDaystoBorrowBook() {
        
         dayAllowedToBorrow=15;
        
        if(numOfCopies > 10){
            dayAllowedToBorrow += 10 ;        
        }else{
            if(condition.equalsIgnoreCase("bad")){
                dayAllowedToBorrow -= 5;
            }else{
                dayAllowedToBorrow +=5;
            }
        }
        
        
        
    }

    @Override
    public String findBooksNeededToReplace() {
        
        String out="you do not need to change";
        
        int cnt = members.size();
        if(yearPublished < 2000 && cnt > 20 ){
            condition = "bad";
           out = "You need to change the book with the new one"; 
            
            return out;
        }
        
      return out;  
    }
    
    
    
    
    
    
}
