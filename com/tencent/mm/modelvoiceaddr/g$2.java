package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.d.a;
import com.tencent.mm.modelvoiceaddr.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

final class g$2
  implements c.a
{
  byte[] gbl;

  g$2(g paramg)
  {
  }

  public final void CV()
  {
    AppMethodBeat.i(116710);
    ab.i("MicroMsg.SceneVoiceInputAddr", "Silent enough to finish time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    this.gbk.stop(false);
    AppMethodBeat.o(116710);
  }

  public final void amu()
  {
    AppMethodBeat.i(116708);
    ab.i("MicroMsg.SceneVoiceInputAddr", "onSpeakToSilent");
    int i;
    if ((g.k(this.gbk) instanceof c))
      i = e.cs(g.amt());
    while (true)
    {
      try
      {
        ((c)g.k(this.gbk)).mw(i);
        AppMethodBeat.o(116708);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "cutShortSentence error", new Object[0]);
        this.gbk.cG(6, -1);
      }
      AppMethodBeat.o(116708);
    }
  }

  public final void amv()
  {
    AppMethodBeat.i(116709);
    ab.i("MicroMsg.SceneVoiceInputAddr", "onSilentToSpeak");
    if ((g.k(this.gbk) instanceof c));
    while (true)
    {
      try
      {
        h localh = ((c)g.k(this.gbk)).gay;
        ab.i("MicroMsg.ShortSentenceContainer", "createNewShortSentence");
        localh.gbt.writeLock().lock();
        h.a locala = new com/tencent/mm/modelvoiceaddr/h$a;
        locala.<init>(localh);
        localh.gbs.put(locala.gbv, locala);
        localh.gbt.writeLock().unlock();
        if (!g.b(this.gbk).Ff())
        {
          this.gbk.cG(5, -1);
          AppMethodBeat.o(116709);
          return;
        }
        AppMethodBeat.o(116709);
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "createShortSentence error", new Object[0]);
        this.gbk.cG(6, -1);
      }
      AppMethodBeat.o(116709);
    }
  }

  public final void c(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(116707);
    if (paramArrayOfShort == null)
    {
      AppMethodBeat.o(116707);
      return;
    }
    if ((this.gbl == null) || (this.gbl.length < paramInt * 2))
      this.gbl = new byte[paramInt * 2];
    for (int i = 0; i < paramInt; i++)
    {
      this.gbl[(i * 2)] = ((byte)(byte)(paramArrayOfShort[i] & 0xFF));
      this.gbl[(i * 2 + 1)] = ((byte)(byte)((paramArrayOfShort[i] & 0xFF00) >> 8));
    }
    if (g.b(this.gbk) != null);
    for (paramInt = g.b(this.gbk).a(new g.a(this.gbl, paramInt * 2), 0, true); ; paramInt = -1)
    {
      if (-1 == paramInt)
      {
        this.gbk.cG(4, -1);
        ab.e("MicroMsg.SceneVoiceInputAddr", "write to file failed");
        AppMethodBeat.o(116707);
        break;
      }
      g.a(this.gbk, paramInt + g.h(this.gbk));
      if ((!g.i(this.gbk)) && (g.h(this.gbk) > 200) && (!g.j(this.gbk)))
      {
        com.tencent.mm.kernel.g.RS().aa(new g.2.1(this));
        g.l(this.gbk);
      }
      AppMethodBeat.o(116707);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.g.2
 * JD-Core Version:    0.6.2
 */