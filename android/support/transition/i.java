package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class i
  implements j
{
  static Class<?> yN;
  private static boolean yO;
  static Method yP;
  static boolean yQ;
  static Method yR;
  static boolean yS;
  private final View yT;

  private i(View paramView)
  {
    this.yT = paramView;
  }

  static void cU()
  {
    if (!yO);
    try
    {
      yN = Class.forName("android.view.GhostView");
      label14: yO = true;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label14;
    }
  }

  public final void a(ViewGroup paramViewGroup, View paramView)
  {
  }

  public final void setVisibility(int paramInt)
  {
    this.yT.setVisibility(paramInt);
  }

  static final class a
    implements j.a
  {
    public final void A(View paramView)
    {
      if (!i.yS);
      try
      {
        i.cU();
        Method localMethod = i.yN.getDeclaredMethod("removeGhost", new Class[] { View.class });
        i.yR = localMethod;
        localMethod.setAccessible(true);
        label36: i.yS = true;
        if (i.yR != null);
        try
        {
          i.yR.invoke(null, new Object[] { paramView });
          label62: return;
        }
        catch (InvocationTargetException paramView)
        {
          throw new RuntimeException(paramView.getCause());
        }
        catch (IllegalAccessException paramView)
        {
          break label62;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label36;
      }
    }

    public final j a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
    {
      if (!i.yQ);
      try
      {
        i.cU();
        Object localObject = i.yN.getDeclaredMethod("addGhost", new Class[] { View.class, ViewGroup.class, Matrix.class });
        i.yP = (Method)localObject;
        ((Method)localObject).setAccessible(true);
        label49: i.yQ = true;
        if (i.yP != null);
        while (true)
        {
          try
          {
            localObject = new android/support/transition/i;
            ((i)localObject).<init>((View)i.yP.invoke(null, new Object[] { paramView, paramViewGroup, paramMatrix }), (byte)0);
            paramView = (View)localObject;
            return paramView;
          }
          catch (InvocationTargetException paramView)
          {
            throw new RuntimeException(paramView.getCause());
          }
          catch (IllegalAccessException paramView)
          {
          }
          paramView = null;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        break label49;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.i
 * JD-Core Version:    0.6.2
 */