package bigcomponet.hwork.bigcomponet.BaseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bigcomponet.hwork.bigcomponet.Model.GridModel;
import bigcomponet.hwork.bigcomponet.R;

public class GridBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<GridModel> GridModelArrayList;
    public GridBaseAdapter(Context context,  ArrayList<GridModel> GridModelArrayList) {
        this.context = context;
        this.GridModelArrayList = GridModelArrayList;
    }
    @Override
    public int getCount() {
        return GridModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return GridModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_cutm_grid,null);

        ImageView imgData = view.findViewById(R.id.img_data);
        TextView Subtiutle = view.findViewById(R.id.tvdata);

        GridModel GridModel = GridModelArrayList.get(i);

        imgData.setImageResource(GridModelArrayList.get(i).getImgLang());
        Subtiutle.setText(GridModel.getStrLang());
        return view;
    }
}
