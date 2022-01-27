
package ImpStack;

import java.util.Stack;

/**
 *
 * @author mustikaRa
 */
public class stack {

    public static void main(String[] args) {
        Stack st = new Stack(10);

		Mhs mhs1 = new Mhs(1, "110", "Feni", "TIF");
		Mhs mhs2 = new Mhs(2, "111", "Yuda", "DKV");
		Mhs mhs3 = new Mhs(3, "112", "Windia", "DKV");
		Mhs mhs4 = new Mhs(4, "113", "Chika", "TIF");
		Mhs mhs5 = new Mhs(5, "114", "Bagus", "TIF");
		
		st.add(mhs1);
		st.add(mhs2);
		st.add(mhs3);
		st.add(mhs4);
		st.add(mhs5);
		
		//st.displayAll();
		st.find(3);
	}

	public static class Mhs {

		int id;
		String nim, nama, jurusan;

		// konstruktor
		Mhs(int idx, String nimx, String namax, String jurusanx) {
			id = idx;
			nim = nimx;
			nama = namax;
			jurusan = jurusanx;
		}
		
		// untuk menampilkan ke layar
		void display() {
			System.out.println(
				"ID = " + id +
				", NIM = " + nim +
				", Nama = " + nama +
				", Jurusan = " + jurusan
			);
		}
	}

	public static class Stack {
		
		// sebagai penanda posisi paling atas
		int top;
		// untuk menyimpan object Mhs
		Mhs[] mhs;

		// constructor
		Stack(int max) {
			// buat array dengan kelas Mhs dengan jumlah elemen 'max'
			mhs = new Mhs[max];
			// posisi awal -1, jika elemen pertama ditambahkan maka top = 0
			// (index array selalu diawali dengan 0)
			top = -1;
		}

		// menambah
		void add(Mhs value) {
			// naikkan posisi 'top'
			top++;
			// isi array ke 'top' dengan 'value'
			mhs[top] = value;
		}

		// menghapus yang terakhir masuk
		void del() {
			// turunkan nilai top sehigga elemen array tidak dapat diakses lagi
			top--;
		}

		// mendapatkan yang terakhir masuk
		Mhs getLast() {
			return mhs[top];
		}

		// mencari berdasarkan id, lalu tampilkan
		void find(int i) {
			for (int j = 0; j <= top; j++) {
				if (i == mhs[j].id) {
					mhs[j].display();
					break;
				}
			}
		}
		
		// menampilkan yang terakhir masuk
		void displayLast() {
			Mhs a = getLast();
			a.display();
		}

		// menampilkan semua
		void displayAll() {
			for (int i = 0; i <= top; i++) {
				mhs[i].display();
			}
		}

	}

}

