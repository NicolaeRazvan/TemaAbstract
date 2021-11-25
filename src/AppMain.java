public class AppMain {
    public static void main(String[] args) {
        //------------------------------------------------//
        Dog dg1 = new Dog();
        dg1.playing();
        dg1.growl();

        Cat ct1 = new Cat();
        ct1.scratching();
        ct1.purrrrrrs();
        //Animal extension ^//
        System.out.println("---------------");
        Woman wm1 = new Woman();
        wm1.aww();
        wm1.eww();

        Man mn1 = new Man();
        mn1.bargain();
        mn1.petting();
        //Adopter extension ^//
        System.out.println("---------------");
        Bag bg1 = new Bag();
        bg1.bagWeight();
        bg1.qualityOfFood();

        Can cn1 = new Can();
        cn1.cold();
        cn1.hot();
        //AnimalFood extension
        System.out.println("---------------");
        Veteran vt1 = new Veteran();
        vt1.notSoHard();
        vt1.magicTouch();

        Newbie nb1 = new Newbie();
        nb1.notSoGood();
        nb1.experienceLevelUp();
        System.out.println("---------------");

        //Tema Abstract
        ct1.talkie();
        dg1.talkie();
        //^From Animal extesion
        System.out.println("---------------------");
        mn1.preference();
        wm1.preference();
        //^From Adopter extension
        System.out.println("---------------------");
        nb1.workTime();
        vt1.workTime();
        //^From VeterinaryMedic extension
    }
}
