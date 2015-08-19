package clbtinhoc.tracnghiem;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by NhuocQuy on 6/25/2015.
 */
public class ListviewMenuLeftAdapter extends ArrayAdapter<String> {
    String[] arr;
    Activity context;
    public ListviewMenuLeftAdapter(Activity context, String[] arr) {
        super(context, clbtinhoc.tracnghiem.R.layout.layout_menu_left);
        this.arr = arr;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arr.length;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            convertView = layoutInflater.inflate(clbtinhoc.tracnghiem.R.layout.layout_menu_left, null);
        }
        if (arr.length > 0 && position >= 0) {
            final TextView tvTen = (TextView) convertView.findViewById(clbtinhoc.tracnghiem.R.id.tvFr);
            tvTen.setText(arr[position]);
        }
        return convertView;
    }
}
