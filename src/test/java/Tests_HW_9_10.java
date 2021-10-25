
import org.testng.annotations.Test;

public class Tests_HW_9_10 {

    //1. Распечатать числа от 1 до 5

    @Test
    public void printArrayTest1() {
        HW_9_10.printArray(1, 5, 1);
    }

    //2. Распечатать числа от 100 до 1
    @Test
    public void printArrayTest2() {
        HW_9_10.printArray(100, 1, 1);
    }

    //3.Распечатать числа от 100 до 1 с шагом 10
    @Test
    public void printArrayTest3() {
        HW_9_10.printArray(100, 1, 10);
    }

    //4.Распечатать числа от -a до a включительно c шагом 3
    @Test
    public void printArrayTest4() {
        HW_9_10.printArray(-5, 5, 3);
    }

    //2.Для чисел  от 1 до 100 распечатать только четные числа
    @Test
    public void printEvenTest() {
        HW_9_10.printEven(1, 100);
    }

    //3.Для чисел от 101 до 200 создать массив нечетных чисел
    @Test
    public void oddToArrayTest() {
        HW_9_10.oddToArray(101, 200);
    }

    @Test
    private void printArrayTask4Test() {
        HW_9_10.printArrayTask4();
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

    @Test
    public void catsInfoTest() {
        HW_9_10.catsInfo(catColors, catAges);
    }


    //9. Распечатать последовательность чисел от -100 до 100 включительно,
    // в которой каждое следующее число больше предыдущего на 3
    @Test
    public void printNumbersTest() {
        HW_9_10.printNumbers();
    }

    //10. Распечатать последовательность чисел:
    //1, -1, 2, -2, 3, -3, ... 10, -10
    @Test
    public void printNumbers2Test() {
        HW_9_10.printNumbers2();

    }

    @Test
    public void printNumber3Test() {
        HW_9_10.printNumbers3();
    }

    @Test
    public void printTriangleTest() {
        HW_9_10.printTriangle();
    }

    @Test
    public void printReverseTriangleTest() {
        HW_9_10.printReverseTriangle();
    }

    @Test
    public void printTriangle2Test() {
        HW_9_10.printTriangle2();
    }

    @Test
    public void printIncreasedNumbersTest() {
        HW_9_10.printIncreasedNumbers(5, 3);
    }

    @Test
    public void printNumbersLineTest() {
        HW_9_10.printNumbersLine();
    }

    @Test
    public void printCharsBetweenTest() {
        HW_9_10.printCharsBetween('c', 'g');
    }

    @Test
    public void fillArrayWithPowTest(){
        HW_9_10.fillArrayWithPow();
    }

    @Test
    public void turnArrayPosAndNegTest(){
        int [] array = {-13, 9, -314, -89, 98, 52, -4};
        HW_9_10.turnArrayPosAndNeg(array);
    }

}
