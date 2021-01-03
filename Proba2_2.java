/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

/**
 *
 * @author Marina
 */
public class Proba2_2 {
    private String firstName, lastName, email, password, password2;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null){
            throw new NullPointerException();
                 
        }
        else{
             this.firstName = firstName; 
        }
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null){
             throw new NullPointerException();
                 
        }
        else{
            this.lastName = lastName;  
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null){
        
         throw new NullPointerException();
        }
        else{
             this.email = email;
        }
       
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null){
            throw new NullPointerException();
                
        }
        else{
             this.password = password;   
        }
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        if(password2 == null){
          
 throw new NullPointerException();          
        }
        else{
            this.password2 = password2;
        }
    }

    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %n", getFirstName(),getLastName(), getEmail(), getPassword(),getPassword2());
    }
    public Proba2_2(String firstName, String lastName, String email, String password, String passwprd2){
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setPassword2(password2);
    }
    public Proba2_2(){
        this("-","-","-","-","-");
    }
    public Proba2_2(Proba2_2 obj){
        this(obj.getFirstName(),obj.getLastName(),obj.getEmail(),obj.getPassword(),obj.getPassword2());
    }
}
