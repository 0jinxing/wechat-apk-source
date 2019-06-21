package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.a;
import com.tencent.mm.pluginsdk.f.i;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.e;

final class k$5
  implements Runnable
{
  k$5(k paramk, che paramche)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34470);
    if ((this.zuR != null) && (this.zuR.nuo.equalsIgnoreCase(i.fN(ah.getContext()))))
      if ((e.ct(this.zuR.xga)) && (a.cM(this.zuR.xga)))
      {
        al.d(new k.5.1(this));
        AppMethodBeat.o(34470);
      }
    while (true)
    {
      return;
      al.d(new k.5.2(this));
      AppMethodBeat.o(34470);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.5
 * JD-Core Version:    0.6.2
 */