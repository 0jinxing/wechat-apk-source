package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

final class g$8
  implements Runnable
{
  g$8(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36143);
    if (g.d(this.qIr))
    {
      ab.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
      AppMethodBeat.o(36143);
    }
    while (true)
    {
      return;
      if (g.e(this.qIr).size() > 0)
      {
        ab.i("MicroMsg.LazyerImageLoader2", "tryStart loaderlist size:" + g.e(this.qIr).size());
        ((g.b)g.e(this.qIr).removeLast()).u(new String[] { "" });
      }
      AppMethodBeat.o(36143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.8
 * JD-Core Version:    0.6.2
 */