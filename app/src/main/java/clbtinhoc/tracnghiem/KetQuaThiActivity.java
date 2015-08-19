package clbtinhoc.tracnghiem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class KetQuaThiActivity extends Activity  {
    private TextView tvTenMonThi;
    private TextView tvHocKi;
    private TextView tvThoiGianThi;
    private TextView tvNgayThi;
    private TextView tvPhong;
    private TextView tvHoVaTen;
    private TextView tvMSSV;
    private TextView tvSoCau;
    private TextView tvDiemThi;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2015-08-19 16:14:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        tvTenMonThi = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvTenMonThi );
        tvHocKi = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvHocKi );
        tvThoiGianThi = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvThoiGianThi );
        tvNgayThi = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvNgayThi );
        tvPhong = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvPhong );
        tvHoVaTen = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvHoVaTen );
        tvMSSV = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvMSSV );
        tvSoCau = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvSoCau );
        tvDiemThi = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.tvDiemThi );

    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2015-08-19 16:14:50 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(clbtinhoc.tracnghiem.R.layout.activity_ket_qua_thi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(clbtinhoc.tracnghiem.R.menu.menu_ket_qua_thi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == clbtinhoc.tracnghiem.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
