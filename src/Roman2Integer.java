import java.util.HashMap;

public class Roman2Integer {

    public static void main(String[] args) {


        String s = "LCM";
        s.toUpperCase();
        HashMap<Character,Integer> hp = new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);

        int res = hp.get(s.charAt(s.length()-1));

        for(int i = s.length()-2;i>=0;i--){

           if(hp.get(s.charAt(i))<hp.get(s.charAt(i+1))){
               res -=hp.get(s.charAt(i));
           }
           else
                res += hp.get(s.charAt(i));
        }

        System.out.println(res);
        }

    }
