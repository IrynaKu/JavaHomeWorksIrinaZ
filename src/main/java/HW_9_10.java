import java.util.ArrayList;
import java.util.Arrays;

public class HW_9_10 {

//    1.Распечатать:
//    числа от 1 до 5
//    числа от 100 до 1
//    числа от 100 до 1 с шагом 10
//    числа от -a до a включительно c шагом 3
//    числа от a до b с шагом с

    public static void printArray(int a, int b, int c) {

        int[] array = new int[Math.abs((b - a)) / c + 1];

        if (b > a) {
            for (int i = 0; i < array.length; i++) {
                array[i] = a;
                System.out.print(array[i] + " ");
                a += c;
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = a;
                System.out.print(array[i] + " ");
                a -= c;
            }
            System.out.println();
        }
    }

    //2.Для чисел  от 1 до 100 распечатать только четные числа
    public static void printEven(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    //3.Для чисел от 101 до 200 создать массив нечетных чисел
    public static void oddToArray(int a, int b) {
        int[] arr = new int[(b - a) / 2 + 1];
        int index = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 > 0) {
                arr[index] = i;
                System.out.println(arr[index]);
                index++;

            }

        }

    }

    //4. Для всех чисел от 1 до 10:
    //   если число меньше 5, распечатать значение, умноженное на 10,
    //   иначе распечатать значение разделенное на 10
    //   Создать массив из получившихся значений

    public static void printArrayTask4() {
        double[] array = new double[10];
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            if (i < 5) {
                array[index] = i * 10.0;

            } else {
                array[index] = i / 10.0;
            }

            System.out.println(array[index]);
            index++;
        }
    }

    //6. Создать массив catsColors
    String[] catColors = {"stripped", "black", "grey", "white", "red"};

    //7.Создать массив catsAges
    int[] catAges = {1, 2, 3, 20, 5};

    //8.Написать методЫ (столько сколько нужно), которые принимают на вход массив,
    // и печатают (желательно в виде таблички):
    //номер “коробки”
    //значение, которое лежит в этой “коробке”
    //“Накорми кота!”,  если номер коробки равен 4 и цвет рыжий
    //“Отнеси кота на прививку!”, если возраст кота меньше 2 лет

    public static void catsInfo(String[] arrColor, int[] arrAge) {
        for (int i = 0; i < arrAge.length; i++) {
            System.out.println("The number of box is " + i);
            System.out.println("Cat's color is " + arrColor[i]);
            System.out.println("Cat's age is " + arrAge[i]);
            if (arrColor[i].equals("red") && i == 4) {
                System.out.println("Накорми кота!");
            }
            if (arrAge[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }
    }

    //9. Распечатать последовательность чисел от -100 до 100 включительно,
    // в которой каждое следующее число больше предыдущего на 3
    public static void printNumbers() {
        for (int i = -100; i <= 100; ) {
            System.out.println(i);
            i += 3;
        }
    }

    //10. Распечатать последовательность чисел:
    //1, -1, 2, -2, 3, -3, ... 10, -10

    public static void printNumbers2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println(i * -1);
        }
    }

    //11. Распечатать последовательность чисел: 1 5 25 125 625 3125 15625 78125 390625
    public static void printNumbers3() {
        for (int i = 1; i <= 390625; ) {
            System.out.println(i);
            i *= 5;
        }
    }

//    12. Распечатать с помощью for:
//            1
//            10
//            100
//            1000
//            10000
//            100000
//            1000000

    public static void printTriangle() {
        for (int i = 0; i < 7; i++) {
            System.out.print(1);
            for (int j = 0; j < i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }

    }
    //13. Распечатать с помощью for:
    //        1000000
    //        100000
    //        10000
    //        1000
    //        100
    //        10
    //        1

    public static void printReverseTriangle() {
        for (int i = 7; i >= 0; i--) {
            System.out.print(1);
            for (int j = 0; j < i; j++) {
                System.out.print(0);
            }
            System.out.println();
        }

    }
    //14. Распечатать с помощью for:
    // 1
    //101
    //10101
    //1010101
    //101010101

    public static void printTriangle2() {
        for (int i = 0; i < 7; i++) {
            System.out.print(1);
            for (int j = 0; j < i; j++) {
                System.out.print("01");
            }
            System.out.println();
        }

    }

//    15. Написать метод, который принимает на вход 2 целочисленных параметра (a, b) и печатает последовательность
//    положительных  чисел в пределах 1000. Последовательность начинается с числа a, и каждый следующий member
//    последовательности в b раз больше предыдущего.
//    Пример:
//            3, 7   ->   3 21 147
//            5, 3   ->   5 15 45 135 405

    public static void printIncreasedNumbers(int a, int b) {
        for (int i = a; i <= 1000; i *= b) {
            System.out.print(i + " ");
        }
    }

    //16. Распечатать последовательность:
    //122333444455555666666777777788888888999999999

    public static void printNumbersLine() {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }

    //17. Написать метод, который принимает на вход 2 символа char и печатает все символы char между ними
    public static void printCharsBetween(char a, char b) {
        for (int i = a; i < b; i++) {
            System.out.print((char) i + " ");
        }
    }

    //18.Создать массив {0, 45, 90, 135, 180}
    int[] numArray = {0, 45, 90, 135, 180};

    //19.Создать массив  {0.0, 4.5, 9.0, 13.5, 18.0}
    double[] numArray2 = {0.0, 4.5, 9.0, 13.5, 18.0};

    //20. Создать массив типа float[] из следующих значений {k, m, l}
    double k = 2987.1234;
    int l = 3456;
    float m = 54.3f;

    float [] mixArray = {(float) k,l,m};

    //21. Создать массив типа Byte[] из следующих значений

    Byte o = 32;
    int  p = 74;
    Short r = 104;

    Byte [] byteArray = {o, Integer.valueOf(p).byteValue(), (byte)r.shortValue()};

    //22. С помощью метода класса Math.pow() создать массив степеней числа 3:
    //[1.0, 3.0, 9.0, 27.0, 81.0, 243.0, 729.0, 2187.0, 6561.0, 19683.0]

    public static void fillArrayWithPow(){
        double [] powArray=new double[10];
        for(int i = 0; i<powArray.length; i++ ){
            powArray[i] = Math.pow(3.0, i);
        }
       System.out.println(Arrays.toString(powArray));

    }

//    23. С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
//    построить новый массив, в котором все числа - положительные
//    построить новый массив, в котором все числа - отрицательные

      public static void turnArrayPosAndNeg(int [] array){
        int [] posArray = new int[array.length];
        int [] negArray = new int[array.length];
        for(int i = 0; i<array.length; i++){
            posArray[i]=Math.abs(array[i]);
            if(array[i]<0){
                negArray[i]=array[i];
            }else{
                negArray[i]=array[i]*-1;
            }
        }
        System.out.println(Arrays.toString(posArray));
          System.out.println(Arrays.toString(negArray));

      }




}





