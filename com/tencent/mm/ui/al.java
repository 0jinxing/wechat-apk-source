package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public final class al
{
  @TargetApi(17)
  public static boolean hw(Context paramContext)
  {
    AppMethodBeat.i(112500);
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    Point localPoint = new Point();
    localDisplay.getSize(localPoint);
    paramContext = hy(paramContext);
    int i = Math.max(localPoint.y, localPoint.x);
    boolean bool;
    if (Math.max(paramContext.y, paramContext.x) > i)
    {
      bool = true;
      AppMethodBeat.o(112500);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112500);
    }
  }

  public static Point hy(Context paramContext)
  {
    AppMethodBeat.i(112499);
    Point localPoint = new Point();
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if (Build.VERSION.SDK_INT >= 17)
      paramContext.getRealSize(localPoint);
    while (true)
    {
      AppMethodBeat.o(112499);
      return localPoint;
      if (Build.VERSION.SDK_INT >= 14)
        try
        {
          Method localMethod = Display.class.getMethod("getRawHeight", new Class[0]);
          localPoint.x = ((Integer)Display.class.getMethod("getRawWidth", new Class[0]).invoke(paramContext, new Object[0])).intValue();
          localPoint.y = ((Integer)localMethod.invoke(paramContext, new Object[0])).intValue();
        }
        catch (Exception localException)
        {
        }
      else
        paramContext.getSize(localPoint);
    }
  }

  public static int la(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(112501);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
      {
        AppMethodBeat.o(112501);
        j = i;
      }
      while (true)
      {
        return j;
        j = Integer.decode(paramString).intValue();
        AppMethodBeat.o(112501);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ai.printErrStackTrace("WeUIUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(112501);
        int j = i;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.al
 * JD-Core Version:    0.6.2
 */