package se.aaslin.android.place;

import se.aaslin.android.activity.ActivityMapper;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class PlaceController {
	
	ActivityMapper activityMapper;
	
	public PlaceController(ActivityMapper activityMapper) {
		this.activityMapper = activityMapper;
	}

	public void goTo(Context context, Place place) {
		Class<? extends Activity> activityClass = activityMapper.getActivity(place);
		Intent intent = new Intent(context, activityClass);
		context.startActivity(intent);
	}
}
