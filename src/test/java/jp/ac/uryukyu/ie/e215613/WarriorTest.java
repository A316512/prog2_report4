package jp.ac.uryukyu.ie.e215613;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test void attackWithWeponSkillTest(){
        int attack= 100;
        int beforeHp = 1000;
        Warrior demoHero = new Warrior("デモ勇者2", 1, attack);
        Enemy slime = new Enemy("スライムもどき", beforeHp, 1);
        for(int count=0; count<3; count++){
            beforeHp = slime.hitPoint;
            demoHero.attackWithWeponSkill(slime); 
            assertEquals(beforeHp - attack*1.5, slime.hitPoint);
        }
        
    }
    
}
