package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.d;
import java.util.Iterator;
import java.util.LinkedList;

public final class h extends g
{
  protected h(String paramString)
  {
    super(paramString);
  }

  public final void bEf()
  {
    AppMethodBeat.i(111246);
    LinkedList localLinkedList = s(optJSONArray("items"));
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      localc.ii(localc.mVk);
    }
    d.ac(localLinkedList);
    AppMethodBeat.o(111246);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.h
 * JD-Core Version:    0.6.2
 */