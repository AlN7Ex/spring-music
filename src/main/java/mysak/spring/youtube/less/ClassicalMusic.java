package mysak.spring.youtube.less;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Classic music playing");
    }
}
