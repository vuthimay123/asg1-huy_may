
import java.util.Scanner;
public class Dictionary_Management {
    public static Dictionary dictionary1 =new Dictionary();

    public static void insertFromCommandline(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu: ");
        int dem = scanner.nextInt();

        for(int i = 0 ; i < dem ; i++ ){
            System.out.println("Nhap tu:");
            String ta = scanner.next();
            scanner.nextLine();
            System.out.println("Nhap nghia: ");
            String tv = scanner.nextLine();
            Word s = new Word(ta,tv);
            dictionary1.array.add(s);
        }

    }
}
