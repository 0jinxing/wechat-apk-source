package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class d$b
  implements Comparable<b>
{
  public g.c mDO;
  public int mDP = -1;
  public int mDQ = -1;

  public final String bAk()
  {
    AppMethodBeat.i(114241);
    Object localObject;
    if ((this.mDO != null) && (this.mDO.mEg.size() > 0))
    {
      localObject = this.mDO.mEg.iterator();
      while (((Iterator)localObject).hasNext())
      {
        g.b localb = (g.b)((Iterator)localObject).next();
        if (localb.mEe == g.d.mEj)
        {
          localObject = localb.content;
          AppMethodBeat.o(114241);
        }
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(114241);
    }
  }

  public final boolean isAvailable()
  {
    if ((this.mDP != -1) && (this.mDQ != -1));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(114242);
    if (this.mDO == null);
    for (String str = ""; ; str = this.mDO.bAn().replaceAll("​", ","))
    {
      str = String.format("FTSQueryHLRequest.Item %s %d %d", new Object[] { str, Integer.valueOf(this.mDP), Integer.valueOf(this.mDQ) });
      AppMethodBeat.o(114242);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.d.b
 * JD-Core Version:    0.6.2
 */