package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class a$g extends com.tencent.mm.plugin.fts.a.a.a
{
  private int[] mGc;
  private int mGd = 0;
  private int moz = 0;

  public a$g(a parama, int[] paramArrayOfInt)
  {
    this.mGc = paramArrayOfInt;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136677);
    String str = String.format("{touched: %d users: %d}", new Object[] { Integer.valueOf(this.moz), Integer.valueOf(this.mGd) });
    AppMethodBeat.o(136677);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136676);
    Object localObject = a.a(this.mFK).g(this.mGc, 1);
    this.moz = ((List)localObject).size();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      String str = localb.mDx;
      if (!a.b(this.mFK).containsKey(str))
      {
        List localList = (List)localHashMap.get(str);
        localObject = localList;
        if (localList == null)
        {
          localObject = new ArrayList(16);
          localHashMap.put(str, localObject);
        }
        ((List)localObject).add(Long.valueOf(localb.mDv));
      }
    }
    a.b(this.mFK).putAll(localHashMap);
    this.mGd = localHashMap.size();
    AppMethodBeat.o(136676);
    return true;
  }

  public final String getName()
  {
    return "MarkAllContactDirtyTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.g
 * JD-Core Version:    0.6.2
 */