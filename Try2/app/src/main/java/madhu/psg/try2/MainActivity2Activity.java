package madhu.psg.try2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import android.view.View.OnClickListener;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
public class MainActivity2Activity extends ActionBarActivity implements OnClickListener{
     EditText et=null;
    EditText et2=null;
    Button login=null;
    TextView tv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        login=(Button)findViewById(R.id.btnLogin);
        et = (EditText)findViewById(R.id.my_email);
        et2 = (EditText)findViewById(R.id.my_pwd);
        login.setOnClickListener(this);
        tv = (TextView)findViewById(R.id.my_msg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
    public void onClick(View v) {
        //get message from message box
        String mail = et.getText().toString();
        String password = et2.getText().toString();
        //check whether the msg empty or not
        DefaultHttpClient hp = new DefaultHttpClient();
        HttpResponse response=null;
        HttpPost htpost = new HttpPost("www.psgdesigndata.org/login_form");
        if (mail.length() > 0 && password.length() > 0) {
            try {
                List<NameValuePair> data = new ArrayList<NameValuePair>(3);
                data.add(new BasicNameValuePair("loginid", mail));
                data.add(new BasicNameValuePair("pwd", password));
                htpost.setEntity(new UrlEncodedFormEntity(data));

               try{

                 hp.execute(htpost);}
               catch(Exception e) {
                   tv.setText("NoneSoFar");
                }
                if (response.getStatusLine().getStatusCode() < 400) {
                    Intent intent = new Intent(MainActivity2Activity.this, MainActivity.class);
                    MainActivity2Activity.this.startActivity(intent);
                } else {
                    tv.setText("Failed");
                }
            }  catch (Exception e) {

            }
        }
    }
}
