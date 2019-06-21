package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.g.a.nd.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

final class g$25
  implements Runnable
{
  g$25(g paramg, nd paramnd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9069);
    ab.i("MicroMsg.MsgHandler", "JSOAUTH errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(this.piP.cJm.errCode), Boolean.valueOf(this.piP.cJm.cJn) });
    if (this.piP.cJm.errCode == -119)
      AppMethodBeat.o(9069);
    while (true)
    {
      return;
      if (this.piP.cJm.errCode != 0)
      {
        g.a(this.uHd, g.j(this.uHd), this.uHy + "fail", null);
        AppMethodBeat.o(9069);
      }
      else if (!this.piP.cJm.cJn)
      {
        g.a(this.uHd, g.j(this.uHd), this.uHy + "cancel", null);
        AppMethodBeat.o(9069);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("nationalCode", this.piP.cJm.cJo);
        localHashMap.put("userName", this.piP.cJm.userName);
        localHashMap.put("telNumber", this.piP.cJm.cJp);
        localHashMap.put("addressPostalCode", this.piP.cJm.cJq);
        localHashMap.put("proviceFirstStageName", this.piP.cJm.cJr);
        localHashMap.put("addressCitySecondStageName", this.piP.cJm.cJs);
        localHashMap.put("addressCountiesThirdStageName", this.piP.cJm.cJt);
        localHashMap.put("addressDetailInfo", this.piP.cJm.cJu);
        g.a(this.uHd, g.j(this.uHd), this.uHy + "ok", localHashMap);
        AppMethodBeat.o(9069);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.25
 * JD-Core Version:    0.6.2
 */