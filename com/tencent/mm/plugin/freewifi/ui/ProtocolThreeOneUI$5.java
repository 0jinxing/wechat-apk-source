package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

final class ProtocolThreeOneUI$5
  implements k.a
{
  private int mAd = -999999999;

  ProtocolThreeOneUI$5(ProtocolThreeOneUI paramProtocolThreeOneUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(21125);
    ProtocolThreeOneUI.a(this.mAx, this.mAx.bzz());
    if (this.mAd != ProtocolThreeOneUI.a(this.mAx))
    {
      this.mAd = ProtocolThreeOneUI.a(this.mAx);
      this.mAx.vT(ProtocolThreeOneUI.a(this.mAx));
    }
    AppMethodBeat.o(21125);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.5
 * JD-Core Version:    0.6.2
 */