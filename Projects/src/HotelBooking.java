import java.util.Scanner;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Welocme to Hotel Booking");
		
		System.out.println("Please Enter Number of Family Members age above 12");
		int adult= scanner.nextInt();
		System.out.println("Please Enter Number of Family Members age below 12");
		int child=scanner.nextInt();
		
		int tfm= adult + child;
		System.out.println("Total Family Member="+tfm);
		
		System.out.println("Please Select the View Point (1 or 2)");
		System.out.println("1. Mountain View");
		System.out.println("2. Pool View");
		int view = scanner.nextInt();
		
		if(view==1)
		{
			System.out.println("Please select the Location");
			System.out.println("1. Mumbai");
			System.out.println("2. Shimla");
			int location=scanner.nextInt();
			
			switch (location) {
			  case 1:
				System.out.println("Hotel No:-1");
			    System.out.println("Hotel Name :-Taj Hotel, Mumbai");
			    System.out.println("Room rate :- 15000/- for 6 person");
			    System.out.println("Extra Person :- 3000 rs/person");
			    
			    System.out.println("Hotel No:-2");
			    System.out.println("Hotel Name :-Hotel Mariot Prime, Mumbai");
			    System.out.println("Room rate :- 8000/- for 4 person");
			    System.out.println("Extra Person :- 2000 rs/person");
			    
			    System.out.println("Please Enter Hotel No:");
			    int hotelno=scanner.nextInt();
		        
			    if (hotelno==1)
			    {
			    	   int rm = 15000;              //room cost
					    int ep=3000;                //extra person cost
					    int tc  = rm +(tfm-6)*ep;   //total cost
			    	 System.out.println("Hotel Name :- Taj Hotel, Mumbai");
			    	  System.out.println("View       :- Mountain View");
				    	System.out.println("Location   :- Mumbai");
					    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
				        System.out.println("Total Family members ="+tfm);
			    	 if (tfm<=6)
				    	 System.out.println("Total cost= "+ rm);
				     else
				         System.out.println("Total cost= "+ tc); 
			    
			    }
			   else if (hotelno==2)
			    {
			    	    int rm = 8000;           //room cost
					    int ep=2000;             //extra person cost
					    int tc= rm +(tfm-4)*ep;   //total cost
			    	    System.out.println("Hotel Name :- Hotel Mariot Prime, Mumbai");
			    	    System.out.println("View       :- Mountain View");
				    	System.out.println("Location   :- Mumbai");
					    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
				        System.out.println("Total Family members ="+tfm);
			    	 if (tfm<=4)
				    	 System.out.println("Total cost= "+ rm);
				     else
				         System.out.println("Total cost= "+ tc); 
			    }
		    else
			    { 	
			    	System.out.println("Invalid Input");
			    }
		    break;
			    
			    
			  case 2:
					System.out.println("Hotel No:-1");
				    System.out.println("Hotel Name :-Snow Valley Resorts, Shimla");
				    System.out.println("Room rate :- 3500/- for 4 person");
				    System.out.println("Extra Person :- 1000 rs/person");
				    
				    System.out.println("Hotel No:-2");
				    System.out.println("Hotel Name :- Hills View Paradise, Shimla");
				    System.out.println("Room rate :- 6000/- for 5 person");
				    System.out.println("Extra Person :- 1500 rs/person");
				    
				    System.out.println("Please Enter Hotel No:");
				    int hotelnos =scanner.nextInt();
			        
				    if (hotelnos ==1)
				    {
				    	   int rm = 3500;              //room cost
						    int ep=1000;                //extra person cost
						    int tc  = rm +(tfm-4)*ep;   //total cost
				    	 System.out.println("Hotel Name :- Snow Valley Resorts, Shimla");
				    	  System.out.println("View       :- Mountain View");
					    	System.out.println("Location   :- Shimla");
						    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
					        System.out.println("Total Family members ="+tfm);
				    	 if (tfm<=4)
					    	 System.out.println("Total cost= "+ rm);
					     else
					         System.out.println("Total cost= "+ tc); 
				    
				    }
				   else if (hotelnos==2)
				    {
				    	    int rm = 6000;           //room cost
						    int ep=1500;             //extra person cost
						    int tc= rm +(tfm-5)*ep;   //total cost
				    	    System.out.println("Hotel Name :- Hills View Paradise, Shimla");
				    	    System.out.println("View       :- Mountain View");
					    	System.out.println("Location   :- Shimla");
						    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
					        System.out.println("Total Family members ="+tfm);
				    	 if (tfm<=5)
					    	 System.out.println("Total cost= "+ rm);
					     else
					         System.out.println("Total cost= "+ tc); 
				    }
			    else
				    { 	
				    	System.out.println("Invalid Input");
				    }
			    
			    break;
			  default:
				    System.out.println("Please select the correct location");
			}
		
			
			
		}
			
		else if(view==2)
		{
			System.out.println("Please select the Location");
				System.out.println("1. Mumbai");
				System.out.println("2. Shimla");
				int location=scanner.nextInt();
				
				switch (location) {
				  case 1:
					System.out.println("Hotel No:-1");
				    System.out.println("Hotel Name :- Hotel Milan International, Mumbai");
				    System.out.println("Room rate :- 12000/- for 6 person");
				    System.out.println("Extra Person :- 2000 rs/person");
				    
				    System.out.println("Hotel No:-2");
				    System.out.println("Hotel Name :- Hotel Greenpark, Mumbai");
				    System.out.println("Room rate :- 6000/- for 4 person");
				    System.out.println("Extra Person :- 2000 rs/person");
				    
				    System.out.println("Please Enter Hotel No:");
				    int hotelno=scanner.nextInt();
			        
				    if (hotelno==1)
				    {
				    	   int rm = 12000;              //room cost
						    int ep=2000;                //extra person cost
						    int tc  = rm +(tfm-6)*ep;   //total cost
				    	 System.out.println("Hotel Name :- Hotel Milan International, Mumbai");
				    	  System.out.println("View       :-  Pool View");
					    	System.out.println("Location   :- Mumbai");
						    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
					        System.out.println("Total Family members ="+tfm);
				    	 if (tfm<=6)
					    	 System.out.println("Total cost= "+ rm);
					     else
					         System.out.println("Total cost= "+ tc); 
				    
				    }
				   else if (hotelno==2)
				    {
				    	    int rm = 6000;           //room cost
						    int ep=2000;             //extra person cost
						    int tc= rm +(tfm-4)*ep;   //total cost
				    	    System.out.println("Hotel Name :- Hotel Greenpark, Mumbai");
				    	    System.out.println("View       :-  Pool View");
					    	System.out.println("Location   :- Mumbai");
						    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
					        System.out.println("Total Family members ="+tfm);
				    	 if (tfm<=4)
					    	 System.out.println("Total cost= "+ rm);
					     else
					         System.out.println("Total cost= "+ tc); 
				    }
			    else
				    { 	
				    	System.out.println("Invalid Input");
				    }
			    break;
				    
				    
				  case 2:
						System.out.println("Hotel No:-1");
					    System.out.println("Hotel Name :- The Grand Welcome Hotel, Shimla");
					    System.out.println("Room rate :- 3500/- for 4 person");
					    System.out.println("Extra Person :- 1000 rs/person");
					    
					    System.out.println("Hotel No:-2");
					    System.out.println("Hotel Name :-Wildflower Hall, An Oberoi Resort, Shimla");
					    System.out.println("Room rate :- 6000/- for 5 person");
					    System.out.println("Extra Person :- 1500 rs/person");
					    
					    System.out.println("Please Enter Hotel No:");
					    int hotelnos =scanner.nextInt();
				        
					    if (hotelnos ==1)
					    {
					    	   int rm = 3500;              //room cost
							    int ep=1000;                //extra person cost
							    int tc  = rm +(tfm-4)*ep;   //total cost
					    	 System.out.println("Hotel Name :- The Grand Welcome Hotel, Shimla");
					    	  System.out.println("View       :-  Pool View");
						    	System.out.println("Location   :- Shimla");
							    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
						        System.out.println("Total Family members ="+tfm);
					    	 if (tfm<=4)
						    	 System.out.println("Total cost= "+ rm);
						     else
						         System.out.println("Total cost= "+ tc); 
					    
					    }
					   else if (hotelnos==2)
					    {
					    	    int rm = 6000;           //room cost
							    int ep=1500;             //extra person cost
							    int tc= rm +(tfm-5)*ep;   //total cost
					    	    System.out.println("Hotel Name :- Wildflower Hall, An Oberoi Resort, Shimla");
					    	    System.out.println("View       :-  Pool View");
						    	System.out.println("Location   :- Shimla");
							    System.out.println("Family members above age 12 = "+adult + "  ;  Family members below age 12= "+ child);
						        System.out.println("Total Family members ="+tfm);
					    	 if (tfm<=5)
						    	 System.out.println("Total cost= "+ rm);
						     else
						         System.out.println("Total cost= "+ tc); 
					    }
				    else
					    { 	
					    	System.out.println("Invalid Input");
					    }
				    
				    break;
				  default:
					    System.out.println("Please select the correct location");
				}
			
		}
		
		else
		{
			System.out.println("Invalied Selection");
		}
		
		String choise;
		System.out.println("Would you like to change your Location?");
		System.out.println("y for yes");
		choise =scanner.next();
		if(choise.equals("y") || choise.equals("Y") )                                        //if variable is string then we need to write choise.equals
		{
			HotelBooking.main(args);
		}
		else
		{
			System.out.println("Thanks!!!");
			System.out.println("Please visit again.");
		}
		scanner.close();
	}

}
