package com.tencent.mm.plugin.honey_pay.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.d;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.protobuf.ahw;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayCheckPwdUI$3
  implements p.a
{
  HoneyPayCheckPwdUI$3(HoneyPayCheckPwdUI paramHoneyPayCheckPwdUI, d paramd)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41837);
    HoneyPayCheckPwdUI.a(this.nse, this.nsf.nqA.woi);
    if (this.nsf.nqA.woj != null)
    {
      c.a(this.nse, this.nsf.nqA.woj, new HoneyPayCheckPwdUI.3.1(this));
      this.nse.bgk();
      AppMethodBeat.o(41837);
    }
    while (true)
    {
      return;
      HoneyPayCheckPwdUI.d(this.nse);
      AppMethodBeat.o(41837);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.3
 * JD-Core Version:    0.6.2
 */