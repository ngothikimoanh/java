package variable;

public class Object {
    public static void main(String[] args) {
        // kiểu String
        String oanh = "KIM OANH";
        oanh.toString();
        System.out.println(oanh.toString());
        // kiểu class
        Person p = new Person("John", "nam", 20);
        System.out.println(p);
    }

    public static class Person {
        protected String name;
        protected String sex;
        protected int age;

        public Person() {
        }

        public Person(String name, String sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return "Person: name = " + name + ", sex = " + sex + ", age = " + age ;
        }

    }
}
