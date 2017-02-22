public class EntryBukuAlamat {
	private String nama;
	private String alamat;
	private String nomorTelepon;
	private String email;

	public EntryBukuAlamat() {
	}

	public String getNama() {
		return nama;
	}

	public String getAlamat() {
		return alamat;	
	}

	public String getNomorTelepon() {
		return nomorTelepon;
	}

	public String getEmail() {
		return email;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public void setNomorTelepon(String nomorTelepon) {
		this.nomorTelepon = nomorTelepon;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printDetail() {
		System.out.println("Nama \t\t: "+this.getNama());
		System.out.println("Alamat \t\t: "+this.getAlamat());
		System.out.println("No. Telepon \t: "+this.getNomorTelepon());
		System.out.println("Email \t\t: "+this.getEmail());
	}

	public void printRow() {
		System.out.println(this.getNama()+" \t\t "+this.getAlamat()+" \t\t "+this.getNomorTelepon() + " \t\t " + this.getEmail());
	}
}