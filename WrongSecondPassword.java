/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaplication1;

/**
 *
 * @author Marina
 */
class WrongSecondPassword extends Exception{
    public WrongSecondPassword(){
        super();
    }
    public WrongSecondPassword(String errorMessage){
        super("WrongSecondPassword" + errorMessage);
    }
}
