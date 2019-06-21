package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f.i;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;

final class k$5$1
  implements Runnable
{
  k$5$1(k.5 param5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34468);
    if ((k.i(this.zuS.zuQ) != null) && (k.i(this.zuS.zuQ).isShowing()))
    {
      ab.i("MicroMsg.InitHelper", "update dialog is showing.");
      AppMethodBeat.o(34468);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 60L, 1L, false);
      k.a(this.zuS.zuQ, com.tencent.mm.ui.base.h.a(k.a(this.zuS.zuQ), this.zuS.zuR.bzH, this.zuS.zuR.title, this.zuS.zuR.xgb, this.zuS.zuR.nna, false, new k.5.1.1(this), new k.5.1.2(this)));
      i.dia();
      AppMethodBeat.o(34468);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.5.1
 * JD-Core Version:    0.6.2
 */