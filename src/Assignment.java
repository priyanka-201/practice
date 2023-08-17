public class Assignment {
    public static void main(String[] args) {
        //"Welcome to I.T MASTAR"
        //Output : MaStar
        String exam="Welcome to I.T MASTAR";
        String a=exam.substring(15,17);
        //  char word=a.charAt(15);
        System.out.println(a);
        char word=a.charAt(0);
        char word1=a.charAt(1);

        // System.out.println(word);

        String letter=String.valueOf(Character.toLowerCase(word1));
        String output=word+letter;
        System.out.println(output);

        // System.out.println(a);
        //char word1=a.charAt(16);
        // System.out.println(word1);
        //System.out.println(letter);
        //  System.out.println(letter);
        //System.out.println(a+letter);

        System.out.println(exam.substring(17,21));
        // char a=exam.charAt(17);
        //System.out.println(a);
        String b=exam.substring(18,21);
        //System.out.println(b);
        //String c=b.toLowerCase();
        //System.out.println(c);
        //String d=a+c;
        String d= String.valueOf(exam.charAt(17)+b.toLowerCase());
        System.out.println(d);
        System.out.println(output+d);

    }
}

