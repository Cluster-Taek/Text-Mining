import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Convert {
	public ArrayList Converting() {
		Scanner sc = new Scanner(System.in);
		String text = "Multi-effect beard trimmer: This trimmer cuts mustache and beard hair, through one clipper blade can be completed shaving and trimming work, without using replacement knife head, include 3 limiting combs.\r\n" + 
				"Special hair clipper: The special design of this hair clipper make this product closer to the skin .Deep cleansing of your excess hair .The non-slip design on the back also gives you a better grip.\r\n" + 
				"Sideburn trimmer: The energetic engine working with stainless steel blade. makes a clean and fast trimming, Has a very good performance, save time and give your face a new look every day.\r\n" + 
				"Charging indicator: Charge 2 hours,you can use it for 60 minutes .The red indicator light goes on when you charging. The green light warns you that the battery is full.It’s a cordless clippers ,it can be used cordless and powered by lithium-ion batteries\r\n" + 
				"Push switch&speed adjustable: One button control switch, convenient and fast.Use it with a softly push ,It has adjustable speeds, medium and high, and you can make it work according to your need.";
		StringTokenizer tokens = new StringTokenizer(text," |.|,|!|\n|(|)|*|-|\"|”|“|…|:");
		ArrayList<String> list = new ArrayList<String>();
		while(tokens.hasMoreTokens()) {
			list.add(tokens.nextToken());
		}
		return list;
	}
	
}
