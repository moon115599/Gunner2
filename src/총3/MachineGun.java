package 총3;

public class MachineGun extends Gun {

    private final int maxBulletNum = 15;
    private int bulletNum = maxBulletNum;

    @Override
    public int getMaxBulletNum() {
        return maxBulletNum;
    }
    public int getBulletNum() {
        return bulletNum;
    }
    public void setBulletNum(int bulletNum) {
        this.bulletNum = bulletNum;
    }



    public MachineGun(String gunName) {
        super(gunName);
    }

    @Override
    public void GunSound() {
        System.out.println("드르르륵!");
    }
    public void showInfo(){
        System.out.println(getGunName()+ "총은 최대 "+maxBulletNum+"발 사격이 가능합니다.");
    };


}
