/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projec;

/**
 *
 * @author Marina
 */
public class WrongEmailException extends Exception {
    public WrongEmailException(){
        super();
    }
    public WrongEmailException(String errorMessage){
        super("WrongEmailException" + errorMessage);
    }
}
