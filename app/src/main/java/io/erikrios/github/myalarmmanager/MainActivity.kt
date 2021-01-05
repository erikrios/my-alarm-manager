package io.erikrios.github.myalarmmanager

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myalarmmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityMainBinding? = null
    private lateinit var alarmReceiver: AlarmReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnOnceDate?.setOnClickListener(this)
        binding?.btnOnceTime?.setOnClickListener(this)
        binding?.btnSetOnceAlarm?.setOnClickListener(this)

        alarmReceiver = AlarmReceiver()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding?.btnOnceDate?.id -> {

            }
            binding?.btnOnceTime?.id -> {

            }
            binding?.btnSetOnceAlarm?.id -> {

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}