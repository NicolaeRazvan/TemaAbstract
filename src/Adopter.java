public abstract class Adopter {
    private String name;
    private double money;

    public void print(){
        System.out.println("name: " + name +", money:" + money);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract void preference();

}
