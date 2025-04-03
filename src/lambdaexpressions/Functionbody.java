package lambdaexpressions;
interface Test3{
    void printOddOrEven(int i);
}
public class Functionbody {
    public static void main(String[] args) {
        printNumber1(i->{
            if(i%2==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        },10);

    }

    private static void printNumber1(Test3 t, int i) {
        t.printOddOrEven(i);
    }

}
