package madhu.psg.try2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;


public class Cores extends ActionBarActivity {
     TableLayout t1=null;
     TableRow tr_head = null;
    Button b1 =null;
    Button b2 =null;
    Button b3=null;
    Button b4 = null;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cores);

         b1 = (Button)findViewById(R.id.b1);
         b2 = (Button)findViewById(R.id.b2);
         b3 = (Button)findViewById(R.id.b3);
         b4 = (Button)findViewById(R.id.b4);

         b1.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(Cores.this, table1.class);
                 Cores.this.startActivity(intent);
             }
         });
         b2.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(Cores.this, table2.class);
                 Cores.this.startActivity(intent);

             }
         });
         b3.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(Cores.this, table3.class);
                 Cores.this.startActivity(intent);
             }
         });
         b4.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(Cores.this, table4.class);
                 Cores.this.startActivity(intent);
             }
         });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cores, menu);
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
