package com.tencent.mm.ui.base;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  private static boolean M(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(106277);
    if (dzs())
      if (paramMotionEvent.getPointerCount() >= 2)
      {
        bool = true;
        AppMethodBeat.o(106277);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(106277);
      continue;
      AppMethodBeat.o(106277);
    }
  }

  public static float N(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106278);
    float f1 = c(paramMotionEvent, 0) - c(paramMotionEvent, 1);
    float f2 = d(paramMotionEvent, 0) - d(paramMotionEvent, 1);
    f1 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(106278);
    return f1;
  }

  public static int O(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106283);
    int i;
    if (dzs())
    {
      new e();
      i = paramMotionEvent.getPointerCount();
      AppMethodBeat.o(106283);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(106283);
    }
  }

  public static void a(PointF paramPointF, Bitmap paramBitmap)
  {
    AppMethodBeat.i(106280);
    if ((paramPointF == null) || (paramBitmap == null))
      AppMethodBeat.o(106280);
    while (true)
    {
      return;
      paramPointF.set(paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
      AppMethodBeat.o(106280);
    }
  }

  public static void a(PointF paramPointF, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106279);
    if ((paramPointF == null) || (paramMotionEvent == null))
      AppMethodBeat.o(106279);
    while (true)
    {
      return;
      float f1 = c(paramMotionEvent, 0);
      float f2 = c(paramMotionEvent, 1);
      float f3 = d(paramMotionEvent, 0);
      float f4 = d(paramMotionEvent, 1);
      paramPointF.set((f1 + f2) / 2.0F, (f3 + f4) / 2.0F);
      AppMethodBeat.o(106279);
    }
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    AppMethodBeat.i(106281);
    float f;
    if (M(paramMotionEvent))
    {
      new e();
      f = paramMotionEvent.getX(paramInt);
      AppMethodBeat.o(106281);
    }
    while (true)
    {
      return f;
      f = paramMotionEvent.getX();
      AppMethodBeat.o(106281);
    }
  }

  public static void c(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106284);
    if (dzs())
    {
      new e();
      paramKeyEvent.startTracking();
    }
    AppMethodBeat.o(106284);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    AppMethodBeat.i(106282);
    float f;
    if (M(paramMotionEvent))
    {
      new e();
      f = paramMotionEvent.getY(paramInt);
      AppMethodBeat.o(106282);
    }
    while (true)
    {
      return f;
      f = paramMotionEvent.getY();
      AppMethodBeat.o(106282);
    }
  }

  public static boolean d(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106285);
    boolean bool;
    if (dzs())
    {
      new e();
      bool = paramKeyEvent.isTracking();
      AppMethodBeat.o(106285);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106285);
    }
  }

  public static boolean dzs()
  {
    if (Build.VERSION.SDK_INT >= 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean e(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106286);
    boolean bool;
    if (dzs())
    {
      new e();
      bool = paramKeyEvent.isCanceled();
      AppMethodBeat.o(106286);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106286);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.f
 * JD-Core Version:    0.6.2
 */