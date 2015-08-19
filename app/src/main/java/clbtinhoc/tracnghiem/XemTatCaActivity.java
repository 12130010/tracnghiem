package clbtinhoc.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class XemTatCaActivity extends Activity implements View.OnClickListener{
    private Button btnDSMonThi;
    private Button btnDSMonDaThi;
    private Button btnTTThiSinh;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2015-08-18 09:32:58 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        btnDSMonThi = (Button)findViewById( clbtinhoc.tracnghiem.R.id.btnDSMonThi );
        btnDSMonDaThi = (Button)findViewById( clbtinhoc.tracnghiem.R.id.btnDSMonDaThi );
        btnTTThiSinh = (Button)findViewById( clbtinhoc.tracnghiem.R.id.btnTTThiSinh );

        btnDSMonThi.setOnClickListener(this);
        btnDSMonDaThi.setOnClickListener( this );
        btnTTThiSinh.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2015-08-18 09:32:58 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == btnDSMonThi ) {
            Intent intent = new Intent(XemTatCaActivity.this, LoadDSMTActivity.class);
            startActivity(intent);
        } else if ( v == btnDSMonDaThi ) {
            Intent intent = new Intent(XemTatCaActivity.this, LoadDSMTActivity.class);
            startActivity(intent);
        } else if ( v == btnTTThiSinh ) {
            Intent intent = new Intent(XemTatCaActivity.this, ThongTinTSActivity.class);
            startActivity(intent);

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(clbtinhoc.tracnghiem.R.layout.activity_xem_tat_ca);
       findViews();
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(clbtinhoc.tracnghiem.R.menu.menu_xem_tat_ca, menu);
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
