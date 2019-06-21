package com.tencent.mm.plugin.fts.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.Map;

final class FTSMainUI$16
  implements View.OnClickListener
{
  FTSMainUI$16(FTSMainUI paramFTSMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(61886);
    FTSMainUI localFTSMainUI = this.mJJ;
    paramView = (String)paramView.getTag();
    if (System.currentTimeMillis() - localFTSMainUI.ijU > 1000L)
    {
      localFTSMainUI.ijU = System.currentTimeMillis();
      if (!aa.HU(0))
      {
        ab.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
        AppMethodBeat.o(61886);
      }
    }
    while (true)
    {
      return;
      Intent localIntent = aa.cVd();
      localIntent.putExtra("ftsbizscene", 15);
      localIntent.putExtra("ftsQuery", paramView);
      localIntent.putExtra("title", paramView);
      localIntent.putExtra("isWebwx", paramView);
      localIntent.putExtra("ftscaneditable", false);
      Object localObject = aa.d(15, false, 2);
      ((Map)localObject).put("query", paramView);
      ((Map)localObject).put("sceneActionType", "2");
      localIntent.putExtra("rawUrl", aa.E((Map)localObject));
      localObject = new ll();
      ((ll)localObject).cHk.scene = 0;
      a.xxA.m((b)localObject);
      localIntent.putExtra("ftsInitToSearch", true);
      d.b(localFTSMainUI.mController.ylL, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", localIntent);
      an.bz(15, paramView);
      AppMethodBeat.o(61886);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.16
 * JD-Core Version:    0.6.2
 */