package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import java.util.HashMap;
import java.util.Map;

final class FTSSOSHomeWebViewUI$1$1
  implements Runnable
{
  FTSSOSHomeWebViewUI$1$1(FTSSOSHomeWebViewUI.1 param1, int paramInt, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8424);
    boolean bool = false;
    HashMap localHashMap;
    if (this.uBH.uBG.getJsapi() != null)
    {
      localHashMap = new HashMap();
      localHashMap.put("isHomePage", "0");
      if (this.ghM != 0)
        break label325;
      localHashMap.put("isHomePage", "1");
    }
    while (true)
    {
      if (!bo.isNullOrNil(this.uBH.uBG.getTotalQuery()))
        localHashMap.put("query", this.uBH.uBG.getTotalQuery());
      bool = this.uBH.uBG.getJsapi().a(this.val$result.getString("scene", "0"), this.val$result.getString("type", "0"), this.val$result.getString("isSug", "0"), this.val$result.getString("isLocalSug", "0"), this.uBH.uBG.getSessionId(), localHashMap);
      if (!TextUtils.isEmpty(this.uBH.uBG.getInEditTextQuery()))
        z.a(this.uBH.uBG.scene, this.uBH.uBG.cvF, this.uBH.uBG.cIy, true, this.uBH.uBG.getInEditTextQuery(), this.uBH.uBG.uAO);
      if (bool)
      {
        this.uBH.uBG.dby().setHint(FTSSOSHomeWebViewUI.f(this.uBH.uBG, this.ghM));
        an.e(this.ghM, this.uBH.uBG.uAN, FTSSOSHomeWebViewUI.o(this.uBH.uBG), FTSSOSHomeWebViewUI.a(this.uBH.uBG).dbC());
        FTSSOSHomeWebViewUI.a(this.uBH.uBG).sendMessage(7);
      }
      AppMethodBeat.o(8424);
      return;
      label325: if (this.ghM == 1)
        localHashMap.put("isMostSearchBiz", this.val$result.getString("isMostSearchBiz", "0"));
      else
        localHashMap.put("isHomePage", "0");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.1.1
 * JD-Core Version:    0.6.2
 */