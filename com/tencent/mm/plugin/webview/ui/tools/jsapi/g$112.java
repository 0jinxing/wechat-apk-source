package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.protobuf.afw;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.ui.MMActivity;

final class g$112
  implements f
{
  g$112(g paramg1, i parami, g paramg2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    int i = -1;
    AppMethodBeat.i(9188);
    if ((g.m(this.uHd) != null) && (g.m(this.uHd).isShowing()))
    {
      g.m(this.uHd).dismiss();
      g.a(this.uHd, null);
    }
    com.tencent.mm.kernel.g.Rg().b(1393, this);
    String str = "selectEnterpriseContact:fail";
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      paramm = null;
      paramInt1 = i;
      paramString = str;
      if (paramInt1 == 0)
        break label219;
      g.a(this.uHd, this.uqf, paramString, null);
      AppMethodBeat.o(9188);
    }
    while (true)
    {
      return;
      afw localafw = ((com.tencent.mm.plugin.webview.model.m)paramm).cXw();
      paramString = str;
      paramm = localafw;
      paramInt1 = i;
      if (localafw == null)
        break;
      paramString = str;
      paramm = localafw;
      paramInt1 = i;
      if (localafw.vNh == null)
        break;
      paramInt2 = localafw.vNh.ret;
      paramString = str;
      paramm = localafw;
      paramInt1 = paramInt2;
      if (localafw.vNh.cyF == null)
        break;
      paramString = str;
      paramm = localafw;
      paramInt1 = paramInt2;
      if (localafw.vNh.cyF.length() <= 0)
        break;
      paramString = localafw.vNh.cyF;
      paramm = localafw;
      paramInt1 = paramInt2;
      break;
      label219: paramString = paramm.vGi;
      paramm = new Intent();
      paramm.putExtra("rawUrl", paramString);
      paramm.putExtra("useJs", true);
      ((MMActivity)g.i(this.uHd)).ifE = this.uIp;
      d.b(g.i(this.uHd), "webview", ".ui.tools.WebViewUI", paramm, 53);
      AppMethodBeat.o(9188);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.112
 * JD-Core Version:    0.6.2
 */