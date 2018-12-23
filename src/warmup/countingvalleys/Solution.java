package warmup.countingvalleys;

public class Solution {

    private static final char STEP_TYPE_UPHILL = 'U';
    private static final int SEA_LEVEL_ALTITUDE = 0;

    static int countingValleys(int n, String s) {

        int altitude = 0, valleys = 0;
        boolean inTheValley = false;
        for (int pathIndex = 0; pathIndex < n; pathIndex++) {
            altitude = isStepUphill(getStepType(s, pathIndex)) ? altitude + 1 : altitude - 1;
            if (isValleyStarted(altitude) && !inTheValley) {
                valleys++;
            }
            inTheValley = !isValleyFinished(altitude);
        }
        return valleys;
    }

    private static boolean isValleyFinished(int altitude) {
        return altitude == SEA_LEVEL_ALTITUDE;
    }

    private static char getStepType(String path, int pathIndex) {
        return path.charAt(pathIndex);
    }

    private static boolean isValleyStarted(int altitude) {
        return altitude < SEA_LEVEL_ALTITUDE;
    }

    private static boolean isStepUphill(char stepType) {
        return stepType == STEP_TYPE_UPHILL;
    }

    public static void main(String[] args) {

        String path = "UDDDUDUU";
        int valleys = countingValleys(8, path);
        System.out.println("VALLEYS:" + valleys);
    }
}
