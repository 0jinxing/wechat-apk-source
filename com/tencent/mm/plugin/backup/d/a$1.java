package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class a$1
  implements Runnable
{
  public a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17221);
    if (this.jta.jsS != null)
      this.jta.jsS.cancel();
    this.jta.jsS = new b();
    if ((this.jta.aSU() == null) || (this.jta.aSU().size() == 0))
    {
      ab.e("MicroMsg.BackupMoveChooseServer", "backupSessionInfo is null or nill!");
      this.jta.jsS.a(this.jta);
    }
    AppMethodBeat.o(17221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.a.1
 * JD-Core Version:    0.6.2
 */