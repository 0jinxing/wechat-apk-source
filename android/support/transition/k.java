package android.support.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

final class k
{
  private static final j.a yU;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (yU = new i.a(); ; yU = new h.a())
      return;
  }

  static void A(View paramView)
  {
    yU.A(paramView);
  }

  static j a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    return yU.a(paramView, paramViewGroup, paramMatrix);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.transition.k
 * JD-Core Version:    0.6.2
 */