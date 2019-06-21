package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Map;

final class g$22
  implements f
{
  g$22(g paramg, Intent paramIntent, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9066);
    if ((g.m(this.uHd) != null) && (g.m(this.uHd).isShowing()))
    {
      g.m(this.uHd).dismiss();
      g.a(this.uHd, null);
    }
    com.tencent.mm.kernel.g.Rg().b(1177, this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
      g.a(this.uHd, g.j(this.uHd), "sendSingleAppMessage:fail", null);
      AppMethodBeat.o(9066);
      return;
    }
    ab.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
    paramString = (v)paramm;
    paramm = new HashMap();
    paramm.put("openid", paramString.ulZ);
    paramm.put("headImgUrl", paramString.kKx);
    paramm.put("nickName", paramString.kKw);
    ab.d("MicroMsg.MsgHandler", "opnid:%s, nick_name:%s", new Object[] { paramString.ulZ, paramString.kKw });
    String str1 = (String)g.j(this.uHd).puc.get("img_url");
    String str2 = (String)g.j(this.uHd).puc.get("src_username");
    String str3 = (String)g.j(this.uHd).puc.get("src_displayname");
    if (this.val$data == null);
    for (paramString = null; ; paramString = this.val$data.getStringExtra("custom_send_text"))
    {
      g.a(this.uHd, null, "", this.cgl, str1, str2, str3, paramString, null);
      if (g.i(this.uHd) != null)
        h.bQ(g.i(this.uHd), g.i(this.uHd).getResources().getString(2131297050));
      g.a(this.uHd, g.j(this.uHd), "sendSingleAppMessage:ok", paramm);
      AppMethodBeat.o(9066);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.22
 * JD-Core Version:    0.6.2
 */