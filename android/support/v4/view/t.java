package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class t
{
  private static Method Nn;

  static
  {
    if (Build.VERSION.SDK_INT == 25);
    try
    {
      Nn = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
      label22: return;
    }
    catch (Exception localException)
    {
      break label22;
    }
  }

  public static float a(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (float f = paramViewConfiguration.getScaledHorizontalScrollFactor(); ; f = c(paramViewConfiguration, paramContext))
      return f;
  }

  @Deprecated
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.getScaledPagingTouchSlop();
  }

  public static float b(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (float f = paramViewConfiguration.getScaledVerticalScrollFactor(); ; f = c(paramViewConfiguration, paramContext))
      return f;
  }

  private static float c(ViewConfiguration paramViewConfiguration, Context paramContext)
  {
    if ((Build.VERSION.SDK_INT >= 25) && (Nn != null));
    while (true)
    {
      float f;
      try
      {
        int i = ((Integer)Nn.invoke(paramViewConfiguration, new Object[0])).intValue();
        f = i;
        return f;
      }
      catch (Exception paramViewConfiguration)
      {
      }
      paramViewConfiguration = new TypedValue();
      if (paramContext.getTheme().resolveAttribute(16842829, paramViewConfiguration, true))
        f = paramViewConfiguration.getDimension(paramContext.getResources().getDisplayMetrics());
      else
        f = 0.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.view.t
 * JD-Core Version:    0.6.2
 */