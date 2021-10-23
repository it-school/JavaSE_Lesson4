package com.itschool;

import java.util.*;

public class Main {
   private static final Scanner scanner = new Scanner(System.in);
   private static final Random r = new Random();

   public static void task1() {
      Random random = new Random();
      final int N = 20;
      double[] buy = new double[N], sell = new double[N];
      for (int i = 0; i < N; i++) {
         buy[i] = 26 + r.nextDouble() * 0.4;
         sell[i] = 26.2 + r.nextDouble() * 0.5;
      }

      for (int i = 1; i <= N; i++) {
         System.out.printf("%6d   ", i);
      }
      System.out.println();

      for (int i = 0; i < N; i++) {
         System.out.printf("%8.2f ", buy[i]);
      }
      System.out.println();
      for (int i = 0; i < N; i++) {
         System.out.printf("%8.2f ", sell[i]);
      }

      int indexMin = 0, indexMax = 0;
      for (int i = 1; i < N; i++) {
         if (sell[i] < sell[indexMin]) {
            indexMin = i;
         } else if (buy[i] > buy[indexMax]) {
            indexMax = i;
         }
      }
      System.out.println();
      System.out.println("The best exchange rate to buy: " + String.format("%6.2f", buy[indexMax]));
      System.out.println("The best exchange rate to sell: " + String.format("%6.2f", sell[indexMin]));

   }

   private static void task2() {
      int[] values = new int[40];
      for (int i = 0; i < values.length; i++) {
         values[i] = (int) (Math.random() * 100);
         System.out.printf("%3d,", values[i]);
      }

      System.out.println();
      for (int i = 0; i < values.length; i++) {
         if (i == 1 || i == 2 || i == 4 || i == 8 || i == 16 || i == 32)
            System.out.printf("%3d,", values[i]);
      }

      System.out.println();
      for (int i = 1; i < values.length; i *= 2) {
         System.out.printf("%3d,", values[i]);
      }

   }

   public static void main(String[] args) {
      // task1();
      task2();
      /*
      final int N = 10;
      Random rnd = new Random();
      int[] array1 = new int[N], array2 = new int[N];
      for (int i = 0; i < array1.length; i++) {
         array1[i] = r.nextInt(100);
        // array2[i] = array1[i];
         array2[i] = r.nextInt(100);
      }

      System.out.println(Arrays.toString(array1));
      System.out.println(Arrays.toString(array2));
      System.out.println(array1.hashCode());
      System.out.println(array2.hashCode());

      System.out.println(array1.equals(array2));
      System.out.println(Arrays.equals(array1, array2));


      System.out.println();
      array1 = array2;
      System.out.println(array1.equals(array2));
      System.out.println(Arrays.equals(array1, array2));

      int indexMin = 0;
      for (int i = 1; i < array1.length; i++) {
         if (array1[i] < array1[indexMin]) {
            indexMin = i;
         }
      }
      System.out.println("Min:" + array1[indexMin] + ", it's index: " + indexMin);

      int indexMax = 0;
      for (int i = 1; i < array1.length; i++) {
         if (array1[i] > array1[indexMax]) {
            indexMax = i;
         }
      }
      System.out.println("Max:" + array1[indexMax] + ", it's index: " + indexMax);
      */
/*
      int indexMin = 0, indexMax = 0;
      for (int i = 1; i < array1.length; i++) {
         if (array1[i] < array1[indexMin]) {
            indexMin = i;
         } else
         if (array1[i] > array1[indexMax]) {
            indexMax = i;
         }
      }
      System.out.println("Min:" + array1[indexMin] + ", it's index: " + indexMin);
      System.out.println("Max:" + array1[indexMax] + ", it's index: " + indexMax);
 */

//        ArraysExample_1();
//        ArraysExample_2();
//        ArraysExample_3();
//        ArraysExample_4();
//        ArraysExample_5();
//        ArraysExample_6();
//        ArraysExample_7();

//        RandomArray();

//        MaxElementInArray();
//        MinElementInArray();
//        Average();
//
//        BubbleSortForMaxToMin();
//        BubbleSortForMinToMax();
//        QuickSort();

//
//        ArraysCompareBikeMethod();
//        ArraysCompareNormalMethod();
//
//        ArrayClone();
//        ArrayToString();
//        ArrayReverse();
//
//        ForToForeach();
//        SaveOurRAM();

//       Задания для работы в аудитории
//      int[] arr = new int[11];
//      FillArrayRandomly(arr);
//      ReverseArray(arr);
//        SearchInArray(arr);

//      Task5();

//
//        ClassWork3(arr);
//        ClassWork4(arr);
//        ClassWork5();
//        ClassWork6();
//        ClassWork7();
//        ClassWork7a();  // С использованием сортировки и выбором 3 крайних значений
//        ClassWork8();

      // Домашние задания
//      Homework_Example_1();
//      Homework_Example_2();
//      Homework_Example_9();
   }

   private static void ReverseArray(int[] arr) {
      int a = 2, b = 3;
      System.out.println(a + ", " + b);
      a = a + b; // 5
      b = a - b; // 2
      a = a - b; // 3

      int c = a;
      a = b;
      b = c;

      System.out.println(Arrays.toString(arr));
      int temp;
      for (int i = 0; i < arr.length / 2; i++) {
         temp = arr[0 + i];
         arr[0 + i] = arr[arr.length - 1 - i];
         arr[arr.length - 1 - i] = temp;
      }
      System.out.println(Arrays.toString(arr));

   }

   private static void Task5() {
/*        Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на
        2 см, а каждый пасмурный день опускается вниз на 1 см. В начале
        наблюдения улитка находилась на расстоянии А см от земли на 5-метровом
        дереве. Имеется 30-элементный массив, содержащий сведения о том, был
        ли соответствующий день наблюдения пасмурным или солнечным.
                Написать программу, определяющую местоположение улитки к концу 30-
                го дня наблюдения.*/
      final int DAYS = 30;
      boolean[] isSunnyDay = new boolean[DAYS];
      for (int i = 0; i < Math.random() * DAYS; i++) {
         isSunnyDay[(int) (Math.random() * DAYS)] = true;
      }
//Arrays.fill(isSunnyDay,true);

      System.out.println(Arrays.toString(isSunnyDay));
      final int A = 200;
      int wayLength = 0 + A;

      for (int i = 0; i < isSunnyDay.length; i++) {
         wayLength += isSunnyDay[i] ? 2 : -1;
      }

      System.out.println("Total height: " + (wayLength >= 0 ? wayLength : 0) + " cm");
   }

   private static void SearchInArray(int[] arr) {
      int key = 10;
      boolean isFound = false;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            System.out.println(i);
            isFound = true;
            break;
         }
      }
      if (!isFound)
         System.out.println("Not found using linear saerch");


      int[] arrCopy = arr.clone();
      Arrays.sort(arrCopy);
      int pos = Arrays.binarySearch(arrCopy, key);
      System.out.println(pos >= 0 ? "Found" : "Not found using binary search");
      System.out.println(Arrays.toString(arr));

   }

   private static int[] FillArrayRandomly(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         arr[i] = r.nextInt(20);
      }
      System.out.println(Arrays.toString(arr));
      return arr;
   }

   private static void ClassWork3(int[] arr) {
      int sum = 0;
      for (int item : arr) {
         if (item % 2 == 0) {
            sum += item;
         }
      }
      System.out.println("Сумма чётных элементов массива: " + sum);
      System.out.println();
   }

   private static void ClassWork4(int[] arr) {
      int mult = 1;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 9 == 0) {
            mult *= arr[i];
         }
      }
      System.out.println();
      System.out.println("Произведение всех элементов массива со значениями, кратными 9: " + mult);
   }

   private static void ClassWork5() {
      final int DAYS = 365, A = 100, L = 500;
      int[] weather = new int[DAYS];
      int current = A;
      for (int i = 0; i < weather.length; i++) {
         weather[i] = (int) (Math.random() * 10) > 3 ? 1 : 0;
      }
      System.out.println(Arrays.toString(weather));

      for (int i = 0; i < weather.length; i++) {
         current += (weather[i] == 1) ? -1 : 2;
         if (current > L) {
            current = L;
         } else if (current < 0) {
            current = 0;
         }
      }

      System.out.println("Улитка начала с точки: " + A + " см");
      System.out.println("Закончила на высоте:   " + current + " см");

		/*
		// Определить победителя в кубики из N игроков
		Random random = new Random();
		int dices1, dices2;
		final int N = 10;
		int[] dices = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			dices1 = 1 + random.nextInt(6);
			dices2 = 1 + random.nextInt(6);
			System.out.println(dices1 + " : " + dices2);
			dices[i] = dices1 + dices2;
			if (dices[i] > max) { max = dices[i]; }
		}
		for (int i = 0; i < N; i++) {
			if (dices[i] == max) { System.out.println("Winner is:" + i); }
		}
		*/
   }

   private static void ClassWork6() {
      final int N = 12, INCOME_RANGE = 100_000;
      double[] r = new double[N];
      double[] p = new double[N];
      double[] z = new double[N];

      for (int i = 0; i < N; i++) {
         r[i] = Math.random() * INCOME_RANGE;
         p[i] = Math.random() * INCOME_RANGE;
      }

      // System.out.println(Arrays.toString(r));
      Locale.setDefault(Locale.US);
      System.out.println("Расходы: ");
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%10.2f", r[i]));
      }
      System.out.println(System.lineSeparator() + "Доходы:  ");
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%10.2f", p[i]) + Currency.getInstance(Locale.getDefault()).getSymbol());
      }

      double all = 0;
      int positiveMonths = 0;
      int indMin = 0, indMax = 0;
      for (int i = 0; i < N; i++) {
         z[i] = p[i] - r[i];
         all += z[i];
         if (z[i] > 0) {
            positiveMonths++;
         }
         if (z[i] < z[indMin]) {
            indMin = i;
         }
         if (z[i] > z[indMax]) {
            indMax = i;
         }
      }
      System.out.println(System.lineSeparator() + "Прибыли: ");
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%10.2f", z[i]));
      }
      System.out.println(System.lineSeparator() + "Итоговая прибыль: " + String.format("%10.2f", all));
      System.out.println("Месяц с максимальной прибылью: " + (indMax + 1));
      System.out.println("Месяц с миниммальной прибылью: " + (indMin + 1));
      System.out.println("Месяцев с прибылью: " + positiveMonths);
   }

   private static void ClassWork7() {
      System.out.println();
      final int N = 15, MAXD = 7, MAXL = 3;
      double[] h = new double[N];
      double[] d = new double[N];
      for (int i = 0; i < N; i++) {
         h[i] = Math.random() * MAXL;
         d[i] = Math.random() * MAXD;
      }

      System.out.println("Прыжки в высоту: ");
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%6.2f", h[i]));
      }

      System.out.println(System.lineSeparator() + "Прыжки в длину: ");
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%6.2f", d[i]));
      }

      double bestD1 = d[0], bestD2, bestD3;
      for (int i = 1; i < N; i++) {
         if (d[i] > bestD1) {
            bestD1 = d[i];
         }
      }
      System.out.println(System.lineSeparator() + "1 Лучший в длину: " + String.format("%6.2f", bestD1));

      bestD2 = 0;
      for (int i = 1; i < N; i++) {
         if (d[i] > bestD2 && d[i] < bestD1) {
            bestD2 = d[i];
         }
      }
      System.out.println("2 Лучший в длину: " + String.format("%6.2f", bestD2));

      bestD3 = 0;
      for (int i = 1; i < N; i++) {
         if (d[i] > bestD3 && d[i] < bestD2) {
            bestD3 = d[i];
         }
      }
      System.out.println("3 Лучший в длину: " + String.format("%6.2f", bestD3));

      double worstD1 = d[0], worstD2, worstD3;
      for (int i = 1; i < N; i++) {
         if (d[i] < worstD1) {
            worstD1 = d[i];
         }
      }
      System.out.println(System.lineSeparator() + "1 Худший в длину: " + String.format("%6.2f", worstD1));

      worstD2 = Double.MAX_VALUE;
      for (int i = 1; i < N; i++) {
         if (d[i] < worstD2 && d[i] > worstD1) {
            worstD2 = d[i];
         }
      }
      System.out.println("2 Худший в длину: " + String.format("%6.2f", worstD2));

      worstD3 = bestD1;
      for (int i = 1; i < N; i++) {
         if (d[i] < worstD3 && d[i] > worstD2) {
            worstD3 = d[i];
         }
      }
      System.out.println("3 Худший в длину: " + String.format("%6.2f", worstD3));

   }

   private static void ClassWork7a() {
      System.out.println();
      final int N = 10;
      float[] H = new float[N], D = new float[N];

      for (int i = 0; i < N; i++) {
         H[i] = (float) (r.nextInt(100) / 10.0);
         D[i] = (float) (r.nextInt(100) / 10.0);
      }

      System.out.println(Arrays.toString(H));
      System.out.println(Arrays.toString(D));

      SubTask7(H, "H");
      SubTask7(D, "D");
   }

   private static void ClassWork8() {
      System.out.println();
      final int N = 15;
      int[] array = new int[N];

      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 100);
      }
      Arrays.sort(array);
      System.out.println(Arrays.toString(array));

      int temp;
      for (int i = 0; i < array.length / 2; i++) {
         temp = array[i];
         array[i] = array[array.length - 1 - i];
         array[array.length - 1 - i] = temp;
      }

      System.out.println(Arrays.toString(array));
   }

   private static void LessonTask5() {
      boolean[] month = new boolean[30];
      int a = 100;
      for (int i = 0; i < month.length; i++) {
         month[i] = r.nextBoolean();
      }

      System.out.println(Arrays.toString(month));

      for (int i = 0; i < month.length; i++) {
         a += (month[i] == true ? 2 : -1);
         if (a > 500) {
            a = 500;
         } else if (a < 0) {
            a = 0;
         }
      }

      System.out.println("Улитка на высоте " + a + " см");
   }

   private static void SubTask7(float[] arr, String arrayName) {
      float[] copyH = arr.clone();

      Arrays.sort(copyH);

      System.out.println("\n" + arrayName + " worst 3: ");
      for (int i = 0; i < 3; i++) {
         System.out.print(copyH[i] + "\t");
      }

      System.out.println("\n" + arrayName + " best 3: ");
      for (int i = copyH.length - 1; i > copyH.length - 4; i--) {
         System.out.print(copyH[i] + "\t");
      }
   }

   // Одномерные массивы. Пример 1

   private static void ArraysExample_1() {
      // Счёт элементов массива всегда начинается с 0

      System.out.println("\nОдномерные массивы. Пример 1");

      int[] array = new int[5];

      array[0] = 10;
      array[1] = 20;
      array[2] = 30;
      array[3] = 40;
      array[4] = 50;

      System.out.print("Массив array : ");
      System.out.print(array[0] + " ");
      System.out.print(array[1] + " ");
      System.out.print(array[2] + " ");
      System.out.print(array[3] + " ");
      System.out.print(array[4] + " ");
   }
   // Одномерные массивы. Пример 2

   private static void ArraysExample_2() {
      System.out.println("\nОдномерные массивы. Пример 2");

      int[] array = new int[5];

      Random rnd = new Random();
      // Заполнение массива.
      for (int i = 0; i < array.length; i++) {
         array[i] = rnd.nextInt(50);
      }

      System.out.print("Массив array: ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }

      System.out.println();
      System.out.println(Arrays.toString(array));
   }
   // Одномерные массивы. Пример 3

   private static void ArraysExample_3() {
      System.out.println("\nОдномерные массивы. Пример 3");

      int[] array = new int[]{1, 2, 3, 4, 5};

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }
   }
   // Одномерные массивы. Пример 4

   private static void ArraysExample_4() {
      System.out.println("\nОдномерные массивы. Пример 4");

      int[] array = {1, 2, 3, 4, 5};

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }
   }
   // Одномерные массивы. Пример 5

   private static void ArraysExample_5() {
      System.out.println("\nОдномерные массивы. Пример 5");

      int[] array = new int[5];

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }
   }
   // Одномерные массивы. Пример 6

   private static void ArraysExample_6() {
      System.out.println("\nОдномерные массивы. Пример 6");

      int[] vector = new int[1];
      vector[0] = 100;
      int value = vector[0];

      System.out.println("Массив vector : " + vector[0]);
      System.out.println("Переменная : " + value);
   }
   // Заполнение массива случайными значениями

   private static void RandomArray() {
      System.out.println("\nЗаполнение массива случайными значениями");

      Random random = new Random();
      int[] array = new int[10];

      for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(100);
      }

      System.out.print("\nМассив со случайными элементами : ");

      for (int a : array) {
         System.out.print(a + " ");
      }
   }
   // Максимальный элемент в массиве

   private static void MaxElementInArray() {
      System.out.println("\nНахождение максимального элемента в массиве");

      int[] array = {21, 243, 415, 54, -2, 31, 98, 10};

      // Обязательно присваивать максимальному элементу нулевой элемент массива
      int max_element = array[0];

      System.out.print("Исходный массив : ");

      for (int a : array) {
         // Выводим элементы массива на экран
         System.out.print(a + "  ");
         // Сравниваем текущий максимальный элемент с i-ым элементом массива
         if (a > max_element) {
            max_element = a;
         }
      }
      System.out.println("\nМаксимальный элемент " + max_element);
   }
   // Минимальный элемент в массиве

   private static void MinElementInArray() {
      System.out.println("\nНахождение минимального элемента в массиве");

      int[] array = {21, 243, 415, 54, -2, 31, 98, 10, -2};

      // Обязательно присваивать минимальному элементу нулевой элемент массива
      int indexMin = 0;

      System.out.print("Исходный массив : ");

      for (int a : array) {
         // Выводим элементы массива на экран
         System.out.print(a + "  ");
         // Сравниваем текущий миниманльный элемент с i-ым элементом массива
      }

      for (int i = 1; i < array.length; i++) {
         if (array[i] < array[indexMin])
            indexMin = i;
      }

      System.out.println("\nМинимальный элемент " + array[indexMin] + ", его индекс: " + indexMin);
   }
   // Среднее арифметическое в массиве

   private static void Average() {
      System.out.println("\nСреднее арифметическое в массиве");

      int[] nums = {4, 8, 10, 12, 16};
      double sum = 0;

      System.out.print("Массив nums : ");

      for (int a : nums) {
         System.out.print(a + "  ");
      }

      for (int i = 0; i < nums.length; i++) {
         sum += nums[i];
      }

      sum = sum / nums.length; // общий результат делим на число элементов в массиве
      System.out.println("Среднее арифметическое: " + String.format("%5.2f", sum));
   }
   // Сортировка пузырьком - от большего к меньшему

   private static void BubbleSortForMaxToMin() {
      System.out.println("\n\nBubbleSort - от большего к меньшему");
      int[] num = {203, 134, 123, -2, 124, 0, 14};
      int j = 0;
      boolean flag = true;
      int temp;

      System.out.print("До сортировки : ");

      for (int a : num) {
         System.out.print(a + " ");
      }

      while (flag) {
         flag = false;
         for (j = 0; j < num.length - 1; j++) {
            if (num[j] < num[j + 1]) {
               temp = num[j];
               num[j] = num[j + 1];
               num[j + 1] = temp;
               flag = true;
            }
         }
      }

      System.out.print("\nПосле сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }
   }
   // Сортировка пузырьком - от меньшего к большему

   private static void BubbleSortForMinToMax() {
      System.out.println("\n\nBubbleSort - от меньшего к большему");
      int[] num = {203, 134, 123, -2, 124, 0, 14};
      int j = 0;
      boolean flag = true;
      int temp;

      System.out.print("До сортировки : ");

      for (int a : num) {
         System.out.print(a + " ");
      }

      while (flag) {
         flag = false;
         for (j = 0; j < num.length - 1; j++) {
            if (num[j] > num[j + 1]) {
               temp = num[j];
               num[j] = num[j + 1];
               num[j + 1] = temp;
               flag = true;
            }
         }
      }

      System.out.print("\nПосле сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }
   }
   // Сортировка QuickSort

   private static void QuickSort() {
      System.out.println("\n\nСортировка методом QuickSort");
      int[] num = {203, 134, 123, -2, 124, 0, 14};

      System.out.print("Массив до сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }

      // Сортируем массив метод QuickSort
      Arrays.sort(num);

      System.out.print("\nМассив после сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }
   }
   // Сравнение элементов массивов с помощью велосипеда

   private static void ArraysCompareBikeMethod() {
      System.out.println("\nСравнение элементов массивов путём изобретения велосипеда");

      int[] a = {10, 20, 30};
      int[] b = {10, 20, 30};
      boolean flag = a.length == b.length;

      if (flag == true) {
         for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
               flag = false;
               break;
            }
         }
      }
      if (flag) {
         System.out.println("Элементы массивов a и b - равны");
      } else {
         System.out.println("Элементы массивов a и b - не равны");
      }
   }
   // Нормальное сравнение элементов массивов

   private static void ArraysCompareNormalMethod() {
      System.out.println("\nСравнение элементов массивов с помощью Arrays.equals");
      int[] a = {10, 20, 30};
      int[] b = {10, 20, 30};

      if (Arrays.equals(a, b)) {
         System.out.println("Элементы массивов a и b - равны");
      } else {
         System.out.println("Элементы массивов a и b - не равны");
      }
   }
   // Клонирование массива

   private static void ArrayClone() {
      System.out.println("\nКлонирование массива\n");

      int[] a = {10, 20, 30};
      System.out.println("Клонируем массив а в массив b");
      int[] b = a.clone();
      System.out.println("Элементы массивов a и b равны - " +
              Arrays.equals(a, b));
      System.out.println("Ссылка а и b указывают на один массив - " +
              (a.hashCode() == b.hashCode()));

      System.out.println("Присваиваем массиву b ссылку массива a");
      b = a;
      System.out.println("Элементы массивов a и b равны - " +
              Arrays.equals(a, b));
      System.out.println("Ссылка а и b указывают на один массив - " +
              (a.hashCode() == b.hashCode()));
   }
   // Преобразование элементов массива в строку

   private static void ArrayToString() {

      System.out.println("\nПреобразование элементов массива в строку");

      int[] intArray = {1, 2, 3, 4, 5};

      // Создаем строку и инициализируем её строковым представлением
      // элементов массива
      String intArrayString = Arrays.toString(intArray);

      System.out.print("Массив преобразованный в строку : ");

      // Выводим строку intArrayString на экран
      System.out.println(intArrayString); // [1, 2, 3, 4, 5]
   }
   // Реверс элементов массива

   private static void ArrayReverse() {
      // Данные метод идеален для собеседования

      System.out.println("\nРеверс элементов массива");

      int[] a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
      for (int i = 0; i < a.length / 2; i++) {
         a[i] = a[i] + a[a.length - 1 - i];
         a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
         a[i] = a[i] - a[a.length - 1 - i];
      }

      System.out.print("Массив после сортировки : ");
      System.out.println(Arrays.toString(a));
   }
   // Переход от for к foreach

   private static void ForToForeach() {
      System.out.println("\nПереход от for к foreach");

      int[] array = {10, 20, 30};

      System.out.print("Массив : ");

      for (int i = 0; i < array.length; i++) {
         // Присваиваем переменной a значение i-го элемента массива array
         int a = array[i];
         // Выводим переменную а, которая равна i-ому элементу массива array
         System.out.print(a + "  ");
         // Изменяем значение переменной а, а значение i-го элемента массива array не изменяется
         a = 20;
      }

      System.out.print("\nМассив : ");

      // Тоже самое, что и выше
      for (int a : array) {
         System.out.print(a + "  ");
         a = 20;
      }
   }
   // Оптимизируем выделение оперативной памяти

   private static void SaveOurRAM() {
      // Динамический диапазон элементов для всех массивов от 0 до 100
      // В таком случает, оптимально будет выбрать массив типа byte
      // чтобы не тратить оперативную память

      final int N = 10000;

      byte[] a_byte = new byte[N];    // Займет в памяти 10000 байтов
      short[] a_short = new short[N]; // Займет в памяти 20000 байтов
      int[] a_int = new int[N];       // Займет в памяти 40000 байтов
      long[] a_long = new long[N];    // Займет в памяти 80000 байтов
   }

   private static void ArraysExample_7() {
      final int N = 10;
      float[] A = new float[N];

      Locale.setDefault(Locale.US);
      for (int i = 0; i < N; i++) {
         System.out.print(String.format("%7.2f", (A[i] = (float) (Math.random() * 100))));
      }

      System.out.println();
      System.out.println(Arrays.toString(A));

      for (float element : A) {
         System.out.print(String.format("%7.2f", element));
      }


      // Быстрая сортировка массива по возрастанию
      Arrays.sort(A);

      // Переворот элементов массива
      float temp = 0;
      for (int i = 0; i < A.length / 2; i++) {
         temp = A[i];
         A[i] = A[A.length - 1 - i];
         A[A.length - 1 - i] = temp;
      }
      System.out.println(Arrays.toString(A));


      int[] B = new int[N * N * N * N * N * N * N * N];
      for (int i = 0; i < B.length; i++) {
         B[i] = (int) (5 + Math.random() * 100000);
      }
      // System.out.println(Arrays.toString(B));
/*
		System.out.println();
		int n = 0;
		// Линейный поиск значения в массиве
		for (int i = 0; i < B.length; i++) {
			if (B[i] == 555) {
				System.out.println("Linear search of 555: " + i);
				n++;
				// break;
			}
		}

		// Линейный поиск значения в массиве в обратном порядке
		for (int i = B.length-1; i > 0; i--) {
			if (B[i] == 555) {
				System.out.println("Linear search of 555: " + i);
				n++;
				break;
			}
		}

		System.out.println(n);
Arrays.sort(B);
		// Бинарный поиск вхождения значения в массив
		System.out.println("Binary search of 555: " + Arrays.binarySearch(B, 555));



		// Для всех элементов
		int n = 0;
		for (int i = 0; i < A.length - 1; i++)
		{
			for (int j = (A.length - 1); j > i; j--) // для всех элементов после i-ого
			{
				if (A[j - 1] > A[j]) // если текущий элемент меньше предыдущего
				{
					temp = A[j - 1]; // меняем их местами
					A[j - 1] = A[j];
					A[j] = temp;
				}
				n++;
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println(n);
 */

      // Поиск минимального значения массива
      int[] C = B.clone();
      int indexMin = 0;
      for (int i = 1; i < C.length; i++) {
         if (C[i] <= C[indexMin]) {
            indexMin = i;
            break;
         }

      }
      System.out.println("Minimum value: " + C[indexMin] + ", it's index is: " + indexMin);
      System.out.println();


      // Сравнение обычной сортировки и с использованием распараллеливания
      long start = System.currentTimeMillis();
      Arrays.sort(B);
      System.out.println("Обычная сортировка: " + (System.currentTimeMillis() - start));

      start = System.currentTimeMillis();
      Arrays.parallelSort(C);
      System.out.println("Сортировка с распараллеливанием: " + (System.currentTimeMillis() - start));


      // Изменение размеров массива
      int[] arr1 = new int[N];
      for (int i = 0; i < arr1.length; i++) {
         arr1[i] = (int) (Math.random() * 1000);
      }
      System.out.println("Initial array:                 " + Arrays.toString(arr1));

      int[] arr2 = Arrays.copyOf(arr1, 5);
      System.out.println("Subcopy of initial array:      " + Arrays.toString(arr2));

      arr1 = arr2;
      System.out.println("Resized copy of initial array: " + Arrays.toString(arr1));
      arr2[3] = 555;
      System.out.println("Resized copy of initial array: " + Arrays.toString(arr1));


   }

   // Типовая задача из домашнего задания. Пример 1
   private static void Homework_Example_1() {
      // В массиве хранятся сведения о стоимости 12 различных предметов.
      // Определить общую стоимость всех предметов.

      System.out.println("\nТиповая задача из домашнего задания. Пример 1");

      double[] cost = new double[12];
      double sum = 0;

      // Так как мы изменяем значения элементов массива
      // то используем for
      for (int i = 0; i < cost.length; i++) {
         System.out.print("Введите стоимость " + (i + 1) + " товара : ");
         cost[i] = scanner.nextDouble();
      }

      // Так как мы не изменяем значения элементов массива
      // а только читаем их, то используем foreach
      for (double a : cost) {
         sum += a;
      }

      System.out.println("Стоимость всех 12 товаров : " + sum + " у.е.");
   }

   // Типовая задача из домашнего задания. Пример 2

   private static void Homework_Example_2() {
      //Дан массив целых чисел. Выяснить:
      // а) верно ли, что сумма элементов массива есть четное число;
      // б) верно ли, что сумма квадратов элементов массива есть пятизначное число;
      // в) верно ли, что сумма элементов массива неотрицательна.

      System.out.println("\nТиповая задача из домашнего задания. Пример 2");

      // Переменная для генерации случайных чисел
      Random random = new Random();

      int[] array = new int[12];
      // Сумма элементов массива
      int sumOfElemets = 0;
      // Сумма квадратов элементов массива
      int sumOfElementsSqr = 0;

      System.out.print("Исходный массив : ");
      for (int i = 0; i < array.length; i++) {
         // В i-ый элемент массива, записываем случайное значение в диапазоне [-50;50)
         array[i] = random.nextInt(100) - 50;
         // Выводим i-ый элемент на экран
         System.out.print(array[i] + "  ");
         // Прибавляем i-ый элемент массива к сумме элементов массива
         sumOfElemets += array[i];
         // Прибавлеяем квадрат i-го элемента массива к сумме квадратов элементов массива
         sumOfElementsSqr += array[i] * array[i];
      }

      System.out.println();

      if (sumOfElemets % 2 == 0) {
         System.out.println("Cумма элементов массива есть четное число");
      } else {
         System.out.println("Cумма элементов массива есть нечетное число");
      }

      if (sumOfElementsSqr >= 10000) {
         System.out.println("Cумма квадратов элементов массива есть пятизначное число");
      } else {
         System.out.println("Cумма квадратов элементов массива есть не пятизначное число");
      }

      if (sumOfElemets >= 0) {
         System.out.println("Cумма элементов массива неотрицательна");
      } else {
         System.out.println("Cумма элементов массива отрицательна");
      }
   }

   private static void Homework_Example_9() {
   /*
      Дан массив целых чисел. Удалить из него:
      а) все четные элементы, стоящие на нечетных местах;
      б) все элементы, кратные 3 или 5.
   */
      int[] array = new int[12];
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 10);
      }

      System.out.println(Arrays.toString(array));

      for (int i = 1; i < array.length; i++) {
         if (array[i] != 0 && array[i] % 2 == 0 && i % 2 == 1) {
            int n = i;
            int currentLength = array.length;
            for (int j = n; j < array.length - 1; j++) {
               array[j] = array[j + 1];
            }
            currentLength--;
            array = Arrays.copyOf(array, currentLength);
            System.out.println(Arrays.toString(array));
         }
      }

      System.out.println(Arrays.toString(array));


   }
}