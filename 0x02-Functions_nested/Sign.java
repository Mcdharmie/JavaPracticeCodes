public class Sign{

    /**
     * print_sign - prints the sign of a number
     * @num: the int to check
     * Return: 1 and prints + if n is greater than zero
     * 0 and prints 0 if n is zero
     * -1 and prints - if n is less than zero
     */
    public static void main (String[] args){
        int num = 8;
        sign(num);
    }

    static int sign(int num){

        if (num > 0){
            System.out.print("+");
            return (1);
        }
        else if (num < 0){
            System.out.print("-");
            return (-1);
        }
        else{
            System.out.print("0");
            return (0);
        }

    }
}
