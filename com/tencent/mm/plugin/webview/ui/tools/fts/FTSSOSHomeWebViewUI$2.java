package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout.a;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import java.util.HashMap;
import java.util.Map;

final class FTSSOSHomeWebViewUI$2
  implements View.OnClickListener
{
  FTSSOSHomeWebViewUI$2(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8427);
    Object localObject1 = (FTSMainUIHotWordLayout.a)paramView.getTag();
    switch (((FTSMainUIHotWordLayout.a)localObject1).cKJ)
    {
    case 2:
    case 3:
    default:
    case 1:
    case 4:
    }
    try
    {
      Object localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      ((Map)localObject2).put("isclick", Integer.valueOf(1));
      ((Map)localObject2).put("scene", Integer.valueOf(20));
      ((Map)localObject2).put("recommendid", FTSSOSHomeWebViewUI.s(this.uBG).getSearchId());
      ((Map)localObject2).put("businesstype", Integer.valueOf(0));
      if (((FTSMainUIHotWordLayout.a)localObject1).zye != null);
      for (paramView = Uri.encode(((FTSMainUIHotWordLayout.a)localObject1).zye); ; paramView = "")
      {
        while (true)
        {
          ((Map)localObject2).put("docid", paramView);
          ((Map)localObject2).put("docpos", Integer.valueOf(((FTSMainUIHotWordLayout.a)localObject1).zyf + 1));
          ((Map)localObject2).put("ishomepage", Integer.valueOf(1));
          ((Map)localObject2).put("typepos", Integer.valueOf(1));
          ((Map)localObject2).put("jumpurl", Uri.encode(((FTSMainUIHotWordLayout.a)localObject1).jumpUrl));
          paramView = aa.an((Map)localObject2);
          localObject1 = new android/os/Bundle;
          ((Bundle)localObject1).<init>();
          ((Bundle)localObject1).putString("logString", paramView);
          FTSSOSHomeWebViewUI.u(this.uBG).g(131, (Bundle)localObject1);
          AppMethodBeat.o(8427);
          while (true)
          {
            return;
            if (this.uBG.uAy)
              break;
            AppMethodBeat.o(8427);
          }
          FTSSOSHomeWebViewUI.q(this.uBG);
          FTSSOSHomeWebViewUI.e(this.uBG, 0);
          this.uBG.dby().clearText();
          this.uBG.dby().n(((FTSMainUIHotWordLayout.a)localObject1).zye, null);
          this.uBG.dby().bBs();
          FTSSOSHomeWebViewUI.a(this.uBG).sendMessage(13);
          try
          {
            paramView = new android/os/Bundle;
            paramView.<init>();
            paramView.putInt("type", 0);
            paramView.putBoolean("isHomePage", true);
            paramView.putInt("scene", 20);
            paramView = FTSSOSHomeWebViewUI.r(this.uBG).p(4, paramView);
            HashMap localHashMap = new java/util/HashMap;
            localHashMap.<init>();
            localHashMap.put("sceneActionType", "2");
            localHashMap.put("recommendId", FTSSOSHomeWebViewUI.s(this.uBG).getSearchId());
            localObject2 = FTSSOSHomeWebViewUI.t(this.uBG);
            FTSSOSHomeWebViewUI.2.1 local1 = new com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$2$1;
            local1.<init>(this, paramView, localHashMap);
            ((ak)localObject2).post(local1);
          }
          catch (Exception paramView)
          {
          }
        }
        break;
        paramView = new Intent();
        paramView.putExtra("rawUrl", ((FTSMainUIHotWordLayout.a)localObject1).jumpUrl);
        paramView.putExtra("convertActivityFromTranslucent", false);
        com.tencent.mm.bp.d.b(ah.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
        break;
      }
    }
    catch (Exception paramView)
    {
      while (true)
      {
        ab.w("MicroMsg.FTS.FTSSOSHomeWebViewUI", "onHotwordCellClickListener cgi report fail for %s", new Object[] { paramView.toString() });
        AppMethodBeat.o(8427);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.2
 * JD-Core Version:    0.6.2
 */