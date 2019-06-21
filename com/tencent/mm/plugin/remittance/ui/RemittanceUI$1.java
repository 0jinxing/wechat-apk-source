package com.tencent.mm.plugin.remittance.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.model.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class RemittanceUI$1
  implements p.a
{
  RemittanceUI$1(RemittanceUI paramRemittanceUI, e parame)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45160);
    ab.e("MicroMsg.RemittanceUI", "net error: %s", new Object[] { this.pWT });
    AppMethodBeat.o(45160);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceUI.1
 * JD-Core Version:    0.6.2
 */