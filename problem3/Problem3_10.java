package problem3;

public class Problem3_10 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		if(num <= 10 || num >= 90){
			System.out.println("10以下か90以上の値です");
		} else {
			System.out.println("10より大きく90未満です");
		}
	}
}
