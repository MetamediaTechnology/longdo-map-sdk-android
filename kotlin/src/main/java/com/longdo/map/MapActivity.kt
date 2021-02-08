package com.longdo.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.longdo.api.IMapListener
import com.longdo.api.Map
import com.longdo.api.MapGLSurfaceView

class MapActivity : AppCompatActivity(), IMapListener {

    private var map: Map? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map_activity)
        setupView()
    }

    private fun setupView() {
        setupMap()
    }

    private fun setupMap() {
        findViewById<MapGLSurfaceView>(R.id.map_view).setListener(this)
    }

    override fun onMapCreated(map: Map?) {
        this.map = map
    }

}