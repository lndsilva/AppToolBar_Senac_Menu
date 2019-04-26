package sp.senac.br.apptoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mAdcionar:
                Toast.makeText(getApplicationContext(), "Adicionar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mLigar:
                Toast.makeText(getApplicationContext(), "Ligar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCamera:
                Toast.makeText(getApplicationContext(), "Camera", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mCarrinho:
                Toast.makeText(getApplicationContext(),"Carrinho",Toast.LENGTH_SHORT).show();
                break;

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
       MenuInflater menuInflater = getMenuInflater();
       menuInflater.inflate(R.menu.menu_principal,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
