package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.v;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.b.l;
import com.tencent.mm.plugin.choosemsgfile.b.b.m;
import java.util.Iterator;
import java.util.List;

public final class c extends a
  implements g
{
  boolean kuX;

  public c(com.tencent.mm.plugin.choosemsgfile.ui.a parama, List<com.tencent.mm.plugin.choosemsgfile.b.b.a> paramList)
  {
    super(parama, paramList);
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(54335);
    switch (paramInt)
    {
    default:
      paramViewGroup = m.m(paramViewGroup);
      AppMethodBeat.o(54335);
    case 0:
    }
    while (true)
    {
      return paramViewGroup;
      paramViewGroup = l.m(paramViewGroup);
      AppMethodBeat.o(54335);
    }
  }

  public final boolean bfz()
  {
    return this.kuX;
  }

  public final int gU(long paramLong)
  {
    AppMethodBeat.i(54336);
    Iterator localIterator = this.iJL.iterator();
    int i = -1;
    int j;
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.choosemsgfile.b.b.a locala = (com.tencent.mm.plugin.choosemsgfile.b.b.a)localIterator.next();
      j = i + 1;
      i = j;
      if (locala.kua != null)
      {
        i = j;
        if (locala.kua.field_msgId == paramLong)
          AppMethodBeat.o(54336);
      }
    }
    while (true)
    {
      return j;
      AppMethodBeat.o(54336);
      j = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.c
 * JD-Core Version:    0.6.2
 */