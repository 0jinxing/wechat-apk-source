package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.bkc;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayCardManagerUI$15
  implements p.a
{
  HoneyPayCardManagerUI$15(HoneyPayCardManagerUI paramHoneyPayCardManagerUI)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41804);
    HoneyPayCardManagerUI.a(this.nrS, HoneyPayCardManagerUI.b(this.nrS));
    if (HoneyPayCardManagerUI.c(this.nrS) != null)
      HoneyPayCardManagerUI.a(this.nrS, HoneyPayCardManagerUI.OE(HoneyPayCardManagerUI.c(this.nrS).wNk));
    HoneyPayCardManagerUI.d(this.nrS);
    AppMethodBeat.o(41804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.15
 * JD-Core Version:    0.6.2
 */