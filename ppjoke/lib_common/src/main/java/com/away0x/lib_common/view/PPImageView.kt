package com.away0x.lib_common.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.away0x.lib_common.utils.PixUtils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class PPImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    fun setImageUrl(imageUrl: String) {
        setImageUrl(this, imageUrl, false)
    }

    @BindingAdapter(value = ["image_url", "isCircle"])
    fun setImageUrl(view: PPImageView, imageUrl: String, isCircle: Boolean) {
        view.setImageUrl(view, imageUrl, isCircle, 0)
    }

    @SuppressLint("CheckResult")
    @BindingAdapter(value = ["image_url", "isCircle"], requireAll = false)
    fun setImageUrl(view: PPImageView, imageUrl: String, isCircle: Boolean, radius: Int) {
        val builder = Glide.with(this).load(imageUrl)

        if (isCircle) {
            builder.transform(CircleCrop())
        } else {
            builder.transform(RoundedCornersTransformation(PixUtils.dp2px(radius), 0))
        }

        val layoutParams = view.layoutParams
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            builder.override(layoutParams.width, layoutParams.height)
        }
        builder.into(view)
    }

}