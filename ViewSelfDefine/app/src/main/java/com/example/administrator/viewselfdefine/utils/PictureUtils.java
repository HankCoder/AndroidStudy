package com.example.administrator.viewselfdefine.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;

/**
 * Created by Administrator on 2016/12/16 0016.
 */

public class PictureUtils {

    public static Bitmap getScaledBitmap(String path, int destWidth, int destHeight) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        float srcWidth = options.outWidth;
        float srcHeight = options.outHeight;

        int inSampleSize = 1;
        if (srcHeight > destHeight || srcHeight > destHeight) {
            if (srcWidth > srcHeight) {
                inSampleSize =  Math.round(srcHeight / destHeight);
            } else {
                inSampleSize = Math.round(srcWidth / destWidth);
            }
        }

        options = new BitmapFactory.Options();
        options.inSampleSize = inSampleSize;

        return BitmapFactory.decodeFile(path, options);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    public static Bitmap getScaledBitmap(String path, Activity activity) {
        Point size = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(size);
        return getScaledBitmap(path, size.x, size.y);
    }
}
