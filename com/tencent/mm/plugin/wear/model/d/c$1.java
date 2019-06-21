package com.tencent.mm.plugin.wear.model.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class c$1
  implements ap.a
{
  c$1(c paramc)
  {
  }

  public final boolean BI()
  {
    boolean bool = true;
    AppMethodBeat.i(26378);
    long l1 = e.cs(this.tYu.filename);
    long l2 = l1 - this.tYu.tYr;
    ab.d("MicroMsg.Wear.NetSceneVoiceToText", "onTimerExpired: filename=%s | fileLength=%d | readOffset=%d | isRecordFinished=%b | canReadLength=%d", new Object[] { this.tYu.filename, Long.valueOf(l1), Integer.valueOf(this.tYu.tYr), Boolean.valueOf(this.tYu.fZa), Long.valueOf(l2) });
    if ((l2 < 3300L) && (!this.tYu.fZa))
      AppMethodBeat.o(26378);
    while (true)
    {
      return bool;
      if ((this.tYu.fZa) && (l2 <= 0L))
      {
        AppMethodBeat.o(26378);
        bool = false;
      }
      else
      {
        if (this.tYu.a(this.tYu.ftf, this.tYu.ehi) == -1)
          this.tYu.ehi.onSceneEnd(3, -1, "doScene failed", this.tYu);
        AppMethodBeat.o(26378);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.d.c.1
 * JD-Core Version:    0.6.2
 */