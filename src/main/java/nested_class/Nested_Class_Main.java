package nested_class;

public class Nested_Class_Main {
    public static void main(String[] args) {
        Inner_Class dogOuter = new Inner_Class("dog", 2, "WoawOuter");
        //Inner_Class.Inner_Class_in perroInner = new Inner_Class.Inner_Class_in("WoawInner"); //Compilation error.
        dogOuter.makeSound();

        Inner_Class.Inner_Class_in dogInner = dogOuter.new Inner_Class_in("WoawInner");
        dogInner.makeSoundInner();

        Inner_Class.StaticInnerClass dogStaticInner = new Inner_Class.StaticInnerClass("WoauStaticInner");
        dogStaticInner.makeSoundStaticInner();

        Inner_Class_II ds = new Inner_Class_II();
        System.out.println("Inner_Class_II print even index elements.");
        ds.printEven();

    }
}
