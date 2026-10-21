package com.eacontrol.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eacontrol.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = getString(R.string.app_name)
        binding.subtitleText.text = getString(R.string.app_tagline)
    }
}
