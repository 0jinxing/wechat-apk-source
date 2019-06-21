package com.tencent.mm.plugin.zero;

import android.os.Build.VERSION;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.mars.sdt.SdtLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.ci.a.a;
import com.tencent.mm.ci.i;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.zero.tasks.LoadNormsgJNITask;
import com.tencent.mm.plugin.zero.tasks.LoadProtocolJNITask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;
import java.io.File;

public class PluginZero extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.plugin.zero.a.d
{
  private static final int[] uZS = { 6, 6, 0, 1, 2, 3, 4, 5 };
  private a uZP;
  private b uZQ;
  private final com.tencent.mm.app.e uZR;
  public com.tencent.mm.plugin.zero.a.b uZT;
  public PluginZero.b uZU;
  public PluginZero.a uZV;

  public PluginZero()
  {
    AppMethodBeat.i(58762);
    this.uZP = new a();
    this.uZQ = new b();
    this.uZR = new com.tencent.mm.app.e();
    this.uZU = new PluginZero.b();
    this.uZV = new PluginZero.a();
    AppMethodBeat.o(58762);
  }

  private void initSDRoot()
  {
    AppMethodBeat.i(58766);
    if (!new File(ac.eSj + "SdcardInfo.cfg").exists())
    {
      com.tencent.mm.compatible.util.e.kw(com.tencent.mm.compatible.util.e.eSl);
      ab.i("MicroMsg.PluginZero", "summermount initSdCardPath sdcard info file not existed use[%s]", new Object[] { com.tencent.mm.compatible.util.e.eSl });
      AppMethodBeat.o(58766);
    }
    while (true)
    {
      return;
      String str1 = com.tencent.mm.compatible.util.e.eSl;
      y localy = new y(ac.eSj + "SdcardInfo.cfg");
      String str2 = (String)localy.get(1, "");
      int i = ((Integer)localy.get(2, Integer.valueOf(0))).intValue();
      int j = Build.VERSION.SDK_INT;
      if (bo.isNullOrNil(str2))
      {
        localy.set(1, str1);
        localy.set(2, Integer.valueOf(j));
      }
      for (String str3 = str1; ; str3 = str2)
      {
        ab.i("MicroMsg.PluginZero", "initSdCardPath cfgSdcardRoot[%s], initSdcardRoot[%s], primarySD[%s], ver[%d], sdk[%d]", new Object[] { str2, str3, str1, Integer.valueOf(i), Integer.valueOf(j) });
        com.tencent.mm.compatible.util.e.kw(str3);
        if ((i == j) || (com.tencent.mm.compatible.util.f.Mn()))
          break label338;
        if ((!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted")) || (!new File(com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getAbsolutePath()).canWrite()))
          break label308;
        localy.set(1, str1);
        localy.set(2, Integer.valueOf(j));
        com.tencent.mm.compatible.util.e.kw(str1);
        ab.i("MicroMsg.PluginZero", "summermount initSdCardPath ver change and old not avail reset SDCARD_ROOT[%s][%b]", new Object[] { com.tencent.mm.compatible.util.e.eSl, Boolean.valueOf(com.tencent.mm.compatible.util.f.Mn()) });
        AppMethodBeat.o(58766);
        break;
      }
      label308: ab.i("MicroMsg.PluginZero", "summermount initSdCardPath ver change but neither primarySD nor old avail keep do nothing[%s][%b][%s]", new Object[] { com.tencent.mm.compatible.util.e.eSl, Boolean.valueOf(com.tencent.mm.compatible.util.f.Mn()), str1 });
      label338: AppMethodBeat.o(58766);
    }
  }

  private void setupStubLog()
  {
    AppMethodBeat.i(58768);
    com.tencent.e.a.b.a(new PluginZero.3(this));
    AppMethodBeat.o(58768);
  }

  private void setupVendingLog()
  {
    AppMethodBeat.i(58769);
    com.tencent.mm.vending.f.a.a(new PluginZero.4(this));
    AppMethodBeat.o(58769);
  }

  public com.tencent.mm.vending.b.b addICoreServiceLifecycleCallback(com.tencent.mm.plugin.zero.a.a parama)
  {
    AppMethodBeat.i(58771);
    parama = this.uZV.aD(parama);
    AppMethodBeat.o(58771);
    return parama;
  }

  public com.tencent.mm.vending.b.b addNotifyReceiverCallback(com.tencent.mm.plugin.zero.a.c paramc)
  {
    AppMethodBeat.i(58770);
    ab.i("MicroMsg.PluginZero", "addNotifyReceiverCallback this %s delegate %s ", new Object[] { this, paramc });
    paramc = this.uZU.aD(paramc);
    AppMethodBeat.o(58770);
    return paramc;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(58765);
    try
    {
      initSDRoot();
      ah.ce(paramg.eHT);
      com.tencent.mm.kernel.a.a.k("configure [%s], setup broken library handler...", new Object[] { this });
      setupStubLog();
      setupVendingLog();
      if (paramg.SG())
      {
        com.tencent.mm.kernel.a.a.k("configure [%s], for process[%s]...", new Object[] { this, paramg.eHT });
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.zero.b.a.class, new com.tencent.mm.kernel.c.e(this.uZP));
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.zero.b.b.class, new com.tencent.mm.kernel.c.e(this.uZQ));
        com.tencent.mm.kernel.a.a.k("configure [%s], make worker core...", new Object[] { this });
        com.tencent.mm.kernel.g localg = com.tencent.mm.kernel.g.RQ();
        if (!localg.eKs)
        {
          localg.eKs = true;
          localg.eKl = new com.tencent.mm.kernel.e(com.tencent.mm.kernel.a.c.Sa());
          localg.eKm = new com.tencent.mm.kernel.a(com.tencent.mm.kernel.a.c.Sa());
          localg.eKn = new com.tencent.mm.kernel.b(localg.eKp, localg.eJn);
          localg.eKo = new com.tencent.mm.cc.b(ah.getContext());
        }
        NotifyReceiver.In();
        com.tencent.mm.kernel.g.RQ().a(new PluginZero.1(this, paramg));
        com.tencent.mm.kernel.g.RQ();
        i.Aiy = new com.tencent.mm.vending.h.h(com.tencent.mm.ci.d.c(com.tencent.mm.kernel.g.RS().doN()), "WeChat.WORKER");
        com.tencent.mm.vending.h.g.a("WeChat.WORKER", i.Aiy);
        new com.tencent.mm.plugin.zero.tasks.a().before(this);
      }
      if ((paramg.SG()) || (paramg.lQ(":push")))
        new LoadNormsgJNITask().before(new LoadProtocolJNITask().before(this));
      if (paramg.lQ(":push"))
      {
        AppLogic.setCallBack(new AppCallBack(ah.getContext()));
        k.a(com.tencent.mm.kernel.b.eJm, getClass().getClassLoader());
        SdtLogic.setHttpNetcheckCGI("/mmnetcheck");
      }
      AppMethodBeat.o(58765);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.PluginZero", localException, "what happened?", new Object[0]);
    }
  }

  public void dependency()
  {
    AppMethodBeat.i(58764);
    dependsOnRoot();
    AppMethodBeat.o(58764);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(58767);
    if (paramg.SG())
    {
      com.tencent.mm.kernel.g.RQ().eKp.aD(new PluginZero.2(this, paramg));
      NotifyReceiver.Io();
    }
    AppMethodBeat.o(58767);
  }

  public void installed()
  {
    AppMethodBeat.i(58763);
    alias(com.tencent.mm.plugin.zero.a.d.class);
    AppMethodBeat.o(58763);
  }

  public void setILightPushDelegate(com.tencent.mm.plugin.zero.a.b paramb)
  {
    this.uZT = paramb;
  }

  public String toString()
  {
    return "plugin-zero";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.PluginZero
 * JD-Core Version:    0.6.2
 */