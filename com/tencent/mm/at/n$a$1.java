package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class n$a$1
  implements Runnable
{
  n$a$1(n.a parama, n.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78357);
    long l = System.currentTimeMillis();
    n.a.a locala = new n.a.a();
    locala.fFU = new PString();
    locala.fFV = new PString();
    locala.fFW = new PString();
    locala.fFX = new PString();
    String str = f.sh(this.fFS.fGc);
    locala.fDK = o.ahl().a(this.fFS.fGc, str, this.fFS.fDC, true, locala.fFU, locala.fFV, locala.fFW, locala.fFX, this.fFS.fGe, this.fFS.fGj);
    n.a.a(this.fFT).lock();
    try
    {
      this.fFT.fFR = locala;
      n.a.b(this.fFT).signal();
      ab.i("MicroMsg.SendImgSpeeder", "notify big file gen prepared %s last %d", new Object[] { this.fFS.fGc, Long.valueOf(System.currentTimeMillis() - Long.valueOf(l).longValue()) });
      return;
    }
    finally
    {
      n.a.a(this.fFT).unlock();
      AppMethodBeat.o(78357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.n.a.1
 * JD-Core Version:    0.6.2
 */