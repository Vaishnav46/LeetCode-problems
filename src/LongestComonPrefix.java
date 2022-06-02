public class LongestComonPrefix {


    public static void main(String[] args) {
        LongestComonPrefix lcm = new LongestComonPrefix();
        String str[] ={"flower","flow","flight"} ;
        String res = lcm.prog(str);
        System.out.println(res);
    }
    public String prog(String[] str){


        if (str.length == 0)
            System.out.println("");

        String prefix = str[0];
        System.out.println(str[1].equalsIgnoreCase(prefix));
        System.out.println(str[2].equalsIgnoreCase(prefix));

        for(int i = 1;i< str.length;i++){
            while (str[i].indexOf(prefix)!=0){
                //System.out.println("in while loop");
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }


        return prefix;
    }
}
