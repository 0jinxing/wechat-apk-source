package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class ac$1
  implements Runnable
{
  ac$1(ac paramac)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68059);
    if (!g.RK())
      AppMethodBeat.o(68059);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      y localy = new y();
      if (localy.puW.oof.size() > 0)
      {
        for (int i = 0; i < localy.puW.oof.size(); i++)
          y.Vm(((w)localy.puW.oof.get(i)).ptN);
        localy.puW.oof.clear();
        localy.save();
      }
      ab.i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(68059);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ac.1
 * JD-Core Version:    0.6.2
 */