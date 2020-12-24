package lab;
import java.util.ArrayList;
import java.io.*;
public class hw1 {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Иванов Адрей Вячеславович");
        FIO.add("Петров Василий Александрович");
        FIO.add("Станиславский Аркадий Алексеевич");
        FIO.add("Петрушкина Антонина Сергеевна");
        FIO.add(1, "Краев Никита Сергеев");
        FIO.add("Добрынин Александр Владимирович");
        System.out.println(FIO.get(1));
        FIO.remove("Добрынин Александр Владимирович");
        for (int i = 0; i < FIO.size(); i++) System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for (Object count : fiol) {

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Users\\IdeaProjects\\lab\\src\\lab\\xxx.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Взять:");
            String text = "Полотенце,тапочки,гель для душа.";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Список закончен.");
            writer.append("\n");
            writer.write("И шампунь.");


            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\lab\\src\\lab\\xxx.txt");
            System.out.println("////////////////////////");
            // символьно
            int c;
            while ((c = reader.read()) != -1) {

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char) c);

            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());


        }


    }
}