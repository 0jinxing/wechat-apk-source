package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.List;

final class m$3
  implements n.c
{
  m$3(List paramList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(30599);
    paraml.ax(1193046, 2131301426, 2130838189);
    Iterator localIterator = this.yIS.iterator();
    while (localIterator.hasNext())
      paraml.add((String)localIterator.next());
    AppMethodBeat.o(30599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.3
 * JD-Core Version:    0.6.2
 */