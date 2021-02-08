package com.longdo.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.longdo.api.IMapListener;
import com.longdo.api.Map;
import com.longdo.api.MapGLSurfaceView;
import com.longdo.map.java.R;

public class MapActivity extends AppCompatActivity implements IMapListener {

    private Map map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        setupView();
    }

    private void setupView() {
        setupMap();
    }

    private void setupMap() {
        ((MapGLSurfaceView) findViewById(R.id.map_view)).setListener(this);
    }

    @Override
    public void onMapCreated(Map map) {
        this.map = map;
    }

}