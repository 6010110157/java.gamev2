import java.io.*;
import java.util.*;
public class Novice
{
    private int level;
    private int maxhp;
    public int hp; 
    private int exp;
    private int money;
    private String nameclass;

    public Novice()
    {
        level=9;
        maxhp=50;
        hp=maxhp;
        exp= 0;
        money=0;
        nameclass="Novice";
    }    
    public void attack() 
    {   exp = exp + 8;
        hp = hp - 10;
        money = money+15;
        if (exp >= 10)
        {   
            level = level+1;
            maxhp =maxhp+50 ;
            exp = 0;
        }   
    }
   
    public void heal()
    { 
         hp = hp + 10;
         money=money-10;
        if(hp > 100)
        {
                hp = 100;            
        }
    } 
    public int getLevel(){
        return level;
    }
    public int getMoney(){
        return money;
    }
    public int getExp(){
        return exp;
    }
    public int getHp(){
        return hp;
    }
    public void usepotion(int i){
        hp += i;
    }
    public void setNewclass(int hpclass,int levelclass,String newclass,int moneyclass){
        hp= hpclass;
        level= levelclass;
        nameclass = newclass;
        money+=moneyclass;

    }
    public String nameClasss(){
        return nameclass;
    }

}