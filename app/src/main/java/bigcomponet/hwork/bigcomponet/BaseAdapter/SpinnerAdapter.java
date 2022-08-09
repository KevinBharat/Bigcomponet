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
import bigcomponet.hwork.bigcomponet.Model.SpinnerModel;
import bigcomponet.hwork.bigcomponet.R;

public class SpinnerAdapter extends BaseAdapter {
    Context context;
    ArrayList<SpinnerModel>SpinnerModelArrayList;
public SpinnerAdapter(Context context,ArrayList<SpinnerModel>SpinnerModelArrayList){
    this.context = context;
    this.SpinnerModelArrayList = SpinnerModelArrayList;
}
    @Override
    public int getCount() {
        return SpinnerModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return SpinnerModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(R.layout.raw_cutm_spinner,null);

        ImageView spimgData = view.findViewById(R.id.spimg_data);
        TextView sptvData = view.findViewById(R.id.sptv_data);

        SpinnerModel spinnerModel = SpinnerModelArrayList.get(i);

        spimgData.setImageResource(SpinnerModelArrayList.get(i).getImgLang());
        sptvData.setText(SpinnerModelArrayList.get(i).getStrLang());
        return view;
    }
}
