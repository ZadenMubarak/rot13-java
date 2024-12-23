public class Rot13{

    public static void main(String[] args){

        // lets begin!!
        // see you you guys when I am finished


        String first = "abcdefghijklm";
        String second = "nopqrstuvwxyz";

        String upper1 = "ABCDEFGHIJKLM";
        String upper2 = "NOPQRSTUVWXYZ";

        // for (int i = 0; i < first.length(); i++){
        //     System.out.println(first.charAt(i));
        // }

        if (StringIn(first, "a")){
            System.out.println("a is in first");
        }
        
    }

    public static boolean StringIn(String word, String letter){

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter.charAt(0)){
                return true;
            }
        }
        return false;
    }

    public static void rot13(String message){

        //for each word in the message
        for (int i = 0; i < message.length(); i++){

            //for each letter

            char word = message.charAt(i);
            // String word_ = ((String)word);

            for(int l =0; l < message.charAt(i).length())

        }
    }

}