package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.sdk.platformtools.al;

final class SnsAdNativeLandingPagesUI$15$1
  implements Runnable
{
  SnsAdNativeLandingPagesUI$15$1(SnsAdNativeLandingPagesUI.15 param15, Object paramObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38648);
    SnsAdNativeLandingPagesUI localSnsAdNativeLandingPagesUI = this.roT.roM;
    String str1 = SnsAdNativeLandingPagesUI.l(this.roT.roM);
    String str2 = SnsAdNativeLandingPagesUI.m(this.roT.roM);
    String str3 = (String)this.roS;
    SnsAdNativeLandingPagesUI.n(this.roT.roM);
    SnsAdNativeLandingPagesUI.o(this.roT.roM);
    localSnsAdNativeLandingPagesUI.rnM = i.ai(str1, str2, str3);
    al.d(new SnsAdNativeLandingPagesUI.15.1.1(this));
    AppMethodBeat.o(38648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.15.1
 * JD-Core Version:    0.6.2
 */