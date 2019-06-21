package com.tencent.mm.plugin.gallery.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gallery.a.a;

final class f$1$2
  implements Animation.AnimationListener
{
  f$1$2(f.1 param1)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(21571);
    a.swap(f.d(this.mRO.mRM), f.e(this.mRO.mRM), f.f(this.mRO.mRM));
    if (f.a(this.mRO.mRM) != null)
      if ((this.mRO.cPK > f.e(this.mRO.mRM)) && (this.mRO.cPK <= f.f(this.mRO.mRM)))
      {
        f.a(this.mRO.mRM).X(f.e(this.mRO.mRM), f.f(this.mRO.mRM), this.mRO.cPK - 1);
        AppMethodBeat.o(21571);
      }
    while (true)
    {
      return;
      if ((this.mRO.cPK < f.e(this.mRO.mRM)) && (this.mRO.cPK >= f.f(this.mRO.mRM)))
      {
        f.a(this.mRO.mRM).X(f.e(this.mRO.mRM), f.f(this.mRO.mRM), this.mRO.cPK + 1);
        AppMethodBeat.o(21571);
      }
      else if (f.e(this.mRO.mRM) == this.mRO.cPK)
      {
        f.a(this.mRO.mRM).X(f.e(this.mRO.mRM), f.f(this.mRO.mRM), f.f(this.mRO.mRM));
        AppMethodBeat.o(21571);
      }
      else
      {
        f.a(this.mRO.mRM).X(f.e(this.mRO.mRM), f.f(this.mRO.mRM), this.mRO.cPK);
        AppMethodBeat.o(21571);
      }
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f.1.2
 * JD-Core Version:    0.6.2
 */