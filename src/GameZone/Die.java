package GameZone;

public class Die {

    private final int HIGHEST_DIE_VALUE = 6;
    private final int LOWEST_DIE_VALUE = 1;
    private int randomValue;

    public Die()
    {
        randomValue = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }

    public int getRandomValue() {

        return randomValue;
    }
}
