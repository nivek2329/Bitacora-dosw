package ejercicio09;

public class ScheduleValidator extends Validator {
    @Override
    protected boolean check(Credentials c) {
        return c.getHoraSolicitud() >= 6 && c.getHoraSolicitud() <= 22;
    }
}
