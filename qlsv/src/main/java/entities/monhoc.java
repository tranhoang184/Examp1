package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class monhoc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3483028378047283756L;
	private String MaMH;
	private String TenMH;
	private String MaGV;

	public monhoc(String MaMH, String TenMH, String MaGV) {
		this.MaMH = MaMH;
		this.TenMH = TenMH;
		this.MaGV = MaGV;

	}
}
