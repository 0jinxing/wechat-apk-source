package com.tencent.mm.plugin.appbrand.appstorage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandKVStorageTransferABTest;", "", "()V", "ABTEST_NEED_TRANSFER", "", "ABTEST_PHASES", "ABTEST_SWITCH", "PHASES_FINISH", "", "PHASES_ROLLBACK", "PHASES_TEST", "TAG", "isNeedTransfer", "", "isPerformanceReportOn", "phases", "isFinishPhases", "isRollbackPhases", "isTestPhases", "load", "", "onABTestUpdate", "plugin-appbrand-integration_release"})
public final class d
{
  private static volatile boolean gXh;
  private static volatile int gXi;
  private static volatile boolean gXj;
  public static final d gXk;

  static
  {
    AppMethodBeat.i(134488);
    d locald = new d();
    gXk = locald;
    gXi = 1;
    locald.sg();
    AppMethodBeat.o(134488);
  }

  public final boolean awH()
  {
    try
    {
      int i = gXi;
      if (i == 3)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final boolean awI()
  {
    try
    {
      int i = gXi;
      if (i == 2)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
    finally
    {
    }
  }

  public final boolean awJ()
  {
    try
    {
      boolean bool = gXj;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean awK()
  {
    try
    {
      boolean bool = gXh;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void sg()
  {
    try
    {
      AppMethodBeat.i(134487);
      ab.i("MicroMsg.AppBrandKVStorageTransferABTest", "[load]");
      Object localObject1 = com.tencent.mm.model.c.c.abi().ll("100478");
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100483");
      j.o(localObject1, "transferTest");
      if (((com.tencent.mm.storage.c)localObject1).isValid())
      {
        gXh = bo.getBoolean((String)((com.tencent.mm.storage.c)localObject1).dru().get("needTransfer"), false);
        gXi = bo.getInt((String)((com.tencent.mm.storage.c)localObject1).dru().get("phases"), 1);
      }
      j.o(localc, "performanceReportSwitchTest");
      if (localc.isValid())
        gXj = bo.getBoolean((String)localc.dru().get("switch"), false);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("[load] isNeedTransfer=");
      ab.i("MicroMsg.AppBrandKVStorageTransferABTest", gXh + "  phases=" + gXi);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("[load] isPerformanceReportOn=");
      ab.i("MicroMsg.AppBrandKVStorageTransferABTest", gXj);
      AppMethodBeat.o(134487);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.d
 * JD-Core Version:    0.6.2
 */