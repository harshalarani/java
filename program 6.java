import java.util.*;

class Invalidage extends Exception {
    public String toString() {
        String s = "Invalid age";
        return s;
    }
}

class Invalidboth extends Exception {
    public String toString() {
        String s = "Son's age cannot be greater than or equal to father's age";
        return s;
    }
}

class father {
    int f_age;
    Scanner sc = new Scanner(System.in);

    father() throws Invalidage {
        System.out.println("Enter father's age");
        f_age = sc.nextInt();
        if (f_age <= 0)
            throw new Invalidage();
    }
}

class son extends father {
    int s_age;
    Scanner s = new Scanner(System.in);

    son() throws Invalidage {
        System.out.println("Enter son's age");
        s_age = sc.nextInt();
        if (s_age <= 0)
            throw new Invalidage();
    }

    void check() throws Invalidboth {
        if (s_age >= f_age)
            throw new Invalidboth();
        else {
            System.out.println("fathers age is " + f_age);
            System.out.println("son's age is " + s_age);
        }
    }
}

    public class programm6 {
        public static void main(String args[]) {

            try {
                son ob = new son();
                ob.check();
            } catch (Invalidage e) {
                System.out.println(e);
            } catch (Invalidboth e1) {
                System.out.println(e1);
            }

        }
    }

