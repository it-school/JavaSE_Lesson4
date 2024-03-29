package com.itschool;

import java.util.*;

/**
 * Примеры на тему: "Одномерные массивы в Java"
 */
public class Main {
   private static final Scanner scanner = new Scanner(System.in);
   private static final Random random = new Random();

   public static void main(String[] args) {
      arraysExample1();
      arraysExample2();
      arraysExample3();
      arraysExample4();
      arraysExample5();
      arraysExample6();
      arraysExample7();

      maxElementInArray();
      minElementInArray();
      findAverageValue();

      bubbleSortFromMaxToMin();
      bubbleSortFromMinToMax();
      quickSortUseExample();

      arraysCompareBikeMethod();
      arraysCompareNormalMethod();

      arrayClone();
      arrayToString();
      arrayReverse();

      forToForeach();
      saveMemory();

      // Задания для работы в аудитории
      int[] arr = new int[11];
      fillArrayRandomly(arr);
      searchInArray(arr);

      classWork1();
      classWork2();
      classWork3(arr);
      classWork4(arr);
      classWork5();
      classWork6();
      classWork7();
      classWork7a();  // С использованием сортировки и выбором 3 крайних значений
      classWork8();

      // Домашние задания
      homework_Example_1();
      homework_Example_2();
      homework_Example_9();
   }

   /**
    * Одномерные массивы. Пример 1: заполнение значениями поэлементно
    */
   private static void arraysExample1() {
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

   /**
    * Одномерные массивы. Пример 2: заполнение массива случайными значениями
    */
   private static void arraysExample2() {
      System.out.println("\nОдномерные массивы. Пример 2");

      int[] array = new int[5];

      Random rnd = new Random();
      // Заполнение массива.
      for (int i = 0; i < array.length; i++) {
         array[i] = rnd.nextInt(50);
      }

      System.out.print("Массив array: ");

      // Вывод на экран значений элементов массива по индексам
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }

      System.out.println();
      // Вывод на экран значений элементов массива с использованием встроенного метода класса Arrays
      System.out.println(Arrays.toString(array));
   }

   /**
    * Одномерные массивы. Пример 3: объявление с немедленной инициализацией
    */
   private static void arraysExample3() {
      System.out.println("\nОдномерные массивы. Пример 3");

      int[] array = new int[]{1, 2, 3, 4, 5};

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }
   }

   /**
    * Одномерные массивы. Пример 4: обращение к неинициализированному массиву
    */
   private static void arraysExample4() {
      System.out.println("\nОдномерные массивы. Пример 4");

      int[] array = {1, 2, 3, 4, 5};

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива.
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + "  ");
      }
   }

   /**
    * Одномерные массивы. Пример 5: поэлементная печать значений массива используя цикл foreach
    */
   private static void arraysExample5() {
      System.out.println("\nОдномерные массивы. Пример 5");

      int[] array = new int[5];

      System.out.print("Массив array : ");

      // Вывод на экран значений элементов массива используя цикл foreach
      for (int element : array) {
         System.out.print(element + "  ");
      }
   }

   /**
    * Одномерные массивы. Пример 6: использование массива из 1 элемента, как переменной
    */
   private static void arraysExample6() {
      System.out.println("\nОдномерные массивы. Пример 6");

      int[] vector = new int[1];
      vector[0] = 100;
      int value = vector[0];

      System.out.println("Массив vector : " + vector[0]);
      System.out.println("Переменная : " + value);
   }

   /**
    * Одномерные массивы. Пример 7: различные примеры работы с массивом вещественных чисел
    */
   private static void arraysExample7() {
      final int N = 10;
      float[] A = new float[N];

      Locale.setDefault(Locale.US);
      for (int i = 0; i < N; i++) {
         System.out.printf("%7.2f", (A[i] = (float) (Math.random() * 100)));
      }

      System.out.println();
      System.out.println(Arrays.toString(A));

      for (float element : A) {
         System.out.printf("%7.2f", element);
      }


      // Быстрая сортировка массива по возрастанию
      Arrays.sort(A);


      // Переворот элементов массива
      float temp;
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
      System.out.println();
      int n = 0, index = -1;
      // Линейный поиск значения в массиве
      for (int i = 0; i < B.length; i++) {
         if (B[i] == 555) {
//            System.out.println("Linear search of 555: " + i);
            index = i;
            n++;
            break;
         }
      }

      System.out.println("\nДлина массива: " + B.length);
      System.out.println("Число 555 встречается в массиве " + n + " раз");
      System.out.println("Последняя позиция числа 555 в массиве: " + index);

      // Линейный поиск значения в массиве в обратном порядке
      for (int i = B.length - 1; i >= 0; i--) {
         if (B[i] == 555) {
//            System.out.println("Reverse Linear search of 555: " + i);
            index = i;
            n++;
            break;
         }
      }
      System.out.println("Первая позиция числа 555 в массиве: " + index);

      // Бинарный поиск вхождения значения в массив
      Arrays.sort(B);
      System.out.println("\nBinary search of 555: " + Arrays.binarySearch(B, 555));


      // Пузырьковая сортировка
      n = 0;
      for (int i = 0; i < A.length - 1; i++) {
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
      System.out.println(System.lineSeparator() + "Отсортированный массив: " + Arrays.toString(A) + System.lineSeparator());

      int[] C = B.clone();
      // Поиск минимального значения массива
      int indexMin = 0;
      for (int i = 1; i < C.length; i++) {
         if (C[i] < C[indexMin]) {
            indexMin = i;
         }
      }
      System.out.println(System.lineSeparator() + "Поиск минимального значения: ");
      System.out.println("Минимум: " + C[indexMin] + ", его индекс: " + indexMin);
      System.out.println();


      // Сравнение обычной сортировки и сортировки с использованием распараллеливания
      long start = System.currentTimeMillis();
      Arrays.sort(B);
      System.out.println("\nОбычная сортировка: " + (System.currentTimeMillis() - start) + " мС");

      start = System.currentTimeMillis();
      Arrays.parallelSort(C);
      System.out.println("Сортировка с распараллеливанием: " + (System.currentTimeMillis() - start) + " мС");


      // Изменение размеров массива
      int[] arr1 = new int[N];
      for (int i = 0; i < arr1.length; i++) {
         arr1[i] = (int) (Math.random() * 1000);
      }
      System.out.println("\nInitial array:                  " + Arrays.toString(arr1));

      int[] arr2 = Arrays.copyOf(arr1, 5);
      System.out.println("SubCopy of initial array:       " + Arrays.toString(arr2));

      arr1 = arr2;
      System.out.println("Replaced copy of initial array: " + Arrays.toString(arr1));
      arr2[3] = 555;
      System.out.println("Modified copy of resized copy:  " + Arrays.toString(arr1));
   }

   /**
    * Заполнение массива случайными значениями
    *
    * @param arr массив для заполнения
    */
   private static void fillArrayRandomly(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         arr[i] = random.nextInt(20);
      }
      System.out.println(Arrays.toString(arr));
   }

   /**
    * Клонирование массива
    */
   private static void arrayClone() {
      System.out.println("\nКлонирование массива\n");

      int[] a = {10, 20, 30};
      System.out.println("Клонируем массив а в массив b");
      int[] b = a.clone();
      System.out.println("Элементы массивов a и b равны - " + Arrays.equals(a, b));
      System.out.println("Ссылка а и b указывают на один массив - " + (a.hashCode() == b.hashCode()));

      System.out.println("Присваиваем массиву b ссылку массива a");
      b = a;
      System.out.println("Элементы массивов a и b равны - " + Arrays.equals(a, b));
      System.out.println("Ссылка а и b указывают на один массив - " + (a.hashCode() == b.hashCode()));
   }

   /**
    * Преобразование элементов массива в строку
    */
   private static void arrayToString() {

      System.out.println("\nПреобразование элементов массива в строку");

      int[] intArray = {1, 2, 3, 4, 5};

      // Создаем строку и инициализируем её строковым представлением
      // элементов массива
      String intArrayString = Arrays.toString(intArray);

      System.out.print("Массив преобразованный в строку : ");

      // Выводим строку intArrayString на экран
      System.out.println(intArrayString); // [1, 2, 3, 4, 5]
   }

   /**
    * Минимальный элемент в массиве
    */
   private static void minElementInArray() {
      System.out.println("\nНахождение минимального элемента в массиве");

      int[] array = {21, 243, 415, 54, -2, 31, 98, 10, -2};

      // Обязательно присваивать индексу минимального элемента 0 - позиция начального элемента для поиска
      int indexMin = 0;

      // Выводим элементы массива на экран
      System.out.print("Исходный массив : ");
      for (int a : array) {
         System.out.print(a + "  ");
      }

      // Сравниваем текущий минимальный элемент с i-ым элементом массива
      for (int i = 1; i < array.length; i++) {
         if (array[i] < array[indexMin]) indexMin = i;
      }
      System.out.println("\nМинимальный элемент " + array[indexMin] + ", его индекс: " + indexMin);

      // Сравниваем текущий минимальный элемент с i-ым элементом массива
      int min = array[0];
      indexMin = 0;
      int index = 0;
      for (int element : array) {
         if (element < min) {
            min = element;
            indexMin = index;
         }
         index++;
      }
      System.out.println("\nМинимальный элемент " + min + ", его индекс: " + indexMin);
   }

   /**
    * Максимальный элемент в массиве
    */
   private static void maxElementInArray() {
      System.out.println("\nНахождение максимального элемента в массиве");

      int[] array = {21, 243, 415, 54, -2, 31, 98, 10};

      // Обязательно присваивать максимальному элементу первый элемент массива (с индексом 0)
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

   /**
    * Среднее арифметическое в массиве
    */
   private static void findAverageValue() {
      System.out.println("\nСреднее арифметическое в массиве");

      int[] numbers = {4, 8, 10, 12, 16};
      double sum = 0;

      System.out.print("Массив numbers : ");

      for (int a : numbers) {
         System.out.print(a + "  ");
      }

      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }

      sum = sum / numbers.length; // общий результат делим на число элементов в массиве
      System.out.println("Среднее арифметическое: " + String.format("%5.2f", sum));
   }

   /**
    * Перестановка элементов массива в обратном порядке
    */
   private static void arrayReverse() {
      // Данный метод идеален как вопрос на собеседовании
      System.out.println("\nРеверс элементов массива");

      int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
      System.out.println(Arrays.toString(array));
      for (int i = 0; i < array.length / 2; i++) {
         array[i] = array[i] + array[array.length - 1 - i];
         array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
         array[i] = array[i] - array[array.length - 1 - i];
      }

      System.out.print("Массив после переворота: ");
      System.out.println(Arrays.toString(array));


      // Можно менять местами значения двух переменных без использования вспомогательной
      int a = 2, b = 3;
      System.out.println(a + ", " + b);

      a = a + b; // 5
      b = a - b; // 2
      a = a - b; // 3
      System.out.println(a + ", " + b);
   }

   /**
    * Поиск вхождения значения в массив с использованием линейного поиска
    *
    * @param arr массив
    */
   private static void searchInArray(int[] arr) {
      //
      int key = 10;
      boolean isFound = false;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            System.out.println(i);
            isFound = true;
            break;
         }
      }
      if (!isFound) System.out.println("Искомое значение в массиве не найдено!");

      // Поиск вхождения с использованием бинарного поиска
      int[] arrCopy = arr.clone();
      Arrays.sort(arrCopy);
      int pos = Arrays.binarySearch(arrCopy, key);
      System.out.println(pos >= 0 ? "Значение обнаружено" : "Искомое значение в массиве не найдено!");
      System.out.println(Arrays.toString(arr));
   }

   /**
    * "Пузырьковая" сортировка по убыванию - от большего к меньшему
    */
   private static void bubbleSortFromMaxToMin() {
      System.out.println("\n\nBubbleSort - от большего к меньшему");
      int[] num = {203, 134, 123, -2, 124, 0, 14};
      int j, temp;
      boolean flag = true;

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

   /**
    * "Пузырьковая" сортировка по возрастанию - от меньшего к большему
    */
   private static void bubbleSortFromMinToMax() {
      System.out.println("\n\nBubbleSort - от меньшего к большему");
      int[] num = {203, 134, 123, -2, 124, 0, 14};
      int j, temp;
      boolean flag = true;

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

   /**
    * Сортировка с использованием встроенной "быстрой сортировки" QuickSort
    */
   private static void quickSortUseExample() {
      System.out.println("\n\nСортировка методом QuickSort");
      int[] num = {203, 134, 123, -2, 124, 0, 14};

      System.out.print("Массив до сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }

      // Сортируем массив методом QuickSort
      Arrays.sort(num);

      System.out.print("\nМассив после сортировки : ");
      for (int a : num) {
         System.out.print(a + " ");
      }
   }

   /**
    * Поэлементное сравнение массивов (с помощью "изобретения велосипеда")
    */
   private static void arraysCompareBikeMethod() {
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

   /**
    * Нормальное сравнение элементов массивов, используя встроенный метод класса Arrays
    */
   private static void arraysCompareNormalMethod() {
      System.out.println("\nСравнение элементов массивов с помощью Arrays.equals");
      int[] a = {10, 20, 30};
      int[] b = {10, 20, 30};

      if (Arrays.equals(a, b)) {
         System.out.println("Элементы массивов a и b - равны");
      } else {
         System.out.println("Элементы массивов a и b - не равны");
      }
   }

   /**
    * Переход от for к foreach
    */
   private static void forToForeach() {
      System.out.println("\nПереход от for к foreach");

      int[] array = {10, 20, 30};

      System.out.print("Массив : ");

      for (int i = 0; i < array.length; i++) //noinspection GrazieInspection
      {
         // Присваиваем переменной a значение i-го элемента массива array
         int a = array[i];
         // Выводим переменную а, которая равна i-ому элементу массива array
         System.out.print(a + "  ");
         // Изменяем значение переменной а, а значение i-го элемента массива array не изменяется
         a = 20;
      }

      System.out.print("\nМассив : ");

      // То же самое, что и выше
      for (int a : array) {
         System.out.print(a + "  ");
         a = 20;
      }
   }

   /**
    * Оптимизируем использование оперативной памяти
    */
   private static void saveMemory() {
      // Если динамический диапазон значений элементов для всех массивов от 0 до 100,
      // то в таком случае, оптимально будет выбрать массив типа byte,
      // чтобы не расходовать оперативную память впустую

      final int N = 10000;

      byte[] a_byte = new byte[N];    // Займет в памяти 10000 байт
      short[] a_short = new short[N]; // Займет в памяти 20000 байт
      int[] a_int = new int[N];       // Займет в памяти 40000 байт
      long[] a_long = new long[N];    // Займет в памяти 80000 байт
   }


   /**
    * У вас есть доллары. Вы хотите обменять их на гривны. Есть информация о
    * стоимости купли-продажи в банках города. В городе N банков. Составьте
    * программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на гривны.
    */
   private static void classWork1() {
      final int N = 20;
      double[] buy = new double[N], sell = new double[N];
      for (int i = 0; i < N; i++) {
         buy[i] = 29.2 + random.nextDouble() * 0.4;
         sell[i] = 29.5 + random.nextDouble() * 0.5;
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

   /**
    * Дан целочисленный массив с количеством элементов n. Напечатать те его элементы,
    * индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...)
    */
   private static void classWork2() {
      int[] values = new int[40];
      for (int i = 0; i < values.length; i++) {
         values[i] = (int) (Math.random() * 100);
         System.out.printf("%3d,", values[i]);
      }

      System.out.println();
      for (int i = 0; i < values.length; i++) {
         if (i == 1 || i == 2 || i == 4 || i == 8 || i == 16 || i == 32) System.out.printf("%3d,", values[i]);
      }

      System.out.println();
      for (int i = 1; i < values.length; i *= 2) {
         System.out.printf("%3d,", values[i]);
      }
   }

   /**
    * Найти сумму четных элементов массива целых чисел
    *
    * @param arr массив
    */
   private static void classWork3(int[] arr) {
      int sum = 0;
      for (int item : arr) {
         if (item % 2 == 0) {
            sum += item;
         }
      }
      System.out.println("Сумма чётных элементов массива: " + sum);
      System.out.println();
   }

   /**
    * Найти произведение элементов массива целых чисел, которые кратны 9
    *
    * @param arr массив
    */
   private static void classWork4(int[] arr) {
      int mult = 1;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 9 == 0) {
            mult *= arr[i];
         }
      }
      System.out.println();
      System.out.println("Произведение всех элементов массива со значениями, кратными 9: " + mult);
   }

   /**
    * Каждый солнечный день улитка, сидящая на дереве, поднимается на 2 см, а каждый пасмурный день опускается вниз на 1 см.
    * В начале наблюдения улитка находилась на расстоянии А см от земли на 5-метровом дереве.
    * Имеется 30-элементный массив, содержащий сведения о том, был ли соответствующий день наблюдения пасмурным или солнечным.
    * Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.
    */
   private static void classWork5() {
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
   }

   /**
    * Руководство фирмы ведет по месяцам учет расходов и поступлений средств.
    * За n месяцев получены два массива: R(n) — расходов и P(n) — поступлений.
    * Сформировать из массивов R(n) и P(n) массив прибыли Z(n).
    * Определить:
    * общую прибыль (как за весь период, так и по месяцам она может быть отрицательная),
    * месяц с максимальной и месяц с минимальной прибылью,
    * количество месяцев с положительной прибылью.
    */
   private static void classWork6() {
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
         System.out.printf("%10.2f%s", r[i], Currency.getInstance(Locale.UK).getSymbol());
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
         System.out.printf("%10.2f", z[i]);
      }

      System.out.println(System.lineSeparator() + "Итоговая прибыль: " + String.format("%10.2f", all));
      System.out.println("Месяц с максимальной прибылью: " + (indMax + 1));
      System.out.println("Месяц с минимальной прибылью: " + (indMin + 1));
      System.out.println("Месяцев с прибылью: " + positiveMonths);
   }

   /**
    * На соревнованиях по прыжкам в высоту и в длину получены два массива результатов H(n) и D(n).
    * Определить три лучших и три худших результата в каждом виде соревнований.
    * <p>
    * Способ с поиском и без использования сортировки
    */
   private static void classWork7() {
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

   /**
    * На соревнованиях по прыжкам в высоту и в длину получены два массива результатов H(n) и D(n).
    * Определить три лучших и три худших результата в каждом виде соревнований.
    * Способ с использованием сортировки
    */
   private static void classWork7a() {
      System.out.println();
      final int N = 10;
      float[] H = new float[N], D = new float[N];

      for (int i = 0; i < N; i++) {
         H[i] = (float) (random.nextInt(100) / 10.0);
         D[i] = (float) (random.nextInt(100) / 10.0);
      }

      System.out.println(Arrays.toString(H));
      System.out.println(Arrays.toString(D));

      classWork7_subTask(H, "H");
      classWork7_subTask(D, "D");
   }

   /**
    * Отображение 3 лучших и 3 худших результатов (по 3 с каждой стороны после сортировки)
    *
    * @param arr       массив
    * @param arrayName подпись для отображения на печати
    */
   private static void classWork7_subTask(float[] arr, String arrayName) {
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

   /**
    * Написать алгоритм переворота элементов массива (смены мест в заданном массиве):
    * первого элемента - с последним, второго - с предпоследним и так далее.
    */
   private static void classWork8() {
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

   /**
    * Типовая задача из домашнего задания. Пример 1
    * В массиве хранятся сведения о стоимости 12 различных предметов.
    * Определить общую стоимость всех предметов.
    */
   private static void homework_Example_1() {
      System.out.println("\nТиповая задача из домашнего задания. Пример 1");

      double[] cost = new double[12];
      double sum = 0;

      // Так как мы изменяем значения элементов массива, то используем for
      for (int i = 0; i < cost.length; i++) {
         System.out.print("Введите стоимость " + (i + 1) + " товара : ");
         cost[i] = scanner.nextDouble();
      }

      // Так как мы не изменяем значения элементов массива, а только читаем их, то используем foreach
      for (double a : cost) {
         sum += a;
      }

      System.out.println("Стоимость всех 12 товаров : " + sum + " у.е.");
   }

   /**
    * Типовая задача из домашнего задания. Пример 2
    * Дан массив целых чисел. Выяснить:
    * а) верно ли, что сумма элементов массива есть четное число;
    * б) верно ли, что сумма квадратов элементов массива есть пятизначное число;
    * в) верно ли, что сумма элементов массива неотрицательна.
    */
   private static void homework_Example_2() {
      System.out.println("\nТиповая задача из домашнего задания. Пример 2");

      // Переменная для генерации случайных чисел
      Random random = new Random();

      int[] array = new int[12];
      // Сумма элементов массива
      int sumOfElements = 0;
      // Сумма квадратов элементов массива
      int sumOfElementsSqr = 0;

      System.out.print("Исходный массив : ");
      for (int i = 0; i < array.length; i++) {
         // В i-ый элемент массива, записываем случайное значение в диапазоне [-50;50)
         array[i] = random.nextInt(100) - 50;
         // Выводим i-ый элемент на экран
         System.out.print(array[i] + "  ");
         // Прибавляем i-ый элемент массива к сумме элементов массива
         sumOfElements += array[i];
         // Прибавляем квадрат i-го элемента массива к сумме квадратов элементов массива
         sumOfElementsSqr += array[i] * array[i];
      }

      System.out.println();

      if (sumOfElements % 2 == 0) {
         System.out.println("Сумма элементов массива есть четное число");
      } else {
         System.out.println("Сумма элементов массива есть нечетное число");
      }

      if (sumOfElementsSqr >= 10000 && sumOfElementsSqr < 100000) {
         System.out.println("Сумма квадратов элементов массива есть пятизначное число");
      } else {
         System.out.println("Сумма квадратов элементов массива есть не пятизначное число");
      }

      if (sumOfElements >= 0) {
         System.out.println("Сумма элементов массива неотрицательна");
      } else {
         System.out.println("Сумма элементов массива отрицательна");
      }
   }

   /**
    * Типовая задача из домашнего задания. Пример 9
    * Дан массив целых чисел. Удалить из него:
    * а) все четные элементы, стоящие на нечетных местах;
    * б) все элементы, кратные 3 или 5.
    */
   private static void homework_Example_9() {
      int[] array = new int[12];
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 10);
      }

      System.out.println(Arrays.toString(array));

      for (int i = 1; i < array.length; i++) {
         if (array[i] != 0 && array[i] % 2 == 0 && i % 2 == 1) {
            int currentLength = array.length;
            for (int j = i; j < array.length - 1; j++) {
               array[j] = array[j + 1];
            }
            //  1 2 3 4 5 6
            //  1 3 4 5 6 _
            //  1 3 5 6 _
            //  1 3 5 _
            currentLength--;
            array = Arrays.copyOf(array, currentLength);
            System.out.println(Arrays.toString(array));
         }
      }

      System.out.println(Arrays.toString(array));
   }
}