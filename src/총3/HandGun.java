package 총3;

public class HandGun extends Gun {

    private final int maxBulletNum = 10;
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


    public HandGun(String gunName) {
        super(gunName);
    }
    @Override
    public void GunSound() {
        System.out.println("탕!");
    }
    public void showInfo(){
        System.out.println(getGunName()+ "총은 최대 "+maxBulletNum+"발 사격이 가능합니다.");
    };

}
