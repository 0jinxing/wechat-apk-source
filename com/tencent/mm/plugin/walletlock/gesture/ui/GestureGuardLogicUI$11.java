package com.tencent.mm.plugin.walletlock.gesture.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.walletlock.c.g;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.protocal.protobuf.bfp;
import com.tencent.mm.sdk.platformtools.ab;

final class GestureGuardLogicUI$11
  implements w.a
{
  GestureGuardLogicUI$11(GestureGuardLogicUI paramGestureGuardLogicUI, w.a parama)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(51596);
    ab.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOff, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString }));
    GestureGuardLogicUI.o(this.tVW);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      d.a(((bfp)paramb.fsH.fsP).wJw);
      g localg = g.tWY;
      g.nx(false);
      GestureGuardLogicUI.i(this.tVW);
      GestureGuardLogicUI.cTQ();
    }
    if (this.fux != null)
    {
      paramInt1 = this.fux.a(paramInt1, paramInt2, paramString, paramb, paramm);
      AppMethodBeat.o(51596);
    }
    while (true)
    {
      return paramInt1;
      AppMethodBeat.o(51596);
      paramInt1 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.11
 * JD-Core Version:    0.6.2
 */