package bigcomponet.hwork.bigcomponet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import bigcomponet.hwork.bigcomponet.Fragment.AFragment;
import bigcomponet.hwork.bigcomponet.Fragment.BFragment;
import bigcomponet.hwork.bigcomponet.R;

public class FragmentLodeActivity extends AppCompatActivity {
Button btn_a,btn_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_lode);
        btn_a = findViewById(R.id.b);
        btn_b = findViewById(R.id.b);
        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AFragment aFragment = new AFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.ferame,aFragment);
                fragmentTransaction.commit();
            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BFragment bFragment = new BFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.ferame,bFragment);
                fragmentTransaction.commit();
            }
        });
    }
}