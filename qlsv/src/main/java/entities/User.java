package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7669228595077443282L;

	private String username;
	private String pass;
	private String type;

	public User(String username, String pass, String type) {
		this.username = username;
		this.pass = pass;
		this.type = type;
	}
}
