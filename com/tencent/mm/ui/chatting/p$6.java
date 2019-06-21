package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.chatting.c.b.aj;
import com.tencent.mm.ui.chatting.d.a;

final class p$6
  implements Runnable
{
  p$6(p paramp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30628);
    synchronized (p.f(this.yJn))
    {
      if (p.g(this.yJn))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.ChattingFooterEventImpl", "jacks already stop before begin!!");
        AppMethodBeat.o(30628);
        return;
      }
      p.h(this.yJn);
      p.b(this.yJn).ae(100L, 100L);
      p.a(this.yJn, false);
      p.c(this.yJn).ae(200L, 200L);
      p.d(this.yJn).Le(p.e(this.yJn).getListView().getHeight());
      d locald = ((aj)p.e(this.yJn).aF(aj.class)).dFm();
      locald.isRecording = true;
      locald.dBB();
      locald.dBw();
      p.i(this.yJn);
      this.yJn.yod.setKeepScreenOn(true);
      ((com.tencent.mm.ui.chatting.c.b.ab)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.ab.class)).OE(3);
      ((com.tencent.mm.ui.chatting.c.b.ab)p.e(this.yJn).aF(com.tencent.mm.ui.chatting.c.b.ab.class)).keepSignalling();
      p.dCo();
      ((aj)p.e(this.yJn).aF(aj.class)).a(p.e(this.yJn).yTx, true);
      AppMethodBeat.o(30628);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.6
 * JD-Core Version:    0.6.2
 */