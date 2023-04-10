public class Main {
    public static void main(String[] args) {
        MathSin S1 = new MathSin(30);
        MathCos C1 = new MathCos(60);
        MathTan T1 = new MathTan(90);
        S1.start();
        C1.start();
        T1.start();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        try {
            S1.join();
            C1.join();
            T1.join();

        }catch (InterruptedException e){
            System.out.println("Error");

        }




    }
}

class MathSin extends Thread{
    public double deg;
    public double res;
    public MathSin(int degree){
        deg = degree;
    }

    public void run(){
        System.out.println("EXECUTING SIN OF " + deg );
        res = Math.sin(deg);
        System.out.println("EXIT FROM SIN");
    }
}

class MathCos extends Thread{
    public double deg;
    public double res;

    public MathCos(int degree){
        deg = degree;
    }

    public void run(){
        System.out.println("EXECUTING COS OF " + deg );
        res = Math.sin(deg);
        System.out.println("EXIT FROM COS");
    }
}

class MathTan extends Thread{
    public double deg;
    public double res;

    public MathTan(int degree){
        deg = degree;
    }

    public void run(){
        System.out.println("EXECUTING TAN OF " + deg );
        res = Math.tan(deg);
        System.out.println("EXIT FROM TAN");
    }
}