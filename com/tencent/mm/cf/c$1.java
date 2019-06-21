package com.tencent.mm.cf;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class c$1
  implements Runnable
{
  c$1(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76899);
    if (c.access$000())
    {
      ab.w("MicroMsg.MemoryDumpOperation", "Hprof is mUploading");
      AppMethodBeat.o(76899);
      return;
    }
    if (this.ydC);
    for (String str = b.ag(true, false); ; str = null)
    {
      Process.setThreadPriority(10);
      boolean bool = at.isWifi(ah.getContext());
      if ((this.ydD) && (!bool))
      {
        ab.w("MicroMsg.MemoryDumpOperation", "Hprof no wifi");
        AppMethodBeat.o(76899);
        break;
      }
      if ((this.ydE) && (str != null));
      while (true)
      {
        c.access$002(true);
        c.sS(str);
        c.access$002(false);
        AppMethodBeat.o(76899);
        break;
        if (this.ydF)
          str = b.ydz;
        else
          str = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.c.1
 * JD-Core Version:    0.6.2
 */