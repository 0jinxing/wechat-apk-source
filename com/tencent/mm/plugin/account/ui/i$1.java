package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class i$1
  implements n.c
{
  i$1(i parami, List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(125096);
    if (paraml.size() == 0)
    {
      Iterator localIterator = this.gCz.iterator();
      while (localIterator.hasNext())
        paraml.i((m)localIterator.next());
    }
    AppMethodBeat.o(125096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.i.1
 * JD-Core Version:    0.6.2
 */