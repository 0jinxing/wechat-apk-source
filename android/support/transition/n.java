package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class n
  implements o
{
  private static Method yY;
  private static boolean yZ;

  public final void a(ImageView paramImageView)
  {
  }

  public final void a(ImageView paramImageView, Animator paramAnimator)
  {
  }

  public final void a(ImageView paramImageView, Matrix paramMatrix)
  {
    if (!yZ);
    try
    {
      Method localMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[] { Matrix.class });
      yY = localMethod;
      localMethod.setAccessible(true);
      label32: yZ = true;
      if (yY != null);
      try
      {
        yY.invoke(paramImageView, new Object[] { paramMatrix });
        label58: return;
      }
      catch (InvocationTargetException paramImageView)
      {
        throw new RuntimeException(paramImageView.getCause());
      }
      catch (IllegalAccessException paramImageView)
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
 * Qualified Name:     android.support.transition.n
 * JD-Core Version:    0.6.2
 */