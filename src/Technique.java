public abstract class Technique {
    private int id;
    private String name;
    private int year;
    private String model;

    public abstract  void oil();
    public abstract void  capacity();

    public Technique(int id, String name, int year, String model) {
        this.id = id;
        if (!name.equals(name.toUpperCase())){
            System.out.println("Баардыгын чон тамга менен жазыныз ");
        }else {
            this.name = name;
        }
        if (year<2018){
            System.out.println("Technigue эски жанысын алып келиниз  ");
        }else {
            this.year = year;
        }
        this.model = model;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nname='" + name + '\'' +
                "\nid=" + id +
                ",\nyear=" + year +
                ",\n model='" + model + '\'' +
                "\n-----------------------------";
    }
}
