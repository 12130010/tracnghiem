package clbtinhoc.tracnghiem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TracNghiemOnline extends Activity implements View.OnClickListener {
    private EditText editTaiKhoan;
    private EditText editMatKhau;
    private TextView linkQuenMatKhau;
    private Button btnDangNhap;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2015-08-18 13:57:52 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        editTaiKhoan = (EditText)findViewById( clbtinhoc.tracnghiem.R.id.editTaiKhoan );
        editMatKhau = (EditText)findViewById( clbtinhoc.tracnghiem.R.id.editMatKhau );
        linkQuenMatKhau = (TextView)findViewById( clbtinhoc.tracnghiem.R.id.linkQuenMatKhau );
        btnDangNhap = (Button)findViewById( clbtinhoc.tracnghiem.R.id.btnDangNhap );

        btnDangNhap.setOnClickListener( this );
        linkQuenMatKhau.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2015-08-18 13:57:52 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == btnDangNhap ) {
            Intent intent = new Intent(TracNghiemOnline.this, XemTatCaActivity.class);
            startActivity(intent);
        }
        if(v == linkQuenMatKhau){
            Intent intent = new Intent(TracNghiemOnline.this, QuenmatkhauActivity.class);
            startActivity(intent);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(clbtinhoc.tracnghiem.R.layout.activity_trac_nghiem_online);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        findViews();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(clbtinhoc.tracnghiem.R.menu.menu_trac_nghiem_online, menu);
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

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("ID", "1234567890");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String ID = savedInstanceState.getString("ID");
    }
}
