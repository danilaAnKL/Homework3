package Homework3;

public class Exercise6 {
    public static void main(String[] args) {

        String[] Player = new String[10];

        Player[0] = "Jack";
        Player[1] = "Emily";
        Player[2] = "Michael";
        Player[3] = "Sarah";
        Player[4] = "William";
        Player[5] = "Jessica";
        Player[6] = "James";
        Player[7] = "Amanda";
        Player[8] = "David";
        Player[9] = "Ashley";

// Цикл с выводом первым трех игроков

        for (int Players = 0; Players < 3; Players++) {
            System.out.println(Player[Players]);
        }


    }
}
