package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;

public class ht
{
  protected static Paint a;
  private static final String b;

  static
  {
    AppMethodBeat.i(99585);
    b = Bitmap.class.getCanonicalName();
    Paint localPaint = new Paint();
    a = localPaint;
    localPaint.setAntiAlias(true);
    AppMethodBeat.o(99585);
  }

  private static Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AppMethodBeat.i(99582);
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
      paramConfig = localBitmap;
      AppMethodBeat.o(99582);
      return paramConfig;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        try
        {
          paramConfig = Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
        }
        catch (OutOfMemoryError paramConfig)
        {
          paramConfig = null;
          AppMethodBeat.o(99582);
        }
    }
  }

  public static Bitmap a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99578);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      paramBitmap = null;
      AppMethodBeat.o(99578);
    }
    while (true)
    {
      return paramBitmap;
      paramBitmap = a(paramBitmap, paramBitmap.getWidth(), paramBitmap.getHeight());
      AppMethodBeat.o(99578);
    }
  }

  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    AppMethodBeat.i(99583);
    if (paramBitmap == null)
      AppMethodBeat.o(99583);
    while (true)
    {
      return paramBitmap;
      if (paramFloat == 1.0F)
      {
        AppMethodBeat.o(99583);
      }
      else
      {
        Matrix localMatrix = new Matrix();
        localMatrix.postScale(paramFloat, paramFloat);
        paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
        AppMethodBeat.o(99583);
      }
    }
  }

  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    Canvas localCanvas = null;
    AppMethodBeat.i(99579);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      AppMethodBeat.o(99579);
      paramBitmap = localCanvas;
    }
    while (true)
    {
      return paramBitmap;
      Bitmap localBitmap = a(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      localBitmap.setDensity(paramBitmap.getDensity());
      if (localBitmap == null)
      {
        AppMethodBeat.o(99579);
        paramBitmap = localCanvas;
      }
      else
      {
        localCanvas = new Canvas(localBitmap);
        localBitmap.eraseColor(0);
        localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, a);
        AppMethodBeat.o(99579);
        paramBitmap = localBitmap;
      }
    }
  }

  public static Bitmap a(Bitmap paramBitmap, Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(99580);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      AppMethodBeat.o(99580);
      paramBitmap = null;
    }
    while (true)
    {
      return paramBitmap;
      int i = paramInt1;
      if (paramInt1 > 2048)
        i = 2048;
      paramInt1 = paramInt2;
      if (paramInt2 > 2048)
        paramInt1 = 2048;
      Bitmap localBitmap = a(i, paramInt1, Bitmap.Config.ARGB_8888);
      if (localBitmap == null)
      {
        AppMethodBeat.o(99580);
        paramBitmap = null;
      }
      else
      {
        localBitmap.eraseColor(0);
        Canvas localCanvas = new Canvas(localBitmap);
        paramBitmap = new BitmapDrawable(paramContext.getResources(), paramBitmap);
        paramBitmap.setBounds(0, 0, i, paramInt1);
        paramBitmap.draw(localCanvas);
        AppMethodBeat.o(99580);
        paramBitmap = localBitmap;
      }
    }
  }

  public static Bitmap a(View paramView)
  {
    AppMethodBeat.i(99577);
    if (paramView != null);
    while (true)
    {
      try
      {
        try
        {
          paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
          paramView.layout(0, 0, paramView.getMeasuredWidth(), paramView.getMeasuredHeight());
          paramView.setDrawingCacheEnabled(true);
          paramView.buildDrawingCache();
          Bitmap localBitmap = a(paramView.getDrawingCache());
          paramView.destroyDrawingCache();
          AppMethodBeat.o(99577);
          paramView = localBitmap;
          return paramView;
        }
        finally
        {
          AppMethodBeat.o(99577);
        }
      }
      catch (Throwable paramView)
      {
        new StringBuilder("BitmapUtil.convertToBitmap errorDetail:").append(Log.getStackTraceString(paramView));
      }
      paramView = null;
      AppMethodBeat.o(99577);
    }
  }

  public static byte[] a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat)
  {
    AppMethodBeat.i(99584);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      paramBitmap = null;
      AppMethodBeat.o(99584);
    }
    while (true)
    {
      return paramBitmap;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(paramCompressFormat, 100, localByteArrayOutputStream);
      paramBitmap = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(99584);
    }
  }

  public static Drawable b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99581);
    paramBitmap = new BitmapDrawable(paramBitmap);
    AppMethodBeat.o(99581);
    return paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ht
 * JD-Core Version:    0.6.2
 */