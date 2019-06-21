package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class RemittanceBaseUI$30
  implements ao.b.a
{
  RemittanceBaseUI$30(RemittanceBaseUI paramRemittanceBaseUI, long paramLong)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(44861);
    if (paramBoolean)
    {
      ab.v("MicroMsg.RemittanceBaseUI", "getContact suc; cost=" + (bo.anU() - this.kEX) + " ms");
      b.U(paramString, 3);
    }
    while (true)
    {
      RemittanceBaseUI.i(this.pRX);
      AppMethodBeat.o(44861);
      return;
      ab.w("MicroMsg.RemittanceBaseUI", "getContact failed");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.30
 * JD-Core Version:    0.6.2
 */