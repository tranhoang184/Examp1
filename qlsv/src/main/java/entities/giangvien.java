package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class giangvien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4792759540921051114L;
	private String MaGV;
	private String TenGV;

	public giangvien(String MaGV, String TenGV) {
		this.MaGV = MaGV;
		this.TenGV = TenGV;
	}

}
