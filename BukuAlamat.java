import java.util.*;

public class BukuAlamat {

	public static void main (String[] args) {
		Scanner x = new Scanner(System.in);
		Boolean run = true;
		ArrayList<EntryBukuAlamat> buku = new ArrayList<EntryBukuAlamat>();

		while (run) {
			System.out.println("\nMenu Buku Alamat");
			System.out.println("1. Insert Data");
			System.out.println("2. Update Data");
			System.out.println("3. Delete Data");
			System.out.println("4. View All Data");
			System.out.println("5. Quit");
			System.out.print("\nPilih (1/2/3/4) : ");

			int choice;
			try {
				choice = Integer.parseInt(x.nextLine());
			} catch (NumberFormatException nfe) { 
				choice = 0;
			}
			

			x = new Scanner(System.in);

			switch(choice) {
				case 1 : 
					System.out.println("\nMenu Insert Data");
					Boolean inputlagi = true;
					while (inputlagi) {
						EntryBukuAlamat entri = new EntryBukuAlamat();

						System.out.print("Nama \t\t : ");
						String nama = x.nextLine();
						entri.setNama(nama);

						System.out.print("Alamat \t\t : ");
						String alamat = x.nextLine();
						entri.setAlamat(alamat);

						System.out.print("No. Telepon \t : ");
						String nomortelepon = x.nextLine();
						entri.setNomorTelepon(nomortelepon);

						System.out.print("Email \t\t : ");
						String email = x.nextLine();
						entri.setEmail(email);

						buku.add(entri);

						System.out.print("Masukkan lagi ? (Y/T) : ");
						String terus = x.nextLine().toUpperCase();

						if (!terus.equals("Y")) {
							inputlagi = false;
						}
					}

					break;
				case 2 :
					System.out.println("\nMenu Update Data");
					System.out.print("\nMasukkan nomor entri yang ingin diubah : ");

					int nomorubah;
					try {
						nomorubah = Integer.parseInt(x.nextLine());
					} catch (NumberFormatException nfe) { 
						nomorubah = 0;
					}

					try {
						if (nomorubah > 0) {
							EntryBukuAlamat a = buku.get(nomorubah - 1);
							Boolean selesai = false;
							while (!selesai) {
								a.printDetail();
								System.out.println("\nApa yang ingin diubah?");
								System.out.println("1. Nama");
								System.out.println("2. Alamat");
								System.out.println("3. Nomor Telepon");
								System.out.println("4. Email");
								System.out.println("5. Selesai");
								System.out.print("\nPilih (1/2/3/4) : ");

								int pilihubah;
								try {
									pilihubah = Integer.parseInt(x.nextLine());
								} catch (NumberFormatException nfe) { 
									pilihubah = 0;
								}

								switch (pilihubah) {
									case 1 : 
										System.out.print("Masukkan nama baru : ");
										a.setNama(x.nextLine());
										break;
									case 2 : 
										System.out.print("Masukkan alamat baru : ");
										a.setAlamat(x.nextLine());
										break;
									case 3 : 
										System.out.print("Masukkan nomor telepon baru : ");
										a.setNomorTelepon(x.nextLine());
										break;
									case 4 : 
										System.out.print("Masukkan alamat baru : ");
										a.setEmail(x.nextLine());
										break;
									case 5 : 
										System.out.println("\nSelesai mengubah entri.");
										selesai = true;
										break;
									default : 
										System.out.println("\nMasukkan angka pada menu.");
										break;
								}
							}
						} else {
							System.out.println("\nTidak ada nomor tersebut pada entri");
						}
					} catch(Exception e) {
						System.out.println("\nTidak ada nomor tersebut pada entri");
					}

					break;
				case 3 :
					System.out.println("\nMenu Delete Data");
					System.out.print("Masukkan nomor entri yang ingin dihapus : ");

					int nomorhapus;
					try {
						nomorhapus = Integer.parseInt(x.nextLine());
					} catch (NumberFormatException nfe) { 
						nomorhapus = 0;
					}

					try {
						if (nomorhapus > 0) {
							buku.remove(nomorhapus - 1);
						} else {
							System.out.println("\nTidak ada nomor tersebut pada entri");
						}
					} catch(Exception e) {
						System.out.println("\nTidak ada nomor tersebut pada entri");
					}

					break;
				case 4 :
					System.out.println("\nNo \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
					System.out.println("===============================================================================================================");
					for (int i = 0; i < buku.size(); i ++) {
						EntryBukuAlamat a = buku.get(i);
						System.out.print((i+1) + "\t");
						a.printRow();
					}
					break;
				case 5 :
					run = false;
					break;
				default:
					System.out.println("\nMasukkan angka yang hanya ada pada menu!");
					break;
			}
		}
	}
}