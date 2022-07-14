package bigcomponet.hwork.bigcomponet.Model;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bigcomponet.hwork.bigcomponet.R;

public class MyBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<Model> modelArrayList;

    public MyBaseAdapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }
    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.raw_cutm_list,null);

        ImageView imgData = view.findViewById(R.id.img_data);

        TextView tvData = view.findViewById(R.id.tv_data);

        Model langModel = modelArrayList.get(i);

        imgData.setImageResource(modelArrayList.get(i).getImgLang());
        tvData.setText(modelArrayList.toString());
        return view;
    }
}
