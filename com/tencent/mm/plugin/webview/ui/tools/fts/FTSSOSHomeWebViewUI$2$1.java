package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import java.util.Map;

final class FTSSOSHomeWebViewUI$2$1
  implements Runnable
{
  FTSSOSHomeWebViewUI$2$1(FTSSOSHomeWebViewUI.2 param2, Bundle paramBundle, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8426);
    if (this.uBJ.uBG.getJsapi() != null);
    for (boolean bool = this.uBJ.uBG.getJsapi().a(this.val$result.getString("type", "0"), this.val$result.getString("isMostSearchBiz", "0"), this.val$result.getString("isSug", "0"), this.val$result.getString("scene", "0"), this.val$result.getString("isLocalSug", "0"), this.uBJ.uBG.getTotalQuery(), this.uBJ.uBG.getInEditTextQuery(), this.uBJ.uBG.dbB(), this.uBJ.uBG.dbw(), this.uBJ.uBG.uBB, this.uBI); ; bool = false)
    {
      if (bool)
      {
        this.uBJ.uBG.dby().setHint(FTSSOSHomeWebViewUI.f(this.uBJ.uBG, 0));
        FTSSOSHomeWebViewUI.a(this.uBJ.uBG).sendMessage(7);
      }
      AppMethodBeat.o(8426);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.2.1
 * JD-Core Version:    0.6.2
 */