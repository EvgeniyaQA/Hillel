public class Lessonfour {
    int b = 1;

    public static void main(String[] args) {
        ClassFourLesson4 example1 = new ClassFourLesson4();// не статик- надо создавать объект
        int mult= example1.doMultiplication(4,5);
        System.out.println("Result  of multiplication :" +mult);

        int sum= ClassFourLesson4.doSum(2,3);
        System.out.println("Result of sum : " +sum);//если статик- не надо создавать объект
        int sum1 =ClassFourLesson4.doSum(2,4,1);
        System.out.println("For third : "+sum);

        int sum2 =ClassFourLesson4.doSum(2,4,1, 6);
        System.out.println("For forth : "+sum);
        

        //Lessonfour obj1 = new Lessonfour();//создали новый объкт
        //double rand = Math.random()*10;

       // int rand = (int) ((Math.random()) * 10);
//        //System.out.println( (doMultiplication(10,3));
        //obj1.doWriteMyName();
        //int ten = obj1.doMultiplication(2, 5);
       // System.out.println("Result " + ten);
       // System.out.println(obj1.doSum(7, 7));
       // obj1.do1();
    }

    public void do1() {
        System.out.println("here is text from do1 method: ");
        do3();
    }

    public void do2() {
        System.out.println("Here's text from do2 method: ");
    }

    public void do3() {
        System.out.println("Here's text from do3 method: ");

    }


    public void doWriteMyName() {
        System.out.println("Zhenya");

    }

    public static int forExample() {
        int d = 0;
        int b = 2;
        int c = d * b;
        return c;
    /*}  public int doMultiplication(int a, int b) {перенесли в другой класс
        int result = a * b;
        return result;
    }

    public int doSum(int a, int b) {
        int result = a + b;
        return result;
    }*/
    }
}




