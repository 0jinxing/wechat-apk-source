package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

final class FreeWifiStateUI$3
  implements k.a
{
  private int mAd = -999999999;

  FreeWifiStateUI$3(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(21073);
    FreeWifiStateUI.a(this.mAc, this.mAc.bzz());
    if (this.mAd != FreeWifiStateUI.a(this.mAc))
    {
      this.mAd = FreeWifiStateUI.a(this.mAc);
      this.mAc.uQ(FreeWifiStateUI.a(this.mAc));
    }
    AppMethodBeat.o(21073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.3
 * JD-Core Version:    0.6.2
 */