package Components;

public class Player {

    String name;
    String[] skills;
    boolean status;
    float health;
    float totalHealth;

    public Player(String name, String[] skills, boolean status, float health) {
        this.name = name;
        this.skills = skills;
        this.status = status;
        this.health = health;
        this.totalHealth = health;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public boolean getStatus() {
        return status;
    }

    public float getHealth() {
        return health;
    }

    public float getTotalHealth() {
        return totalHealth;
    }

    public void setStatus(boolean value) {
        status = value;
    }

    public void takeHealth(float value) {
        if (health - value > 0)
            health -= value;
        else
            health = 0;
    }

    public void giveHealth(float value) {
        if (health + value < totalHealth)
            health += value;
        else
            health = totalHealth;
    }
}
