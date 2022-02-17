package 총3;

public class GunTest {
    public static void main(String[] args) {
        Gun gun1 = new HandGun("K-5");
        Gun gun2 = new MachineGun("K-6");

        gun1.showInfo();
        gun2.showInfo();

        Gunner child = new Gunner("문", 13);
        Gunner gunner1 = new Gunner("문", 23);
        Gunner gunner2 = new Gunner("김", 29);

        child.shoot(gun1,4);
        gunner1.shoot(gun1,3);
        gunner2.shoot(gun1,9);
        gunner2.refillBullet(gun1, 11);

        gunner1.shoot(gun2,7);
        gunner2.shoot(gun2,10);
        gunner2.refillBullet(gun2, 10);
    }
}


