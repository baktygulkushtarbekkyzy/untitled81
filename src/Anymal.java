public abstract class Anymal {
    private int id;
    private String name;
    private int age;
    private int weight;
    private boolean domesticAnymal;

    public abstract void run();
    public abstract void eats();
    public abstract void Helive();

    public Anymal(int id, String name, int age, int weight, boolean domesticAnymal) {
        this.id = id;
        if (name.length()<2){
            System.out.println("Аты 2 тамгадан жогору болушу зарыл ");
        }else {
        this.name = name;
        }
        if (age<0){
            System.out.println("Жаштарын терс сан менен берууго болбойт ");
        }else {
            this.age = age;
        }
        this.weight = weight;
        this.domesticAnymal = domesticAnymal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDomesticAnymal() {
        return domesticAnymal;
    }

    public void setDomesticAnymal(boolean domesticAnymal) {
        this.domesticAnymal = domesticAnymal;
    }

    @Override
    public String toString() {
        return
                "\nname='" + name + '\'' +
                        "\nid=" + id +
                ", \nage=" + age +
                ", \nweight=" + weight +
                ", \ndomesticAnymal=" + domesticAnymal +
                "\n------------------------------------";
    }
}
