import java.util.Arrays;

public class Person {
    private int id;
    private String name;
    private int age;
    private String anymal;
    private String technique;

    public Person(int id, String name, int age, String anymal, String technique) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.anymal = anymal;
        this.technique = technique;
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

    public String getAnymal() {
        return anymal;
    }

    public void setAnymal(String anymal) {
        this.anymal = anymal;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                "\nid=" + id +
                ", \nage=" + age +
                ",\n Жаныбарлары: ='" + anymal + '\'' +
                ",\n Техникалары: ='" + technique + '\'' +
                '}';
    }
    //    public Person(int id, String name, int age, Anymal [] anymal, Technique [] technique) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.anymal = anymal;
//        this.technique = technique;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Anymal[] getAnymal() {
//        return anymal;
//    }
//
//    public void setAnymal(Anymal[] anymal) {
//        this.anymal = anymal;
//    }
//
//    public Technique[] getTechnique() {
//        return technique;
//    }
//
//    public void setTechnique(Technique[] technique) {
//        this.technique = technique;
//    }
//
//    @Override
//    public String toString() {
//        return " Person : " +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                "\nAsan дын жаныбарлары: "+
//                ",\n anymal=" + Arrays.toString(anymal) +
//                ",\n technique=" + Arrays.toString(technique) +
//                '}';
    }

