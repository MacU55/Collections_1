package Mains;

import arrays.Array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_Array {

    public static void main(String[] args) {
        Array_1 array1 = new Array_1();
        array1.objects = new Object[5];
        array1.objects[0] = 5;
        array1.objects[1] = "big";
        array1.objects[2] = 13.2;

        // изменить содержимое определенной ячейки
        array1.objects[2] = 13.99999;
        array1.objects[4] = 100.54178;

        System.out.println(Arrays.toString(array1.objects));

        // делаем из массива список

        List<Object> objectList = new ArrayList<>(Arrays.asList(array1.objects));
        objectList.add(897);
        System.out.println("List<Object> objectList:  " + objectList);

        //создадим численный массив и сортируем массив

        Array_1 array2 = new Array_1();
        array2.numbers = new Integer[5];
        array2.numbers[0] =5;
        array2.numbers[1] =8;
        array2.numbers[2] =3;
        array2.numbers[3] =1;
        array2.numbers[4] =4;

        System.out.println("массив до сортировки" + Arrays.toString(array2.numbers));

        Arrays.sort(array2.numbers, 0,5);

        System.out.println("массив после сортировки" + Arrays.toString(array2.numbers));

    }
}
