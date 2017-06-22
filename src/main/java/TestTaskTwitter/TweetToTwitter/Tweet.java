package TestTaskTwitter.TweetToTwitter;

import java.util.Scanner;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Tweet {
	public static void main(String[] args) throws TwitterException {
		// The factory instance is re-useable and thread safe.
		Twitter twitter = TwitterFactory.getSingleton();
		
		
		//read user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message : ");
		String messg = sc.nextLine();
		sc.close();
		//post it
		Status status = twitter.updateStatus(messg);
		
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
