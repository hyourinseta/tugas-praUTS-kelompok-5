import java.util.*;

public class StartMobil {
	public static void main (String[] args) {
		Boolean run = true;
		Scanner x = new Scanner(System.in);
		Mobil mobil = new Mobil();
		mobil.setKecMax(200);

		while (run) {
			System.out.println("\nMenu Mobil");
			System.out.println("\n1. Start Mobil");
			System.out.println("2. Ganti Gigi");
			System.out.println("3. Gas Mobil");
			System.out.println("4. Rem Mobil");
			System.out.println("5. Stop Mobil");
			System.out.println("6. Keluar");

			System.out.print("\nPilih menu : ");

			int choice;
			try {
				choice = Integer.parseInt(x.nextLine());
			} catch (NumberFormatException nfe) { 
				choice = 0;
			}

			x = new Scanner(System.in);

			switch (choice) {
				case 1 : 
					mobil.start();
					break;
				case 2 : 
					System.out.print("Ganti ke gigi (1/2/3/4/5) : ");
					int gigi;
					try {
						gigi = Integer.parseInt(x.nextLine());
						if (gigi >= 0 && gigi <=5) {
							mobil.gantiGigi(gigi);
						}
					} catch (NumberFormatException nfe) { 
						System.out.println("Masukkan angka 1 - 5");
					}
					break;
				case 3 : 
					mobil.gas();
					break;
				case 4 : 
					mobil.rem();
					break;
				case 5 : 
					mobil.stop();
					break;
				case 6 : 
					run = false;
					break;
				default : 
					System.out.println("\nMasukkan hanya angka 1 sampai dengan 6!\n");
					break;
			}
		}

	}
}