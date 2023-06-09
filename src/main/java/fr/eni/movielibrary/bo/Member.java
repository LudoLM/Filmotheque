package fr.eni.movielibrary.bo;

import java.util.List;

public class Member {

	private String lastName;
	private String firstName;
	private String login;
	private String password;
	private boolean isAdmin;

	public List<Opinion> getOpinions() {
		return opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}

	private List<Opinion> opinions;

	public Member() {
		super();
	}

	public Member(String lastName, String firstName, String login, String password, boolean isAdmin) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
