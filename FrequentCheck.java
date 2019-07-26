
import java.util.Scanner;

public class FrequentCheck {

	public static void main(String[] args) {
		System.out.println("enter the number!");
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		int[][] map =null;
		for(int i = 0 ; i<num.length();i++) {
			for(int j=0;j<i+1;j++) {
				if(map[j][0]==Character.getNumericValue(num.charAt(i))) {
					map[j][1]++;
					break;
				}
				else {
					map[i][0]=num.charAt(i);
					map[i][1]=1;
				}
			}
		}
		int ln=0;
		int freq=0;
		for(int i=0;i<num.length();i++) {
			if(freq<map[i][1]&&ln<map[i][0]) {
				freq=map[i][1];
				ln=map[i][0];
			}
		}
		System.out.println("frequent didit is " + ln);
	}

}
