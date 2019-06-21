package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.a.d;
import java.util.Vector;

final class j$1
  implements Runnable
{
  j$1(j paramj, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135675);
    if (!j.a(this.pJL).contains(this.pJK))
      j.a(this.pJL).add(this.pJK);
    AppMethodBeat.o(135675);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.j.1
 * JD-Core Version:    0.6.2
 */