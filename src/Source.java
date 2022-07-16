public class Source {
    public static void main(String[] args) {
    char value = 'a';
        System.out.println(position(value).equals("Position of alphabet: 1"));
    }
    public static String position(char alphabet)    {
        return String.format("Position of alphabet: %s",alphabet - 'a' + 1);
    }
}
