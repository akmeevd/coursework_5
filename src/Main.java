import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> booksAndAuthorsMap= new HashMap<>();
        booksAndAuthorsMap.put("Братья Карамазовы", "Ф.М.Достоевский");
        booksAndAuthorsMap.put("Дядя Ваня", "А.П.Чехов");
        booksAndAuthorsMap.put("Анна Каренина", "Л.Н.Толстой");
        booksAndAuthorsMap.put("Дело Артамоновых", "М.Горький");
        booksAndAuthorsMap.put("Капитанская дочка", "А.С.Пушкин");

        //Первый способ, цикл
        List<String> booksAndAuthorsList1 = new ArrayList<>();
        for (Map.Entry<String, String> entry : booksAndAuthorsMap.entrySet()) {
            booksAndAuthorsList1.add(entry.getKey() + ": " + entry.getValue());
        }

        //Второй способ, stream
        List<String> booksAndAuthorsList2 = booksAndAuthorsMap
                .entrySet()
                .stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .toList();

        //Выводим в консоль новые списки
        System.out.println(booksAndAuthorsList1);
        System.out.println(booksAndAuthorsList2);
    }
}
