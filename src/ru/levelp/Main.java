package ru.levelp;

/**
 * Created by natalie on 06.03.16.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        все коллекции делятся на категории
        если в названии есть list - все эл-ты стоят по порядку и можно получить эл-т по индексу
         */

//        ArrayList list = new ArrayList(); // коллекции в JAVA работают с любым типом данных, но только 1 тип за раз
        // по умолчанию "чистый" Array list хранит ОБЪЕКТЫ
//        list.add("Line 1"); // строка - объект
//        list.add(new Scanner(System.in)) // сканнер - объект. это один и тот же тип
//        String str = list.get(0); // хочет строку - видит объект
//        String str = (String) list.get(0); // сработает, но это плохой подход :)

        // ArrayList работает с массивами

//        ArrayList<String> list = new ArrayList(); // указываем хранимый тип
//        // java-8 второй раз можно не указывать тип new ArrayList<String>()
//        list.add("Line 1");
//        String str = list.get(0);
//        list.add(1, "line 2"); // = insert вставка по индексу
//
//        // LinkedList работает по-другому - д/з
//
//        LinkedList<String> linkedList = new LinkedList<>(); // list имеет стандартный набор методов
//        linkedList.add("Linked line 1");
//
//        // коллекцию определяет задача
//        // в зависимости от того, как хотите хранить данные: упорядоченно или нет
//
//        HashSet<String> set = new HashSet<>();
//        // set - множество: набор уникальных (!) элементов, без дубликатов
//        set.add("Line");
//        set.add("Line");
////        System.out.println(set.size()); // =1 т.к. второе добавление не прошло, такой эл-т уже есть
//        // set.get - нет метода, тк нет порядка, нельзя получить эл-т по индексу. эл-ты не упорядочены
//
//        TreeSet<String> tree = new TreeSet<>(); // тел книга по алфавиту, нет двух одинаковых имен
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Line 1");
//        linkedHashSet.add("Line 2");
//
//        // пройти по порядку: ИТЕРАТОР
//        // foreach - по каждому эл-ту коллекции, работает с любой коллекцией. выведет все элементы
//
//        for (String s : linkedHashSet) { // для каждой строки s из коллекции
//            System.out.println(s);       // в каждую итерацию берет строку и записывает в строку s
//        }
//        // также можно пробегаться по массиву linkedHashSet = array
//
//        // разница между способами: время выполнения цикла
////        for (int i = 0; i < 10000; i++) {
////            linkedList.add("Line " + 1);
////        }
////        System.out.println("Lines added");
//
////        for (String s : linkedList) {
////            s = "new Line";
////        }
////        System.out.println("foreach finished");
//
////        for (int i = 0; i < linkedList.size(); i++) {
////            String s = linkedList.get(i); // тут важно GET(i) -- работает сильно медленнее!!!
////        }
//
//        for (int i = 0; i < 10; i++) {
//  //          linkedList.add("Line " + i);
//        }
//        System.out.println("Lines added");
//
//        for (String s : linkedList) { // lList хранит ссылки
//            s = "new Line"; // s - ссылка, в lL ничего не меняется
//            // s.name = "New name"  теперь изменится
//        }
//        for (int i = 0; i < linkedList.size(); i++) {
////            System.out.println(linkedList.get(i));
//        }
//
//        Hashtable<String, String> table = new Hashtable<>();
//        //           Key, Value
//        // хранит таблицу
//        // как в массиве - индекс + значение
//        // не может быть два одинаковых ключа
//
//        table.put("key1", "value 1");
//        System.out.println(table.get("key1")); // = value 1
//
//        table.put("key1", "value 2"); // перезапишет значение
//        System.out.println(table.get("key1"));
//        System.out.println(table.get("key2")); // = null
//        // нельзя указывать null при заполнении
//
//        // как хранить примитивы в коллекциях
//        // у каждого примитива есть класс ОБЕРТКА
//
//        ArrayList<Integer> intList = new ArrayList<>(); // Integer = class int
//        intList.add(345);
//        // list.add(new Student) - вызов объекта
//
//        Integer x = 5;
//        Double y; // просто с большой буквы = класс
//        Character d; // = char

        MyArrayList list = new MyArrayList();
        list.add(5);
//        System.out.println(list.values[0]);

/*        модификаторы доступа: public, private
          private - доступ

 */
        Student st = new Student();

        st.setName("Vova"); // set - осознанно меняем переменную
        // безопасность кода в плане разработки
        st.setAge(45);

        System.out.println(st.getName());

        st.setFrom(Student.FROM_RUS); // обратились через имя класса - статические переменные/методы static

        // static не требуют создания объекта, общие для всех объектов и для программы
        // Класс.метод - пример класс Math

        ArrayList<String> list = new ArrayList();
        list.sort();

    }
}
