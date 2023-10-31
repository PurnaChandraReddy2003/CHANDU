public class Personvalidator {
    public static String validatePerson(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Valid Person";
        } else {
            return "Invalid Person";
        }
    }

    public static void main(String[] args) {
        String result = validatePerson("ram", 3025);
        System.out.println(result);
    }
}
