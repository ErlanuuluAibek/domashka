import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       Aparrot volinstyi=new Aparrot();
       volinstyi.setType("Волнистый");
       volinstyi.setColor("Красный");
       volinstyi.setRost(21);
       volinstyi.setVes(45);
       volinstyi.informationvolisty();
        System.out.println();

       Aparrot jako=new Aparrot();
       jako.setType("Jako");
       jako.setColor("Серый");
       jako.setRost(35);
       jako.setVes(400);
       jako.informationJako();
        System.out.println();

        Aparrot kakadu=new Aparrot();
        kakadu.setType("Какаду");
        kakadu.setColor("белый");
        kakadu.setRost(45);
        kakadu.setVes(600);
        kakadu.informationKakadu();

        Fish sazan=new Fish();
        sazan.setType("Сазан");
        sazan.setColor("Золотисто-желтый");
        sazan.setHeight(100);
        sazan.setWeight(25);
        sazan.informationSazan();
        System.out.println();


        Fish swordfish=new Fish();
        swordfish.setType("Рыба меч");
        swordfish.setColor("темно-коричневый");
        swordfish.setHeight(4);
        swordfish.setWeight(250);
        swordfish.informationSwordfish();

        Dog sibaInu=new Dog();
        sibaInu.setType("Сиба-ину");
        sibaInu.setColor("Желтый");
        sibaInu.setAge(12);
        sibaInu.setRost(38);
        sibaInu.informationSibaInu();
        System.out.println();

        Dog haski=new Dog();
        haski.setType("Северный хаски");
        haski.setColor("серый");
        haski.setAge(10);
        haski.setRost(50);
        haski.informationHaski();
        System.out.println();
          Dog chauchau=new Dog();
          chauchau.setType("Чау-Чау");
          chauchau.setColor("светло-оранжевый");
          chauchau.setRost(49);
          chauchau.setAge(12);
          chauchau.informationChauChau();
        System.out.println();
      Cat snouShi=new Cat();
      snouShi.setType("Сноу Шу");
        snouShi.setColor("Синий");
        snouShi.setAge(14);
        snouShi.setWeight(4);
        snouShi.informationsnouShi();
        System.out.println();
        Cat shinShila=new Cat();
        shinShila.setType("Шиншила");
        shinShila.setColor("Белый");
        shinShila.setAge(10);
        shinShila.setWeight(5);
        shinShila.informationShinshila();
    }
}