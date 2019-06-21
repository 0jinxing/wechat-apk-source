package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g$c
{
  public List<g.b> mEg;

  public g$c()
  {
    AppMethodBeat.i(114254);
    this.mEg = new ArrayList();
    AppMethodBeat.o(114254);
  }

  private List<String> bAm()
  {
    AppMethodBeat.i(114255);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mEg.iterator();
    while (localIterator.hasNext())
    {
      g.b localb = (g.b)localIterator.next();
      if (!localArrayList.contains(localb.content))
        localArrayList.add(localb.content);
    }
    AppMethodBeat.o(114255);
    return localArrayList;
  }

  public final String bAn()
  {
    AppMethodBeat.i(114256);
    Object localObject = bAm();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    if (i < ((List)localObject).size())
    {
      String str = (String)((List)localObject).get(i);
      localStringBuilder.append("\"");
      localStringBuilder.append(str);
      char c = str.charAt(str.length() - 1);
      if ((g.u(c)) || (g.v(c)))
        localStringBuilder.append("\"*");
      while (true)
      {
        if (i != ((List)localObject).size() - 1)
          localStringBuilder.append(" OR ");
        i++;
        break;
        localStringBuilder.append("\"");
      }
    }
    localObject = localStringBuilder.toString();
    AppMethodBeat.o(114256);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.g.c
 * JD-Core Version:    0.6.2
 */