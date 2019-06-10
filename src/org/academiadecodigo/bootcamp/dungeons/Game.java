package org.academiadecodigo.bootcamp.dungeons;
import org.academiadecodigo.bootcamp.dungeons.character.ReturningAttackValues;
import org.academiadecodigo.bootcamp.dungeons.character.enemy.EnemyFactory;
import org.academiadecodigo.bootcamp.dungeons.character.player.PlayerClasses;
import org.academiadecodigo.bootcamp.dungeons.character.player.PlayerSkills;
import org.academiadecodigo.bootcamp.dungeons.character.player.Player;
import org.academiadecodigo.bootcamp.dungeons.character.enemy.Enemy;
import org.academiadecodigo.bootcamp.dungeons.keyboard.GameKeyboardHandler;

import java.util.LinkedList;

public class Game {

    private Player player;
    private LinkedList<PlayerSkills> playerPossibleSpellsList;


    public Game(){

        init();
    }


    public void init(){

        player = new Player (PlayerClasses.WARRIOR);
        GameKeyboardHandler gameKeyboardHandler = new GameKeyboardHandler(this);

      //  createPlayerPossibleSkillsList();        //store all possible player skills in a list
    }


    public void start(){

        while (player.getHealthPoints() >= 0){

            System.out.println("Creating new enemy");
            System.out.println("Current experience: " + player.getExperience());

            battle(EnemyFactory.createEnemy()); //battle returns true if player defeats the enemy
                                                       //or false if he flees
                                       //he only gets a chance for loot if he doesn't flee


           // if ("player chooses to rest"){

             //   if (!player.rest()){ //if rest is not successful generate elite battle
              //      battle(EnemyFactory.createEliteEnemy()); //monster with random skills and higher stats
               // }
            //}
        }
    }


    private void battle(Enemy enemy){

        ReturningAttackValues damage;

        while (player.getHealthPoints() > 0 && enemy.getHealthPoints() > 0){

            //player.takeAction();
            System.out.println("Player attacking");
            damage = player.attack();
            enemy.calculateDamageTaken(damage);


            if (enemy.getHealthPoints() > 0) { //enemy attack method returns a ReturningAttackValues object

                System.out.println("Enemy attacking");
                damage = enemy.attack();        //which contains damage dealt and damage type

                player.calculateDamageTaken(damage);
                            //after that we pass those values to player calculateDamageTaken()
            }

        }

        if (player.getHealthPoints() <= 0){
            gameOver();
        }
// TODO: 10/06/2019 only generateLoot if player doesnt flee

        generateLoot(enemy.getExperience());
    }


    private void createPlayerPossibleSkillsList(){

        for (PlayerSkills skill : PlayerSkills.values()) {
            playerPossibleSpellsList.add(skill);
        }
    }


    private void generateLoot(int experience){
        player.gainExperience(experience);
    }

    private void gameOver(){
        System.exit(0);
    }
}
