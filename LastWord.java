public class LastWord {
    public static void main(String[] args) {
        String s = "Hi my name is sahar";
        lastWord(s);
    }
    public static void lastWord(String a) {
        int num = a.length();
        char b [] = a.toCharArray();
        for (int i = num-1; i >= 0 ; i--) {
        if (b[i]==' '){
            System.out.println((num-1) - i);
            break;
    }}}}
