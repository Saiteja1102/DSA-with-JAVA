public class D02_Array_Arguments {
    public static void update(int marks[],int nonChangable){
        nonChangable = 10;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        int marks[] = {97,98,99};
        int nonChangable = 5;
        update(marks,nonChangable);

        // Output
        System.out.println(nonChangable);
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
