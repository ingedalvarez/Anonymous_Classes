package nested_class.Anonymous_Classes;

public class Anonymous_Class {
    private final String nombre = "Campo de la clase";
    public static void main(String[] args) {
        Anonymous_Class myApp = new Anonymous_Class();
        myApp.sayHello();
    }
    interface HelloWorld{
        void greed();
        void greedSomeOne(String name);
        }

        public void sayHello(){
        HelloWorld frenchGreed = new HelloWorld() {
            @Override
            public void greed() {
                System.out.println("salut monde");

            }

            @Override
            public void greedSomeOne(String name) {
                System.out.println("salut monde "+name);

            }
        };
            HelloWorld spanishGreed = new HelloWorld() {
                @Override
                public void greed() {
                    System.out.println("Hola mundo");
                }

                @Override
                public void greedSomeOne(String name) {

                    System.out.println("Hola mundo "+name);
                }
            };



        frenchGreed.greed();
        frenchGreed.greedSomeOne("Edward");
        frenchGreed.greedSomeOne(nombre);
        spanishGreed.greed();
        spanishGreed.greedSomeOne("Yolecy");
        spanishGreed.greedSomeOne(nombre);


        }


}
