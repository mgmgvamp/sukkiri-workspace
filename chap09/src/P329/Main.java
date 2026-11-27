package P329;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print(" ＞ ");
		String s1 = new Scanner(System.in).nextLine();
		String s2 = "こんにちは";
		if (s1 == s2) {
			System.out.println("アドレスがおなじ");
		} else {
			System.out.print("ちがう");
		}

	}

}
