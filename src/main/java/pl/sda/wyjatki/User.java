package pl.sda.wyjatki;

import pl.sda.wyjatki.exeptions.EmailException;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }
    public User (){
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
        public String getEmail() {
        return email;
    }
// email = avc@wp.pl
    public void setEmail(String email) throws EmailException {
        if(!this.checkEmail (email)){
            throw new EmailException ("Niepoprawny email");
        }else{
            this.email = email;
        }
    }
    public boolean checkEmail(String email){
        return email.contains ("@");
    }
}
