package android.support.design.widget;

import android.support.v4.widget.t;
import android.support.v4.widget.t.a;
import android.view.MotionEvent;
import android.view.View;

public class n<V extends View> extends CoordinatorLayout.Behavior<V>
{
  t nl;
  private final t.a nv = new n.1(this);
  n.a rE;
  private boolean rF;
  private float rG = 0.0F;
  private boolean rH;
  int rI = 2;
  float rJ = 0.5F;
  float rK = 0.0F;
  float rL = 0.5F;

  static float c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }

  static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }

  static float p(float paramFloat)
  {
    return Math.min(Math.max(0.0F, paramFloat), 1.0F);
  }

  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    boolean bool2 = this.rF;
    boolean bool3 = bool2;
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      bool3 = bool2;
    case 2:
      if (bool3)
        if (this.nl == null)
          if (!this.rH)
            break label142;
      break;
    case 0:
    case 1:
    case 3:
    }
    label142: for (paramCoordinatorLayout = t.a(paramCoordinatorLayout, this.rG, this.nv); ; paramCoordinatorLayout = t.a(paramCoordinatorLayout, this.nv))
    {
      this.nl = paramCoordinatorLayout;
      bool1 = this.nl.f(paramMotionEvent);
      return bool1;
      this.rF = paramCoordinatorLayout.d(paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      bool3 = this.rF;
      break;
      this.rF = false;
      bool3 = bool2;
      break;
    }
  }

  public final boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent)
  {
    if (this.nl != null)
      this.nl.g(paramMotionEvent);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean h(View paramView)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.n
 * JD-Core Version:    0.6.2
 */