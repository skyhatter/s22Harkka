package harkka.EstateManagement.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AppUserRegistration {
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty
	@Size(min = 4, max = 30)
	private String username = "";
	
	@NotEmpty
	@Size(min = 4, max = 30)
	private String password = "";

	@NotEmpty
	@Size(min = 4, max = 30)
	private String passwordCheck = "";
		
	@NotEmpty
	private String role = "USER";
	
	public AppUserRegistration() {
		super();
	}

	public AppUserRegistration(@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty @Size(min = 4, max = 30) String username,
			@NotEmpty @Size(min = 4, max = 30) String password, @NotEmpty @Size(min = 4, max = 30) String passwordCheck,
			@NotEmpty String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.passwordCheck = passwordCheck;
		this.role = role;
	}

	public AppUserRegistration(@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty @Size(min = 4, max = 30) String username,
			@NotEmpty @Size(min = 4, max = 30) String password,
			@NotEmpty @Size(min = 4, max = 30) String passwordCheck) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.passwordCheck = passwordCheck;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AppUserRegistration [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", passwordCheck=" + passwordCheck + ", role=" + role + "]";
	}
	
	
}
