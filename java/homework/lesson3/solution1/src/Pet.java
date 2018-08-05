public class Pet extends Alive {

    char aClass, gender;
    String name, owner, livAddress;
    int health;

    Pet (char aClass, char gender, String name, String owner, String livAddress)
    {
        this.aClass = aClass;
        this.gender = gender;
        this.name = name;
        this.owner = owner;
        this.livAddress = livAddress;
        this.health = 100;
    }

    public char getGender() {
        return gender;
    }

    public char getAClass() {
        return aClass;
    }

    public String getLivAddress() {
        return livAddress;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth (int health) {this.health = health;}

    public void voice ()
    {
        System.out.println(name + ": Подаю голос");
    }

    public void run ()
    {
        health = health - 7;
        System.out.println(name + ": Делаю ноги. Уровень здоровья: " + health);

    }

    public void eat ()
    {
        health = health + 16;
        System.out.println(name + ": Наворачиваю еду. Уровень здоровья: " + health);

    }

    public void sleep ()
    {
        health = health + 20;
        System.out.println(name + ": ZzzzZzzzz. Уровень здоровья: " + health);

    }

    public int fight ()
    {
        int force = 0;
        switch (aClass) {
            case 'C': force = 13; break;
            case 'D': force = 19; break;
        }
        System.out.println(name + ": Кусаюсь. Уровень здоровья противника: -" + force);

        return force;
    }

}
