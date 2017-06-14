package ly.cite.app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by alecca on efter Kristus 2017-06-14.
 */

public class CitelyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
    }
}
