package se.aaslin.android.activity;

import se.aaslin.android.place.Place;
import android.app.Activity;

public interface ActivityMapper {

	Class<? extends Activity> getActivity(Place place);
}
