package pl.pjatk.JakZur.Zajecia2;

public class Pojo {
    private String s;

    public Pojo(String s) {
        this.s = s;
        sayHi();
    }

    public void sayHi() {
        System.out.println("Hi"+s);
    }

}
