package HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        task1_2(); //1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
        task1_3(); //1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
        task1_5(); //1.5 Попробуйте сделать побитовую операцию с числова 42.5, опишите результат
    }
        static void task1_2() {
            byte a = 42;
            byte b = 15;
            System.out.println(Integer.toBinaryString(a));//101010
            System.out.println(Integer.toBinaryString(b));//1111
            System.out.println(a | b);// a | b = 47
            System.out.println(Integer.toBinaryString(a | b));
            // 101010 | 1111 =101111
            System.out.println(a & b);// a & b =10
            System.out.println(Integer.toBinaryString(a & b));
            //101010 & 1111 =1010
            System.out.println(a ^ b);//a ^ b = 37
            System.out.println(Integer.toBinaryString(a ^ b));
            //101010 ^ 1111 =100101
            System.out.println(~a);//~a=-43
            System.out.println(Integer.toBinaryString(~a));
            //~a=11111111111111111111111111010101
            System.out.println(a >> 1);// Происходит сдвиг вправо на одно значение
            System.out.println(Integer.toBinaryString(a >> 1));
            // Происходит сдвиг вправо на одно значение (было101010) (Стало 10101)
            System.out.println(a << 1);// Происходит сдвиг влево на одно значение
            System.out.println(Integer.toBinaryString(a << 1));
            //Происходит сдвиг влево на одно значение (было101010) (Стало 1010100)
            System.out.println(a <<= 1);// Происходит сдвиг влево c присвиванием
            System.out.println(Integer.toBinaryString(a <<= 1));//(было 101010)(стало11111111111111111111111110101000)
            System.out.println(a >>= 1);// Происходит сдвиг вправо c присвиванием
            System.out.println(Integer.toBinaryString(a >>= 1));//(было 101010)(стало11111111111111111111111111101010)
            System.out.println(a >>> 1);// Происходит сдвиг вправо с заполнением нулями
            System.out.println(Integer.toBinaryString(a >>> 1));//(было 101010)(стало1111111111111111111111111110101)
            System.out.println(a >>>= 1);// Происходит сдвиг вправо с заполнением нулями c присваиванием
            System.out.println(Integer.toBinaryString(a >>>= 1));//(было 101010)(стало11111111111111111111111111111010)
        }
        static void task1_3(){
            byte a = -42;
            byte b = -15;
            System.out.println("task1_3");
            System.out.println(Integer.toBinaryString(a));//11111111111111111111111111010110
            System.out.println(Integer.toBinaryString(b));//11111111111111111111111111110001
            System.out.println(a | b);// a | b =-9
            System.out.println(Integer.toBinaryString(a | b));
            //11111111111111111111111111010110 | 11111111111111111111111111110001=11111111111111111111111111110111
            System.out.println(a & b);// a & b =-48
            System.out.println(Integer.toBinaryString(a & b));
            //11111111111111111111111111010110 | 11111111111111111111111111110001=11111111111111111111111111010000
            System.out.println(a ^ b);//a ^ b =39
            System.out.println(Integer.toBinaryString(a ^ b));
            //11111111111111111111111111010110 ^ 11111111111111111111111111110001=100111
            System.out.println(~a);//~a=41
            System.out.println(Integer.toBinaryString(~a));
            //~a=101001
            System.out.println(a >> 1);// Происходит сдвиг вправо на одно значение
            System.out.println(Integer.toBinaryString(a >> 1));
            // Происходит сдвиг вправо на одно значение (было11111111111111111111111111010110) (Стало 11111111111111111111111111101011)
            System.out.println(a << 1);// Происходит сдвиг влево на одно значение
            System.out.println(Integer.toBinaryString(a << 1));
            //Происходит сдвиг влево на одно значение (было11111111111111111111111111010110) (Стало11111111111111111111111110101100 )
            System.out.println(a <<= 1);// Происходит сдвиг влево c присвиванием
            System.out.println(Integer.toBinaryString(a <<= 1));//(было11111111111111111111111111010110 )(стало1011000)
            System.out.println(a >>= 1);// Происходит сдвиг вправо c присвиванием
            System.out.println(Integer.toBinaryString(a >>= 1));//(было11111111111111111111111111010110 )(стало10110)
            System.out.println(a >>> 1);// Происходит сдвиг вправо с заполнением нулями
            System.out.println(Integer.toBinaryString(a >>> 1));//(было11111111111111111111111111010110 )(стало1011)
            System.out.println(a >>>= 1);// Происходит сдвиг вправо с заполнением нулями c присваиванием
            System.out.println(Integer.toBinaryString(a >>>= 1));//(было 11111111111111111111111111010110)(стало101)
        }
        static void task1_5(){
        double a =42.5;
            System.out.println("java: bad operand type float for unary operator '~'");
            // Приходим к выводу, что побитовые операторы только для целых чисел.
        }
    }
