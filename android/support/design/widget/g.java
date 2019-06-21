package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import java.lang.reflect.Method;

final class g
{
  private static Method pY;
  private static boolean pZ;

  static boolean a(DrawableContainer paramDrawableContainer, Drawable.ConstantState paramConstantState)
  {
    boolean bool = true;
    if (!pZ);
    try
    {
      Method localMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[] { DrawableContainer.DrawableContainerState.class });
      pY = localMethod;
      localMethod.setAccessible(true);
      label34: pZ = true;
      if (pY != null);
      while (true)
      {
        try
        {
          pY.invoke(paramDrawableContainer, new Object[] { paramConstantState });
          return bool;
        }
        catch (Exception paramDrawableContainer)
        {
        }
        bool = false;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label34;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.widget.g
 * JD-Core Version:    0.6.2
 */