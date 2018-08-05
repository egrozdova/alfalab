public class DOG {
    String name;
    int age;
    String breed;

    //конструктор
    DOG (String name)
    {
        this.name = name;
    }

    public void bark ()
    {
        System.out.println("GAV-GAV" + " " + name);
    }

}
