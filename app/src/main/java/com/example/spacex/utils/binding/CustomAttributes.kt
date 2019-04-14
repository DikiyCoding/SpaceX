package com.example.spacex.utils.binding

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

@BindingAdapter("android:src")
fun setImageUrl(imageView: ImageView, url: String) {
    Picasso
        .get()
        .load(url)
        .noFade()
        .into(imageView)
}
