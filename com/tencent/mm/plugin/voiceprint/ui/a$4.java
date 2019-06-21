package com.tencent.mm.plugin.voiceprint.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements Animation.AnimationListener
{
  a$4(a.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(26253);
    if (this.sMU != null)
      this.sMU.cHW();
    AppMethodBeat.o(26253);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.a.4
 * JD-Core Version:    0.6.2
 */