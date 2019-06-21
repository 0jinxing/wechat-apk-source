package com.tencent.mm.plugin.fts.ui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class FTSMainUI$11
  implements Runnable
{
  FTSMainUI$11(FTSMainUI paramFTSMainUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(61878);
    if (System.currentTimeMillis() - FTSMainUI.u(this.mJJ) <= 1000L)
      AppMethodBeat.o(61878);
    while (true)
    {
      return;
      FTSMainUI.a(this.mJJ, System.currentTimeMillis());
      if (!aa.HU(0))
      {
        ab.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
        AppMethodBeat.o(61878);
      }
      else
      {
        Object localObject = ac.adM("searchID");
        an.x(this.bVv, 14, (String)localObject);
        ab.i("MicroMsg.FTS.FTSMainUI", "FTSWebReportLogic.kvReportGlobalTabClick reported type %d, searchId %s", new Object[] { Integer.valueOf(this.bVv), localObject });
        this.mJJ.aqX();
        Intent localIntent = aa.cVd();
        localIntent.putExtra("ftsneedkeyboard", true);
        localIntent.putExtra("ftsbizscene", 14);
        localIntent.putExtra("ftsType", this.bVv);
        localObject = aa.d(14, true, this.bVv);
        ((Map)localObject).put("sessionId", e.mCM);
        ((Map)localObject).put("subSessionId", e.mCM);
        localIntent.putExtra("sessionId", e.mCM);
        localIntent.putExtra("subSessionId", e.mCM);
        localIntent.putExtra("rawUrl", aa.E((Map)localObject));
        localIntent.putExtra("key_load_js_without_delay", true);
        localObject = null;
        if (Build.VERSION.SDK_INT >= 21)
          localObject = ActivityOptions.makeSceneTransitionAnimation(this.mJJ, new Pair[0]).toBundle();
        if (this.bVv != 64)
        {
          d.a(this.mJJ, "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", localIntent, (Bundle)localObject);
          AppMethodBeat.o(61878);
        }
        else
        {
          ((j)g.K(j.class)).aa(this.mJJ, 14);
          AppMethodBeat.o(61878);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.11
 * JD-Core Version:    0.6.2
 */