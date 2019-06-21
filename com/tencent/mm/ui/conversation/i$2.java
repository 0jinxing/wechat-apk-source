package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class i$2
  implements Runnable
{
  i$2(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34398);
    if (!aw.RK())
    {
      i.c(this.zuh).stopTimer();
      ab.e("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange acc has not ready");
      AppMethodBeat.o(34398);
    }
    while (true)
    {
      return;
      long l = ah.anU();
      i.d(this.zuh);
      l = ah.gb(l) * 3L;
      ab.d("MicroMsg.EnterpriseConversationAdapter", "dkpno handleDataChange guest:%d old:%d needNotify:%b", new Object[] { Long.valueOf(l), Long.valueOf(i.dIL()), Boolean.valueOf(i.a(this.zuh)) });
      i.nu((l + i.dIL()) / 2L);
      i.e(this.zuh);
      ap localap = i.c(this.zuh);
      l = i.dIL();
      localap.ae(l, l);
      AppMethodBeat.o(34398);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.i.2
 * JD-Core Version:    0.6.2
 */