public class Symmetry {
    public static void main(String[] args) {
        symmetry(1238456);
    }
    public static void symmetry(Integer a) {
        String num = a.toString();
        char[] number = num.toCharArray();
        int numberLength = number.length;
        for (int i = 0; i <= numberLength / 2; i++) {
            if (number[i] == number[numberLength - (i + 1)]) {
                System.out.println("for index  " + i + " : is symmetry");
            } else {
                System.out.println("for index  " + i + " : is not symmetry");
            }
        }
    }
}
