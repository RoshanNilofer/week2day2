package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input=121, output=0, temp,r;
		temp = input;
		while(temp!=0) {
			r=temp%10;
			output=output * 10 +r;
			temp /= 10;
		};
		if(input == output)
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");
	}
}
