package org.brohede.marcus.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Skapar ett List objekt med alla berg. Se array mountainNames.
        List<String> listData = new ArrayList<String>(Arrays.asList(mountainNames));

        //Skapar en ArrayAdapter som ansluter till list_item_textview, my_item_textview samt med List objektet.
        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.list_item_textview, R.id.my_item_textview, listData);

        //Hittar layout elementet my_listview och skapar en objekt instans.
        ListView myListView = (ListView)findViewById(R.id.my_listview);

        //Ansluter ArrayAdaptern med ListView objektet.
        myListView.setAdapter(adapter);
    }
}
