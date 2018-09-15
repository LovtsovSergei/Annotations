import java.lang.reflect.Field;

public class AnnotationAnalyzer {
    public  static void analyze(Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            DefaultValue annotation = field.getAnnotation(DefaultValue.class);
            if (annotation != null) {
                Class genClass = annotation.myClass();
                Object newGenClassInstance = genClass.newInstance();
                Object newClazzInstance = genClass.getMethod("generate").invoke(newGenClassInstance);
                field.set(object, newClazzInstance);
            }
        }
        }
    }
