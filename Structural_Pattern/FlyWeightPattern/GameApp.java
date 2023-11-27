package Structural_Pattern.FlyWeightPattern;

import java.time.Duration;
import java.util.*;

public class GameApp {

    private static List<ISoldier> soldiers = new ArrayList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Yuri", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context star = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
            ISoldier soldier = SoldierFactory.createSoldier(soldierName);
            soldier.promote(star);
            soldiers.add(soldier);
        }
    }
} 

//Như bạn thấy, chúng ta đã tạo ra 15 soldier chỉ với 6 giây (do chỉ tạo 2 lần ứng với 2 loại Yuri và Spy, mỗi loại mất 3 giây).
// Nếu không sử dụng Flyweight mà tạo từng soldier riêng lẻ, chúng ta sẽ mất đến 45 giây (do mỗi soldier mất 3 giây và có tất cả 15 soldier).