public abstract class Animal {
    private String name ;
    private byte age;
    private byte healthStatus;
    private byte hungerLevel;
    private byte spirit;
    private String favouriteFood;
    private String favouriteActivity;

    public void print(){
        System.out.println("name: " +name + ", age:" + age + ", healthStatus:" +healthStatus + ", hungerLevel" + hungerLevel + ", spirit:" +spirit + ", favouriteFood:" +favouriteFood + ", favouriteActivity:" + favouriteActivity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setHealthStatus(byte healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setHungerLevel(byte hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setSpirit(byte spirit) {
        this.spirit = spirit;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public abstract void talkie();

}
