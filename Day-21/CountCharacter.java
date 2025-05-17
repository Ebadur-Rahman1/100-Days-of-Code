// Count how many times lowercase vowels occurred in a String entered by the user.

public class CountCharacter {
    public static void main(String[] args){
        String s = "Ebadur Rahman";
        char[] sArr = s.toCharArray();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(sArr[i] == 'a' || sArr[i] == 'e' || sArr[i] == 'i' || sArr[i] == 'o' || sArr[i] == 'u'){
                count++;
            }
        }
        System.out.println("Total lowercase vowel is: "+ count);
    }
}