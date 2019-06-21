package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements Runnable
{
  b$1(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17638);
    if (b.aUf() != null)
    {
      b.aUf().a(this.jru, this.bVv, this.eRK, this.jrs);
      AppMethodBeat.o(17638);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BackupBaseScene", "callbackToNotify, onNotify is null");
      AppMethodBeat.o(17638);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.b.1
 * JD-Core Version:    0.6.2
 */