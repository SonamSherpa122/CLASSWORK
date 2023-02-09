public class DAY7 {
    public static void main(String[] args) {
         Car mycar= new Car();
        int x=2;
        mycar.car(x);
        mycar.car("Blue");
        mycar.car(15,"Blue");
    }
    }
    class Car
    {
        void car(){
            System.out.println("I have Cars");
        }
        void car(String Color){
            System.out.println("I have "+Color+" Car");

        }
        void car(int qty){
            System.out.println("I have "+qty+" Cars");
        }
        void car(int qty, String Color)
        {
            System.out.println("I have " +qty+" " +Color+" Cars" );
        }
    }