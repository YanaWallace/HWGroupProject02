package HWGroupExercise2;

public class RegistrationClass9 {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email){
        if(email.contains("yahoo")){
            this.email=email;
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }
    }
    void setUserName(String userName){
        if(userName.isEmpty()){
            System.out.println("username must not be empty");
        }else if(userName.length()<=6){
            System.out.println("username must be more than 6 characters");
        }else{
            this.userName=userName;
            System.out.println("valid username");
        }
    }
    void setPassword(String password){
        if(password.isEmpty()){
            System.out.println("password must not be empty");
        }else if(password.contains(userName.toLowerCase())) {
            System.out.println("password must not contain username");
        }else{
            this.password=password;
            System.out.println("valid password");

        }
    }
    }
