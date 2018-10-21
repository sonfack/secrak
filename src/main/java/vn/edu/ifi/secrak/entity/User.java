package vn.edu.ifi.secrak.entity;

import javax.persistence.*;

@Entity
@Table(name="secrakuser")
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="secrakuser_id")
	private Long userId;
	
	@Column(name="secrakuser_name")
	private String userName ;

    @Column(name="secrakuser_number")
    private String userNumber ;

	@Column(name="secrakuser_login", nullable=false, unique=true)
	private String userLogin ;
	
	@Column(name="secrakuser_password")
	private String userPassWord ;

	public  User(){

	}

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }
}
