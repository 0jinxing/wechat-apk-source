package com.tencent.mm.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$11
  implements Animation.AnimationListener
{
  a$11(a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(116383);
    this.zZU.getActionBar().setVisibility(0);
    this.zZU.getFooterBg().setVisibility(0);
    AppMethodBeat.o(116383);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.11
 * JD-Core Version:    0.6.2
 */