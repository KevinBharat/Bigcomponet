package bigcomponet.hwork.bigcomponet.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import bigcomponet.hwork.bigcomponet.BaseAdapter.SpinnerAdapter;
import bigcomponet.hwork.bigcomponet.Model.SpinnerModel;
import bigcomponet.hwork.bigcomponet.R;

public class CustomSpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    TextView tvSpinner;
    String strLang[] = {"India","pakistan","napal","Bhutan"};
    int imgLang[]={R.drawable.india,R.drawable.pakistan,R.drawable.napal,R.drawable.bhutan};
    ArrayList<SpinnerModel>spinnerModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner_activity);
        spinner=findViewById(R.id.spinner);
        spinnerModelArrayList=new ArrayList<SpinnerModel>();
        for (int i=0;strLang.length>i;i++){
            SpinnerModel spinnerModel=new  SpinnerModel(strLang[i],imgLang[i]);
            spinnerModelArrayList.add(spinnerModel);
        }
        SpinnerAdapter spinnerAdapter=new SpinnerAdapter(this,spinnerModelArrayList);
        spinner.setAdapter(spinnerAdapter);
    }
}