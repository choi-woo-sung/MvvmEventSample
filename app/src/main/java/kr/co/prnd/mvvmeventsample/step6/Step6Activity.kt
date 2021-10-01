package kr.co.prnd.mvvmeventsample.step6

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kr.co.prnd.mvvmeventsample.BaseActivity
import kr.co.prnd.mvvmeventsample.R
import kr.co.prnd.mvvmeventsample.databinding.ActivityStep6Binding
import kr.co.prnd.mvvmeventsample.step5.repeatOnStarted
import kr.co.prnd.mvvmeventsample.step6.Step6ViewModel.Event

@AndroidEntryPoint
class Step6Activity :
    BaseActivity<ActivityStep6Binding, Step6ViewModel>(R.layout.activity_step6) {

    override val viewModel: Step6ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        repeatOnStarted {
            viewModel.eventFlow.collect {
                Log.d("gf", "$it")
            }
        }
    }


}
