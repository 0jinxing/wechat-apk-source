package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class m$1
  implements Runnable
{
  m$1(m paramm, String paramString, boolean paramBoolean, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87759);
    synchronized (this.kbT.kbO)
    {
      Object localObject2 = (Set)this.kbT.kbO.get(this.kbS);
      if ((localObject2 != null) && (((Set)localObject2).size() > 0))
      {
        ??? = new HashSet();
        ((Set)???).addAll((Collection)localObject2);
        ??? = ((Set)???).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (m.a)((Iterator)???).next();
          if (localObject2 != null)
            ((m.a)localObject2).a(this.fBW, this.ewh);
        }
      }
    }
    AppMethodBeat.o(87759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.m.1
 * JD-Core Version:    0.6.2
 */