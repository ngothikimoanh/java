package variable;

public class hang {
    public static void main(String[] args) {
        // nguyên thủy hằng
        final String name = "Ngo thi kim oanh";
        final int age = 20;
        System.out.println(name + " " + age);

        // object hằng
        final Innerhang h = new Innerhang("ngo thi kim oanh", 20);
        h.setName("oanh");
        h.setAge(21);
        System.out.println(h.getName() + " " + h.getAge());
        Innerhang h2 = h;// tham chiếu đến cùng 1 object với h
        // thay đổi nội dung
        h2.setName("Pham qui duong");
        // in ra Pham qui duong
        System.out.println(h.getName());
        System.out.println(h2.getName());

    }

    final static class Innerhang {
        private String name; // Không final
        private int age;

        public Innerhang(String name, int age) {
            this.name = name;
            this.age = age;
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

    }
}
