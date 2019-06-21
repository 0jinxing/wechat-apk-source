package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;

final class e$1
  implements e.c
{
  e$1(e parame)
  {
  }

  public final void finish()
  {
    AppMethodBeat.i(55749);
    this.cqk.cqb.cqo = null;
    ab.i("MicroMsg.RecordModeAsyncRead", "finish stopRecord");
    if (this.cqk.cqc != null)
    {
      if (this.cqk.cqh != null)
      {
        this.cqk.cqh.cancel();
        this.cqk.cqh = null;
      }
      ??? = this.cqk.cqc;
      ((b)???).eoJ = 0;
      ((b)???).eoK = 0;
      ((b)???).eoM = 0;
      ((b)???).eoN = 0;
      ((b)???).eoL = null;
    }
    synchronized (this.cqk.cqe)
    {
      this.cqk.cqc = null;
      this.cqk.cqd = null;
      this.cqk.cqi = false;
      this.cqk.cqc = null;
      AppMethodBeat.o(55749);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.e.1
 * JD-Core Version:    0.6.2
 */