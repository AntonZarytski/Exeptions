/**
 * перегоняем стринг массив в ИНт, получаем ошибку насчет формата.
 * Хочу обработать это исключение сейчас через трай кэтч блок, но что задать в кэтч? что мне делать с ним?
 * Что бы валидная дата бралась, а невалидная просто откидывалась
 */
public class Main {
    public static void main(String[] args) {
        String[] data = new String[] {"3","2hgg","1","4"};
        int[] data2 = new int[4];
        try{
        for (int i = 0; i < data.length; i++) {
            data2[i] = Integer.parseInt(data[i]);}
        }
        catch (NumberFormatException e){

        }
                for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);

        }

    }

}

