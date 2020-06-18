package ezcar.backend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    
    private String userName;
    private String userPhoneNumber;
    @Id
    private int userId;

    public User(){}

    public User(String username, String userphone, int userId){
        this.userName = username;
        this.userPhoneNumber = userphone;
        this.userId = userId;
    }

    public void setUserName(String username){
        this.userName = username;
    }

    public void setUserPhoneNumber(String userphone){
        this.userPhoneNumber = userphone;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserPhoneNumber(){
        return userPhoneNumber;
    }

    public int getUserId(){
        return userId;
    }
}