import java.awt.*;

public class HelloWorld {
    class mem{
        int a=1;
    }
    static int times=1;
    public static void main(String[] args) {
        {
            System.out.println(Color.blue + "HelloWorld");
            System.out.println(times);
        }//sout
        {
            boolean b = false;
            boolean a = true;
            if (b) {
                System.out.println("false");
            }
            if (a) {
                System.out.println("true");
            }
        }//boolean
        {
            int switch_a = 5;
            switch (switch_a) {
                case 1:
                    System.out.println("it is a");
                    break;
                case 2:
                    System.out.println("it is b");
                    break;
                default:
                    System.out.println("it is nothing");
            }
        }//switch
        {
            for (int sum = 1; sum <= 100; sum++) {
                System.out.println(sum);
            }
        }//for
        {
            int x = 1;
            int ner = 0;
            while (x <= 100) {
                ner = ner + x;
                x++;
            }
            System.out.println(ner);
        }//while 百加数
        {
            int baishu =0;
            for(int gongju=0;gongju<=100;gongju++){
                baishu=baishu+gongju;
            }
            System.out.println(baishu);
        }//for百加数
    }
}

