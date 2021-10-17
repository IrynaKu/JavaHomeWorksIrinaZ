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
        int[] arr = new int[(b - a) /2 + 1];
        int index = 0;
        for (int i = a; i <b; i++) {
            if (i % 2 > 0) {
                arr[index] = i;
                System.out.println(arr[index]);
                index++;

            }

        }

    }

}



