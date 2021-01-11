/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projec;

/**
 *
 * @author Mina
 */
class WrongLastNameException extends Exception{
    public WrongLastNameException(){
        super();
    }
    public WrongLastNameException(String errorMessage){
        super("WrongLastNameException" + errorMessage);
    }
}
