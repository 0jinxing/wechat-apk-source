package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.t;
import com.tencent.mm.protocal.protobuf.afy;
import com.tencent.mm.protocal.protobuf.bos;
import java.util.HashMap;
import java.util.Map;

final class g$109
  implements f
{
  g$109(g paramg, i parami)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = -1;
    AppMethodBeat.i(9185);
    t.b(this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      paramString = "getEnterpriseChat:fail";
      paramm = null;
      paramInt1 = i;
    }
    while (true)
    {
      if (paramInt1 != 0)
      {
        g.a(this.uHd, this.uqf, paramString, null);
        AppMethodBeat.o(9185);
      }
      while (true)
      {
        return;
        paramString = (t)paramm;
        if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
        for (paramm = (afy)paramString.ehh.fsH.fsP; ; paramm = null)
        {
          if ((paramm != null) && (paramm.vNh != null))
            break label123;
          paramString = "getEnterpriseChat:fail";
          paramInt1 = i;
          break;
        }
        label123: paramInt1 = paramm.vNh.ret;
        if ((paramm.vNh.cyF == null) || (paramm.vNh.cyF.length() <= 0))
          break label229;
        paramString = "getEnterpriseChat:fail_" + paramm.vNh.cyF;
        break;
        paramString = new HashMap();
        paramString.put("result", paramm.result);
        g.a(this.uHd, this.uqf, "getEnterpriseChat:ok", paramString);
        AppMethodBeat.o(9185);
      }
      label229: paramString = "getEnterpriseChat:fail";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.109
 * JD-Core Version:    0.6.2
 */