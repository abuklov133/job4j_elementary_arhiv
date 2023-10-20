package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
               rst = i;
               break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] data = {0, 45, 2, 46, 7, 5};
        System.out.println(indexInRange(data, 7, 0, 4));
    }
}
