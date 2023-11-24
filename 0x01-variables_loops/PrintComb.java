

import static java.lang.System.out;

public class PrintComb {
	public static void main(String [] args) {

		int i;
		int j;
		for (i = 0; i <= 9; i++) {
			for (j = 1; j <= 9; j++) {
				out.print(i);
				out.print(j);
				out.print(", ");
			}
		}
	}
}
