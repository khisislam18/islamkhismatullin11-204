public class Car  implements Comparable<Object>{
    private int year;
    private String model;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
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
    public int compareTo(Object o) {
        return 0;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "year=" + year +
//                ", model='" + model + '\'' +
//                '}';
//    }
}
