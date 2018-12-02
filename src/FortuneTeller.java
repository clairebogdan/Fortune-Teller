import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) 
	{
	System.out.println("Welcome to the Fortune Teller 9000! Enter your birth year.");
	Scanner scan = new Scanner(System.in);
	long year = scan.nextLong();
	
if(year > 1910 && year < 1940) {
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
		if(name == 1) {
			System.out.println("You will eat a cookie later");
		}
		if(name == 2) {
			System.out.println("You will meet a cool stranger");
		}
		if(name == 3) {
			System.out.println("You will get pulled over next week");
		}
		if(name == 4) {
			System.out.println("You will have an awkward encounter");
		}
		if(name == 5) {
			System.out.println("You will get a dog");
		}
}
if(year > 1940 && year < 1970) {
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
	if(name == 1) {
		System.out.println("You will see a famous person in your city");
	}
	if(name == 2) {
		System.out.println("You will win the lottery!");
	}
	if(name == 3) {
		System.out.println("You will eat free ice cream next week");
	}
	if(name == 4) {
		System.out.println("You will have a new opportunity coming soon");
	}
	if(name == 5) {
		System.out.println("You will break a bone within the next 2 years");
	}	
}
if(year > 1970 && year < 1990) {
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
	if(name == 1) {
		System.out.println("You will find out you are allergic to something new");
	}
	if(name == 2) {
		System.out.println("You will get married within 5 years");
	}
	if(name == 3) {
		System.out.println("You will make a dangerous decision");
	}
	if(name == 4) {
		System.out.println("You will travel to a new country");
	}
	if(name == 5) {
		System.out.println("Donald Trump will be impeached");
	}
}
if(year > 1990 && year < 2000) {	
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
	if(name == 1) {
		System.out.println("You will get a new job within 3 years");
	}
	if(name == 2) {
		System.out.println("You will meet a new friend through a random encounter");
	}
	if(name == 3) {
		System.out.println("You will see the real Santa");
	}
	if(name == 4) {
		System.out.println("You will make a viral meme");
	}
	if(name == 5) {
		System.out.println("You will make a life changing decision");
	}
}
if(year > 2000 && year < 2010) {
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
	if(name == 1) {
		System.out.println("You will get a new phone soon");
	}
	if(name == 2) {
		System.out.println("You will have a near death experience");
	}
	if(name == 3) {
		System.out.println("You will have a lucid dream");
	}
	if(name == 4) {
		System.out.println("You will win on a lottery ticket (small prize)");
	}
	if(name == 5) {
		System.out.println("You will add a member to your family");
	}
}
if(year > 2010 && year < 2018) {
	System.out.println("Enter a number 1 to 5");
	int name = scan.nextInt();
	if(name == 1) {
		System.out.println("You will invent something in the future");
	}
	if(name == 2) {
		System.out.println("You will buy a house");
	}
	if(name == 3) {
		System.out.println("You will study medicine");
	}
	if(name == 4) {
		System.out.println("You will become a master at something");
	}
	if(name == 5) {
		System.out.println("You will become an athlete");
	}
	
	
}
if(year < 1910 || year > 2018) {
	System.out.println("Invalid birth year!");
	
}
	

	}

}
