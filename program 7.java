class one extends Thread {
    public void run() {
        
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            System.out.println("Tnteruppted");
        }
    }
}

class two extends Thread {
    public void run() {

        
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        } catch (Exception e1) {
            System.out.println("Interuppted");
        }
    }
}



public class Main{
    public static void main(String args[]) {
        one obj1 = new one();
        two obj2 = new two();
        obj1.start();
        obj2.start();
       

    }

}