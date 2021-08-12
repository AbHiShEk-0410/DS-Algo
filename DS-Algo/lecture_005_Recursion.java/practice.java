import java.io.CharArrayReader;
import java.util.ArrayList;

public class practice {
    public static ArrayList<String> subSequence(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> recAns = subSequence(str.substring(1));

        ArrayList<String> myAns = new ArrayList<>(recAns);
        for (String s : recAns) {
            myAns.add(ch + s);
        }
        return myAns;
    }

    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKpc(String str){
        if(str.length() ==0 ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String code = nokiaKeys[ch - '0']; 

        ArrayList<String> recAns = getKpc(str.substring(1));
        ArrayList<String> myAns = new ArrayList<>();

        for(int i = 0; i < code.length();i++){
            for (String s : recAns) {
                myAns.add(code.charAt(i) + s);
            }
        }
        return myAns;
    }

    public static void main(String[] args) {
        System.out.println(getKpc("456"));
    }
}