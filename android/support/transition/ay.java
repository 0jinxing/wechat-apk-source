package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ay extends ax
{
  private static Method Bs;
  private static boolean Bt;
  private static Method Bu;
  private static boolean Bv;
  private static Method Bw;
  private static boolean Bx;

  public final void a(View paramView, Matrix paramMatrix)
  {
    if (!Bt);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[] { Matrix.class });
      Bs = localMethod;
      localMethod.setAccessible(true);
      label32: Bt = true;
      if (Bs != null);
      try
      {
        Bs.invoke(paramView, new Object[] { paramMatrix });
        label58: return;
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      catch (IllegalAccessException paramView)
      {
        break label58;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label32;
    }
  }

  public final void b(View paramView, Matrix paramMatrix)
  {
    if (!Bv);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[] { Matrix.class });
      Bu = localMethod;
      localMethod.setAccessible(true);
      label32: Bv = true;
      if (Bu != null);
      try
      {
        Bu.invoke(paramView, new Object[] { paramMatrix });
        label58: return;
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      catch (IllegalAccessException paramView)
      {
        break label58;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label32;
    }
  }

  public final void c(View paramView, Matrix paramMatrix)
  {
    if (!Bx);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[] { Matrix.class });
      Bw = localMethod;
      localMethod.setAccessible(true);
      label32: Bx = true;
      if (Bw != null);
      try
      {
        Bw.invoke(paramView, new Object[] { paramMatrix });
        label58: return;
      }
      catch (IllegalAccessException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      catch (InvocationTargetException paramView)
      {
        break label58;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label32;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.ay
 * JD-Core Version:    0.6.2
 */