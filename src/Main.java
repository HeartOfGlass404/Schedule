import UI.MainWindow;
import java.util.Scanner;
import Utils.*;

/*идея: реализовать расписание через массив структур, чтобы составлялась колонка время-предмет, например,
    через список. Для первого узла 8:00-9:30 и т.д.
    сделать выборку по группе и подгруппе, курсу, факультету, направлению и т.д.
     +сохранение в файл и считывание из файла

    совсем на будущее:
    1) реализовать сбор людей в группы, чтобы они могли просматривать одно расписание на всех,
    сделать подключение к группе.
    2) сделать меню с "коллекцией" расписаний, возможность объединять расписания или сопоставлять, свободно ли время
    проводя поиск по остальным расписаниям
    и совсем совсееем на будущее: кроссплатформа, просмотр расписаний с любого устройства
     */
public class Main {
static package4schedule.Week Week1;
package4schedule.Week Week2;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run () {
                new MainWindow().setVisible(true);
            }
        });

        Scanner sc = new Scanner(System.in);
        String menu = """
               Выберите пункт меню:
               1. Посмотреть расписание
               2. Добавить расписание
               3. Удалить расписание
               """;
        System.out.println(menu);
        int i=sc.nextInt();
        switch (i){
            case 1:
                System.out.println("Выбран первый пункт");
                int subjectCase = 1;
                break;
            case 2:
                System.out.println("Выбран второй пункт");
                subjectCase=2;
                System.out.println("Введите данные");
                package4schedule.Weekday Monday = new package4schedule.Weekday();
                Monday.put(1,"sdas");
                break;
            case 3:
                System.out.println("Выбран третий пункт");
                subjectCase=3;
                break;
            default:
                System.out.println("Введён неверный символ!");
                break;
        }


    }
}