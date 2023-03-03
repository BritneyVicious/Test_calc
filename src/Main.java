import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int i = 0;
        int first;
        int second;
        int signInd;
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] digits = s.toCharArray();
        if (digits[0] == '1' && digits[1] == '0') {
            first = 10;
            i = i + 2;
        }
        else if ((digits[0] <= '0' || digits[0] > '9') || (digits[1] != ' ')){
            throw new IOException();
        } else {
            first = Character.digit(digits[0], 10);
            i++;
        }

        if (digits[i] != ' ' || digits[i + 2] != ' '){
            throw new IOException();
        }
        else signInd = ++i;

        if (digits.length - i == 4) {
            if (digits[i + 2] == '1' && digits[i + 3] == '0') second = 10;
                else throw new IOException();
        }
        else if (digits.length - i == 3){
            if (digits[i + 2] <= '0' || digits[i + 2] > '9') {
                throw new IOException();
            } else second = Character.digit(digits[i + 2], 10);
        }
        else throw new IOException();

        switch (digits[signInd]){
            case '+' :
                System.out.println(first + second);
                break;
            case '-' :
                System.out.println(first - second);
                break;
            case '*' :
                System.out.println(first * second);
                break;
            case '/' :
                System.out.println(first / second);
                break;
            default: throw new IOException();
        }
    }
}
