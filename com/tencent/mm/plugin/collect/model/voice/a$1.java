package com.tencent.mm.plugin.collect.model.voice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bf.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;

final class a$1 extends c<bf>
{
  a$1(a parama)
  {
    AppMethodBeat.i(41003);
    this.xxI = bf.class.getName().hashCode();
    AppMethodBeat.o(41003);
  }

  private boolean a(bf parambf)
  {
    AppMethodBeat.i(41004);
    if (parambf.cus.cut == 60);
    synchronized (a.a(this.kDe))
    {
      if (a.kCR)
      {
        ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent OFF_LINE == true");
        AppMethodBeat.o(41004);
        return false;
      }
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "CheckResUpdateCacheFileEvent resTyep:%s subType:%s", new Object[] { Integer.valueOf(parambf.cus.cut), Integer.valueOf(parambf.cus.cuu) });
      if (parambf.cus.cuu == 1)
        e.y(parambf.cus.filePath, a.kCU);
      while (parambf.cus.cuu != 2)
      {
        a.b(this.kDe);
        AppMethodBeat.o(41004);
        break;
      }
      e.y(parambf.cus.filePath, a.kCV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.a.1
 * JD-Core Version:    0.6.2
 */