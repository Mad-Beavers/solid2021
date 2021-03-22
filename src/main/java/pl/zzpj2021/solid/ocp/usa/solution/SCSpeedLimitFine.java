package pl.zzpj2021.solid.ocp.usa.solution;

public class SCSpeedLimitFine extends USASpeedLimitFines {
    private static final int SC_MAX_SPEED = 0;

    @Override
    double calculateSpeedLimitFine(int speed) {
        double fine = 0;
        if (speed > SC_MAX_SPEED) {
            // calculate...
        }
        return fine;
    }
}
