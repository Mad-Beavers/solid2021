package pl.zzpj2021.solid.ocp.usa.solution;



public class ALSpeedLimitFine extends USASpeedLimitFines {
    private static final int AL_MAX_SPEED = 0;

    @Override
    double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > AL_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
