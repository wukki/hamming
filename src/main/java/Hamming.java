public class Hamming {
    public static int compute(String str1, String str2) {
        if (str1.length() != str2.length()) throw new IllegalArgumentException();
        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();
        int d = 0;
        for (int i = 0; i < chr1.length; i++) {
            if (chr1[i] != chr2[i]) d++;
        }
        return d;
    }
}
