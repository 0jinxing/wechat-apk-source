package com.tencent.mm.plugin.sns.abtest;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$3
  implements Animation.AnimationListener
{
  b$3(b paramb)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(35672);
    if (this.qCP.qCz != null)
      this.qCP.qCz.setVisibility(0);
    this.qCP.qCN = false;
    this.qCP.qCL = true;
    AppMethodBeat.o(35672);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    this.qCP.qCN = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.b.3
 * JD-Core Version:    0.6.2
 */