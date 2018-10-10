public class DictionaryCommandline {
    Dictionary dictionary1 = new Dictionary();
    public static void showAll(){
        System.out.println("|No     "+"English      "+"VietNam");
        for(int i=0;i< Dictionary_Management.dictionary1.array.size();i++)
        {
            System.out.println("|"+(i+1)+"        |"+ Dictionary_Management.dictionary1.array.get(i).getWord_taget()
                    +"     |"+ Dictionary_Management.dictionary1.array.get(i).getWord_explain());

        }
    }
}
