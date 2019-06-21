package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingPagesUI$11
  implements i.a
{
  SnsAdNativeLandingPagesUI$11(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI, View paramView)
  {
  }

  private void csM()
  {
    AppMethodBeat.i(38639);
    if ((this.roP != null) && (this.roP.getParent() != null))
      ((ViewGroup)this.roP.getParent()).removeView(this.roP);
    SnsAdNativeLandingPagesUI.O(this.roM);
    AppMethodBeat.o(38639);
  }

  public final void cpF()
  {
    AppMethodBeat.i(38637);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "onDismiss");
    csM();
    AppMethodBeat.o(38637);
  }

  public final void cpG()
  {
    AppMethodBeat.i(38638);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "onCancel");
    csM();
    AppMethodBeat.o(38638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.11
 * JD-Core Version:    0.6.2
 */