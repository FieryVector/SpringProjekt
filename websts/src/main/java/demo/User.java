package demo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	@NotNull
	@NotEmpty(message = "{validation.username.NotEmpty.message}")
	@Size(min = 8, max = 16, message = "{validation.username.kurzbeschr.message}")
	private String username;
	
	@NotEmpty(message = "{validation.firstname.NotEmpty.message}")
	@Size(min = 2, max = 60, message = "{validation.firstname.Size.message}")
	private String firstname;

	@NotNull
	private String lastname;
	
	@NotNull
	private String password;
	
	private boolean admin;
	
	@NotNull
	@NotEmpty(message = "{validation.email.NotEmpty.message}")
	private String email;

	public User(String username, String firstname, String lastname, String password, boolean admin, String email) {
	setUsername(username);
	setEmail(email);
	setAdmin(admin);
	setFirstname(firstname);
	setLastname(lastname);
	setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", password=" + password
				+ ", admin=" + admin + ", email=" + email + "]";
	}
}
