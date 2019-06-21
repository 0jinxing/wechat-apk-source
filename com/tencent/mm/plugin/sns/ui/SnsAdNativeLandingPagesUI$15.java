package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e;
import com.tencent.mm.sdk.platformtools.ak;

final class SnsAdNativeLandingPagesUI$15
  implements AdLandingPagesProxy.e
{
  SnsAdNativeLandingPagesUI$15(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void ao(Object paramObject)
  {
    AppMethodBeat.i(38649);
    SnsAdNativeLandingPagesUI.k(this.roM).removeCallbacksAndMessages(null);
    SnsAdNativeLandingPagesUI.k(this.roM).post(new SnsAdNativeLandingPagesUI.15.1(this, paramObject));
    AppMethodBeat.o(38649);
  }

  public final void f(int paramInt1, int paramInt2, Object paramObject)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.15
 * JD-Core Version:    0.6.2
 */