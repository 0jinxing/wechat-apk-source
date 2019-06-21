package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class az extends ay
{
  private static Method By;
  private static boolean Bz;

  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!Bz);
    try
    {
      Method localMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE });
      By = localMethod;
      localMethod.setAccessible(true);
      label54: Bz = true;
      if (By != null);
      try
      {
        By.invoke(paramView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
        label106: return;
      }
      catch (InvocationTargetException paramView)
      {
        throw new RuntimeException(paramView.getCause());
      }
      catch (IllegalAccessException paramView)
      {
        break label106;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label54;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.az
 * JD-Core Version:    0.6.2
 */