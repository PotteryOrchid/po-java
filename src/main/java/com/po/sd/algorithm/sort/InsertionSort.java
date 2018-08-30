package com.po.sd.algorithm.sort;

/**
 * Simple insertion sort.
 *
 * Created by ZJ on 30/08/2018.
 */
public class InsertionSort {

  /**
   * 插入排序：先查找被排序数应插入的位置，然后将被排序数插入到序列中。
   *
   * @param ins input value
   * @return int[] result
   */
  public static int[] insertionSortAsc(int[] ins) {
    for (int i = 1; i < ins.length; i++) {
      int tmp = ins[i], j = i;
      // 循环遍历前面已经排好顺序的数列，找到被排序数应插入的位置。
      for (; j > 0 && ins[j - 1] > tmp; j--) {
        ins[j] = ins[j - 1];
      }
      ins[j] = tmp;
    }
    return ins;
  }

  public static void main(String[] args) {
    int[] res = insertionSortAsc(new int[]{23, 12, 65, 4, 78, 122, 34, 567, 345, 563, 2});
    for (int r : res) {
      System.out.print(r);
      System.out.print(" ");
    }
  }
}
