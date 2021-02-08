package com.crts.app.sme.main.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String fullName;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<UserAddress> userLaddress;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<UserAddress> userPaddress;
	
	private long userMobno;
	private long userAmobno;
	private String userEmail;
	private String userGender;
	private String userName;
	private String passWord;
	@OneToOne(cascade=CascadeType.ALL)
	private Role userRole;
	@OneToOne(cascade=CascadeType.ALL)
	private Branch userBranch;
	private String userDob;
	private String userDoj;
	private int userStatusCode;
	//private UserDocuments userdocument;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public List<UserAddress> getUserLaddress() {
		return userLaddress;
	}
	public void setUserLaddress(List<UserAddress> userLaddress) {
		this.userLaddress = userLaddress;
	}
	public List<UserAddress> getUserPaddress() {
		return userPaddress;
	}
	public void setUserPaddress(List<UserAddress> userPaddress) {
		this.userPaddress = userPaddress;
	}
	public long getUserMobno() {
		return userMobno;
	}
	public void setUserMobno(long userMobno) {
		this.userMobno = userMobno;
	}
	public long getUserAmobno() {
		return userAmobno;
	}
	public void setUserAmobno(long userAmobno) {
		this.userAmobno = userAmobno;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	public Branch getUserBranch() {
		return userBranch;
	}
	public void setUserBranch(Branch userBranch) {
		this.userBranch = userBranch;
	}
	public String getUserDob() {
		return userDob;
	}
	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
	public String getUserDoj() {
		return userDoj;
	}
	public void setUserDoj(String userDoj) {
		this.userDoj = userDoj;
	}
	public int getUserStatusCode() {
		return userStatusCode;
	}
	public void setUserStatusCode(int userStatusCode) {
		this.userStatusCode = userStatusCode;
	}
//	public UserDocuments getUserdocument() {
//		return userdocument;
//	}
//	public void setUserdocument(UserDocuments userdocument) {
//		this.userdocument = userdocument;
//	}

	
	
	
	
	
	
}
