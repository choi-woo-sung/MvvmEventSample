package kr.co.prnd.mvvmeventsample.step6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.waterexample.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kr.co.prnd.mvvmeventsample.R
import kr.co.prnd.mvvmeventsample.databinding.FragmentBlankBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@AndroidEntryPoint
class BlankFragment : BaseFragment<FragmentBlankBinding>(R.layout.fragment_blank) {

    private val viewModel: Step6ViewModel by viewModels()

    override fun init() {
        TODO("Not yet implemented")
    }




    private fun handleEvent(event: MainViewModel.Event) = when (event) {
        is MainViewModel.Event.showBottomFragment -> {
            "히"
        }


}