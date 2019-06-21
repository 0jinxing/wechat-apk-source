package com.tencent.mm.plugin.secinforeport;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.z;

public class PluginSecInfoReport extends f
  implements b
{
  private static HandlerThread qjd = null;
  private static ak qje = null;

  private void reportSecurityInfoAsync(final int paramInt)
  {
    AppMethodBeat.i(57487);
    if (qje == null)
    {
      ab.e("MicroMsg.PSIR", "[tomys] workerposter is null, give up doing rest ops.");
      AppMethodBeat.o(57487);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.secinforeport.a.d.qjp.Y(1, 86400000L))
        qje.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(57481);
            try
            {
              i = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("DisableRiskScanSdkProb", 0);
              int j = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("DisableInstalledPkgInfoReportProb", 0);
              com.tencent.mm.kernel.g.RN();
              int k = i.bL(com.tencent.mm.kernel.a.QF(), 101);
              if ((i > 0) && (k >= 0) && (k <= i))
              {
                i = 1;
                if ((j <= 0) || (k < 0) || (k > j))
                  break label134;
                k = 1;
                label88: j = 12;
                if (i == 0)
                  j = 13;
                if (k == 0)
                  break label139;
                i = 0;
              }
              while (true)
              {
                if (i == 0)
                  break label212;
                j |= 2;
                com.tencent.mm.plugin.secinforeport.a.d.qjp.ff(paramInt, j);
                AppMethodBeat.o(57481);
                return;
                i = 0;
                break;
                label134: k = 0;
                break label88;
                try
                {
                  label139: boolean bool = com.tencent.mm.au.b.sO((String)com.tencent.mm.kernel.g.RP().Ry().get(274436, null));
                  if (!bool)
                    break label215;
                  i = 0;
                }
                catch (Throwable localThrowable1)
                {
                  ab.printErrStackTrace("MicroMsg.PSIR", localThrowable1, "**** point 0, explained by source code.", new Object[0]);
                  i = 0;
                }
              }
            }
            catch (Throwable localThrowable2)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.PSIR", localThrowable2, "unexpected exception was thrown.", new Object[0]);
                AppMethodBeat.o(57481);
                continue;
                label212: continue;
                label215: int i = 1;
              }
            }
          }
        });
      if (com.tencent.mm.plugin.secinforeport.a.d.qjp.Y(2, 86400000L))
        qje.post(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(57482);
            com.tencent.mm.plugin.secinforeport.a.d.qjp.Ch(-2147483646);
            AppMethodBeat.o(57482);
          }
        });
      AppMethodBeat.o(57487);
    }
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(57485);
    com.tencent.mm.plugin.secinforeport.a.d.a(c.qjh);
    com.tencent.mm.plugin.secinforeport.a.a.a(a.qjb);
    AppMethodBeat.o(57485);
  }

  public void dependency()
  {
    AppMethodBeat.i(57484);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.c.class);
    dependsOn(com.tencent.mm.plugin.normsg.a.class);
    AppMethodBeat.o(57484);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(57486);
    if (qjd == null);
    try
    {
      paramg = com.tencent.mm.sdk.g.d.anM("SIRWorker");
      qjd = paramg;
      paramg.start();
      paramg = new com/tencent/mm/sdk/platformtools/ak;
      paramg.<init>(qjd.getLooper());
      qje = paramg;
      com.tencent.mm.sdk.b.a.xxA.b(new PluginSecInfoReport.1(this));
      com.tencent.mm.sdk.b.a.xxA.b(new PluginSecInfoReport.2(this));
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new PluginSecInfoReport.3(this));
      AppMethodBeat.o(57486);
      return;
    }
    catch (Throwable paramg)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.PSIR", paramg, "[tomys] unexpected exception.", new Object[0]);
    }
  }

  public void installed()
  {
    AppMethodBeat.i(57483);
    alias(b.class);
    AppMethodBeat.o(57483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.secinforeport.PluginSecInfoReport
 * JD-Core Version:    0.6.2
 */