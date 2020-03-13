mport javax.crypto.spec.PSource;

public class ForExample {
    public static void main(String[] args) {
        /*for(int i=10; i>0;i--){
            System.out.println(i);
        }*/
       /* for (int i=0; i<10;i++){
            if( i==5)
            break;
            System.out.println(i);
        }
        System.out.println("За циклом");*/

        for (int a=0;a<10;a++){
            if (a>=5&&a<=7)// перескок 5 и 7
                continue;
            System.out.println(a);
        }
        System.out.println("За циклом");
    }
    
}
