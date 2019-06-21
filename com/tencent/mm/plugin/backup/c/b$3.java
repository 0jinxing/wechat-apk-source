package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.f.b;
import java.util.LinkedList;

public final class b$3
  implements Runnable
{
  public b$3(b paramb, b.b paramb1, LinkedList paramLinkedList, f.b paramb2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17169);
    if ((!this.jry.jrv) && (this.jrz != null))
      this.jrz.a(this.jrA, this.jrB, this.jrC);
    AppMethodBeat.o(17169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.b.3
 * JD-Core Version:    0.6.2
 */