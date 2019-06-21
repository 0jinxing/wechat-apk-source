package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.d.a.l;
import com.tencent.mm.d.a.l.b;
import com.tencent.mm.d.a.t;
import com.tencent.mm.d.a.t.a;
import com.tencent.mm.d.a.u;
import com.tencent.mm.plugin.appbrand.report.quality.a;
import com.tencent.mm.plugin.appbrand.report.quality.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class ae extends t
{
  static
  {
    AppMethodBeat.i(129157);
    if (!ae.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(129157);
      return;
    }
  }

  ae(u paramu)
  {
    super(paramu);
  }

  public final void a(l paraml, t.a parama)
  {
    AppMethodBeat.i(129156);
    Object localObject;
    if ((parama instanceof ae.a))
    {
      localObject = ((ae.a)parama).gQB;
      if (!bo.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.V8EngineWorkerManagerWC", "hy: %s has sourcemap", new Object[] { parama.filePath });
        paraml.a((String)localObject, null);
      }
    }
    ab.i("MicroMsg.V8EngineWorkerManagerWC", "hy: evaluating %s", new Object[] { parama.filePath });
    int i;
    if (!parama.filePath.endsWith("WAWorker.js"))
    {
      i = 0;
      if (i == 0)
        break label163;
      AppMethodBeat.o(129156);
    }
    while (true)
    {
      return;
      if ((!$assertionsDisabled) && (!(parama instanceof ae.a)))
      {
        paraml = new AssertionError();
        AppMethodBeat.o(129156);
        throw paraml;
      }
      localObject = (ae.a)parama;
      final long l = System.currentTimeMillis();
      paraml.a(parama.filePath, parama.script, new l.b()
      {
        public final void ds(String paramAnonymousString)
        {
          AppMethodBeat.i(129155);
          a.aLz();
          b.a(this.gQy.gQC, this.gQy.appId, l, "WAWorker.js", this.gQz.script.length());
          AppMethodBeat.o(129155);
        }
      });
      i = 1;
      break;
      label163: paraml.a(parama.filePath, parama.script, null);
      AppMethodBeat.o(129156);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ae
 * JD-Core Version:    0.6.2
 */