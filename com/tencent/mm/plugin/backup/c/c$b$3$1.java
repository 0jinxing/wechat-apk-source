package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.g.l.a;
import com.tencent.mm.sdk.g.d;
import java.util.LinkedList;

final class c$b$3$1
  implements l.a
{
  c$b$3$1(c.b.3 param3)
  {
  }

  public final void D(LinkedList<Long> paramLinkedList)
  {
    AppMethodBeat.i(17181);
    d.h(new c.b.3.1.1(this, paramLinkedList), "AddBigFileToQueue").start();
    AppMethodBeat.o(17181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.3.1
 * JD-Core Version:    0.6.2
 */