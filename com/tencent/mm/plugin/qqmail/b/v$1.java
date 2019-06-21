package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class v$1
  implements Runnable
{
  v$1(v paramv, v.d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(67992);
    v.b localb = new v.b(this.puK, (byte)0);
    v.a(this.puK).put(Long.valueOf(this.puJ.id), this.puJ);
    v.b(this.puK).put(Long.valueOf(this.puJ.id), localb);
    localb.b(this.puJ);
    AppMethodBeat.o(67992);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v.1
 * JD-Core Version:    0.6.2
 */