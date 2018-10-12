import java.io.*;
import java.util.Scanner;
 class Dictionary_Management {
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
    public static void insertFromFile()  {
        File file=new File("dictionaries.txt");
//        FileInputStream fis= null;
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr= new InputStreamReader(fis);
            BufferedReader buffer=new BufferedReader(isr);
            String a=buffer.readLine();
            while(a != null){
               String[] b= a.split("[   ]",2);
                 String ta =b[0];
                 String tv=b[1];
                Word add1=new Word(ta,tv);
                dictionary1.array.add(add1);
                a=buffer.readLine();

            }
            fis.close();
            isr.close();
            buffer.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

     }
     public static void Lookup(String a )
     {
         int dem=0;
         for(int i=0;i<dictionary1.array.size();i++)
         {
             if(a.equals(dictionary1.array.get(i).getWord_taget())) {
                 dem++;
                 System.out.println("Nghia cua tu can tim la:" + dictionary1.array.get(i).getWord_explain());
                 break;
             }

         }
         if(dem==0)
             System.out.println("khong tim thay tu can tra");
     }

}