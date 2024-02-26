
public class IsLower{
	static char letter = 'A';

	public static void main(String[] args){
		isLower();
	}

	static void  isLower(){
		if(letter >= 'a' && letter <= 'z'){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
	}
}
