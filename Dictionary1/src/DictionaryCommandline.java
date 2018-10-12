

public class DictionaryCommandline {
    public static void showAll(){
        System.out.println("|No     "+"English      "+"VietNam");
        //for(int i=0;i< Dictionary_Management.dictionary1.array.size();i++)
        int i=0;
        while(i!=Dictionary_Management.dictionary1.array.size())
        {
            System.out.println("|"+(i+1)+"        |"+ Dictionary_Management.dictionary1.array.get(i).getWord_taget()
                    +"     |"+ Dictionary_Management.dictionary1.array.get(i).getWord_explain());
            i++;
        }
    }
}
