
public class MyClass {
    int check = 42;
}

class Foo {
    public Foo() throws Exception {
       AnnotationAnalyzer.analyze(this);
    }

    @DefaultValue(myClass = MyClassGenerator.class)
    private MyClass field1;
    private MyClass field2;

    public static void main(String[] args) throws Exception {
        Foo foo = new Foo();
        System.out.println(foo.field1.check);
        System.out.println(foo.field2);

    }
}