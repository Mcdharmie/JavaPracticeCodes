public class IsAlpha{

	public static void main(String[] args){
		char letter = 'a';

		if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
	}
}
