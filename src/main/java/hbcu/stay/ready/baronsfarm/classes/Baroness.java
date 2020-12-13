package hbcu.stay.ready.baronsfarm.classes;

public class Baroness extends Pilot{

    private static Baroness instance;

    private Baroness(String name, String noise, long id) {
        super(name, noise, id);
    }
}
