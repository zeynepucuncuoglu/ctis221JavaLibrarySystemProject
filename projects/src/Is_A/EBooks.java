/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Is_A;

/**
 *
 * @author zeynepucuncuoglu
 */
    public class EBooks extends AllBooks{
    
    private String link;
    private String database;
    
    public EBooks(String title, String author, int yearPublished, String isbn,String link, String database){ 
           
        super(title, author,yearPublished, isbn);
        this.link=link;
        this.database=database;
    }
    
    @Override
    public String toString() {
        
        return super.toString()+"\nEBook info:" + "\nLink:" + link + "\nDatabase=" + database;
    }

    @Override
    public void calculateAllowedDaystoBorrowBook(){
       
        dayAllowedToBorrow = 100;
        
        
    }
    
}

