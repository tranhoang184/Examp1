package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class hocky implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6259499199625403631L;
	private String MaHK;
	private String TenHK;

	public hocky(String MaHK, String TenHK) {
		this.MaHK = MaHK;
		this.TenHK = TenHK;
	}

}
