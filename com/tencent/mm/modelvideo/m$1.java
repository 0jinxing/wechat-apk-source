package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class m$1
  implements Runnable
{
  m$1(m paramm, long paramLong)
  {
  }

  public final void run()
  {
    long l1 = 0L;
    AppMethodBeat.i(50733);
    m.alh();
    m.c(this.fWk);
    m.a(this.fWk, "");
    long l2 = l1;
    if (this.fWj > 0L)
    {
      l2 = l1;
      if (m.d(this.fWk).get(Long.valueOf(this.fWj)) != null)
        l2 = ((g.a)m.d(this.fWk).get(Long.valueOf(this.fWj))).Mr();
    }
    ab.d("MicroMsg.SightMassSendService", "onJobEnd ok massSendId:" + this.fWj + " time:" + l2 + " inCnt:" + m.access$300() + " stop:" + m.e(this.fWk) + " running:" + m.f(this.fWk) + " sending:" + m.g(this.fWk));
    if (m.e(this.fWk) > 0)
      m.h(this.fWk);
    while (true)
    {
      m.ali();
      AppMethodBeat.o(50733);
      return;
      if (!m.g(this.fWk))
        m.i(this.fWk);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(50734);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(50734);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.m.1
 * JD-Core Version:    0.6.2
 */