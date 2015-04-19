package novo.tvir.myapplication2.app;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import lombok.extern.slf4j.Slf4j;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.res.IntegerRes;

@EActivity(R.layout.activity_main)
@Slf4j
public class MainActivity extends ActionBarActivity {

    @IntegerRes(android.R.integer.config_shortAnimTime) int shortAnimTime;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        log.info("sdfsdfsdfsdf");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
