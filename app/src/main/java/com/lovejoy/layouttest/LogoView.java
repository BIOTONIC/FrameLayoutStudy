package com.lovejoy.layouttest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class LogoView extends View {

    public float bitmapX;
    public float bitmapY;
    public LogoView(Context context) {
        super(context);

        // Set start position
        bitmapX = 800;
        bitmapY = 200;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        // Generate bitmap object
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.deemo);
        // Draw bitmap
        canvas.drawBitmap(bitmap, bitmapX, bitmapY,paint);
        // Recycle bitmap
        if(bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }
}
