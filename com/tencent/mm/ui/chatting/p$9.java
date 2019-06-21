package com.tencent.mm.ui.chatting;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.d.a;

final class p$9
  implements ap.a
{
  p$9(p paramp)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(30631);
    long l = p.a(this.yJn).EV();
    ab.d("MicroMsg.ChattingFooterEventImpl", "ms ".concat(String.valueOf(l)));
    if ((l >= 50000L) && (l <= 60000L))
    {
      if (!p.k(this.yJn))
      {
        bo.gM(p.e(this.yJn).yTx.getContext());
        p.a(this.yJn, true);
      }
      int i = (int)((60000L - l) / 1000L);
      p.d(this.yJn).setRecordNormalWording(p.e(this.yJn).yTx.getMMResources().getQuantityString(2131361794, i, new Object[] { Integer.valueOf(i) }));
    }
    if (l >= 60000L)
    {
      ab.v("MicroMsg.ChattingFooterEventImpl", "record stop on countdown");
      p.l(this.yJn);
      p.d(this.yJn).bvH();
      ay.au(p.e(this.yJn).yTx.getContext(), 2131304062);
      AppMethodBeat.o(30631);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(30631);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.9
 * JD-Core Version:    0.6.2
 */