package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.SwipeBackLayout;

final class SnsAdNativeLandingPagesUI$6
  implements a
{
  SnsAdNativeLandingPagesUI$6(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void aZ(float paramFloat)
  {
    AppMethodBeat.i(38631);
    SnsAdNativeLandingPagesUI.G(this.roM).setAlpha(1.0F - paramFloat);
    AppMethodBeat.o(38631);
  }

  public final void onAnimationEnd()
  {
    AppMethodBeat.i(38632);
    SnsAdNativeLandingPagesUI.H(this.roM);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "sns exit anim end");
    this.roM.finish();
    this.roM.overridePendingTransition(2131034130, 2131034130);
    if (this.roM.isSupportNavigationSwipeBack())
      this.roM.getSwipeBackLayout().setEnableGesture(true);
    AppMethodBeat.o(38632);
  }

  public final void onAnimationStart()
  {
    AppMethodBeat.i(38630);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "sns exit anim start");
    SnsAdNativeLandingPagesUI.e(this.roM).setVisibility(4);
    AppMethodBeat.o(38630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.6
 * JD-Core Version:    0.6.2
 */