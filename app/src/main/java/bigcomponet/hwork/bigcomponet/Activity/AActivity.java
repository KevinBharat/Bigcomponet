package bigcomponet.hwork.bigcomponet.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import bigcomponet.hwork.bigcomponet.R;

public class AActivity extends AppCompatActivity {
    Button btnnext;
    public static  String TAG = "AActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aactivity);
        btnnext=findViewById(R.id.btn_next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AActivity.this,BActivity.class);
                startActivity(i);
            }
        });
        Log.e(TAG, "onCreate: " );
    }
     @Override
     protected void onStart(){
        super.onStart();
        Log.e(TAG, "onStart: " );
    }
    protected void onRestart(){
        super.onRestart();
        Log.e(TAG,"onRestart");
    }
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume");
    }
    protected  void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.e(TAG,"onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG,"onDestroy");
    }
}