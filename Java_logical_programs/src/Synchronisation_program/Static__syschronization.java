package Synchronisation_program;

class Book__Ticket22 {
	static int total_ticket = 10;

	synchronized static void book_ticket1(int tic) {

		if (tic <= total_ticket) {
			total_ticket = total_ticket - tic;
			System.out.println("your ticket is book successfully  " + tic);

			System.out.println("remender ticket is     :" + total_ticket);
		}

		else {
			System.out.println("ticket is not available here");
			System.out.println("only " + total_ticket + "  is remaning");
		}
	}

}

class Thread1 extends Thread {
	static int tic;
	Book__Ticket22 b1;

	Thread1(Book__Ticket22 b1, int tic) {
		this.b1 = b1;
		this.tic = tic;
	}

	public void run() {
		Book__Ticket22.book_ticket1(tic);

	}
}

class Thread2 extends Thread {
	int tic;
	Book__Ticket22 b1;

	Thread2(Book__Ticket22 b1, int tic) {
		this.b1 = b1;
		this.tic = tic;
	}

	public void run() {
		Book__Ticket22.book_ticket1(tic);

	}
}

public class Static__syschronization {
	public static void main(String[] args) {
		Book__Ticket22 b1 = new Book__Ticket22();
		Thread1 akhlaq = new Thread1(b1, 4);
		akhlaq.start();
		Thread2 mubashir = new Thread2(b1, 7);

		mubashir.start();
		Book__Ticket22 b2 = new Book__Ticket22();
		Thread2 adnan = new Thread2(b2, 3);
		Thread2 farooq = new Thread2(b2, 8);
		adnan.start();
		farooq.start();

	}
}
