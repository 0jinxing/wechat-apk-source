package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class e$2
  implements Runnable
{
  e$2(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34186);
    if (!aw.RK())
    {
      e.f(this.zrE).stopTimer();
      ab.e("MicroMsg.ConversationAdapter", "dkpno handleDataChange acc has not ready");
      AppMethodBeat.o(34186);
    }
    while (true)
    {
      return;
      long l = ah.anU();
      e.g(this.zrE);
      l = ah.gb(l) * 3L;
      ab.d("MicroMsg.ConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", new Object[] { Long.valueOf(l), Long.valueOf(e.dIt()), Boolean.valueOf(e.d(this.zrE)) });
      e.nt((l + e.dIt()) / 2L);
      e.h(this.zrE);
      ap localap = e.f(this.zrE);
      l = e.dIt();
      localap.ae(l, l);
      AppMethodBeat.o(34186);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.e.2
 * JD-Core Version:    0.6.2
 */