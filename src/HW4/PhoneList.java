package HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
телефонных номеров. В этот телефонный справочник с помощью метода add() можно
добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем
через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного
справочника.*/
public class PhoneList {
//главный метод
    public static void main(String[] args) {
       //объявляем и инициализируем справочник
        HashMap<String, String> phoneList = new HashMap<>();
        phoneList.put("+7(917)75-121-74", "Kulagin");
        phoneList.put("+7(963)79-191-78", "Vasilev");
        phoneList.put("+7(903)77-129-58", "Kozhina");
        phoneList.put("+7(987)85-581-34", "Kulagin");
        phoneList.put("+7(901)45-456-78", "Onuchin");
        phoneList.put("+7(927)75-111-11", "Kulagin");
        phoneList.put("+7(917)75-121-75", "Onuchin");
        //распечатываем весь справочник
        printAll(phoneList);
        //находим все телефоны однофамильцев
        System.out.println(getAllPhonesForSurname(phoneList, "Onuchin"));
        //добавляем нового пользователя в справочник
        System.out.println(addNewUser(phoneList, "+7(918)45-456-98", "Onuchin"));
        //находим все телефоны однофамильцев добавленного пользователя, чтобы убедиться, что метод работает
        System.out.println(getAllPhonesForSurname(phoneList, "Onuchin"));
        }
        //метод печати всего справочника
    public static void printAll(HashMap nameList){
        Set<Map.Entry<String, String>> entrySet = nameList.entrySet();
        for (Map.Entry<String, String> o : entrySet) {
            System.out.println(o.getKey() + ": " + o.getValue());}
        }
    //метод добавления нового пользователя
    public static String addNewUser(HashMap nameList, String phone, String surname) {
        String newUser = surname;
        nameList.put(phone, surname);
        return ("В телефонный справочник дабавлен новый пользователь: "+ newUser);
    }
    //метод нахождения телефонов по фамилии
    public static String getAllPhonesForSurname(HashMap nameList, String surname) {
        Set<Map.Entry<String, String>> entrySet = nameList.entrySet();
        ArrayList<String> answerList = new ArrayList<>();
        for (Map.Entry<String, String> pair : entrySet) {
            if (surname.equals(pair.getValue())) {
                answerList.add(pair.getKey());
            }
        }
        return ("Телефоны связанные с фамилией "+surname+ ": "+answerList);
    }
}