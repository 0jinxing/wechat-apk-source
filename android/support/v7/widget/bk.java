package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class bk
{
  private static Method avi;

  static
  {
    if (Build.VERSION.SDK_INT >= 18);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[] { Rect.class, Rect.class });
      avi = localMethod;
      if (!localMethod.isAccessible())
        avi.setAccessible(true);
      label48: return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label48;
    }
  }

  public static void a(View paramView, Rect paramRect1, Rect paramRect2)
  {
    if (avi != null);
    try
    {
      avi.invoke(paramView, new Object[] { paramRect1, paramRect2 });
      label26: return;
    }
    catch (Exception paramView)
    {
      break label26;
    }
  }

  public static boolean bW(View paramView)
  {
    boolean bool = true;
    if (s.T(paramView) == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static void bX(View paramView)
  {
    if (Build.VERSION.SDK_INT >= 16);
    try
    {
      Method localMethod = paramView.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
      if (!localMethod.isAccessible())
        localMethod.setAccessible(true);
      localMethod.invoke(paramView, new Object[0]);
      label44: return;
    }
    catch (IllegalAccessException paramView)
    {
      break label44;
    }
    catch (InvocationTargetException paramView)
    {
      break label44;
    }
    catch (NoSuchMethodException paramView)
    {
      break label44;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bk
 * JD-Core Version:    0.6.2
 */