/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Has_A;

/**
 *
 * @author zeynepucuncuoglu
 */
public class Members {
    
    private String nameSurname;
    private int id;
    private int signedDay;
    
    //private int rate;
    private String membershipType;
    
    public Members(String nameSurname ,int id){
        this.nameSurname=nameSurname;
        this.id=id;
    }

    public int getSignedDay() {
        return signedDay;
    }

    public String getMembershipType() {
        return membershipType;
    }

    
     
    @Override
    public String toString() {
        return "Members\n" + 
               "nameSurname=" + nameSurname +
               "id=" + id ; 
               
    }
    
    
    
    
    
}
