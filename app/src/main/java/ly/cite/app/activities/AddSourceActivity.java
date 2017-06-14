package ly.cite.app.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ly.cite.app.R;
import ly.cite.app.fragments.AddSourceFragment;

public class AddSourceActivity extends AppCompatActivity implements AddSourceFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_source);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
