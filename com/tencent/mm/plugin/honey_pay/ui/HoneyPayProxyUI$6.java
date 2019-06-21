package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.atk;
import com.tencent.mm.protocal.protobuf.bnn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayProxyUI$6
  implements p.a
{
  HoneyPayProxyUI$6(HoneyPayProxyUI paramHoneyPayProxyUI, com.tencent.mm.plugin.honey_pay.a.m paramm)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41928);
    ab.i(this.nsM.TAG, "state: %s", new Object[] { Integer.valueOf(this.nsO.nqK.wps.state) });
    if (this.nsO.nqK.wps.state == 1)
      HoneyPayProxyUI.a(this.nsM, this.nsO.nqK);
    while (true)
    {
      this.nsM.finish();
      AppMethodBeat.o(41928);
      return;
      HoneyPayProxyUI.b(this.nsM, this.nsO.nqK);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI.6
 * JD-Core Version:    0.6.2
 */