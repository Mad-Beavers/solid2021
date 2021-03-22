package pl.zzpj2021.solid.ocp.usa.solution;

public class GASpeedLimitFine extends USASpeedLimitFines {
    private static final int GA_MAX_SPEED = 0;

    @Override
    double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > GA_MAX_SPEED) {
            // calculate...
        }
        return fine;

    }
}
