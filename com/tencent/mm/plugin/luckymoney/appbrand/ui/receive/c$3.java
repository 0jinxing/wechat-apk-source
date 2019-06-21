package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements d.a
{
  c$3(c paramc)
  {
  }

  public final void d(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(42127);
    if (paramInt == -1)
    {
      paramIntent = this.nTO;
      if (paramIntent.nTK == null)
      {
        ab.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.succeed ui == null");
        AppMethodBeat.o(42127);
      }
    }
    while (true)
    {
      return;
      paramIntent.nTK.bKV();
      paramIntent.nTK.c(-1, new Intent());
      AppMethodBeat.o(42127);
      continue;
      this.nTO.af(paramIntent);
      AppMethodBeat.o(42127);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.c.3
 * JD-Core Version:    0.6.2
 */