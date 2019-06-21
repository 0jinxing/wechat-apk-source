package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.webview.model.k;
import com.tencent.mm.protocal.protobuf.aem;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class g$102
  implements f
{
  g$102(g paramg, i parami)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9172);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MsgHandler", "doGetWechatVerifyTicket, errType = " + paramInt1 + ", errCode = " + paramInt2);
      g.a(this.uHd, this.uqf, "get_wechat_verify_ticket:fail ticket", null);
    }
    while (true)
    {
      com.tencent.mm.kernel.g.Rg().b(1097, this);
      AppMethodBeat.o(9172);
      return;
      paramm = (k)paramm;
      paramString = new HashMap();
      paramString.put("ticket", ((aem)paramm.lty.fsH.fsP).cxb);
      g.a(this.uHd, this.uqf, "get_wechat_verify_ticket:ok ticket", paramString);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.102
 * JD-Core Version:    0.6.2
 */