package com.tencent.mm.plugin.voiceprint.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$5
  implements Animation.AnimationListener
{
  a$5(a.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(26255);
    if (this.sMU != null)
      this.sMU.cHW();
    AppMethodBeat.o(26255);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(26254);
    if (this.sMU != null)
      this.sMU.cHV();
    AppMethodBeat.o(26254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.a.5
 * JD-Core Version:    0.6.2
 */