package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.a.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceBaseUI$23$1
  implements a.a
{
  RemittanceBaseUI$23$1(RemittanceBaseUI.23 param23)
  {
  }

  public final boolean a(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(44847);
    this.pSc.pRX.pRt = paramBoolean;
    if (!bo.isNullOrNil(paramString1))
    {
      this.pSc.pRX.eeO = paramString1;
      if (this.pSc.pRX.pRt)
        break label188;
      if (bo.isNullOrNil(paramString2))
        break label146;
      this.pSc.pRX.mName = paramString2;
      label65: if (bo.isNullOrNil(paramString3))
        break label160;
      this.pSc.pRX.pdC = paramString3;
      label85: if (bo.isNullOrNil(paramString4))
        break label174;
      this.pSc.pRX.pRs = paramString4;
    }
    while (true)
    {
      RemittanceBaseUI.c(this.pSc.pRX);
      RemittanceBaseUI.d(this.pSc.pRX);
      AppMethodBeat.o(44847);
      return true;
      this.pSc.pRX.eeO = null;
      break;
      label146: this.pSc.pRX.mName = null;
      break label65;
      label160: this.pSc.pRX.pdC = null;
      break label85;
      label174: this.pSc.pRX.pRs = null;
      continue;
      label188: this.pSc.pRX.mName = null;
      this.pSc.pRX.pdC = null;
      this.pSc.pRX.pRs = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.23.1
 * JD-Core Version:    0.6.2
 */