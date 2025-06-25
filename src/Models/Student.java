package Models;

public class Student {
    private String id;
    private String name;
    private String marks;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getMarks() {
        return marks;
    }


    public Student(){

    }
    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.marks = builder.marks;
    }

    public static class Builder{
        private String id;
        private String name;
        private String marks;

        public Builder setId(String id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setMarks(String marks){
            this.marks = marks;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }
}
