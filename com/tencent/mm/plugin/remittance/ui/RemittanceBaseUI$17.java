package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.a.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceBaseUI$17
  implements a.a
{
  RemittanceBaseUI$17(RemittanceBaseUI paramRemittanceBaseUI)
  {
  }

  public final boolean a(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44841);
    this.pRX.pRt = paramBoolean;
    if (!bo.isNullOrNil(paramString1))
    {
      this.pRX.eeO = paramString1;
      if (!this.pRX.pRt)
      {
        if (bo.isNullOrNil(paramString2))
          break label119;
        this.pRX.mName = paramString2;
        label53: if (bo.isNullOrNil(paramString3))
          break label130;
        this.pRX.pdC = paramString3;
        label70: if (bo.isNullOrNil(paramString4))
          break label141;
      }
    }
    label130: label141: for (this.pRX.pRs = paramString4; ; this.pRX.pRs = null)
    {
      RemittanceBaseUI.c(this.pRX);
      RemittanceBaseUI.d(this.pRX);
      AppMethodBeat.o(44841);
      return true;
      this.pRX.eeO = null;
      break;
      label119: this.pRX.mName = null;
      break label53;
      this.pRX.pdC = null;
      break label70;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.17
 * JD-Core Version:    0.6.2
 */