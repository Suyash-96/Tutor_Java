package app.school.tutor_java;

import android.view.View;

public class Utils {
    public static void enableViews(View... views) {
        for (View v : views) {
            v.setEnabled(true);
        }
    }

    public static void disableViews(View... views) {
        for (View v : views) {
            v.setEnabled(false);
        }
    }

    public static void visibleViews(View... views) {
        for (View v : views) {
            v.setVisibility(View.VISIBLE);
        }
    }

    public static void goneViews(View... views) {
        for (View v : views) {
            v.setVisibility(View.GONE);
        }
    }
}
