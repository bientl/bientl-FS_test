import java.util.Scanner;


public class Assignment1 {
    //return the longest word in a string.
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String confirm = null;
            do {
                System.out.println("Enter String:");
                String inputString = sc.nextLine();
                String longestWord = getLongestWord(inputString);
                System.out.println(String.format("==>'%s' is the longest word, with %s characters", longestWord,longestWord.length()));

                System.out.println("------------------------------");
                System.out.println("Do you want to countinue? (y/n)");
                confirm = sc.nextLine();
            } while (confirm.equalsIgnoreCase("y"));
        }
    }


    public static String getLongestWord(String input){
        String words[] = input.split(" ");
        String longestWord = words[0];

        for (String eachWord : words) {
            if (eachWord.length() > longestWord.length()){
                longestWord = eachWord;
            }
        }
        return longestWord;
    }
}
