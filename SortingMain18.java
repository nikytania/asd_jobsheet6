package Praktikum05;

public class SortingMain18 {
  public static void main(String[] args) {
    int a[] = {20, 10, 2, 7, 12};
    int b[] = {30, 20, 2, 8, 14};
    int c[] = {40, 10, 4, 9, 3};

  Sorting dataurut1 = new Sorting(a, a.length);

  System.out.println("Data awal 1");
  dataurut1.tampil();
  dataurut1.bubbleSort();
  System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
  dataurut1.tampil();

  Sorting dataurut2 = new Sorting(b, b.length);
  System.out.println("Data awal 2");
  dataurut2.tampil();
  dataurut2.bubbleSort();
  System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
  dataurut2.tampil();

  Sorting dataurut3 = new Sorting(c, c.length);
  System.out.println("Data awal 3");
  dataurut3.tampil();
  dataurut3.bubbleSort();
  System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
  dataurut3.tampil();

  }
}
