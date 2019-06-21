package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.SwipeBackLayout;

final class SnsAdNativeLandingPagesUI$4
  implements a
{
  SnsAdNativeLandingPagesUI$4(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void aZ(float paramFloat)
  {
    AppMethodBeat.i(38627);
    SnsAdNativeLandingPagesUI.G(this.roM).setAlpha(1.0F - paramFloat);
    AppMethodBeat.o(38627);
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(38628);
    SnsAdNativeLandingPagesUI.H(this.roM);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "sns enter anim end");
    SnsAdNativeLandingPagesUI.e(this.roM).setVisibility(0);
    SnsAdNativeLandingPagesUI.h(this.roM).setVisibility(0);
    SnsAdNativeLandingPagesUI.p(this.roM);
    SnsAdNativeLandingPagesUI.I(this.roM);
    if (this.roM.isSupportNavigationSwipeBack())
      this.roM.getSwipeBackLayout().setEnableGesture(true);
    AppMethodBeat.o(38628);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(38626);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "sns enter anim start");
    AppMethodBeat.o(38626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.4
 * JD-Core Version:    0.6.2
 */