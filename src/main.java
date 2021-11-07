public class main {
    public static void main(String[] args){
        int initialAccount = 200;
        int replenishmentAmount = 1200;
        int percent = 100;
        int bonus = replenishmentAmount/percent;

        if (replenishmentAmount > 1000){
            bonus = replenishmentAmount/percent;
        }else {
            bonus = 0;
        }
        int check = initialAccount +replenishmentAmount + bonus;
        System.out.println(bonus);
        System.out.println(check);
        }

    }

