import java.sql.SQLOutput;
import java.util.Scanner;

public class DictionaryCommandline {
    public static void showAll() {
        System.out.println("|No     " + "English      " + "VietNam");
        //for(int i=0;i< Dictionary_Management.dictionary1.array.size();i++)
        int i = 0;
        while (i != Dictionary_Management.dictionary1.array.size()) {
            System.out.println("|" + (i + 1) + "        |" + Dictionary_Management.dictionary1.array.get(i).getWord_target()
                    + "     |" + Dictionary_Management.dictionary1.array.get(i).getWord_explain());
            i++;
        }
    }

    public static void dictionarySearcher() {
        String a = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi Nhap:");
        a = scanner.next();
        int dem = 0;
        for (int i = 0; i < Dictionary_Management.dictionary1.array.size(); i++) {
            if (Dictionary_Management.dictionary1.array.get(i).getWord_target().substring(0, a.length()).equals(a)) {
                System.out.println(Dictionary_Management.dictionary1.array.get(i).getWord_target());
                dem++;
            }
        }
        if (dem == 0)
            System.out.println("Khong tim thay nhung tu nhu tren!");
    }

}
