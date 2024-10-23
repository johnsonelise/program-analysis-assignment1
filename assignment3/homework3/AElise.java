package homework3;

public class AElise {
    int a = 0;
    int b = 5;

    public AElise(){}
    public AElise(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static int min(int a, int b){
        if(a < b) return a;
        return b;
    }

    public static int max(int a, int b){
        if(a < b) return b;
        return a;
    }

    public static Object breaker(int a, int b, int c){
        return new AElise();
    }

    public static int obj_input(AElise in_elise){
        return in_elise.a + in_elise.b;
    }
}
