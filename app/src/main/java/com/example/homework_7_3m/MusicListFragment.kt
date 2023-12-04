import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_7_3m.MusicAdapter
import com.example.homework_7_3m.MusicModel
import com.example.homework_7_3m.SecondActivity
import com.example.homework_7_3m.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {
    private lateinit var binding: FragmentMusicListBinding
    private val musicList = arrayListOf(
        MusicModel("1", "Downtown Baby", "Bloo", "3:16"),
        MusicModel("2", "Shape of you", "Ed Sheeran", "3:53"),
        MusicModel("3", "Sway", "Michael Buble", "3:08"),
        MusicModel("4", "The Hills", "The Weekend", "3:41"),
        MusicModel("5", "La la life", "Tony Tonite", "4:01"),
        MusicModel("6", "Too Good At Goodbyes", "Sam Smith", "3:21"),
        MusicModel("7", "Кечки Бишкек", "Mirbek Atabekov", "4:19"),
        MusicModel("8", "Доча", "Jah Khalib", "2:28"),
        MusicModel("9", "Два сердца", "Гоша матарадзе", "4:10"),
        MusicModel("10", "Красивая история", "Алан Черкасов", "4:20"),
        MusicModel("11", "Брюнетка", "Tuma", "2:45"),
        MusicModel("12", "Kolybelnaya", "Jah Khalib", "3:04"),
        MusicModel("13", "Love yourself", "Justin Bieber", "3:52"),
        MusicModel("14", "Fly me to the moon", "Joseph Vincent", "1:41"),
        MusicModel("15", "Perfect", "Ed-Sheeran", "4:23"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicAdapter = MusicAdapter(musicList,this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(pos:Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key",pos)
        startActivity(intent)
    }
}