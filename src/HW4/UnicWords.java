package HW4;
/*1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
*/
import java.util.ArrayList;
import java.util.HashMap;

public class UnicWords {

        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();
            words.add("Морж");
            words.add("Медведь");
            words.add("Заяц");
            words.add("Лиса");
            words.add("Обезьяна");
            words.add("Волк");
            words.add("Слон");
            words.add("Лев");
            words.add("Тигр");
            words.add("Газель");
            words.add("Осел");
            words.add("Лошадь");
            words.add("Рысь");
            words.add("Слон");
            words.add("Лев");
            words.add("Тигр");
            words.add("Газель");
            words.add("Осел");
            words.add("Медведь");
            words.add("Заяц");
            words.add("Лиса");
            words.add("Медведь");
            words.add("Заяц");
            words.add("Лиса");

            HashMap<String, Integer> dictUnicWords = new HashMap<>();
            for (String word: words){
                if (!dictUnicWords.containsKey(word)) {
                    dictUnicWords.put(word,1);
                } else {
                    int value=dictUnicWords.get(word);
                    dictUnicWords.replace(word,++value);
                }
            }
            System.out.println(dictUnicWords);
        }
    }

