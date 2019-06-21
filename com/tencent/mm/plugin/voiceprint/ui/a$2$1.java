package com.tencent.mm.plugin.voiceprint.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2$1
  implements Animation.AnimationListener
{
  a$2$1(a.2 param2)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(26250);
    ab.i("MicroMsg.VoiceViewAnimationHelper", "next end");
    if (this.sMX.sMV != null)
      this.sMX.sMV.cHW();
    AppMethodBeat.o(26250);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.a.2.1
 * JD-Core Version:    0.6.2
 */