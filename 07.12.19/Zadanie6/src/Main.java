

import java.io.IOException;

public class Main {
    private void throwException() throws IOException{
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        try {
            main.throwException();
        }catch (IOException ex){
            System.out.println("nie_wyjatek." + ex);
        }
    }
}