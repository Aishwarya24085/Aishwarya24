class MutablePerson {
    private String name;
    private int age;

    public MutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getData() {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }

    public void setData(String name,int age) {
        this.name = name;
        this.age = age;
    }
}

class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getData() {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    /* 
    public void setData(String name,int age) {
        this.name = name;
        this.age = age;
    }*/
    //Since it is immutable it cannot be overwritten.  
}

public class MutableAndImmutable {
    public static void main(String[] args) {
        // Mutable object
        MutablePerson mutablePerson = new MutablePerson("John", 30);
        System.out.println("Mutable person before modification: " + mutablePerson);
        mutablePerson.setData("Candy",24);
        System.out.println("Mutable person after modification: " + mutablePerson);

        // Immutable object
        ImmutablePerson immutablePerson = new ImmutablePerson("Alice", 40);
        System.out.println("Immutable person: " + immutablePerson);
    }
}
