package android.support.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ao
  implements aq
{
  private static LayoutTransition AT;
  private static Field AU;
  private static boolean AV;
  private static Method AW;
  private static boolean AX;

  public am c(ViewGroup paramViewGroup)
  {
    return (ak)ar.I(paramViewGroup);
  }

  public void c(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject;
    if (AT == null)
    {
      localObject = new ao.1(this);
      AT = (LayoutTransition)localObject;
      ((LayoutTransition)localObject).setAnimator(2, null);
      AT.setAnimator(0, null);
      AT.setAnimator(1, null);
      AT.setAnimator(3, null);
      AT.setAnimator(4, null);
    }
    if (paramBoolean)
    {
      localObject = paramViewGroup.getLayoutTransition();
      if ((localObject != null) && ((((LayoutTransition)localObject).isRunning()) && (AX)));
    }
    try
    {
      Method localMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
      AW = localMethod;
      localMethod.setAccessible(true);
      label118: AX = true;
      if (AW != null);
      try
      {
        AW.invoke(localObject, new Object[0]);
        label141: if (localObject != AT)
          paramViewGroup.setTag(2131820681, localObject);
        paramViewGroup.setLayoutTransition(AT);
        while (true)
        {
          return;
          paramViewGroup.setLayoutTransition(null);
          if (!AV);
          try
          {
            localObject = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
            AU = (Field)localObject;
            ((Field)localObject).setAccessible(true);
            label196: AV = true;
            paramBoolean = bool2;
            if (AU != null)
              paramBoolean = bool1;
            try
            {
              bool1 = AU.getBoolean(paramViewGroup);
              paramBoolean = bool1;
              if (bool1)
              {
                paramBoolean = bool1;
                AU.setBoolean(paramViewGroup, false);
                paramBoolean = bool1;
              }
              label237: if (paramBoolean)
                paramViewGroup.requestLayout();
              localObject = (LayoutTransition)paramViewGroup.getTag(2131820681);
              if (localObject == null)
                continue;
              paramViewGroup.setTag(2131820681, null);
              paramViewGroup.setLayoutTransition((LayoutTransition)localObject);
            }
            catch (IllegalAccessException localIllegalAccessException1)
            {
              break label237;
            }
          }
          catch (NoSuchFieldException localNoSuchFieldException)
          {
            break label196;
          }
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        break label141;
      }
      catch (IllegalAccessException localIllegalAccessException2)
      {
        break label141;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label118;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.ao
 * JD-Core Version:    0.6.2
 */