package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

final class aw$3
  implements Runnable
{
  aw$3(aw paramaw, int paramInt, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36684);
    if (af.cnn())
    {
      ab.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
      AppMethodBeat.o(36684);
    }
    while (true)
    {
      return;
      Iterator localIterator = aw.c(this.qNp).iterator();
      while (localIterator.hasNext())
      {
        aw.a locala = (aw.a)localIterator.next();
        if (locala != null)
          locala.ad(this.qNq, this.fBW);
      }
      AppMethodBeat.o(36684);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aw.3
 * JD-Core Version:    0.6.2
 */