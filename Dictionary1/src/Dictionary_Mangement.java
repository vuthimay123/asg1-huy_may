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
        File file=new File("C:\\Users\\dell\\IdeaProjects\\asg1-huy_may\\asg1-huy_may\\Dictionary1\\src\\dictionaries.txt");
        if(file.exists()==false)
            System.out.println("file khong ton tai");
        else
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr= new InputStreamReader(fis);
            BufferedReader buffer=new BufferedReader(isr);
            String a="";
            a=buffer.readLine();
            while(a != null){
               String[] b= a.split("[   ]",2);
                 String ta =b[0];
                 String tv=b[1].trim();
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
             if(a.equals(dictionary1.array.get(i).getWord_target())) {
                 dem++;
                 System.out.println("Nghia cua tu can tim la: " + dictionary1.array.get(i).getWord_explain());
                 break;
             }

         }
         if(dem==0)
             System.out.println("khong tim thay tu can tra");
     }

     public  static void change(){
         Scanner thaotac=new Scanner(System.in);
         System.out.println("ban muon lam gi:them/xoa/sua");
         String a=thaotac.next();

         switch (a){
            //them tu vao trong mang dictionary
             case ("them") :
             {
             System.out.println(" Nhap Tu moi ban muon them: ");
             Scanner input = new Scanner(System.in);
             String english = "", vietnam = "";
             english = input.nextLine();
             System.out.println("Nhap nghia cua tu ban them: ");
             vietnam = input.nextLine();
             Word add1 = new Word(english, vietnam);
             dictionary1.array.add(add1);
             break;
            }

             //xoa tu trong mang dictionary
             case ("xoa"):
             {
                 System.out.println(" Nhap Tu ban muon xoa: ");
                 Scanner input = new Scanner(System.in);
                 String xoa=input.next();
                 int dem=0;
                 for(int i=0;i<dictionary1.array.size();i++ )
                 {
                     if(xoa.equals(dictionary1.array.get(i).getWord_target())) {
                         dictionary1.array.remove(i);
                         dem++;
                         break;
                     }
                 }
                 if(dem==0)
                     System.out.println("Tu dien khong co tu ban muon xoa");
                 break;
             }
             // sua tu trong tu dien
             case("sua"):
             {
                 Scanner scanner=new Scanner(System.in);
                 System.out.println("ban muon sua tu nao:");
                 String b=scanner.nextLine();
                 for(int i=0;i<dictionary1.array.size();i++)
                 {
                     if(b.equals(dictionary1.array.get(i).getWord_target()))
                     {

                         System.out.println("nhap thay doi (tieng anh) :");
                         String c=scanner.nextLine();
                         dictionary1.array.get(i).setWord_target(c);
                         System.out.println("nhap thay doi (tieng viet):");
                         String d=scanner.nextLine();
                         dictionary1.array.get(i).setWord_explain(d);
                     }
                 }
                 break;
             }

         }
     }

    public static void  dictionaryExportToFile() {
         File file=new File("output.txt");
//         if(file.exists())
//             System.out.println("Exists?"+ "True");
        System.out.println(file.getAbsolutePath());
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

//            Writer writer = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for(int i=0;i<dictionary1.array.size();i++)
            //bufferedWriter.write(dictionary1.array.get(i).getWord_explain()+"   "+ dictionary1.array.get(i).getWord_explain());
//            bufferedWriter.write(3);
                printWriter.print(dictionary1.array.get(i).getWord_target()+"   "+dictionary1.array.get(i).getWord_explain());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
