public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("arra"));
    }
    public static boolean palindrom(String text){
        StringBuilder rev = new StringBuilder();
        for (int i = text.length()-1; i >= 0; i--) {
            rev.append(text.charAt(i));
        }
        System.out.println("rev: "+rev);
        System.out.println("text: "+text);
        return rev.equals(text);

    }
}