package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.avm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class g$17
  implements f
{
  g$17(g paramg)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(9061);
    if ((g.m(this.uHd) != null) && (g.m(this.uHd).isShowing()))
    {
      g.m(this.uHd).dismiss();
      g.a(this.uHd, null);
    }
    com.tencent.mm.kernel.g.Rg().b(1566, this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId fail");
      g.a(this.uHd, g.j(this.uHd), "selectSingleContact:fail", null);
      AppMethodBeat.o(9061);
      return;
    }
    ab.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId success");
    paramString = (com.tencent.mm.plugin.webview.model.p)paramm;
    if (paramString.ehh == null);
    for (paramString = null; ; paramString = (avm)paramString.ehh.fsH.fsP)
    {
      if (paramString != null)
        break label166;
      g.a(this.uHd, g.j(this.uHd), "selectSingleContact:fail", null);
      AppMethodBeat.o(9061);
      break;
    }
    label166: paramm = g.j(this.uHd).puc.get("result_sign_type");
    if (paramm != null);
    for (paramInt1 = bo.getInt((String)paramm, 0); ; paramInt1 = 0)
    {
      paramm = new HashMap();
      paramm.put("package", paramString.vYP);
      paramm.put("sign", paramString.vYQ);
      if (paramInt1 == 1)
        paramm.put("signType", paramString.vYR);
      paramm.put("timestamp", paramString.vLo);
      paramm.put("noncestr", paramString.vYO);
      ab.d("MicroMsg.MsgHandler", "select single contact : package:%s, sign:%s", new Object[] { paramString.vYP, paramString.vYQ });
      g.a(this.uHd, g.j(this.uHd), "selectSingleContact:ok", paramm);
      AppMethodBeat.o(9061);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.17
 * JD-Core Version:    0.6.2
 */