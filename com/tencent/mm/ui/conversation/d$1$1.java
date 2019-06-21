package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1$1
  implements Runnable
{
  d$1$1(d.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34173);
    ab.d("MicroMsg.ConvUnreadHelper", "refresh main ui unread count.");
    this.zri.zrh.zrd.notifyDataSetChanged();
    this.zri.zrh.dIp();
    AppMethodBeat.o(34173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.d.1.1
 * JD-Core Version:    0.6.2
 */