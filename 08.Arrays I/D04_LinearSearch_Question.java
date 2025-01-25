public class D04_LinearSearch_Question {
    public static int linearSearch(String fruits[],String key){
        for(int i = 0;i<fruits.length;i++){
            if(fruits[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        String fruits[] = {"apple","banana","orange","grapes","pineapple","kiwi","pears","guava"};
        String key = "pineapple";

        int index = linearSearch(fruits, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is at the index : "+index);
        }
    }
}
