package madhu.psg.try2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends ActionBarActivity implements OnClickListener{
    Button b = null;
    TextView tv = null;
   // ImageView Iv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.my_button);
        tv =(TextView)findViewById(R.id.my_text);
       // Iv =(ImageView)findViewById(R.id.my_back);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        MainActivity.this.startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
  /*  public void goToSo (View view) {
        goToUrl("http://www.psgdesigndata.org/");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }*/
}
