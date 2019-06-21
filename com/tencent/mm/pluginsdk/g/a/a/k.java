package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.f;
import com.tencent.mm.pluginsdk.g.a.c.f.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.c.u;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

final class k extends f<a>
{
  private final f<a>.a veJ;

  k()
  {
    AppMethodBeat.i(79546);
    this.veJ = new f.a(this, 0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new u());
    AppMethodBeat.o(79546);
  }

  static void g(s params)
  {
    AppMethodBeat.i(79547);
    new k.a(a.a(params)).run();
    AppMethodBeat.o(79547);
  }

  final void a(a parama)
  {
    AppMethodBeat.i(79548);
    if (ajd(parama.vdC))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "URLKey(%s) is already decrypting, skip repeated task", new Object[] { parama.vdC });
      AppMethodBeat.o(79548);
    }
    while (true)
    {
      return;
      if (((parama.vdD) && (parama.cuv == parama.vdG) && (parama.vdG >= 0)) || ((!parama.vdD) && (parama.vdE)));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label98;
        AppMethodBeat.o(79548);
        break;
      }
      label98: ab.i("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "request#URLKey(%s) posted to decryptWorker", new Object[] { parama.vdC });
      super.b(parama);
      AppMethodBeat.o(79548);
    }
  }

  public final f<a>.a dik()
  {
    return this.veJ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.k
 * JD-Core Version:    0.6.2
 */