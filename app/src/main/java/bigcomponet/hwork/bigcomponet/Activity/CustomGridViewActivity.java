package bigcomponet.hwork.bigcomponet.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import bigcomponet.hwork.bigcomponet.BaseAdapter.GridBaseAdapter;
import bigcomponet.hwork.bigcomponet.Model.GridModel;
import bigcomponet.hwork.bigcomponet.R;

public class CustomGridViewActivity extends AppCompatActivity {
GridView gridView;
    String strLang[] = {"Android","Java","PHP","C","C++","IOS","Python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.ic_java,R.drawable.ic_php,
            R.drawable.ic_c,R.drawable.ic_cc,
            R.drawable.ic_ios,R.drawable.ic_php};
    ArrayList<GridModel> GridModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);
        gridView=findViewById(R.id.grid_view);

        GridModelArrayList = new ArrayList<>();
        for (int i = 0; strLang.length >i ; i++){

            GridModel gridModel = new GridModel(strLang[i],imgLang[i]);
            GridModelArrayList.add(gridModel);

        }
        GridBaseAdapter gridBaseAdapter=new GridBaseAdapter(this,GridModelArrayList);
        gridView.setAdapter(gridBaseAdapter);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(CustomGridViewActivity.this, "Data is "+GridModelArrayList.get(i).getStrLang(),
                            Toast.LENGTH_SHORT).show();
                }
            });

    }
}