// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.lang.Thread;
public class ThreadTest extends Thread {

    public void run(){
int i = 0;
        while(true){

            System.out.println(i + " Hello");
            i++;
        }

    }

public static void main(String[] args) {

    ThreadTest t = new ThreadTest();
    t.start();
    int i = 0;
    while(true){

        System.out.println(i + " World");
        i++;
    }

}
        }



