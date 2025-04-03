package lambdaexpressions;
interface Test1{
    void display(String s);
}
public class SingleParameter {
    public static void main(String[] args) {
        funct(s-> System.out.println(s),"hello");
    }

    private static void funct(Test1 t, String s) {
        t.display(s);
    }

}
