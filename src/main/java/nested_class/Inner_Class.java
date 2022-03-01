package nested_class;

public class Inner_Class {
    private String animal;
    private Integer age;
    private String sound;

    public Inner_Class(String animal, Integer age, String sound) {
        this.animal = animal;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println("in the OUTER class the animal "+animal+" make: "+sound);

    }

    class Inner_Class_in{
        private String soundIn;

        public Inner_Class_in(String soundIn) {
            this.soundIn = soundIn;
        }

        public void makeSoundInner(){
            System.out.println("in the INNER class the animal "+animal+" make: "+soundIn);
        }
    }

    static class StaticInnerClass{
        private String soundStaticIn;

        public StaticInnerClass(String soundStaticIn) {
            this.soundStaticIn = soundStaticIn;
        }
        public void makeSoundStaticInner(){
            System.out.println("in the INNER STATIC class the animal (static nested class cannot refer directly to instance variables or methods defined in its enclosing class) make: "+soundStaticIn);
        }

    }

}
