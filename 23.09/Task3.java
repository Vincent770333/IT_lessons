import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            } else {
                array.add(Integer.parseInt(line));
            }
        }
        int x = scanner.nextInt();
        int counter = 0;
        for(int q:array){
            if(q<=x){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
