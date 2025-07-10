public class Main {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        String[] words = sentence.split(" ");

        for (int i=0; i < words.length; i++) {
            int count = 1;

            if (words[i].equals("0"))
                continue;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count ++;
                    words[j] = "0";
                }
            }

            if (!words[i].equals("0")) {
                System.out.println("Từ '" + words[i] + "' xuất hiện: " + count + " lần");
            }

        }


    }
}