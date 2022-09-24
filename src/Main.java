public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        // Задание 1
        System.out.println("      НАКОПЛЕНИЯ ВАСИЛИЯ");
        double totalContributionVasil = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f",totalContributionVasil) + " рублей." );
        int z = 1;
        for (; totalContributionVasil <= 12_000_000; z++) {
            totalContributionVasil = totalContributionVasil + totalContributionVasil*0.07;
            System.out.println("Месяц " + z + " ,сумма накоплений Василия равна "
                    + String.format("%.2f", totalContributionVasil) + " рублей.");
        }
        // Задание 2
        System.out.println("      СОКРАЩЁННЫЙ ОТЧЁТ О НАКОПЛЕНИЯХ ВАСИЛИЯ");
        double totalContributionVasilS = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f",totalContributionVasilS) + " рублей." );
        int x = 1;
        for (; totalContributionVasilS <= 14_000_000; x++) {
            totalContributionVasilS = totalContributionVasilS + totalContributionVasilS*0.07;
            if( x % 6 == 0) {
                System.out.println("Месяц " + x + " ,сумма накоплений Василия равна "
                        + String.format("%.2f", totalContributionVasilS) + " рублей.");
            }

        }
        // Задание 3
        System.out.println("      ВКЛАД ВАСИЛИЯ НА БЛИЖАЙШИЕ 9 ЛЕТ.");
        double totalContributionVasilN = 15_000;
        System.out.println("      Первоначальные накопления Василия "
                + String.format("%.2f",totalContributionVasilN) + " рублей." );
        int b = 1;
        for (; b <= 108; b++) {
            totalContributionVasilN =totalContributionVasilN + totalContributionVasilN * 0.07;
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + " ,сумма накоплений Василия равна "
                        + String.format("%.2f", totalContributionVasilN) + " рублей.");
            }
        }
        // Задания 4
        System.out.println("ОТЧЁТНАЯ ПЯТНИЦА");
        int Friday = 7;
        for (; Friday <= 31; Friday++) {
            if (Friday % 7 == 0) {
                System.out.println("Сегодня пятница," + Friday + "-е число. Необходимо подготовить отчет.");
            }
        }



        System.out.println(" Накопления + проценты по вкладу,цель накопить 2_459_000 рублей.");
        int contribution = 15_000;
        double totalContribution = 0;
        int a = 1;
        for (; totalContribution <= 2_459_000; a++) {
            totalContribution = totalContribution + totalContribution / 100;
            totalContribution = totalContribution + contribution;
            System.out.println("Месяц " + a + " ,сумма накоплений равна "
                    + String.format("%.2f", totalContribution) + " рублей.");
        }



        }







    }
