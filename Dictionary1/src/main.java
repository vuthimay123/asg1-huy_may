import java.io.File;
//import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//        Scanner input=new Scanner(System.in);
//        System.out.println("Tu muon ra: ");
//        String nhap;
//        nhap=input.next();
//        Dictionary_Management.insertFromCommandline();
//        DictionaryCommandline.showAll();
        File file=new File("dictionaries.txt");
        System.out.println("Exist?"+file.exists());
    }
}

