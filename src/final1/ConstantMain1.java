package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("max users : " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("currentUserCount : " + currentUserCount);
        if (currentUserCount >= Constant.MAX_USERS) {
            System.out.println("on waitinglist");
        } else {
            System.out.println("play game");
        }
    }
}
