package entities;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class sinhvien implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5422502354092903770L;
	private String MaSV;
	private String TenSV;
	private String GioiTinh;
	private Date NgaySinh;
	private String MaLop;
	private String MaKhoa;

	public sinhvien(String MaSV, String TenSV, String GioiTinh, Date NgaySinh, String MaLop, String MaKhoa) {
		this.MaSV = MaSV;
		this.TenSV = TenSV;
		this.GioiTinh = GioiTinh;
		this.NgaySinh = NgaySinh;
		this.MaLop = MaLop;
		this.MaKhoa = MaKhoa;
	}
}
