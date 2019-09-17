package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    /* Demonstrate how to use Map that includes storing and retrieving elements.
             * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
             * Use For Each loop and while loop with Iterator to retrieve data.
             Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
             */
    public static void main(String[] args) {

        Map<String, Integer> stuId = new HashMap<String, Integer>(5);
        stuId.put("Marcon", 132);
        stuId.put("Jems", 125);
        stuId.put("Caleb", null);
        System.out.println("Original Map: " + stuId);
        stuId.put("jery", 231);
        stuId.remove("Jems");
        System.out.println("Updated Map: " + stuId);
        System.out.println(stuId.keySet());
        System.out.println(stuId.values());

        String userName = "codebind";
        String password = "fiker";

        String url = "jdbc;mysql;//localhost;3306/employees?useSSL=false";
        String query = "select * from students.students_detail;";

        try {
            Class.forName("com.mysql.jdbc.Drive");
        } catch (ClassNotFoundException e) {
            System.out.println("check driver");
            e.printStackTrace();

        }
    }
}