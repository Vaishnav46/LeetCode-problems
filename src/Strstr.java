public class Strstr {

    public int strStr(String haystack, String needle) {

        int counter = 0;
        int m = haystack.length();
        int n = needle.length();
        char[] haystackc = haystack.toCharArray();
        char[] needlec = needle.toCharArray();

        if (needle.isEmpty())
            return 0;
 //still not solved
        if (m < n)
            return -1;

        for (int i = 0; i < haystackc.length - needle.length(); i++) {
            for (int j = 0; j < needlec.length; j++) {
                if (haystackc[i + j] == needlec[j]) {
                    break;
                }
                if (j == needlec.length)
                    return i;
            }
        }
        return strStr(haystack,needle);
    }



    public static void main(String[] args) {
        Strstr str = new Strstr();
        int n =str.strStr("hello","l");
        System.out.println(n);
    }
}

