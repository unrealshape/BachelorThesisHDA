package Model;

public class UserModel {
	
	//variabeln
	private int id;
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	
	//default constructor
	public UserModel() {
		// TODO Auto-generated constructor stub
	}
	//constructor
	public UserModel(int id, String username, String password, String email, String firstname, String lastname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	//constructor for login
	public UserModel(String username, String password)
	{
		super();
		this.username = username;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
}
