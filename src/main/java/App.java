import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld anotherHelloWorldBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat anotherCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(helloWorldBean == anotherHelloWorldBean);
        System.out.println(cat == anotherCat);
        applicationContext.close();
    }
}