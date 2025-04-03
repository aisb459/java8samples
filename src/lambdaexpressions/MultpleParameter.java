package lambdaexpressions;

interface Test2{
    void display(String s1, String s2);
}
public class MultpleParameter {
    public static void main(String[] args) {
        funct2((s1,s2) -> System.out.println(s1+" "+s2),"hello","world");
    }

    private static void funct2(Test2 t, String s1, String s2) {
        t.display(s1,s2);
    }
}
