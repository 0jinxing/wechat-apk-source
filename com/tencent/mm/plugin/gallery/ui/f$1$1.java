package com.tencent.mm.plugin.gallery.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1$1
  implements Animation.AnimationListener
{
  f$1$1(f.1 param1, int paramInt, RecyclerView.v paramv)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(21570);
    if (this.mRN == 2)
    {
      f.b(this.mRO.mRM, f.a(this.mRO.mRM, this.jbn.kj()));
      this.mRO.cPK = f.c(this.mRO.mRM);
      ab.i("MicroMsg.PreviewSelectedImageAdapter", "lastVisiblePos:%s", new Object[] { Integer.valueOf(this.mRO.cPK) });
    }
    AppMethodBeat.o(21570);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.f.1.1
 * JD-Core Version:    0.6.2
 */