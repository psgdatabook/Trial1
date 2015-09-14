package madhu.psg.try2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Spinner;


public class Activity3 extends ActionBarActivity {
    Spinner sp = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        sp = (Spinner)findViewById(R.id.Materials);
        sp.setOnTouchListener(new OnTouchListener(){
          public boolean onTouch(View v, MotionEvent event)
          {
              String val =sp.getSelectedItem().toString();
               if(val.equals("Materials")) {
               }
               else if(val.equals("Cores,Permanent Moulds")){
                      Intent intent = new Intent(Activity3.this, Cores.class);
                      Activity3.this.startActivity(intent);

               }
              else
               {
                   Intent intent = new Intent(Activity3.this, MainActivity.class);
              Activity3.this.startActivity(intent);}



              return false;
          }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
         automatically handle clicks on the Home/Up button, so long
        as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
