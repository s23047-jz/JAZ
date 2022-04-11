package pl.pjatk.JakZur.Components;

import org.springframework.stereotype.Component;

//@Component
public class SecondComponent {

    public SecondComponent(FirstComponent firstComponents) {
        System.out.println("Second");
        firstComponents.worksVoidForSecond();
    }
    public void printNameAndMethod() {
        System.out.println("SecondComponent PrintNameAndMethod");
    }
}
