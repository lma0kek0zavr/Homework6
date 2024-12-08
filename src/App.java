
public class App {
    public static void main(String[] args) throws Exception {

        Author JKRowling = new Author("Joanne", "Rowling");

        Author HPLovecraft = new Author("Howard", "Lovecraft");

        Book HarryPotter = new Book("Harry Potter and the Philosopher`s Stone", JKRowling, 1997);

        Book TheCallOfTheCthulhu = new Book("The call of the Cthulhu", HPLovecraft, 1928);

        System.out.println("------------");
        System.out.println("Object: JKRowling");
        System.out.println("------------");

        System.out.printf("Author.toString(): %s \nAuthor.hashCode(): %d \nAuthor.equals(HPLovecraft): %b", 
        JKRowling.toString(),
        JKRowling.hashCode(), 
        JKRowling.equals(HPLovecraft));

        System.out.println();

        System.out.println("------------");
        System.out.println("Object: HPLovecraft");
        System.out.println("------------");

        System.out.printf("Author.toString(): %s \nAuthor.hashCode(): %d \nAuthor.equals(JKRowling): %b", 
        HPLovecraft.toString(),
        HPLovecraft.hashCode(), 
        HPLovecraft.equals(JKRowling));

        System.out.println();

        System.out.println("------------");
        System.out.println("Object: HarryPotter");
        System.out.println("------------");

        System.out.printf("Book.toString(): %s \nBook.hashCode(): %d \nBook.equals(TheCallOfTheCthulhu): %b", 
        HarryPotter.toString(),
        HarryPotter.hashCode(), 
        HarryPotter.equals(TheCallOfTheCthulhu));

        System.out.println();

        System.out.println("------------");
        System.out.println("Object: TheCallOfTheCthulhu");
        System.out.println("------------");

        System.out.printf("Book.toString(): %s \nBook.hashCode(): %d \nBook.equals(TheCallOfTheCthulhu): %b", 
        TheCallOfTheCthulhu.toString(),
        TheCallOfTheCthulhu.hashCode(), 
        TheCallOfTheCthulhu.equals(HarryPotter));
    }
}