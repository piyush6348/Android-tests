package practice.tests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by piyush on 2/10/17.
 */

import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class MainActivityUITests {
    MainActivity mainActivity;

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void creatingActivity(){
        mainActivity = activityActivityTestRule.getActivity();
    }
    @Test
    public void calcFareRunOnUIThread(){
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

                ((EditText)mainActivity.findViewById(R.id.et_dist)).setText("0");
                ((EditText)mainActivity.findViewById(R.id.et_min)).setText("0");
                ((Button)mainActivity.findViewById(R.id.btn_calc)).performClick();

                String result = ((TextView) mainActivity.findViewById(R.id.tv_fare)).getText().toString();
                assertEquals("50.0",result);
            }
        });
    }
}
