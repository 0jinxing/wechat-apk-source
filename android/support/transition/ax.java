package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ax extends aw
{
  private static Method Bo;
  private static boolean Bp;
  private static Method Bq;
  private static boolean Br;

  public final float L(View paramView)
  {
    if (!Br);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
      Bq = localMethod;
      localMethod.setAccessible(true);
      label27: Br = true;
      if (Bq != null);
      while (true)
      {
        try
        {
          f = ((Float)Bq.invoke(paramView, new Object[0])).floatValue();
          return f;
        }
        catch (InvocationTargetException paramView)
        {
          throw new RuntimeException(paramView.getCause());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
        }
        float f = super.L(paramView);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label27;
    }
  }

  public final void M(View paramView)
  {
  }

  public final void N(View paramView)
  {
  }

  public final void c(View paramView, float paramFloat)
  {
    if (!Bp);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[] { Float.TYPE });
      Bo = localMethod;
      localMethod.setAccessible(true);
      label33: Bp = true;
      if (Bo != null);
      try
      {
        Bo.invoke(paramView, new Object[] { Float.valueOf(paramFloat) });
        label62: return;
      }
      catch (InvocationTargetException paramView)
      {
        while (true)
        {
          throw new RuntimeException(paramView.getCause());
          paramView.setAlpha(paramFloat);
        }
      }
      catch (IllegalAccessException paramView)
      {
        break label62;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label33;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.transition.ax
 * JD-Core Version:    0.6.2
 */