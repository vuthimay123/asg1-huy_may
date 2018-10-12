import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

          Scanner input=new Scanner(System.in);
          System.out.println("Tu muon tra: ");
          String nhap;
          nhap=input.next();
          Dictionary_Management.insertFromFile();
          Dictionary_Management.Lookup(nhap);
          DictionaryCommandline.showAll();
          Dictionary_Management.change();
          DictionaryCommandline.showAll();
          DictionaryCommandline.dictionarySearcher();
          Dictionary_Management.dictionaryExportToFile();

}
}

