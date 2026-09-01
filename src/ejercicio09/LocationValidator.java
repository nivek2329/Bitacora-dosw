package ejercicio09;

public class LocationValidator extends Validator {
    @Override
    protected boolean check(Credentials c) {
        return !c.getUbicacion().equalsIgnoreCase("pais_no_permitido");
    }
}
