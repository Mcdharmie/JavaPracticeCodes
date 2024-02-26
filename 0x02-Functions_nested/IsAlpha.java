public class IsAlpha{
	static char letter = 'a';
	public static void main(String[] args){

		is_alpha();

	}

	static void is_alpha(){

		if((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
	}
}
