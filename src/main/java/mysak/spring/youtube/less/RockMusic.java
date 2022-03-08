package mysak.spring.youtube.less;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public void getSong() {
        System.out.println("Rock music playing");
    }
}
