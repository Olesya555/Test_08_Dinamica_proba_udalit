import java.util.LinkedList;

// ОЧЕРЕДИ. Пробежали быстро от преподователя
// в очереди НЕ может быть значения ноль!!!

public class Queue {
    // Очередь организована на  LinkedList
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Лондон"); // Добавляем
        queue.offer("Киев");
        queue.offer("Москва");
        queue.offer("Омск");

        System.out.println(queue.peek()); // Возвращение элемента из головы очереди, то есть он выведет
        // первый элемент списка или выведет ноль, если очередь пустая

        String town;
        while ((town = queue.poll()) != null) { // Печать городов первого по списку и сразу удаление напечатанного
            // города из списка, пока в списке не останется ни одного значения
            System.out.println(town);
        }
    }
}
