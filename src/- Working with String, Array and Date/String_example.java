public class String_example {
    public static void main(String[] args) {
        //1.1 Khởi tạo chuỗi
        //String str1 = new String();
        String str1 = "Hello Word";
        String str2 = ("I'm Lan Anh");
        char[] chars = {'J', 'a', 'v', 'a'};
        //String str3 = new String(chars);
        String str3 = String.valueOf(chars);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println( );

        //1.2 Nối chuỗi và số
        String name = "Nguyen";
        name = name + " Lan Anh";
        System.out.println("Name: " + name);

        int age = 21;
        String message = "Age: " + age;
        System.out.println(message);
        System.out.println( );

        //1.3 So sánh chuỗi
        String s1 = "java";
        String s2 = "Java";
        String s3 = ("java");
        String s4 = "JAVA";
        System.out.println(("s1: " + s1));
        System.out.println(("s2: " + s2));
        System.out.println(("s3: " + s3));
        System.out.println(("s4: " + s4));

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equals(s4): " + s1.equals(s4));
        System.out.println( );

        // CompareTo and startsWith
        String hello1 = "Hello";
        String hello2 = "Hello";
        String hi = "Hi";
        System.out.println("hello1.compareTo(hello2): " + hello1.compareTo(hello2));
        System.out.println("hello1.compareTo(hi): " + hello1.compareTo(hi));
        System.out.println("hello1.startsWith(\"Hi\"): "+ hello1.startsWith("Hi"));
        System.out.println( );

        // 1.5 Các phương thức thông dụng của String
        String example = "Nguyen Lan Anh";
        System.out.println("Length: " + example.length());
        System.out.println("Substring (6): " + example.substring(6));
        System.out.println("Contains \"Linh\": " + example.contains("Linh"));
        System.out.println("Is empty: " + example.isEmpty());
        System.out.println("Replace 'a' with 'o': " + example.replace('a', 'o'));
        String[] parts = example.split("");
        System.out.println("Split resultt: ");
        for (String i : parts) {
            System.out.print(i + " ");
        }
        System.out.println( );

        int number = 123;
        String strNumber = String.valueOf(number);
        System.out.println("String.valueOf(123): " + strNumber);
    }
}