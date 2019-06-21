package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;

public final class m
{
  private static String vvl = null;
  private static final String[] vvm = { "", "dynamic_config_recv", "trigger_download", "start_download", "stop_download", "download_finish", "install_finish", "use" };

  private static String fS(Context paramContext)
  {
    AppMethodBeat.i(114678);
    if (vvl != null)
    {
      paramContext = vvl;
      AppMethodBeat.o(114678);
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(ah.getPackageName(), 128);
        if ((paramContext != null) && (paramContext.metaData != null))
        {
          paramContext = paramContext.metaData.getString("com.tencent.mtt.TBS_CODE");
          if (!bo.isNullOrNil(paramContext))
          {
            vvl = paramContext;
            AppMethodBeat.o(114678);
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.TBSReporter", "getMetaTbsCode, ex = %s", new Object[] { paramContext.getMessage() });
        paramContext = null;
        AppMethodBeat.o(114678);
      }
    }
  }

  private static void gQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114679);
    ab.i("MicroMsg.TBSReporter", "logSceneDetail, scene = %d_%s, errcode = %d", new Object[] { Integer.valueOf(paramInt1), vvm[paramInt1], Integer.valueOf(paramInt2) });
    AppMethodBeat.o(114679);
  }

  public static void gu(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(114677);
    if ((paramInt1 <= 0) || (paramInt1 > 7))
    {
      ab.e("MicroMsg.TBSReporter", "report invalid scene = %d", new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(114677);
    }
    while (true)
    {
      return;
      gQ(paramInt1, paramInt2);
      Object localObject = ah.getContext();
      int i = WebView.getInstalledTbsCoreVersion((Context)localObject);
      int j = WebView.getTbsSDKVersion((Context)localObject);
      localObject = fS((Context)localObject);
      h.pYm.a(11633, false, true, new Object[] { Integer.valueOf(paramInt1), Long.valueOf(System.currentTimeMillis() / 1000L), Integer.valueOf(i), Integer.valueOf(j), localObject, Integer.valueOf(paramInt2) });
      AppMethodBeat.o(114677);
    }
  }

  public static void kT(int paramInt)
  {
    AppMethodBeat.i(114676);
    gu(paramInt, 0);
    AppMethodBeat.o(114676);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.m
 * JD-Core Version:    0.6.2
 */