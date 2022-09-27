public class MyClass {
    private int id;

    public int getId() {
        return id;
    }

    MyClass(int id) {
        this.id = id;
    }

//    @Override
//    public int compareTo(MyClass o) {
//        return this.id - o.id;
//    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                '}';
    }
}


