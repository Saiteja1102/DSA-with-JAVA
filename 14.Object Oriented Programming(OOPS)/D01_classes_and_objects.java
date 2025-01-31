public class D01_classes_and_objects{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "White";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String setcolor){
        color = setcolor;
    }

    void setTip(int settip){
        tip = settip;
    }
}