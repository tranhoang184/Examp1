package entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class diem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1688732026354432950L;
	private String MaSV;
	private String MaMH;
	private float DiemKT;
	private float DiemGK;
	private float DiemThi;
	private float DiemTB;
	private String MaGV;
	private String MaHK;

	public diem(String MaSV, String MaMH, float DiemKT, float DiemGK, float DiemThi, float DiemTB, String MaGV,
			String MaHK) {

		this.MaSV = MaSV;
		this.MaMH = MaMH;
		this.DiemKT = DiemKT;
		this.DiemGK = DiemGK;
		this.DiemThi = DiemThi;
		this.DiemTB = DiemTB;
		this.MaGV = MaGV;
		this.MaHK = MaHK;
	}
}
