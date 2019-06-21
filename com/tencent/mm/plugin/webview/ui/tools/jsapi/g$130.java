package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.protocal.protobuf.cii;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.Map;

final class g$130
  implements f
{
  g$130(g paramg, i parami, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9207);
    if ((g.m(this.uHd) != null) && (g.m(this.uHd).isShowing()))
    {
      g.m(this.uHd).dismiss();
      g.a(this.uHd, null);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (ac)paramm;
      if (paramString.ehh == null)
      {
        paramString = null;
        if (paramString == null)
          break label303;
        String str1 = paramString.username;
        if (bo.isNullOrNil(str1))
          break label293;
        if ((g.i(this.uHd) instanceof MMActivity))
        {
          String str2 = (String)this.uqf.puc.get("img_url");
          paramm = (String)this.uqf.puc.get("desc");
          String str3 = (String)this.uqf.puc.get("src_username");
          paramString = (String)this.uqf.puc.get("src_displayname");
          String str4 = (String)this.uqf.puc.get("title");
          if (g.a(this.uHd, this.val$appId, str4, str2, str1, paramm, str3, paramString, "sendAppMessageToSpecifiedContact:ok", "sendAppMessageToSpecifiedContact:fail") != null)
            break label284;
          ab.e("MicroMsg.MsgHandler", "sendAppMessageToSpecifiedContact fail, cannot show dialog");
          g.a(this.uHd, this.uqf, "sendAppMessageToSpecifiedContact:fail", null);
        }
      }
    }
    while (true)
    {
      g.a(this.uHd, this.uqf, "sendAppMessageToSpecifiedContact:fail", null);
      AppMethodBeat.o(9207);
      while (true)
      {
        return;
        paramString = (cii)paramString.ehh.fsH.fsP;
        break;
        label284: AppMethodBeat.o(9207);
      }
      label293: ab.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact request userName is null");
      continue;
      label303: ab.e("MicroMsg.MsgHandler", "TransIdResponse response is null");
      continue;
      ab.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact request error is null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.130
 * JD-Core Version:    0.6.2
 */