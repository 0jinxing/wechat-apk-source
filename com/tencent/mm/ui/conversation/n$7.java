package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

final class n$7
  implements Runnable
{
  n$7(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34602);
    if (!ah.dox())
    {
      ah.ph(true);
      al.n(new n.7.1(this), 100L);
    }
    g.BO(8);
    AppMethodBeat.o(34602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n.7
 * JD-Core Version:    0.6.2
 */