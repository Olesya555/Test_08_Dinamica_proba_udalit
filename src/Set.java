import java.util.HashSet;

public class Set {
// Множества, пробегали быстро с преподавателем
    // Не позволяет дублирование значений. Хранятся не сортированно.

    //Set
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(100);
        myHashSet.add(20);
        myHashSet.add(-3);
        myHashSet.remove(100); // вводится именно значение, потому что здесь нет порядка.
        System.out.println(myHashSet.contains(20)); // Проверяем, содержится ли определенное значение во множестве

        for (int i : myHashSet) // вывод через for ich - вывод каждого элемента списка
            System.out.println(i);
    }
}