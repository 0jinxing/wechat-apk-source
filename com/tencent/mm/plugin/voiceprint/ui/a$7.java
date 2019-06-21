package com.tencent.mm.plugin.voiceprint.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$7
  implements Animation.AnimationListener
{
  a$7(a.a parama)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(26259);
    if (this.sMU != null)
      this.sMU.cHW();
    AppMethodBeat.o(26259);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(26258);
    if (this.sMU != null)
      this.sMU.cHV();
    AppMethodBeat.o(26258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.a.7
 * JD-Core Version:    0.6.2
 */