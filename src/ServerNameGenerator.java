public class ServerNameGenerator {
    String[] adjectives = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit"};
    String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "two", "family", "government"};

    public static String randomElement(String[] strings) {
        return strings[(int) (Math.random() * strings.length)];
    }
    public static void main(String[] args) {
        ServerNameGenerator sng = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.println(randomElement(sng.adjectives) + "-" + randomElement(sng.nouns));
    }
}
