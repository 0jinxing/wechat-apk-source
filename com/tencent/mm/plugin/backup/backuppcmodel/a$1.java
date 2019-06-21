package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.b;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17477);
    if (this.jvT.jtR != null)
      this.jvT.jtR.cancel();
    this.jvT.jtR = new b();
    this.jvT.jtR.a(this.jvT);
    AppMethodBeat.o(17477);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.a.1
 * JD-Core Version:    0.6.2
 */