package mysak.spring.youtube.less;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println("Id: " + computer.getId());
        System.out.println("PC name: " + computer.getName());

        computer.playMusic();

    }
}
