package homework4; 


public class hardtests {
    public static void main(String[] args) {

        // System.out.println("starting hard tests!");

        int a = 5;
        int b = 10;
        int c = a + b;

        if(c < a){
            c = 5;
        }else{
            b = c + a;
        }

        for(int i = 0; i < 5; i++){
            c = c*a;
        }

        int x = 0;
        while(x != 5){
            x++;
        }

        // System.out.println("final c val: " + c + "\nwe done!!");

    }
}