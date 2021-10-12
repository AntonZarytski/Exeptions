/**
 * перегоняем стринг массив в ИНт, получаем ошибку насчет формата.
 * Хочу обработать это исключение сейчас через трай кэтч блок, но что задать в кэтч? что мне делать с ним?
 * Что бы валидная дата бралась, а невалидная просто откидывалась
 * Добавил трай кэтч,  и на выходе теперь 3 0 0 0 ? вопрос почему так коряво у меня получилось? только пожалуйста далеко не забегай вперед
 * Тоесть вопрос к тебе что сделать с этим кодом что бы на выходе получить 3 2 1 4
 */
public class Main {
    private List<String> list;
    public static void main(String[] args) {
        String[] data = new String[] {"3","2hgg","1","4"};
        int[] data2 = new int[4];
        try{
        for (int i = 0; i < data.length; i++) {
            data2[i] = Integer.parseInt(data[i]);}
        }
        catch (NumberFormatException e){
// сюда ты добавляешь логику обработки исключений(никакой ключевой логики для работы аппы в catch добавлять не рекомендуется),
// а так же можешь отобразить исключение
            // e.printStackTrace() или Log.e(TAG, e)
//если в блоке catch возникнет иисключение, то аппа упадет
        } finnaly {
            // посмотри что такое finnaly
        }
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);

        }
        // list = new ArrayList();
        getListSize(size) == -1 ? 
        System.out.println("Exception was triggered"):
        System.out.println("Exception wasnt triggered, listSize is " + getListSize(list)):
    }
    
    // наример метод с exception, когда тебе надо вернуть что-то, где может возникнуть исключение, вообще варианвто может быть дофига
    int getListSize(List<T> list){
        int answer = 0;
        try{
            answer = list.size();
        }catch (NullPointerException e){
            answer = -1;
            Log.e(TAG, e);
        }
        return answer
    }                 
}

