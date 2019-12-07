package Zadanie1;
public class Main<T> {
    public boolean contains(T[] collection , T genericElement){
        for(T item : collection){

            if(item.equals(genericElement)){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] array = {"element", "item"};
        String element1 = "element";
        String element2 = "element2";

        Main main = new Main();
        System.out.println(main.contains(array, element1));
        System.out.println(main.contains(array, element2));
    }
}