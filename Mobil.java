public class Mobil {
	private int kecMax;
	private int percepatan;
	private int kecAktual;
	private int gigi;
	private Boolean started;

	public Mobil() {
		started = false;
		gigi = 0;
		kecAktual = 0;
		kecMax = 180;
		percepatan = 20;
	}

	public int getKecAktual() {
		return kecAktual;
	}

	public int getPercepatan() {
		return percepatan;
	}

	public int getKecMax() {
		return kecMax;
	}

	public int getGigi() {
		return gigi;
	}

	public Boolean isStarted() {
		return started;
	}

	public void setKecAktual(int kecAktual) {
		this.kecAktual = kecAktual;
	}

	public void setPercepatan(int percepatan) {
		this.kecAktual = kecAktual;
	}

	public void setKecMax(int kecMax) {
		this.kecMax = kecMax;
	}

	public void setGigi(int gigi) {
		this.gigi = gigi;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public void start() {
		if (!this.isStarted()) {
			this.started = true;
			System.out.println("\nMobil sudah dinyalakan.");
		} else {
			System.out.println("\nMobil sudah dalam kondisi menyala.");
		}
	}

	public void stop() {
		if (this.isStarted() && this.getKecAktual() == 0) {
			System.out.println("\nMobil sudah dalam kondisi mati.\n");
		} else {
			System.out.println("\nHarap berhenti terlebih dahulu!\n");
		}
	}

	public void gas() {
		if (this.getKecAktual() < this.getKecMax()) {
			if (this.getKecMax() < this.getKecAktual() + this.getPercepatan()) {
				this.setKecAktual(this.getKecMax());
			} else {
				this.setKecAktual(this.getKecAktual() + this.getPercepatan());
			}
		} else {
			System.out.println("\nMobil sudah pada batas maksimal!\n");
		}
		System.out.println("\nKecepatan mobil saat ini : "+this.getKecAktual()+" Km/jam");
	}

	public void rem() {
		this.setKecAktual(this.getKecAktual()/2);
		System.out.println("\nKecepatan mobil saat ini : "+this.getKecAktual()+" Km/jam");
	}

	public void gantiGigi(int gigi) {
		this.gigi = gigi;
		switch(gigi) {
			case 0 : 
				this.percepatan = 0;
				break;
			case 1:
				this.percepatan = 10;
				break;
			case 2:
				this.percepatan = 20;
				break;
			case 3 :
				this.percepatan = 30;
				break;
			case 4 :
				this.percepatan = 40;
				break;
			case 5 :
				this.percepatan = 50;
				break;
		}
		System.out.println("\nPosisi Gigi : "+this.getGigi());
		System.out.println("\nPercepatan Mobil : "+this.getPercepatan()+" Km/Jam^2");
	}
}