package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.l;
import com.tencent.mm.protocal.protobuf.atj;
import com.tencent.mm.protocal.protobuf.bnl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayProxyUI$3
  implements p.a
{
  HoneyPayProxyUI$3(HoneyPayProxyUI paramHoneyPayProxyUI, l paraml)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41926);
    if (this.nsN.nqJ.wci != null)
      ab.i(this.nsM.TAG, "state: %s", new Object[] { Integer.valueOf(this.nsN.nqJ.wci.state) });
    HoneyPayProxyUI.a(this.nsM, this.nsN.nqJ);
    this.nsM.finish();
    AppMethodBeat.o(41926);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI.3
 * JD-Core Version:    0.6.2
 */