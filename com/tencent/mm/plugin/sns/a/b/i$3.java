package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cbd;
import java.util.LinkedList;

final class i$3
  implements Runnable
{
  i$3(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35752);
    if ((System.currentTimeMillis() - i.b(this.qEJ) >= 60000L) || (i.a(this.qEJ).vDW.size() > 1000))
    {
      if ((i.a(this.qEJ) != null) && (i.a(this.qEJ).vDW.size() > 0))
        i.d(this.qEJ);
      i.a(this.qEJ, 0L);
    }
    AppMethodBeat.o(35752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.i.3
 * JD-Core Version:    0.6.2
 */