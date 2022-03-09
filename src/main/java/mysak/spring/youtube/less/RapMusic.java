package mysak.spring.youtube.less;

import org.springframework.stereotype.Component;

//@Component
public class RapMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Rap music playing");
    }
}
