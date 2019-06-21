package android.support.design.internal;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.view.View;
import android.view.WindowInsets;

final class ScrimInsetsFrameLayout$1
  implements o
{
  ScrimInsetsFrameLayout$1(ScrimInsetsFrameLayout paramScrimInsetsFrameLayout)
  {
  }

  public final aa a(View paramView, aa paramaa)
  {
    if (this.lZ.lY == null)
      this.lZ.lY = new Rect();
    this.lZ.lY.set(paramaa.getSystemWindowInsetLeft(), paramaa.getSystemWindowInsetTop(), paramaa.getSystemWindowInsetRight(), paramaa.getSystemWindowInsetBottom());
    this.lZ.a(paramaa);
    paramView = this.lZ;
    if (Build.VERSION.SDK_INT >= 20)
    {
      bool = ((WindowInsets)paramaa.NF).hasSystemWindowInsets();
      if ((bool) && (this.lZ.lX != null))
        break label120;
    }
    label120: for (boolean bool = true; ; bool = false)
    {
      paramView.setWillNotDraw(bool);
      s.R(this.lZ);
      return paramaa.et();
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.design.internal.ScrimInsetsFrameLayout.1
 * JD-Core Version:    0.6.2
 */