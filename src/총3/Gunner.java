package 총3;

public class Gunner {

        private String name;
        private int age;
        private int shot;

        public Gunner(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void shoot(Gun gun, int shot){
            if (shot > gun.getMaxBulletNum()){
                System.out.println(gun.getGunName() + "의 최대 격발 수는 " + gun.getMaxBulletNum() + "입니다.");
                System.exit(0);
            }
            else{
                gun.setBulletNum( gun.getBulletNum() );
            }

            if (this.age>=20){
                System.out.println(name + "씨가 " + gun.getGunName() + " 총을 쏩니다.");

                while( shot != 0){
                    if (gun.getBulletNum()==0) {
                        System.out.println("총알이 "+ (shot - gun.getBulletNum()) +"개 부족합니다. 장전해주세요.");
                        break;
                    }

                    gun.GunSound();
                    shot--;
                    gun.setBulletNum( gun.getBulletNum() - 1  );
                }
            }
            else{
                System.out.println("미성년자는 시격이 불가능합니다.");
            }
            System.out.println("현재 남은 총알은 "+gun.getBulletNum()+"개 입니다.");
            System.out.println("-----------------");
        }

        public void refillBullet(Gun gun, int shot){
            System.out.println(name+ "씨가 " +gun.getGunName()+ " 총에 " +shot+"개의 총알 장전을 원합니다");
            while( shot != 0){
                if (gun.getBulletNum() == gun.getMaxBulletNum()) {
                    System.out.println("탄창에 최대 "+gun.getMaxBulletNum()+"개의 총알이 저장 가능합니다. "+ shot +"개의 총알이 남습니다.");
                    break;
                }
                shot--;
                gun.setBulletNum( gun.getBulletNum() + 1 );
            }

            System.out.println("현재 남은 총알은 "+gun.getBulletNum()+"개 입니다.");
            System.out.println("-----------------");
        }
}



/*
//
//


우남
1. o
2. ㅌ,


종학
1. x o x
2.


*/
