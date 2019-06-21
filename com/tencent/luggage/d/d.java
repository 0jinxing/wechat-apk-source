package com.tencent.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  final LinkedList<Class<? extends a>> bPc;

  public d()
  {
    AppMethodBeat.i(90770);
    this.bPc = new LinkedList();
    AppMethodBeat.o(90770);
  }

  public final void B(List<Class<? extends a>> paramList)
  {
    AppMethodBeat.i(90771);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Class)localIterator.next();
      this.bPc.add(paramList);
    }
    AppMethodBeat.o(90771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.d
 * JD-Core Version:    0.6.2
 */