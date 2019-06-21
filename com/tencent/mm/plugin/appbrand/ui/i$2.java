package com.tencent.mm.plugin.appbrand.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.sdk.platformtools.al;

final class i$2
  implements Animation.AnimationListener
{
  i$2(Runnable paramRunnable, i parami)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(133155);
    if (this.ijG != null)
      al.d(this.ijG);
    AppMethodBeat.o(133155);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(133156);
    this.gVf.gNE.setWillNotDraw(false);
    AppMethodBeat.o(133156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.i.2
 * JD-Core Version:    0.6.2
 */