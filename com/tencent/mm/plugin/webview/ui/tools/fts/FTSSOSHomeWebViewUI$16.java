package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class FTSSOSHomeWebViewUI$16
  implements View.OnClickListener
{
  FTSSOSHomeWebViewUI$16(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 2;
    AppMethodBeat.i(8445);
    boolean bool = b.a(this.uBG, "android.permission.RECORD_AUDIO", 80, "", "");
    ab.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.uBG });
    if (!bool)
      AppMethodBeat.o(8445);
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("sessionId", this.uBG.cvF);
      paramView.putExtra("subSessionId", this.uBG.cIy);
      paramView.putExtra("key_scene", this.uBG.scene);
      if (this.uBG.dbC())
        i = 1;
      paramView.putExtra("key_is_nav_voice", i);
      d.b(this.uBG, ".ui.websearch.WebSearchVoiceUI", paramView, 1);
      this.uBG.overridePendingTransition(0, 0);
      AppMethodBeat.o(8445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.16
 * JD-Core Version:    0.6.2
 */