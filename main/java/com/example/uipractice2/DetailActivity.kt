package com.example.uipractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.bumptech.glide.Glide
import com.example.uipractice2.databinding.ActivityDetailBinding
import com.example.uipractice2.model.Book
import com.example.uipractice2.model.Review

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var DB: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        DB = getAppDatabase(this)

        val model = intent.getParcelableExtra<Book>("bookModel")

        binding.titleTextView.text = model?.title.orEmpty()
        binding.descriptionTextView.text = model?.dexcription.orEmpty()

        Glide.with(binding.coverImageView.context)
            .load(model?.coverSmallUrl.orEmpty())
            .into(binding.coverImageView)

        Thread {
            val review1 = DB.reviewDao().getOneReview(model?.id?.toInt() ?: 0)
            Log.d("review1", review1.toString())
            runOnUiThread {
                if (review1.isNotEmpty())
                    binding.reviewEditTextView.setText(review1[0].review)
                else
                    binding.reviewEditTextView.setText("")
            }
        }.start()

        binding.saveButton.setOnClickListener {
            Thread {
                DB.reviewDao().saveReview(
                    Review(
                        model?.id?.toInt() ?: 0,
                        binding.reviewEditTextView.text.toString()
                    )
                )
            }.start()
        }

    }
}