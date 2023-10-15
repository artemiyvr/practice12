import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.practice12.R

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var radioGroup: RadioGroup

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        radioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = findViewById<RadioButton>(checkedId)
            val selectedOption = radioButton.text.toString()

            when (selectedOption) {
                "Option 1" -> imageView.setImageResource(R.drawable.apple)
                "Option 2" -> imageView.setImageResource(R.drawable.image2)
                "Option 3" -> imageView.setImageResource(R.drawable.image3)
            }
        }
    }
    class MainActivity : AppCompatActivity() {
        private lateinit var checkBoxApple: checkBoxApple
        private lateinit var checkBoxPear: checkBoxPear
        private lateinit var checkBoxGrape: checkBoxGrape
        private lateinit var imageView2: ImageView
        private lateinit var imageView3: ImageView
        private lateinit var imageView4: ImageView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            checkBoxApple = findViewById(R.id.checkBoxApple)
            checkBoxPear = findViewById(R.id.checkBoxPear)
            checkBoxGrape = findViewById(R.id.checkBoxGrape)
            imageView2 = findViewById(R.id.imageView2)
            imageView3 = findViewById(R.id.imageView3)
            imageView4 = findViewById(R.id.imageView4)

            checkBoxApple.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageView2.setImageResource(R.drawable.apple)
                } else {
                    imageView2.setImageDrawable(null)
                }
            }

            checkBoxPear.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageView3.setImageResource(R.drawable.image2)
                } else {
                    imageView3.setImageDrawable(null)
                }
            }

            checkBoxGrape.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    imageView4.setImageResource(R.drawable.image3)
                } else {
                    imageView4.setImageDrawable(null)
                }
            }

}
