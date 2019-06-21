package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

final class au
{
  private static final ba Bi;
  private static Field Bj;
  private static boolean Bk;
  static final Property<View, Float> Bl;
  static final Property<View, Rect> Bm;

  static
  {
    if (Build.VERSION.SDK_INT >= 22)
      Bi = new az();
    while (true)
    {
      Bl = new au.1(Float.class, "translationAlpha");
      Bm = new au.2(Rect.class, "clipBounds");
      return;
      if (Build.VERSION.SDK_INT >= 21)
        Bi = new ay();
      else if (Build.VERSION.SDK_INT >= 19)
        Bi = new ax();
      else if (Build.VERSION.SDK_INT >= 18)
        Bi = new aw();
      else
        Bi = new av();
    }
  }

  static at J(View paramView)
  {
    return Bi.J(paramView);
  }

  static be K(View paramView)
  {
    return Bi.K(paramView);
  }

  static float L(View paramView)
  {
    return Bi.L(paramView);
  }

  static void M(View paramView)
  {
    Bi.M(paramView);
  }

  static void N(View paramView)
  {
    Bi.N(paramView);
  }

  static void a(View paramView, Matrix paramMatrix)
  {
    Bi.a(paramView, paramMatrix);
  }

  static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Bi.b(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  static void b(View paramView, Matrix paramMatrix)
  {
    Bi.b(paramView, paramMatrix);
  }

  static void c(View paramView, float paramFloat)
  {
    Bi.c(paramView, paramFloat);
  }

  static void c(View paramView, Matrix paramMatrix)
  {
    Bi.c(paramView, paramMatrix);
  }

  static void l(View paramView, int paramInt)
  {
    if (!Bk);
    try
    {
      Field localField = View.class.getDeclaredField("mViewFlags");
      Bj = localField;
      localField.setAccessible(true);
      label23: Bk = true;
      if (Bj != null);
      try
      {
        int i = Bj.getInt(paramView);
        Bj.setInt(paramView, i & 0xFFFFFFF3 | paramInt);
        label54: return;
      }
      catch (IllegalAccessException paramView)
      {
        break label54;
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label23;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.au
 * JD-Core Version:    0.6.2
 */