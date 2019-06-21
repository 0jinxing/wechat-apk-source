package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.sdk.platformtools.ah;

final class e$1
  implements Runnable
{
  e$1(e.a parama, c paramc, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32862);
    int i = this.zda.jPL.getHeight();
    int j = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 20);
    int k = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 168);
    atb localatb = new atb();
    localatb.cuu = this.zdb.cuu;
    localatb.wwQ = new atc();
    atc localatc = localatb.wwQ;
    if (this.zdc)
    {
      str = this.zdb.ffT;
      localatc.wwV = str;
      localatc = localatb.wwQ;
      if (!this.zdc)
        break label176;
    }
    label176: for (String str = this.zdb.ffU; ; str = this.zdb.ffS)
    {
      localatc.wwY = str;
      ((com.tencent.mm.plugin.luckymoney.a.a)g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).a(this.zda.ohc, i - j, k, localatb, this.zdc);
      AppMethodBeat.o(32862);
      return;
      str = this.zdb.ffR;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.e.1
 * JD-Core Version:    0.6.2
 */