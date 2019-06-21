package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.axe;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Deprecated
public final class h extends j.b
{
  private axe fLC;

  public h(List<h.a> paramList)
  {
    super(36);
    AppMethodBeat.i(59997);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localLinkedList.add(((h.a)localIterator.next()).fLD);
    this.fLC = new axe();
    this.fLC.jBv = paramList.size();
    this.fLC.jBw = localLinkedList;
    this.oqT = this.fLC;
    AppMethodBeat.o(59997);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.h
 * JD-Core Version:    0.6.2
 */