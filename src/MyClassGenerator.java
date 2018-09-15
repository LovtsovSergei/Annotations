public class MyClassGenerator implements Generator<MyClass> {
    @Override
    public MyClass generate() {
        return new MyClass();
    }
}
