import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char first_char=line.charAt(0);
        if(first_char==' ') {
            System.out.println("Space!");
        }else
        if(first_char>='0'&&first_char<='9'){
            System.out.println("Digit!");
        }else
        if(first_char>='a'&&first_char<='z'){
            System.out.println("Lowercase letter!");
        }else
        if(first_char>='A'&&first_char<='Z'){
            System.out.println("Capital letter!");
        }else System.out.println("Something else!");
        System.out.println("Length of the string: "+line.length());
    }
}
