package com.example.eagleconstruction.Utills

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.dermedapp.R


var options: RequestOptions = RequestOptions()
    .centerCrop()
    .placeholder(R.drawable.place_holder)
    .diskCacheStrategy(DiskCacheStrategy.ALL)
    .priority(Priority.HIGH)
    .dontAnimate()
    .dontTransform()

fun ImageView.placeImage(imageUrl: String?, placeholder: Int = 0) {

    try {
        Glide.with(this).load(imageUrl).placeholder(placeholder).apply(options).into(this)

    } catch (e: Exception) {

    }
}