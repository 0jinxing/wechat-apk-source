package com.tencent.mm.plugin.downloader.model;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.c.c;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

final class d$1$1
  implements f
{
  d$1$1(d.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(2406);
    paramm.ftk = true;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded get pkg sig error");
      com.tencent.mm.plugin.report.service.h.pYm.a(322L, 28L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4028), String.format("%s,%s,%d,%d", new Object[] { this.kMY.kMF.field_packageName, this.kMY.kMF.field_filePath, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) });
      if ((!bo.isNullOrNil(this.kMY.kMF.field_appId)) && (g.dk(this.kMY.kMF.field_appId)))
      {
        ab.i("MicroMsg.FileDownloadManager", "onSceneEnd, fail, appId: %s", new Object[] { this.kMY.kMF.field_appId });
        com.tencent.mm.plugin.report.service.h.pYm.a(710L, 24L, 1L, false);
      }
    }
    while (true)
    {
      al.d(new d.2(this.kMY.kMX, this.kMY.kMF, this.kMY.kML));
      AppMethodBeat.o(2406);
      return;
      paramm = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "yyb_pkg_sig_prefs", com.tencent.mm.compatible.util.h.Mu()).getString(this.kMY.kMF.field_packageName, "");
      ab.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded sig[%s]", new Object[] { paramm });
      if (!bo.isNullOrNil(paramm))
      {
        try
        {
          paramString = new java/io/File;
          paramString.<init>(this.kMY.kMF.field_filePath);
          c.c(paramString, paramm);
          ab.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode done");
          com.tencent.mm.plugin.report.service.h.pYm.a(322L, 25L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4025), String.format("%s,%s,%s", new Object[] { this.kMY.kMF.field_packageName, this.kMY.kMF.field_filePath, paramm }) });
        }
        catch (Exception paramString)
        {
          ab.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode e: " + paramString.getMessage());
          com.tencent.mm.plugin.report.service.h.pYm.a(322L, 27L, 1L, false);
          com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4027), String.format("%s,%s,%s", new Object[] { this.kMY.kMF.field_packageName, this.kMY.kMF.field_filePath, paramString.getMessage() }) });
        }
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(322L, 26L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4026), String.format("%s,%s", new Object[] { this.kMY.kMF.field_packageName, this.kMY.kMF.field_filePath }) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.d.1.1
 * JD-Core Version:    0.6.2
 */