package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class b$a extends n<b.e>
{
  b$a(b paramb)
  {
  }

  private boolean a(CoordinatorLayout paramCoordinatorLayout, b.e parame, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      return super.a(paramCoordinatorLayout, parame, paramMotionEvent);
      if (paramCoordinatorLayout.d(parame, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
      {
        l.co().a(this.mR.mQ);
        continue;
        l.co().b(this.mR.mQ);
      }
    }
  }

  public final boolean h(View paramView)
  {
    return paramView instanceof b.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.b.a
 * JD-Core Version:    0.6.2
 */