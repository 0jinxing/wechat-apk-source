package com.tencent.mm.plugin.sns.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsTimeLineUI$31
  implements Animation.AnimationListener
{
  SnsTimeLineUI$31(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(39501);
    ab.i("MicroMsg.SnsTimeLineUI", "refreshAnim end");
    AppMethodBeat.o(39501);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
    AppMethodBeat.i(39500);
    ab.i("MicroMsg.SnsTimeLineUI", "refreshAnim repeat");
    AppMethodBeat.o(39500);
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(39499);
    ab.i("MicroMsg.SnsTimeLineUI", "refreshAnim start");
    AppMethodBeat.o(39499);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.31
 * JD-Core Version:    0.6.2
 */