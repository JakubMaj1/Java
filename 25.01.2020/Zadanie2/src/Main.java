

public class Main {
    public static void main(String[] args) {
        JoinPractice instance1 = new JoinPractice();
        JoinPractice instance2 = new JoinPractice();
        JoinPractice instance3 = new JoinPractice();
        JoinPractice instance4 = new JoinPractice();
        JoinPractice instance5 = new JoinPractice();

        instance1.start();
        instance2.start();
        instance3.start();
        instance4.start();
        instance5.start();

        try{
            instance1.join();
            instance2.join();
            instance3.join();
            instance4.join();
            instance5.join();
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }


    }




}