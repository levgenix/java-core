package ru.itsinfo.module3.Task_3_3_13;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot(Direction.UP, 5, 12);
        moveRobot(r1, 3, 4);
        System.out.println(r1.getDirection() + " : " + r1.getX() + " : " + r1.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX) {
            int deltaX = toX - robot.getX();
            switch (robot.getDirection()) {
                case UP:
                    if (0 < deltaX) robot.turnRight();
                    else robot.turnLeft();
                    break;
                case RIGHT:
                    if (0 > deltaX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case DOWN:
                    if (0 < deltaX) robot.turnLeft();
                    else robot.turnRight();
                    break;
                case LEFT:
                    if (0 < deltaX) {
                        robot.turnRight();
                        robot.turnRight();
                    }
            }
            for (int i = 0; i < Math.abs(deltaX); i++) robot.stepForward();
        }
        if (robot.getY() != toY) {
            int deltaY = toY - robot.getY();
            switch (robot.getDirection()) {
                case UP:
                    if (0 > deltaY) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case RIGHT:
                    if (0 < deltaY) robot.turnLeft();
                    else robot.turnRight();
                    break;
                case DOWN:
                    if (0 < deltaY) {
                        robot.turnRight();
                        robot.turnRight();
                    }
                    break;
                case LEFT:
                    if (0 < deltaY) robot.turnRight();
                    else robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(deltaY); i++) robot.stepForward();
        }
    }
}
