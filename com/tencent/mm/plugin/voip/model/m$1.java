package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.plugin.voip.a.a;

final class m$1
  implements c.a
{
  m$1(m paramm)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(4436);
    while (true)
    {
      synchronized (m.m(this.sQb))
      {
        if ((this.sQb.kzf != 2) || (m.a(this.sQb) == null))
        {
          AppMethodBeat.o(4436);
          return;
        }
        if (m.b(this.sQb) == 1)
        {
          m.a(this.sQb, System.currentTimeMillis());
          m.b(this.sQb, m.c(this.sQb));
          m.d(this.sQb);
          if (m.f(this.sQb) <= 10)
            m.b(this.sQb, 92);
          int i = m.a(this.sQb).cIq();
          m.b(this.sQb, (i + 24 + m.f(this.sQb) * 3) / 4);
          if (m.g(this.sQb) != 1)
            break label369;
          m.c(this.sQb, m.a(this.sQb).cIn());
          if (m.h(this.sQb) >= m.f(this.sQb))
            m.c(this.sQb, m.h(this.sQb) - m.f(this.sQb));
          m.b(this.sQb, m.h(this.sQb));
          m.i(this.sQb);
          if (1 != m.j(this.sQb))
            break label381;
          m.k(this.sQb);
          m.c(this.sQb, System.currentTimeMillis());
          a.Logi("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,first record");
          this.sQb.sNl.sPp.recordCallback(paramArrayOfByte, paramInt, m.f(this.sQb));
          m.sPZ += 1;
        }
      }
      long l1 = System.currentTimeMillis();
      m.a(this.sQb, (int)(l1 - m.e(this.sQb) - m.sPZ * 20));
      m.a(this.sQb, l1);
      continue;
      label369: m.b(this.sQb, 0);
      continue;
      label381: l1 = System.currentTimeMillis();
      long l2 = l1 - m.l(this.sQb);
      if (l2 > 1000L)
        a.Logi("MicroMsg.Voip.VoipDeviceHandler", "amyfwang,error,deltaTime:".concat(String.valueOf(l2)));
      m.c(this.sQb, l1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.m.1
 * JD-Core Version:    0.6.2
 */