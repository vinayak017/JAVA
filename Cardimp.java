public class Cardimp{
    public static void main(String[] args){
        Cards cd1 = new Cards();
        cd1.display();
        cd1.shuffle();
        System.out.println("After Shuffle:::::::::");
        cd1.display();
        cd1.randomindex();
    }
}