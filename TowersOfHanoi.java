/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Mar 2019
 * Created for: ICS4U
 * This program shows instrcutions on how to solve the Towers of Hanoi,
 * depending on the number of discs
 *
 ****************************************************************************/

import java.util.Scanner;

public class TowersOfHanoi
{
    // This is the main function
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numDiscs = 0;
        System.out.print("How many discs? : ");

        // Obtains the number of discs
        if (scanner.hasNextInt())
        {
            numDiscs = scanner.nextInt();
        }

        // Sends the number of discs into function, as well as the three poles called A, B, and C
        moveTower(numDiscs, "A", "B", "C");
    }

    // This function shows the steps to solving the tower of hanoi
    // fromPole is the pole from which the disc moved started
    // toPole is the destination of said disc
    // withPole is the pole not being used at the moment
    public static void moveTower(int numDiscs, String fromPole, String toPole, String withPole)
    {
        if (numDiscs >= 1)
        {
            // Moves tower, with one less disc
            // Essentially removes top disc
            moveTower(numDiscs-1,fromPole,withPole,toPole);
            System.out.print("Moving disc from " + fromPole + " to " + toPole + "\n");

            // Switch fromPole and withPole and toPole
            // This means that you are taking the disc on the withPole and moving toPole, and
            // the fromPole is not being used
            moveTower(numDiscs-1,withPole,toPole,fromPole);
        }
    }
}
