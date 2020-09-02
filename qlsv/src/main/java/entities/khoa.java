package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class khoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6288570195978385786L;
	private String MaKhoa;
	private String TenKhoa;

	public khoa(String MaKhoa, String TenKhoa) {
		this.MaKhoa = MaKhoa;
		this.TenKhoa = TenKhoa;
	}

}
