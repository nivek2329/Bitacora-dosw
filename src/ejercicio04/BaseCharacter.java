package ejercicio04;

public class BaseCharacter implements Character {
    private final String tipo;
    private final String armor;
    private final String weapon;
    private final String skill;

    public BaseCharacter(String tipo, String armor, String weapon, String skill) {
        this.tipo = tipo;
        this.armor = armor;
        this.weapon = weapon;
        this.skill = skill;
    }

    @Override
    public String attack() {
        return tipo + " ataca con " + weapon + " (armadura: " + armor + ", habilidad: " + skill + ")";
    }
}
