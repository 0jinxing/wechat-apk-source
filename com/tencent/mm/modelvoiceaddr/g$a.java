package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.Map;

final class g$a
  implements Runnable
{
  private g$a(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116711);
    long l2;
    Object localObject4;
    synchronized (this.gbk)
    {
      ab.i("MicroMsg.SceneVoiceInputAddr", "initDeviceInLock time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      long l1 = System.nanoTime() & 0xFFFFFFFF;
      l2 = l1;
      if (l1 < 0L)
        l2 = Math.abs(l1);
      try
      {
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>(g.access$100());
        if (!((File)localObject1).exists())
          ((File)localObject1).mkdir();
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(g.amt());
        if (!((File)localObject1).exists())
          ((File)localObject1).createNewFile();
        ((File)localObject1).delete();
        localObject4 = this.gbk;
        localObject1 = new com/tencent/mm/audio/b/c;
        ((com.tencent.mm.audio.b.c)localObject1).<init>(16000, 1, 3);
        g.a((g)localObject4, (com.tencent.mm.audio.b.c)localObject1);
        g.a(this.gbk).cpB = -19;
        g.a(this.gbk).bq(false);
        localObject1 = this.gbk;
        localObject4 = new com/tencent/mm/audio/d/c;
        ((com.tencent.mm.audio.d.c)localObject4).<init>(16000, 23900);
        g.a((g)localObject1, (com.tencent.mm.audio.d.a)localObject4);
        if (!g.b(this.gbk).eo(g.amt()))
        {
          ab.e("MicroMsg.SceneVoiceInputAddr", "init speex writer failed");
          g.b(this.gbk).Fe();
          g.a(this.gbk, null);
          this.gbk.cG(5, -1);
          AppMethodBeat.o(116711);
          return;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localException, "delete file failed", new Object[0]);
      }
    }
    if (q.etn.erW > 0)
    {
      g.a(this.gbk).v(q.etn.erW, true);
      g.a(this.gbk).gG(50);
      g.a(this.gbk).br(false);
    }
    while (true)
    {
      try
      {
        Object localObject3 = this.gbk;
        localObject4 = new com/tencent/mm/modelvoiceaddr/a/c;
        ((com.tencent.mm.modelvoiceaddr.a.c)localObject4).<init>();
        g.a((g)localObject3, (com.tencent.mm.modelvoiceaddr.a.c)localObject4);
        g.d(this.gbk).gbP = g.c(this.gbk);
        localObject3 = com.tencent.mm.model.c.c.abi().ll("100235");
        if (!((com.tencent.mm.storage.c)localObject3).isValid())
          break label565;
        i = bo.getInt((String)((com.tencent.mm.storage.c)localObject3).dru().get("MMVoipVadOn"), 0);
        localObject3 = this.gbk;
        localObject4 = new com/tencent/mm/modelvoiceaddr/c;
        ((c)localObject4).<init>(g.amt(), String.valueOf(l2), String.valueOf(i), g.e(this.gbk), g.f(this.gbk));
        g.a((g)localObject3, (a)localObject4);
        g.a(this.gbk).cpM = g.g(this.gbk);
        if (g.a(this.gbk).EL())
          break;
        ab.e("MicroMsg.SceneVoiceInputAddr", "start record failed");
        this.gbk.cG(8, -1);
        break;
        g.a(this.gbk).v(5, false);
      }
      catch (Throwable localThrowable)
      {
        ab.printErrStackTrace("MicroMsg.SceneVoiceInputAddr", localThrowable, "init VoiceDetectAPI failed", new Object[0]);
        this.gbk.cG(7, -1);
      }
      break;
      label565: int i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.g.a
 * JD-Core Version:    0.6.2
 */