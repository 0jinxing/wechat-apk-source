package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;

final class h$1
  implements ap.a
{
  h$1(h paramh)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(17672);
    if (h.a(this.jxS))
    {
      ab.e("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler stopped is true, index[%d]", new Object[] { Integer.valueOf(h.access$100()) });
      this.jxS.jxP = 0;
      AppMethodBeat.o(17672);
      return false;
    }
    ab.i("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler start reconnect, index[%d]", new Object[] { Integer.valueOf(h.access$100()) });
    if (h.access$100() < h.b(this.jxS).length)
    {
      h.c(this.jxS).aTK();
      ap localap = h.d(this.jxS);
      long l = h.b(this.jxS)[h.access$100()];
      localap.ae(l, l);
      h.acr();
    }
    while (true)
    {
      AppMethodBeat.o(17672);
      break;
      h.e(this.jxS);
      this.jxS.jxP = 0;
      h.c(this.jxS).aTL();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.h.1
 * JD-Core Version:    0.6.2
 */