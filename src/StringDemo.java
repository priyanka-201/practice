public class StringDemo {
    public static void main(String[] args) {
        String word = "Mastar";
        System.out.println("word");
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.length());
        String word1 = "hello";
        String word2 = "world";
        String word3 = word1 + " " + word2;
        System.out.println(word3);
        String word4 = word1.concat(word);
        System.out.println(word4);
        char letter = 'a';
        System.out.println(Character.toUpperCase(letter));
        String word5 = "Hello";
        System.out.println(word1.equals(word5));
        System.out.println(word1.equalsIgnoreCase(word5));
        String w = "learn_it";
        System.out.println(w.substring(1, 4));
    }
}