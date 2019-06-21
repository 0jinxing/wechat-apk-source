package com.tencent.mm.plugin.voiceprint.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$6
  implements Animation.AnimationListener
{
  a$6(a.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(26257);
    if (this.sMU != null)
      this.sMU.cHW();
    AppMethodBeat.o(26257);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(26256);
    if (this.sMU != null)
      this.sMU.cHV();
    AppMethodBeat.o(26256);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.a.6
 * JD-Core Version:    0.6.2
 */