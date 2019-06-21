package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.p;
import com.tencent.xweb.x5.sdk.d;

final class AppBrandTBSDownloadProxyUI$a
  implements com.tencent.xweb.x5.sdk.h
{
  private AppBrandTBSDownloadProxyUI$a(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void onDownloadFinish(int paramInt)
  {
    AppMethodBeat.i(133107);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onDownloadFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
    m.gu(5, paramInt);
    label99: Object localObject;
    if ((paramInt == 100) || (paramInt == 120) || (paramInt == 122))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(366L, 4L, 1L, false);
      if (paramInt == 110)
        break label225;
      if ((paramInt != 100) && (paramInt != 120) && (paramInt != 122))
        break label166;
      com.tencent.mm.plugin.report.service.h.pYm.a(64, 64, 4, 3, 1, 1, false);
      localObject = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (localObject != null)
      {
        ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "tbs has download finished, save to sharedpreference");
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
        ((SharedPreferences.Editor)localObject).apply();
      }
      AppMethodBeat.o(133107);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(366L, 5L, 1L, false);
      break;
      label166: AppBrandTBSDownloadProxyUI.d(this.iIJ);
      d.a(AppBrandTBSDownloadProxyUI.e(this.iIJ));
      com.tencent.mm.plugin.report.service.h.pYm.a(64L, 3L, 1L, false);
      localObject = new Intent();
      this.iIJ.setResult(0, (Intent)localObject);
      this.iIJ.finish();
      break label99;
      label225: localObject = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (localObject != null)
      {
        ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "tbs has download finished, save to sharedpreference");
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
        ((SharedPreferences.Editor)localObject).apply();
      }
      AppBrandTBSDownloadProxyUI.d(this.iIJ);
      d.a(AppBrandTBSDownloadProxyUI.e(this.iIJ));
      localObject = new Intent();
      this.iIJ.setResult(0, (Intent)localObject);
      this.iIJ.finish();
      AppMethodBeat.o(133107);
    }
  }

  public final void onDownloadProgress(int paramInt)
  {
    AppMethodBeat.i(133109);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onDownloadProgress, percent = %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.iIJ.tipDialog != null)
      al.d(new AppBrandTBSDownloadProxyUI.a.1(this, paramInt));
    AppMethodBeat.o(133109);
  }

  public final void onInstallFinish(int paramInt)
  {
    AppMethodBeat.i(133108);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onInstallFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.iIJ.tipDialog != null)
    {
      this.iIJ.tipDialog.dismiss();
      this.iIJ.tipDialog = null;
    }
    m.gu(6, paramInt);
    Intent localIntent;
    if ((paramInt == 200) || (paramInt == 220))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(64, 64, 7, 6, 1, 1, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(366L, 6L, 1L, false);
      ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "onInstallFinish, restart tool");
      c.aNX();
      AppBrandTBSDownloadProxyUI.d(this.iIJ);
      d.a(AppBrandTBSDownloadProxyUI.e(this.iIJ));
      localIntent = new Intent();
      this.iIJ.setResult(-1, localIntent);
      this.iIJ.finish();
      AppMethodBeat.o(133108);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(64L, 6L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(366L, 7L, 1L, false);
      AppBrandTBSDownloadProxyUI.d(this.iIJ);
      d.a(AppBrandTBSDownloadProxyUI.e(this.iIJ));
      localIntent = new Intent();
      this.iIJ.setResult(0, localIntent);
      this.iIJ.finish();
      AppMethodBeat.o(133108);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.a
 * JD-Core Version:    0.6.2
 */