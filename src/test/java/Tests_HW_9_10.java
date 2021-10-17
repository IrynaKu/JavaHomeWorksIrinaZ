
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

}
