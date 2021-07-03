package Synchronisation_program;

class Ticket___book
{
	
	static int	total_ticket=30;
	  
   void book_ticket1(int ticket) 
	  {
    	  
    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());

    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());

    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());

    	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());

		synchronized (this) {
			
		
     	  if(ticket<=total_ticket)
		 {    total_ticket=total_ticket-ticket;
			 System.out.println("your ticket is book successfully");
			
		
			 System.out.println("remender ticket is     :"+total_ticket);
		 }
		 
		 else
		 {
			 System.out.println("ticket is not available here"  );
			 System.out.println("only "+total_ticket+"  is remaning");
		 }
		}    	
		
		System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
  	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
	  System.out.println("--------------------------------------------  "+Thread.currentThread().getName());
}
}

public class Sysnchro__block extends Thread

{
	 int  tic;
	 Ticket___book b;
      public void run()
	{
    //	b=new Book_ticket();b.book_ticket(tic);
    	 b=new Ticket___book();
    	 b.book_ticket1(tic);
		
	}
	public static void main(String[] args)
	{
		Sysnchro__block akhlaq=new Sysnchro__block();
		akhlaq.tic=10;
		akhlaq.start();
		
		Sysnchro__block mubashir=new Sysnchro__block();
		mubashir.tic=11;
		mubashir.start();
	}
}
