package ejercicio04;

public class WarriorBuilder {
    private String armor = "cuero";
    private String weapon = "espada corta";
    private String skill = "ninguna";

    public WarriorBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public WarriorBuilder setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public WarriorBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public Character build() {
        return new BaseCharacter("Guerrero", armor, weapon, skill);
    }
}
