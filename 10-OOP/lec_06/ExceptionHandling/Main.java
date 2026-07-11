package lec_06.ExceptionHandling;

import lec_04.AccessModifier.A;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            String name = "ritesh";
            if(name.equals("ritesh")) {
                throw new MyException("Name is ritesh");
            }

            divide(a, b);
        }

        catch(MyException e){
            System.out.println(e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Always Executed");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        return a/b;
    }
}
