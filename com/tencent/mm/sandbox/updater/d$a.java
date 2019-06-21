package com.tencent.mm.sandbox.updater;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class d$a
  implements com.tencent.xweb.x5.sdk.h
{
  private d$a(d paramd)
  {
  }

  public final void onDownloadFinish(int paramInt)
  {
    AppMethodBeat.i(28881);
    ab.i("MicroMsg.MyTbsListener", "onDownloadFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
    m.gu(5, paramInt);
    if (paramInt != 110)
    {
      if (paramInt != 100)
        break label107;
      com.tencent.mm.plugin.report.service.h.pYm.a(64, 64, 4, 3, 1, 1, false);
    }
    while (true)
    {
      Object localObject = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (localObject != null)
      {
        ab.i("MicroMsg.MyTbsListener", "tbs has download finished, save to sharedpreference");
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
        ((SharedPreferences.Editor)localObject).apply();
      }
      AppMethodBeat.o(28881);
      return;
      label107: com.tencent.mm.plugin.report.service.h.pYm.a(64L, 3L, 1L, false);
    }
  }

  public final void onDownloadProgress(int paramInt)
  {
  }

  public final void onInstallFinish(int paramInt)
  {
    AppMethodBeat.i(28882);
    ab.i("MicroMsg.MyTbsListener", "onInstallFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
    m.gu(6, paramInt);
    if ((paramInt == 200) || (paramInt == 220))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(64, 64, 7, 6, 1, 1, false);
      d.b(this.xwq);
      AppMethodBeat.o(28882);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(64L, 6L, 1L, false);
      AppMethodBeat.o(28882);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.d.a
 * JD-Core Version:    0.6.2
 */