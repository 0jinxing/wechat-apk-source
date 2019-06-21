package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.model.e;
import com.tencent.mm.protocal.protobuf.px;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class RemittanceUI$3
  implements p.a
{
  RemittanceUI$3(RemittanceUI paramRemittanceUI, e parame)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45162);
    ab.d("MicroMsg.RemittanceUI", "mask_name: %s truename_extend %s", new Object[] { this.pWT.pOI.vWW, this.pWT.pOI.pWR });
    this.pWU.pRx = this.pWT.pOI.vWW;
    this.pWU.pWR = this.pWT.pOI.pWR;
    this.pWU.pRa = this.pWT.pOI.vWX;
    RemittanceUI.a(this.pWU, this.pWT.pOI.pWS);
    this.pWU.cfH();
    AppMethodBeat.o(45162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceUI.3
 * JD-Core Version:    0.6.2
 */