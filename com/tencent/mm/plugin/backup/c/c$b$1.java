package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import java.util.concurrent.atomic.AtomicLong;

final class c$b$1
  implements com.tencent.mm.plugin.backup.g.c.b
{
  c$b$1(c.b paramb)
  {
  }

  public final void g(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(17176);
    c.a locala = this.jsa.jrQ;
    long l1 = paramInt;
    locala.jrM.addAndGet(0L - l1);
    if (locala.jrM.get() < 8388608L)
      locala.jrN.open();
    if (locala.jrM.get() < 16777216L)
      locala.jrO.open();
    long l2 = locala.jrM.get();
    boolean bool1;
    if (locala.jrM.get() >= 8388608L)
    {
      bool1 = true;
      if (locala.jrM.get() < 16777216L)
        break label266;
    }
    label266: for (boolean bool2 = true; ; bool2 = false)
    {
      ab.v("MicroMsg.BackupPackAndSend", "MemoryChecker.release size:%d sum:%d [%b,%b] [%b,%b]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(locala.jrN.xzf), Boolean.valueOf(locala.jrO.xzf) });
      this.jsa.jrL.jrG += paramInt;
      ab.i(this.jsa.TAG, "OnfinishIdCallback size[%d], isIdFinish[%b], id[%s] ", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), paramString });
      AppMethodBeat.o(17176);
      return;
      bool1 = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.b.1
 * JD-Core Version:    0.6.2
 */