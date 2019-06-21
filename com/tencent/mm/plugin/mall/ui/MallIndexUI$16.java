package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.uo.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class MallIndexUI$16
  implements Runnable
{
  MallIndexUI$16(MallIndexUI paramMallIndexUI, uo paramuo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43221);
    if (!bo.isNullOrNil(this.kHm.cQK.cQM))
      e.a(this.onu.omz, this.kHm.cQK.cQM, this.kHm.cQK.content, this.kHm.cQK.url);
    AppMethodBeat.o(43221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.16
 * JD-Core Version:    0.6.2
 */