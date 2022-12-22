public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("kék"));
    }
    public static boolean palindrom(String text){
        StringBuilder rev = new StringBuilder(text);
       rev.reverse();
        return rev.toString().equals(text);

    }
}