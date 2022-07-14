package bigcomponet.hwork.bigcomponet.Desige;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import bigcomponet.hwork.bigcomponet.Model.Model;
import bigcomponet.hwork.bigcomponet.Model.MyBaseAdapter;
import bigcomponet.hwork.bigcomponet.R;

public class CustomListViewActivity extends AppCompatActivity {
    ListView listView;
    String strLang[] = {"Android","Java","PHP","C","C++","IOS","Python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.ic_java,R.drawable.ic_php,R.drawable.ic_c,R.drawable.ic_cc,
            R.drawable.ic_ios,R.drawable.ic_python};
    ArrayList<Model>modelsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        listView=findViewById(R.id.list_view);
        modelsArrayList=new ArrayList<>();
        for (int i = 0; strLang.length > i; i++) {
            Model model = new Model(strLang[i],imgLang[i]);
            modelsArrayList.add(model);
      //  modelsArrayList.add(new Model(strLang[i],imgLang[i]));
        }
        MyBaseAdapter myBaseAdapter = new MyBaseAdapter(this,modelsArrayList);
        listView.setAdapter(myBaseAdapter);

    }
}