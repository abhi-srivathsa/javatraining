package divisible;

public class divisible {

	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i%3==0&&i%5==0) {
				System.out.print("abcxyz ");
				
			}else if (i % 3 == 0)
				System.out.print("abc ");
			else if (i % 5 == 0) {
				System.out.print("xyz ");

			}
			
			else {
				System.out.print(i + " ");
			}
		}

	}

}
