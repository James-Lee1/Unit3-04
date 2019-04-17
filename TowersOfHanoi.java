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
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numDiscs = 0;
        System.out.print("How many discs? : ");

        if (scanner.hasNextInt())
        {
            numDiscs = scanner.nextInt();
        }
        moveTower(numDiscs, "A", "B", "C");
    }
    public static void moveTower(int numDiscs, String fromPole, String toPole, String withPole)
    {
        if (numDiscs >= 1)
        {
            moveTower(numDiscs-1,fromPole,withPole,toPole);
            moveDisc(fromPole,toPole);
            moveTower(numDiscs-1,withPole,toPole,fromPole);
        }
    }
    public static void moveDisc(String fp, String tp)
    {
        System.out.print("Moving disc from " + fp + " to " + tp + "\n");
    }
}
