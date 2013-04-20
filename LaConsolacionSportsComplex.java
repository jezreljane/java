 /*Project in ComPro 1: INFORMATION SYSTEM
  *
  *Project Title: 		LA CONSOLACION SPORTS COMPLEX INFORMATION SYSTEM
  *
  *Submission date: 		October 8, 2008 (date of defense also)
  *						
  *Group 1 members:		Buenaobra, Vernice Carla S.
  *	    BS101A 		Garde, Sheena Mae N.
  *				Himbing, Jezrel Jane J. (Lead)
  *				Magpantay, Alfredo J.
  *						
  *Instructor: 			Ms. Marife S. Edu
  */
public class LaConsolacionSportsComplex {
public static void main(String[] args) throws Exception {
    System.out.println("If you want to view in Full Screen, press & hold ALT key, then press ENTER key.\n");
	System.out.println("GENERAL GUIDELINES and PROCEDURES:\n");
	System.out.println(" 1. Read and follow the instructions carefully.");
	System.out.println(" 2. Choose and press one character at a time before hitting the ENTER KEY.");
	System.out.println(" 3. If you won\'t follow the rules, the system will experience a run-time error.");
	System.out.println(" 4. If an error occurs, you won\'t be able to get the desired result.");
	System.out.println("\n\t        DO YOU AGREE WITH THE ABOVEMENTIONED STATEMENTS?\n");
	System.out.print("PRESS the ENTER KEY if your answer is YES. If no, press TAB, then ENTER key.");
	
	char info, YES;
	char ENTER = (char)System.in.read(); System.in.read();
	if (ENTER=='\r') { 
		System.out.println("\n\n\t\t\t\tACCESS GRANTED!!! \n\n"); 
		System.out.println("\t    LA CONSOLACION SPORTS COMPLEX (LCSC) INFORMATION SYSTEM");
		System.out.println("\t\t\t  \"To be the BEST Sports Center\"\n");
		System.out.println("\nWhat information do you want to know about LCSC?");
	do {
	   System.out.println("\n   a. Administration and Staff\n   b. Address and Contact Number");
	   System.out.println("   c. Office Hours\n   d. Services\n   e. Company Background");
	   System.out.print("   f. Mission and Vision\n\nPlease select a letter and press ENTER. ");
			info = (char)System.in.read(); System.in.read(); System.in.read();
	switch(info) {
	   case 'a':
	   case 'A': adminStaff(); break;
	   
	   case 'b':
	   case 'B': contactDetails(); break;
		
	   case 'c':
	   case 'C': officeHours(); break;

	   case 'd':
	   case 'D': serviceOffrd(); break;
		
	   case 'e':
	   case 'E': companyBG(); break;
	   
	   case 'f':
	   case 'F': MxonVxon(); break;
	   
	   default: System.out.println("\nYou typed an invalid character.");
				System.out.print("Please try again. ");
				
			info = (char)System.in.read(); 
			System.in.read(); System.in.read();
		
			switch(info) {
		   case 'a':
		   case 'A': adminStaff(); break;
		   
		   case 'b':
		   case 'B': contactDetails(); break;
			
		   case 'c':
		   case 'C': officeHours(); break;
	
		   case 'd':
		   case 'D': serviceOffrd(); break;
			
		   case 'e':
		   case 'E': companyBG(); break;
		   
		   case 'f':
		   case 'F': MxonVxon(); break;

		   default:
		   System.out.print("\nInvalid character! Please MAKE SURE"
							+" that you type a LETTER on the list. ");

			info = (char)System.in.read(); 
			System.in.read(); System.in.read();
	
			switch(info) {
		   case 'a':
		   case 'A': adminStaff(); break;
		   
		   case 'b':
		   case 'B': contactDetails(); break;
			
		   case 'c':
		   case 'C': officeHours(); break;
	
		   case 'd':
		   case 'D': serviceOffrd(); break;
			
		   case 'e':
		   case 'E': companyBG(); break;
		   
		   case 'f':
		   case 'F': MxonVxon(); break;
	   	
		   default: System.out.println("\n\tYou still entered an invalid character. You didn\'t follow!!!" 
									+ "\nWe are very SORRY to tell you, but you cannot continue this time."
									+ "\nYour ACCESS is being TERMINATED. Thanks for visiting. GOD BLESS YOU.");
					System.exit(0); }
				}
			} YES = (char)System.in.read(); System.in.read();System.in.read();
		} while(YES == 'y'||YES == 'Y');
	System.out.println("\nTHANK YOU for viewing our company profile! May God richly bless you! Au revoir!");
	System.exit(0); } //end of if statement
		else if (ENTER=='\t'||ENTER=='\t') {
			System.out.println("\nHow sad. You didn\'t agree with our conditions. :(");
			System.out.println("Sorry, you won\'t be able to view at least a part of our system.");
			System.exit(0);} //end of else if statement
		else {
			System.out.println("\nAccess denied.");
			System.out.println("ACCESS DENIED!");
			System.exit(0); } //end of else statement
} //end of the main() method

//METHODS CALLED in the main() method
public static void adminStaff()	throws Exception {
		char choose, yup;
		do {
		System.out.println("\n\n\n\t\t\t       ADMINISTRATION AND STAFF\n");
		System.out.println("       g. The Property Owner");
		System.out.println("       h. The Managing Partner");
		System.out.println("       i. Tennis Club President");
		System.out.println("       j. The Secretary");
		System.out.println("       k. Tennis Club Trainers and Members");
		System.out.println("       l. Utility and Maintenance");
		System.out.println("       m. The \"BALL BOYS\"");
		System.out.print("\nPlease choose a letter (g-m  only), then press ENTER. ");
		choose = (char)System.in.read();
		System.in.read();System.in.read();
			switch (choose) {
			case 'g':
			case 'G': ownerDtail(); break;

			case 'h':
			case 'H': managingPrtnrDtail(); break;
			
			case 'i':
			case 'I': tennisPresDtail(); break;

			case 'j':
			case 'J': secretaryDtail(); break;

			case 'k':
			case 'K': trainersMmbrsDtail(); break;

			case 'l':
			case 'L': utilMaintenance(); break;

			case 'm':
			case 'M': ballBoysDtail(); break;

			default: invalidChar();
			}
		System.out.print("\nDo you want to see other ADMIN/STAFF profiles? Press Y. ");
		yup = (char)System.in.read(); System.in.read();System.in.read();
		} while (yup=='y'||yup=='Y');
		yes();
}	//end of adminStaff() method

//METHODS CALLED in the adminStaff() method	
	public static void ownerDtail() {
		System.out.println("\n\n\n\t\t\t\t  THE PROPERTY OWNER\n");
		System.out.print("\n    The founder/owner of La Consolacion Sports Complex is Mr. David C. Mercado. In");
		System.out.print(" association with the managing partner, he makes the strategic plans ");
		System.out.print("of LCSC.\n    He is also the president of Stronghold Insurance Company,  another  company that he owns.");
		System.out.println(" In addition, he owns the Flashing Meadows Hotel & Resort located  in Bohol.");
	}	//end of ownerDtail() method

	public static void managingPrtnrDtail() {
		System.out.println("\n\n\n\t\t\t         THE MANAGING PARTNER\n");
		System.out.print("\n      To keep the company transactions running smoothly, Mr. Timoteo P. Tiangco,");
		System.out.print("the managing partner, helps the owner in monitoring LCSC on a daily basis. He is");
		System.out.print("the overseer of the operations. He also handles the financial concerns of LCSC.");
		System.out.println("\n     He is a businessman and is one of the stockholders of Sterling Insurance    Company. He is the former Manager of Security Bank.");
	}	//end of managingPrtnrDtail() method
	
	public static void tennisPresDtail() {
		System.out.println("\n\n\n\t\t\t       TENNIS CLUB PRESIDENT\n");
		System.out.print("\n       The Tennis Club President is Mr. Leo Untalan. He is liable for the making");
		System.out.print("of activities, events, play-offs or tournaments of the Tennis Club. He\'s also in");
		System.out.print("charge of the club\'s funds and monthly dues payment. Since he is the Tennis Club");
		System.out.println("President, he makes sure that all participants will abide by the game rules.");
	}	//end of tennisPresDtail() method
	
	public static void secretaryDtail() {
		System.out.println("\n\n\n\t\t\t\t   THE SECRETARY\n");
		System.out.print("\n\tMs. Vernice Carla S. Buenaobra is the secretary of La Consolacion Sports");
		System.out.print("Complex. She handles all the daily & monthly reports of La Consolacion\'s income.");
		System.out.print("Furthermore, she\'s in charge of the receipts and disbursements of LCSC. She does");
		System.out.println("a lot of paper works. She is 22 years old and presently studying at STI COLLEGE-PARA¥AQUE.");
	}	//end of secretaryDtail() method

	public static void trainersMmbrsDtail() throws Exception {
		System.out.println("\n\n\n\t\t\t    TENNIS CLUB TRAINERS AND MEMBERS\n");
		System.out.println("\nWho do you want to know first, the Trainers or the Members?");
		System.out.print("Press T for trainer, M for member, then ENTER. ");
		char viewFirst = (char)System.in.read();System.in.read();System.in.read();
			switch(viewFirst) {
			case 't':
			case 'T': trainer(); break;

			case 'm':
			case 'M': member(); break;

			default:  invalidChar(); }
	}	//end of trainersMmbrsDtail() method

	//METHODS CALLED in the trainersMmbrsDtail() method
		public static void trainer() throws Exception {
			char yah;
			String[] trainer = {"Luis de Vera","Tito de Vera","Wilson Chu","Juan Macaraeg"};
			System.out.println("\nThere are only 4 tennis club TRAINERS in LCSC. They are:\n");
			for (int ind=0; ind<trainer.length; ind++) {
				System.out.println("   "+trainer[ind]);
			}
			System.out.println("\nIf you do not know yet who the tennis club members are, press Y.");
			System.out.print("If you do, press other character, then press ENTER. ");
			yah = (char)System.in.read(); System.in.read();System.in.read();
			if (yah=='y'||yah=='Y') {
				member(); }
			else {System.out.println("\nOK. That\'s good! And now...");}
		} //end of trainer() method		
		public static void member() throws Exception {
			char yeh;
			String[] member = {"Ambion, Claude","Atilano, Bing","Banaria, Sid","Baquirin, Fred","Besana, Egay","Borromeo, Bobby",
	 			"Cruz, Tirso III","Dandan, Nick","Dionisio, Emil","Dore, Philip","Fabio, Ric","Gaerlan, Mary Jean",
	 			"Garcia, Bobby","Gonazaga, Dong","Gui, Mariano","Idquival, Christine","Jamerlan, Elmer","Joaquin, Vic",
	 			"Joseph, Ronnie","Kim, Young","Lapa, Jean","Luber, Johnny","Lucas, Eric","Macapaar, Abba",
	 			"Mangilet, Danny","Manundo, Ernie","Obligado, Manny","Ordiales, Art","Pantoja, Art","Po, Baby",
	 			"Reyes, Ernie","Rivera, Joey","Salavador, Noel","Seo, Romeo","Seo, Juliet","Seo, Steven",
	 			"Seo, William","Tiangco, Timmy","Tolosa, Rey","Uy, Dodong","Valencia, Boy","Vergara, Ed"};
			System.out.println("\nThe 43 active tennis club MEMBERS are:\n");
			for (int sub=0; sub<member.length; sub++) {
				System.out.println("   "+member[sub]);
			}
			System.out.println("\nIf you do not know yet who the trainers are, press Y.");
			System.out.print("If you do, type another CHARACTER, then press ENTER. ");
			yeh = (char)System.in.read(); System.in.read();System.in.read();
			if (yeh=='y'||yeh=='Y') {
				trainer(); }
			else {System.out.println("\nOK, that\'s good! And now...");}
		} //end of member() method
	//end of all the METHODS CALLED in the trainerMmbrsDtail() method

	public static void utilMaintenance() {
		System.out.println("\n\n\n\t\t\t       UTILITY AND MAINTENANCE\n");
		System.out.print("\tFor this category, we have Mr. Luis de Vera and Mr. Juan Macaraeg.");
		System.out.print("\n\n\tMr. Luis de Vera is assigned for the maintenance of the tennis");
		System.out.print(" court andswimming pools. He sees to it that all equipments and facilities");
		System.out.print(" in the complex are in good condition. That\'s why he is the Court and Pool Manager.");
		System.out.print("\n\n\tThe Floor Manager is Mr. Juan Macaraeg. He maintains the cleanliness of the facilities");
		System.out.print(" other than the tennis court and pool. Such are the comfort rooms,kitchen, dining hall and");
		System.out.println(" the surroundings.\n\n\tYou can also view other information about them in the \'Ball Boys\' Category.");
	}	//end of utilMaintenance() method

	public static void ballBoysDtail() throws Exception {
		char yeah;
		System.out.println("\n\n\n\t\t\t\t   \"THE BALL BOYS\"\n");
		System.out.print("\tThe Tennis Court and Swimming Pool Maintenance (a.k.a. \"The BALL BOYS\"),");
		System.out.println("maintains the order and cleanliness of facilities and equipment.");
		do{
		char[] option  = {'1','2','3','4','5','6','7'};
		String[] kuya = {"Wilson ","Ahron ", "Luis ", "Paul ","Juan ",  "Albert ", "June "};
		String[] surName ={"Chu", "de Vera","de Vera","Grajo","Macaraeg","Pineda", "Pineda"};
		String[] file = new String[7];
			file[0] = "Age: 19 yrs. old\nBirth Date: August 12, 1988"+
					"\nCivil Status: Single\nProvince: Pangasinan";
			file[1] = "Age: 19 yrs. old\nBirth Date: December 31, 1988"+
					"\nCivil Status: Single\nProvince: Pangasinan";
			file[2] = "Age: 19 yrs. old\nBirth Date: April 2, 1988"+
					"\nCivil Status: Single\nProvince: Pangasinan";
			file[3] = "Age: 26 yrs. old\nBirth Date: August 12, 1982"+
					"\nCivil Status: Married\nProvince: Boracay";
			file[4] = "Age: 41 yrs. old\nBirth Date: December 26, 1957"+
					"\nCivil Status: Married\nProvince: Pangasinan";
			file[5] = "Age: 19 yrs. old\nBirth Date: April 2, 1988"+
					"\nCivil Status: Single\nProvince: Caranglan, Nueva Ecija";
			file[6] = "Age: 17 yrs. old\nBirth Date: June 17, 1991"+
					"\nCivil Status: Single\nProvince: Nueva Vizcaya";
			
		System.out.println("\nWhose profile do you want to see?\n");
		for (int index=0; index<option.length; index++) {
		System.out.println("\t" + option[index] + ". " + kuya[index]);
		}
			System.out.print("\nSelect a NUMBER, then press ENTER. ");
			char choice = (char)System.in.read();
			System.in.read(); System.in.read();

		for (int subscript=0; subscript<option.length; subscript++) {
			if (choice==option[subscript]) {
			System.out.println("\nYou have chosen number " + choice + ".\n");
			System.out.println("\n\t\t  The PERSONAL PROFILE of MR. "
							+kuya[subscript].toUpperCase() + surName[subscript].toUpperCase() + "\n");
			System.out.println("\n"+file[subscript]);}
		}
		System.out.print("\nWould you like to see another profile from this category? Press Y. ");
		yeah = (char)System.in.read(); System.in.read();System.in.read();
		} while (yeah=='y'||yeah=='Y');
	}	//end of ballBoysDtail() method
//end of all the METHODS CALLED in the adminStaff() method

public static void contactDetails() {
		System.out.println("\n\n\n\t\t\t    ADDRESS AND CONTACT NUMBERS\n"); 
		System.out.println("\n  Buenos Aires cor. Paris/Peking St., BF International, Las Pi¥as City.");
		System.out.println("\n  Feel free to contact us at: 829-1474 or 0929-800-7171.");
		yes();
}	//end of contactDetails() method

public static void officeHours() {
		System.out.println("\n\n\n\t\t\t\t   OFFICE HOURS\n");
		System.out.println("\tLa Consolacion Sports Complex is open daily from 7 AM to 7 PM.");
		yes();
}	//end of officeHours() method

public static void serviceOffrd() throws Exception {
		char choose, Oo;
		do {
		System.out.println("\n\n\n\t\t\t\t     OUR SERVICES\n");
		System.out.println("       n. Tennis Court Rental");
		System.out.println("       o. Swimming Pool Rental");
		System.out.println("       p. Billiards");
		System.out.println("       q. Canteen");
		System.out.print("\nPlease choose a letter (n-q  only), then press ENTER. ");
		choose = (char)System.in.read();
		System.in.read(); System.in.read();
			switch(choose) {
			case 'n':
			case 'N': tennisCourt(); break;

			case 'o':
			case 'O': poolRental(); break;

			case 'p':
			case 'P': billiard(); break;

			case 'q':
			case 'Q': canteen(); break;

			default:  invalidChar();
			}
		System.out.print("\nDo you want to see other SERVICES? Press Y. ");
		Oo = (char)System.in.read();
		System.in.read(); System.in.read();
		} while (Oo=='y'||Oo=='Y');
		yes();
}	//end of serviceOffrd() method

//METHODS CALLED in the serviceOffrd() method
		public static void tennisCourt() {
			System.out.println("\n\n\n\t\t\t\t  TENNIS COURT RENTAL\n");
			System.out.println("Court Fees:\n   Php150 per hour (non-member)");
			System.out.println("   Php120 per hour (club members)");
			System.out.println("\n\tLa Consolacion takes pride of its summer clinics, and appreciate the");
			System.out.println("importance of having roots well grounded in the fundamentals. ");
			System.out.println("\tThe starter camps are designed to teach the basics to customers to \ndevelop social and athletic skills. ");
		} //end of tennisCourt() method
		public static void poolRental() {
			System.out.println("\n\n\n\t\t\t\t  SWIMMING POOL RENTAL\n");
			System.out.println("Fees:\n   Php100 (for kids)");
			System.out.println("   Php120 (for adults)");
			System.out.println("\nSAFETY RULES:\n");
			System.out.println("  1. Wear Swimsuits.");
			System.out.println("  2. Do not bring foods.");
			System.out.println("  3. Do not swim alone.");

		} //end of poolRental() method
		public static void billiard() {
			System.out.println("\n\n\n\t\t\t\t       BILLIARDS\n");
			System.out.println("Rental Fee:\n\n\tPhp100 per one hour");
			System.out.println("\n\tMinimum time of game: half hour");
		} //end of billiard() method
		public static void canteen() throws Exception {
			System.out.println("\n\n\n\t\t\t\t        CANTEEN\n");
			char yep;
			int[] priceSndwch = { 45,           30,            50,           50,           50};
			String[] sandwich = {"Ham        ","Egg        ","Tuna       ","Chicken    ","Ham and Egg"};
			
			int[] priceMealRc = { 120,               120,                120};
			String[] mealRice = {"Adobo          ", "Tapsilog       " , "Daing na Bangus"};
			
			int[] priceSftDrnk = {30,                30,               10,               15,               30,             35};
			String[] SoftDrink = {"Coke Zero      ","Coke Light     ","Coke Sakto     ","Coke 12 oz.    ","Fit' Right     ","Gatorade       "};
			
			int[] priceEnrgyDrnk = {40,                 40};
			String[] EnergyDrink = {"Red Bull       ", "Lipovitan      "};
			
			int[] priceChips  = {25,                 50,               30,               25,                25,              25,                50};
			String[] chipipai = {"Nova           ", "Lay's          ","E-aji          ","Chippy         ","Piattos        ","Tortillos      ", "Roller Coaster "};
			
			System.out.println("SANDWICHES:          MEAL (WITH RICE):\n");
			for (int SUB = 0, sub=0; SUB<priceSndwch.length&&sub<priceMealRc.length; SUB++,sub++) {
				System.out.println("   "+sandwich[SUB]+"       "+mealRice[sub]);}
				
			System.out.println("\n\nCHIPS:\n");				
			for (int SUB = 0;SUB<priceChips.length; SUB++) {
				System.out.println("   "+chipipai[SUB]);}
				
			System.out.println("\n\nSOFTDRINKS:          ENERGY DRINKS:\n");				
			for (int SUB = 0, sub=0; SUB<priceSftDrnk.length&&sub<priceEnrgyDrnk.length; SUB++,sub++) {
				System.out.println("   "+SoftDrink[SUB]+"      "+EnergyDrink[SUB]);}
								
			System.out.print("\nDo you want to know the price of all item? Press Y. ");
			yep = (char)System.in.read(); System.in.read();System.in.read();
			
			if (yep=='y'||yep=='Y') {
				System.out.println("\n\n\t\t\t* ALL PRICES IN PHILIPPINE PESO (Php) *");
				System.out.println("\n   SANDWICHES:");
				for (int SUB = 0; SUB<priceSndwch.length; SUB++) {
					System.out.println("    "+sandwich[SUB]+" - "+priceSndwch[SUB]);}
				
				System.out.println("\n   MEAL (WITH RICE):");	
				for (int SUB = 0; SUB<priceMealRc.length; SUB++) {
					System.out.println("    "+mealRice[SUB]+" - "+priceMealRc[SUB]);}
					
				System.out.println("\n   SOFTDRINKS:");				
				for (int SUB = 0; SUB<priceSftDrnk.length; SUB++) {
					System.out.println("    "+SoftDrink[SUB]+" - "+priceSftDrnk[SUB]);}
					
				System.out.println("\n   ENERGY DRINKS:");				
				for (int SUB = 0; SUB<priceEnrgyDrnk.length; SUB++) {
					System.out.println("    "+EnergyDrink[SUB]+" - "+priceEnrgyDrnk[SUB]);}
					
				System.out.println("\n   CHIPS:");				
				for (int SUB = 0;SUB<priceChips.length; SUB++) {
					System.out.println("    "+chipipai[SUB]+" - "+priceChips[SUB]);}
			} else {System.out.println("\n  O.K. Just read the next lines...");}
		} //end of canteen() method
//end of all the METHODS CALLED in the serviceOffrd() method
		
public static void companyBG() {
		System.out.println("\n\n\n\t\t\t       COMPANY BACKGROUND\n\n");
		System.out.print("     La Consolacion Sports Complex (LCSC) germinated into life from the drive of");
		System.out.println("Mr. David C. Mercado to extend quality sports event to avid tennis individuals.");
		System.out.print("     La Consolacion was solely put up on January 1990 in Las Pi¥as City by David");
		System.out.println("and later on, partnered with Mr. Timoteo P. Tiangco. La Consolacion was derived");
		System.out.println("from David's mother, Consolacion.");
		System.out.print("     La Co (for brevity) is committed to be highly competitive and profitable in");
		System.out.print("all its services. Paper works began, w/c included an application w/ the Dept. of");
		System.out.println("Trade & Industry (DTI) for the approval of the company name.");
		System.out.print("     It officially  started right after the registration, with 8 employees,armed");
		System.out.print("w/ the vision of being one of the top sports centers in Metro Manila by means of");
		System.out.println("effective and innovative strategies  that would certainly benefit the people andsociety.");
		yes();
	}	//end of companyBG() method

public static void MxonVxon() {
		System.out.println("\n\n\n\t\t\t     OUR MISSION AND VISION\n");
		System.out.println("   MISSION:");
		System.out.println("\n     * To satisfy customers by giving the best services and top-of-the-line"); 
		System.out.println("  facilities in a sports complex");
		System.out.println("\n\n   VISION: ");
		System.out.println("\n     * To be one of the top sports centers in Metro Manila");
		yes();
	}	//end of MxonVxon() method

//METHODS USED to 
//1.)ask the user whether to continue or not, the viewing of info
//2.)exit the system if an invalid character is entered
	public static void yes() {
		System.out.print("\n\nPress Y to view the Main List. ");}
	public static void invalidChar() {
		System.out.println("\nO-oh!! That\'s not on the list! Sorry, you cannot continue. ACCESS DENIED!");
		System.exit(0); }
} //end of class LaConsolacion