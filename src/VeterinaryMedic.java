public abstract class VeterinaryMedic {
    private String name;
    private String specialization;

    public void print(){
        System.out.println("name: " +name +", specialization: " +specialization);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public abstract void workTime();
}
