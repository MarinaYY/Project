package javaapplication1;

/**
 *
 * @author Marina
 */
public class SetGet {

    private String firstName, lastName, email, password, password2;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException();

        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException();

        } else {
            this.lastName = lastName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {

            throw new NullPointerException();
        } else {
            this.email = email;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null) {
            throw new NullPointerException();

        } else {
            this.password = password;
        }
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        if (password2 == null) {

            throw new NullPointerException();
        } else {
            this.password2 = password2;
        }
    }

    public String toString() {
        return String.format("%s %s %s %s %s %n", getFirstName(), getLastName(), getEmail(), getPassword(), getPassword2());
    }

    public SetGet(String firstName, String lastName, String email, String password, String passwprd2) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        setPassword2(password2);
    }

    public SetGet() {
        this("-", "-", "-", "-", "-");
    }

    public SetGet(SetGet obj) {
        this(obj.getFirstName(), obj.getLastName(), obj.getEmail(), obj.getPassword(), obj.getPassword2());
    }
}