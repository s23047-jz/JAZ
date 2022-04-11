package pl.pjatk.JakZur.Components;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class ThirdComponent {

    private ApplicationContext applicationContext;

    public ThirdComponent(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        createComponents();
    }
    public void createComponents() {
        FirstComponent firstComponent = applicationContext.getBean("firstComponent", FirstComponent.class);
        SecondComponent secondComponent = applicationContext.getBean("secondComponent", SecondComponent.class);
        firstComponent.printNameAndMethod();
        secondComponent.printNameAndMethod();
    }
}
