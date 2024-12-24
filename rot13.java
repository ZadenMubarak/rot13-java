public class Rot13{

    public static void main(String[] args){
        // System.out.println(args[0]);
        rot13("Hello, world!");

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

        String first = "abcdefghijklm";
        String second = "nopqrstuvwxyz";

        String upper1 = "ABCDEFGHIJKLM";
        String upper2 = "NOPQRSTUVWXYZ";

        String sentence = "";

        //for each word in the message

        for (char word: message.toCharArray()){

            String encrypted_word = "";
            
            String str = Character.toString(word);
            for (char letter: str.toCharArray()){

                if (StringIn(first, Character.toString(letter))){
                    encrypted_word = encrypted_word +second.charAt(first.indexOf(letter));
                }

                else if (StringIn(second, Character.toString(letter))){
                    encrypted_word = encrypted_word + first.charAt(second.indexOf(letter));
                }

                else if (StringIn(upper1, Character.toString(letter))){
                    encrypted_word = encrypted_word + upper2.charAt(upper1.indexOf(letter));
                }
                
                else if (StringIn(upper2, Character.toString(letter))){
                    encrypted_word = encrypted_word + upper1.charAt(upper2.indexOf(letter));
                }

                else{
                    encrypted_word = encrypted_word + letter;
                }
            
            }
            
            sentence = sentence + encrypted_word;
        }

        System.out.println(sentence);

    }
}