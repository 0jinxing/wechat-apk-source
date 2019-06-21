package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class b$2
  implements Runnable
{
  b$2(b paramb, b.a parama, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17168);
    if ((!this.jry.jrv) && (this.jrw != null))
      this.jrw.B(this.jrx);
    AppMethodBeat.o(17168);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.b.2
 * JD-Core Version:    0.6.2
 */