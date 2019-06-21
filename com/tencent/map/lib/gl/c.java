package com.tencent.map.lib.gl;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.opengles.GL10;

public class c
{
  private static int a(GL10 paramGL10)
  {
    AppMethodBeat.i(98055);
    int[] arrayOfInt = new int[1];
    paramGL10.glGenTextures(1, arrayOfInt, 0);
    int i = arrayOfInt[0];
    AppMethodBeat.o(98055);
    return i;
  }

  public static int a(GL10 paramGL10, Bitmap paramBitmap)
  {
    AppMethodBeat.i(98054);
    int i = b(paramGL10);
    GLUtils.texImage2D(3553, 0, paramBitmap, 0);
    AppMethodBeat.o(98054);
    return i;
  }

  public static Bitmap a(Bitmap paramBitmap)
  {
    int i = 2;
    AppMethodBeat.i(98053);
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    int m = 2;
    int n;
    while (true)
    {
      n = i;
      if (m >= j)
        break;
      m <<= 1;
    }
    while (n < k)
      n <<= 1;
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(false);
    try
    {
      localBitmap = Bitmap.createBitmap(m, n, Bitmap.Config.ARGB_8888);
      localBitmap.setDensity(0);
      Canvas localCanvas = new Canvas(localBitmap);
      localCanvas.setDensity(0);
      localBitmap.eraseColor(0);
      localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, localPaint);
      AppMethodBeat.o(98053);
      return localBitmap;
    }
    catch (OutOfMemoryError paramBitmap)
    {
      while (true)
      {
        Bitmap localBitmap = null;
        AppMethodBeat.o(98053);
      }
    }
  }

  private static int b(GL10 paramGL10)
  {
    AppMethodBeat.i(98056);
    int i = a(paramGL10);
    paramGL10.glBindTexture(3553, i);
    paramGL10.glTexParameterf(3553, 10241, 9729.0F);
    paramGL10.glTexParameterf(3553, 10240, 9729.0F);
    paramGL10.glTexParameterf(3553, 10242, 33071.0F);
    paramGL10.glTexParameterf(3553, 10243, 33071.0F);
    AppMethodBeat.o(98056);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.c
 * JD-Core Version:    0.6.2
 */