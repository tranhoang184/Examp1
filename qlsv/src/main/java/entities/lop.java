package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class lop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5528569837757037472L;
	private String MaLop;
	private String TenLop;
	private String MaKhoa;
	private String MaGV;

	public lop(String MaLop, String TenLop, String MaKhoa, String MaGV) {
		this.MaLop = MaLop;
		this.TenLop = TenLop;
		this.MaKhoa = MaKhoa;
		this.MaGV = MaGV;

	}
}
