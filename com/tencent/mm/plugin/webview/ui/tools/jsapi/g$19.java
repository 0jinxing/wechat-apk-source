package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.v;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class g$19
  implements f
{
  g$19(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9063);
    if ((g.m(this.uHd) != null) && (g.m(this.uHd).isShowing()))
    {
      g.m(this.uHd).dismiss();
      g.a(this.uHd, null);
    }
    com.tencent.mm.kernel.g.Rg().b(1177, this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
      g.a(this.uHd, g.j(this.uHd), "selectSingleContact:fail", null);
      AppMethodBeat.o(9063);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
      paramm = (v)paramm;
      paramString = new HashMap();
      paramString.put("package", paramm.ulZ);
      paramString.put("sign", paramm.sign);
      paramString.put("headImgUrl", paramm.kKx);
      paramString.put("nickName", paramm.kKw);
      paramString.put("friendRelation", Integer.valueOf(paramm.uma));
      ab.d("MicroMsg.MsgHandler", "select single contact : opnid:%s, sign:%s, nick_name:%s, friend_relation:%d", new Object[] { paramm.ulZ, paramm.sign, paramm.kKw, Integer.valueOf(paramm.uma) });
      g.a(this.uHd, g.j(this.uHd), "selectSingleContact:ok", paramString);
      AppMethodBeat.o(9063);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.19
 * JD-Core Version:    0.6.2
 */