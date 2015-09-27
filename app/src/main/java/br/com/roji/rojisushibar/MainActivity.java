package br.com.roji.rojisushibar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar cabecalho;
    private Drawer.Result menuLateral;
    private int itemSelecionadoMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cabecalho = (Toolbar) findViewById(R.id.tb_main);
        cabecalho.setTitle(R.string.app_name);
        cabecalho.setLogo(R.mipmap.logo_roji);
        setSupportActionBar(cabecalho);

        menuLateral = new Drawer()
                .withActivity(this)
                .withToolbar(cabecalho)
                .withDisplayBelowToolbar(true)
                .withActionBarDrawerToggleAnimated(true)
                .withDrawerGravity(Gravity.LEFT)
                .withSavedInstance(savedInstanceState)
                .withActionBarDrawerToggle(true)
                        //.withAccountHeader(headerNavigationLeft)
                .withSelectedItem(-1)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
                        Intent intent = null;
                        itemSelecionadoMenu = i;

                        if (itemSelecionadoMenu == 0) {
                            intent = new Intent(MainActivity.this, ListagemProdutos.class);
                        } else if (itemSelecionadoMenu == 1) {
                            intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse("https://www.facebook.com/RojiSushibar?fref=ts"));
                        } else if (itemSelecionadoMenu == 2) {
                            intent = new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse("https://instagram.com/rojisushibar/"));
                        } else if (itemSelecionadoMenu == 3) {
                            intent = new Intent(MainActivity.this, Localizacao.class);
                        }

                        if (intent != null) {
                            startActivity(intent);
                        }

                    }
                })

                .build();
        menuLateral.addItem(new PrimaryDrawerItem().withName(R.string.carrinho).withIcon(getResources().getDrawable(R.mipmap.carrinho_compras)));
        menuLateral.addItem(new PrimaryDrawerItem().withName("Facebook").withIcon(getResources().getDrawable(R.mipmap.facebook)));
        menuLateral.addItem(new PrimaryDrawerItem().withName("Instagram").withIcon(getResources().getDrawable(R.mipmap.instagram)));
        menuLateral.addItem(new PrimaryDrawerItem().withName(R.string.localização).withIcon(getResources().getDrawable(R.mipmap.google_maps)));
        menuLateral.addItem(new SectionDrawerItem().withName("Desenvolvido por Fernando Júnior"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
