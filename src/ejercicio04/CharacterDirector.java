package ejercicio04;

// El Director conoce arquetipos predefinidos y los arma con el Builder.
public class CharacterDirector {
    public Character crearGuerreroElite(WarriorBuilder builder) {
        return builder.setArmor("platino").setWeapon("mandoble").setSkill("furia").build();
    }
}
