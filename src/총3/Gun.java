package 총3;

public abstract class Gun {
    private String gunName;
    private int maxBulletNum;
    private int bulletNum;

    public String getGunName() {
        return gunName;
    }
    public void setGunName(String gunName) {
        this.gunName = gunName;
    }


    public Gun(String gunName) {
        this.gunName = gunName;
    }


    public abstract void GunSound();
    public abstract int getMaxBulletNum();
    public abstract int getBulletNum() ;
    public abstract void setBulletNum(int bulletNum) ;
    public abstract void showInfo();
}
