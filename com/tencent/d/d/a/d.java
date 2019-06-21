package com.tencent.d.d.a;

import com.tencent.d.d.b.d.a;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements b
{
  private final HashSet<Integer> Atd;
  private final List<d.a> Ate;

  public d()
  {
    AppMethodBeat.i(114506);
    this.Atd = new HashSet();
    this.Ate = new ArrayList();
    AppMethodBeat.o(114506);
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(114507);
    if (parama.uid != 0)
      AppMethodBeat.o(114507);
    while (true)
    {
      return;
      if ((parama.Atj == 1) && (!"/sbin/adbd".equals(parama.name)))
      {
        new StringBuilder("ProcessRelationAnalyzer parent : ").append(parama.toString());
        h.dQH();
        this.Atd.add(Integer.valueOf(parama.pid));
        AppMethodBeat.o(114507);
      }
      else
      {
        if ((parama.Atj > 1) && ("sh".equals(parama.name)) && ("/system/bin/sh".equals(parama.name)))
        {
          new StringBuilder("ProcessRelationAnalyzer child : ").append(parama.toString());
          h.dQH();
          this.Ate.add(parama);
        }
        AppMethodBeat.o(114507);
      }
    }
  }

  public final boolean dQl()
  {
    AppMethodBeat.i(114508);
    Iterator localIterator = this.Ate.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      if (this.Atd.contains(Integer.valueOf(locala.Atj)))
      {
        new StringBuilder("ProcessRelationAnalyzer match : ").append(locala.toString());
        h.dQG();
        bool = true;
        AppMethodBeat.o(114508);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.d
 * JD-Core Version:    0.6.2
 */