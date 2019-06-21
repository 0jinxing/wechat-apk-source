package android.support.transition;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ap extends ao
{
  private static Method AZ;
  private static boolean Ba;

  public final am c(ViewGroup paramViewGroup)
  {
    return new al(paramViewGroup);
  }

  public final void c(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    if (!Ba);
    try
    {
      Method localMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[] { Boolean.TYPE });
      AZ = localMethod;
      localMethod.setAccessible(true);
      label33: Ba = true;
      if (AZ != null);
      try
      {
        AZ.invoke(paramViewGroup, new Object[] { Boolean.valueOf(paramBoolean) });
        label62: return;
      }
      catch (InvocationTargetException paramViewGroup)
      {
        break label62;
      }
      catch (IllegalAccessException paramViewGroup)
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.ap
 * JD-Core Version:    0.6.2
 */