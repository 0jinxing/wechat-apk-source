package com.tencent.magicbrush.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  private static float bUz = -1.0F;

  public static Point aA(Context paramContext)
  {
    AppMethodBeat.i(116008);
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    Point localPoint = new Point();
    if (localWindowManager != null)
    {
      localWindowManager.getDefaultDisplay().getRealSize(localPoint);
      if ((localPoint.x == 0) || (localPoint.y == 0));
    }
    while (true)
    {
      localPoint.x = v(paramContext, localPoint.x);
      localPoint.y = v(paramContext, localPoint.y);
      AppMethodBeat.o(116008);
      return localPoint;
      localPoint.x = paramContext.getResources().getDisplayMetrics().widthPixels;
      localPoint.y = paramContext.getResources().getDisplayMetrics().heightPixels;
    }
  }

  public static float getDensity(Context paramContext)
  {
    AppMethodBeat.i(116006);
    if (bUz < 0.0F)
      bUz = paramContext.getResources().getDisplayMetrics().density;
    float f = bUz;
    AppMethodBeat.o(116006);
    return f;
  }

  private static int v(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(116007);
    paramInt = (int)Math.ceil(paramInt / getDensity(paramContext));
    AppMethodBeat.o(116007);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.d.a
 * JD-Core Version:    0.6.2
 */