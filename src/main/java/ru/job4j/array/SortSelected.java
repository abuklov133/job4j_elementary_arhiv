package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            if (index >= i) {
                SwitchArray.swap(data, index, i);
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 2, 1, 4, 0};
        sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

//        System.out.println();
//        int min = (MinDiapason.findMin(data, 0, data.length - 1));
//        System.out.println(min);
//        System.out.println(FindLoop.indexInRange(data, min, 0, data.length - 1));
    }

}
