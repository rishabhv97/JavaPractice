public class StringsAssignment {

    public static int countVowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || 
                str.charAt(i) == 'e' || 
                str.charAt(i) == 'i' || 
                str.charAt(i) == 'o' || 
                str.charAt(i) == 'u') {
                count++;
                }
        }
        return count;
    }
    public static void main(String[] args) {
        // Question1:CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser.
        String s="aeiouA";
        System.out.println(countVowel(s));


        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));


        String str="Apnacollege".replace("l", "");
        System.out.println(str);
        
    }
}
