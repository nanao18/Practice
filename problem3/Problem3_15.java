package problem3;

public class Problem3_15 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100)+1;
		System.out.println("点数："+a);
		if(a >= 80){
			System.out.println("優");
		} else if(a >= 70){
			System.out.println("良");
		} else if(a >= 60){
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}
}
