package com.example.sorting;

public class SortingUtility {

    /**
     * Part A Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudocode.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int i = 0;
        int length = data.length;
        while (i < length) {
            if (i == 0 || data[i].compareTo(data[i-1]) >= 0) {
                i++;
            } else {
                T tmp = data[i];
                data[i] = data[i - 1];
                data [--i] = tmp;
            }
        }
    }

    /**
     * Part B Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {
        int length = data.length;
        for(int i = 1; i < length; i++) {
            gnomierSort(data, i);
        }
    }

    /**
     * Part C Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     */
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        int i = upperBound;
        while (i > 0 && data[i].compareTo(data[i-1]) < 0) {
            T tmp = data[i];
            data[i] = data[i - 1];
            data [--i] = tmp;
        }

    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





