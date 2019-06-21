package com.tencent.mm.plugin.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.f.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

final class b$2$1
  implements Runnable
{
  b$2$1(b.2 param2, h.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18574);
    ab.d("MicroMsg.CalcWxService", "on notify change [%s] [%d]", new Object[] { this.jZZ.oqJ, Integer.valueOf(this.jZZ.oqK.size()) });
    if ("delete".equals(this.jZZ.oqJ))
      AppMethodBeat.o(18574);
    while (true)
    {
      return;
      int i;
      Iterator localIterator;
      if ("delete".equals(this.jZZ.oqJ))
      {
        i = 2;
        localIterator = this.jZZ.oqK.iterator();
      }
      while (true)
      {
        label93: if (!localIterator.hasNext())
          break label222;
        Object localObject = (bi)localIterator.next();
        if (localObject != null)
        {
          b localb = this.kaa.jZY;
          long l = ((cy)localObject).field_msgId;
          if (localb.jZK);
          for (boolean bool = localb.jZJ.contains(Long.valueOf(l)); ; bool = false)
          {
            if (!bool)
              break label194;
            ab.d("MicroMsg.CalcWxService", "it locked now [%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId) });
            break label93;
            i = 1;
            break;
          }
          label194: localObject = new a((bi)localObject, i);
          b.d(this.kaa.jZY).aa((Runnable)localObject);
        }
      }
      label222: AppMethodBeat.o(18574);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.2.1
 * JD-Core Version:    0.6.2
 */