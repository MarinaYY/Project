package javaaplication1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Marina
 */
public class SetGet {

    private String firstName, lastName, email, password, password2;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws WrongFirstNameException {
        Pattern fName = Pattern.compile("[A-Z][\\-\\,\\a-z\\.\\ ']+[ ]*");
        Matcher fName2 = fName.matcher(firstName);
        if (fName2.matches() == true) {
            this.firstName = firstName;
     }
            else{
        throw new WrongFirstNameException();
    
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws WrongLastNameException {
         Pattern lName = Pattern.compile("[A-Z][\\-\\,\\a-z\\.\\ ']+[ ]*");
        Matcher lName2 = lName.matcher(lastName);
        if (lName2.matches() == true) {
            this.lastName = lastName;
     }
            else{
        throw new WrongLastNameException();
    
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws WrongEmailException {
        Pattern mail1 = Pattern.compile("\\w+@\\w+\\.[a-zA-Z]{2,3}");
        Matcher mail2 = mail1.matcher(email);
        if (mail2.matches() == true) {
            this.email = email;
        }
    else{
        throw new WrongEmailException();
    }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null) {
            this.password = password;
        } else {
           throw new NullPointerException();
        }
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) throws WrongSecondPassword {
        if (password2.equals(getPassword())) {
            this.password2 = password2;    
        } else {
            throw new WrongSecondPassword();
        }
    }

    public String toString() {
        return String.format("%s %s %s %s %s %n", getFirstName(), getLastName(), getEmail(), getPassword(), getPassword2());
    }

    public SetGet(String firstName, String lastName, String email, String password, String password2) throws WrongSecondPassword, WrongEmailException, WrongFirstNameException, WrongLastNameException {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setPassword2(password2);
    }

    public SetGet() throws WrongSecondPassword, WrongEmailException, WrongFirstNameException, WrongLastNameException {
        this("-", "-", "-", "-", "-");
    }

    public SetGet(SetGet obj) throws WrongSecondPassword, WrongEmailException, WrongFirstNameException, WrongLastNameException {
        this(obj.getFirstName(), obj.getLastName(), obj.getEmail(), obj.getPassword(), obj.getPassword2());
    }
}