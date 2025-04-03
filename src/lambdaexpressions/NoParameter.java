package lambdaexpressions;
@FunctionalInterface
interface Test{
   void display();
        }
public class NoParameter {
    static void printNumber(Test t){
        t.display();
    }

    public static void main(String[] args) {
        printNumber(()-> System.out.println("hello"));
    }

}
