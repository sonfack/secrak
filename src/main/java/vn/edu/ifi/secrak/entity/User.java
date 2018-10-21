package vn.edu.ifi.secrak.entity;

import javax.persistence.*;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="user_fname")
	private String userFirstName ;
	
	@Column(name="user_lname")
	private String userLastName ;
	
	@Column(name="user_login", nullable=false, unique=true)
	private String userLogin ;
	
	@Column(name="user_password")
	private String userPassWord ;

	public  User(){

	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
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
