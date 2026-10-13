package org.codewiththamsanqa;

public class LoginCheck {
    String username = "tahmiix@gmail.com";
    String password = "12345678";

public void checkCredentials(){
    String dUserName = "tahmiix@gmail.com";
    String dPassword = "12345678";
    String result;

    if(this.username.equals(dUserName) && this.password.equals(dPassword)){
        result = "Login Successful !!!";

    }else{
        result = "Invalid Credentials";
    }

    System.out.println(result);
}
}
