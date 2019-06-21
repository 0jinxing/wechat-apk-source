package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class am$3
  implements n.c
{
  am$3(List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(31012);
    Iterator localIterator = this.yMk.iterator();
    while (localIterator.hasNext())
      paraml.add((String)localIterator.next());
    AppMethodBeat.o(31012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.am.3
 * JD-Core Version:    0.6.2
 */