package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lp
{
  private final String a;
  private int b;
  private int c;
  private List<lm> d;

  public lp(int paramInt1, int paramInt2, List<lm> paramList)
  {
    AppMethodBeat.i(100465);
    this.a = "_night";
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramList;
    Collections.sort(paramList, new lp.1(this));
    AppMethodBeat.o(100465);
  }

  public int a()
  {
    return this.b;
  }

  public String[] a(a parama, int paramInt)
  {
    AppMethodBeat.i(100466);
    Iterator localIterator = this.d.iterator();
    Object localObject;
    while (true)
      if (localIterator.hasNext())
      {
        localObject = (lm)localIterator.next();
        if (((lm)localObject).a(parama))
          if (((paramInt == 13) || (paramInt == 10)) && (((lm)localObject).d() != null) && (((lm)localObject).d().length() > 0))
          {
            parama = ((lm)localObject).b() + "_night";
            localObject = ((lm)localObject).d();
            AppMethodBeat.o(100466);
            parama = new String[] { parama, localObject };
          }
      }
    while (true)
    {
      return parama;
      parama = ((lm)localObject).b();
      localObject = ((lm)localObject).c();
      AppMethodBeat.o(100466);
      parama = new String[] { parama, localObject };
      continue;
      parama = null;
      AppMethodBeat.o(100466);
    }
  }

  public int b()
  {
    return this.c;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lp
 * JD-Core Version:    0.6.2
 */