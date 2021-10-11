public class Main {
    public static void main(String[] args) {
        String[] data = new String[] {"3","2hgg","1","4"};
        int[] data2 = new int[4];
        for (int i = 0; i < data.length; i++) {
            data2[i] = Integer.parseInt(data[i]);
        }
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);

        }

    }

}

