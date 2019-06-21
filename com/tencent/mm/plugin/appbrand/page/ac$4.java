package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ac$4 extends bj<Boolean>
{
  ac$4(ac paramac, Boolean paramBoolean)
  {
    super(1000L, paramBoolean, (byte)0);
  }

  private Boolean aKg()
  {
    AppMethodBeat.i(91090);
    LinkedList localLinkedList;
    Iterator localIterator;
    try
    {
      ac localac = this.iuB;
      localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      localIterator = localac.iut.iterator();
      while (localIterator.hasNext())
        localLinkedList.add((ac.b)localIterator.next());
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.AppBrandWebViewCustomViewContainer", "removeAll error ".concat(String.valueOf(localException)));
    }
    while (true)
    {
      Boolean localBoolean = Boolean.FALSE;
      AppMethodBeat.o(91090);
      return localBoolean;
      localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
        localBoolean.pw(((ac.b)localIterator.next()).id);
      localLinkedList.clear();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ac.4
 * JD-Core Version:    0.6.2
 */