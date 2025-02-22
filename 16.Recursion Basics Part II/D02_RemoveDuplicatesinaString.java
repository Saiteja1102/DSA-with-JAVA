public class D02_RemoveDuplicatesinaString {
    public static void removeDup(String str,int idx,StringBuilder sb,boolean track[]){
        // base case
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        // kaam
        char currentchar = str.charAt(idx);
        if(track[currentchar-'a'] == true){
            //duplicate
            removeDup(str, idx+1, sb, track);    
        }
        else{
            track[currentchar-'a'] = true;
            removeDup(str, idx+1, sb.append(currentchar), track);
        } 
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}