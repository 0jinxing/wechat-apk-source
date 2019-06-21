package android.support.transition;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class h$1
  implements ViewTreeObserver.OnPreDrawListener
{
  h$1(h paramh)
  {
  }

  public final boolean onPreDraw()
  {
    this.yM.yJ = this.yM.mView.getMatrix();
    s.R(this.yM);
    if ((this.yM.yE != null) && (this.yM.yF != null))
    {
      this.yM.yE.endViewTransition(this.yM.yF);
      s.R(this.yM.yE);
      this.yM.yE = null;
      this.yM.yF = null;
    }
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.h.1
 * JD-Core Version:    0.6.2
 */