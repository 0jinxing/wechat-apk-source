package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.ui.base.p;

final class e
{
  ap frk;
  d icy;
  p mzU;
  boolean urN;
  boolean urO;
  final e.a urP;
  OAuthUI urQ;

  private e(OAuthUI paramOAuthUI, e.a parama, d paramd)
  {
    AppMethodBeat.i(7415);
    this.urN = false;
    this.urO = false;
    this.frk = new ap(new e.1(this), false);
    this.urQ = paramOAuthUI;
    this.urP = parama;
    this.icy = paramd;
    AppMethodBeat.o(7415);
  }

  public static e a(OAuthUI paramOAuthUI, String paramString, SendAuth.Req paramReq, e.a parama, d paramd)
  {
    AppMethodBeat.i(7416);
    paramOAuthUI = new e(paramOAuthUI, parama, paramd);
    parama = paramReq.scope;
    paramReq = paramReq.state;
    if (paramOAuthUI.urN)
      ab.e("MicroMsg.OAuthSession", "already getting");
    while (true)
    {
      AppMethodBeat.o(7416);
      return paramOAuthUI;
      paramOAuthUI.urO = true;
      paramd = new Bundle();
      paramd.putString("geta8key_data_appid", paramString);
      paramd.putString("geta8key_data_scope", parama);
      paramd.putString("geta8key_data_state", paramReq);
      try
      {
        paramOAuthUI.icy.s(233, paramd);
        paramOAuthUI.urN = true;
        paramOAuthUI.frk.ae(3000L, 3000L);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.w("MicroMsg.OAuthSession", "startGetA8Key, ex = " + paramString.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.e
 * JD-Core Version:    0.6.2
 */