package pl.pjatk.JakZur.Components;

import org.springframework.stereotype.Component;

//@Component
public class FirstComponent {

    private SecondComponent secondComponent;

    public FirstComponent() {
        System.out.println("First");
    }

    public void worksVoidForSecond() {
        System.out.println("Works for SecondComponent");
    }

    public void printNameAndMethod() {
        System.out.println("FirstComponent PrintNameAndMethod");
    }
}
