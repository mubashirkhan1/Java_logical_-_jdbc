package Synchronisation_program;


class Book_ticket
{
  static int	total_ticket=20;
  
 synchronized static void book_ticket(int ticket) 
  {
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
}

public class User_ticket extends Thread
{ 
	  int  tic;
	 // Book_ticket b;
      public void run()
	{
    //	b=new Book_ticket();b.book_ticket(tic);
    	Book_ticket.book_ticket(tic);
		
	}
	public static void main(String[] args)
	{
		User_ticket akhlaq=new User_ticket();
		akhlaq.tic=10;
		akhlaq.start();
		
		User_ticket mubashir=new User_ticket();
		mubashir.tic=11;
		mubashir.start();
	}
	
}
