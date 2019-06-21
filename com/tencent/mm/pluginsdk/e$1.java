package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class e$1
  implements f
{
  e$1(Context paramContext, int paramInt, String paramString1, String paramString2, e.a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(11655);
    g.Rg().b(233, this);
    ab.i("MicroMsg.DeepLinkHelper", "[oneliang][doDeepLink][onSceneEnd]:errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = bool2;
    com.tencent.mm.modelsimple.h localh;
    String str;
    if (paramm != null)
    {
      bool3 = bool2;
      if ((paramm instanceof com.tencent.mm.modelsimple.h))
      {
        localh = (com.tencent.mm.modelsimple.h)paramm;
        ab.d("MicroMsg.DeepLinkHelper", "bitset:" + localh.aiZ());
        long l = localh.aiZ();
        str = localh.aiT();
        if (!e.aH(str, l))
          break label338;
      }
    }
    for (bool3 = bool1; ; bool3 = true)
    {
      try
      {
        ab.i("MicroMsg.DeepLinkHelper", "[oneliang] uri: %s", new Object[] { str });
        bool3 = bool1;
        bool1 = e.a(this.val$context, localh.ajb(), localh.ajc(), str);
        bool3 = bool1;
        com.tencent.mm.plugin.report.service.h.pYm.e(11405, new Object[] { str, Integer.valueOf(1), Integer.valueOf(this.fwD), this.eiH, bo.nullAsNil(this.val$url) });
        bool3 = bool1;
        if (this.vaq != null)
          this.vaq.a(paramInt1, paramInt2, paramString, paramm, bool3);
        AppMethodBeat.o(11655);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.DeepLinkHelper", localException, "", new Object[] { "" });
          com.tencent.mm.plugin.report.service.h.pYm.e(11405, new Object[] { str, Integer.valueOf(0), Integer.valueOf(this.fwD), this.eiH, bo.nullAsNil(this.val$url) });
        }
      }
      label338: ab.i("MicroMsg.DeepLinkHelper", "[oneliang] no permission");
      Intent localIntent = new Intent();
      localIntent.setFlags(268435456);
      localIntent.setClassName(ah.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
      localIntent.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
      localIntent.putExtra("geta8key_session_id", localh.ajb());
      localIntent.putExtra("geta8key_cookie", localh.ajc());
      ah.getContext().startActivity(localIntent);
      com.tencent.mm.plugin.report.service.h.pYm.e(11405, new Object[] { str, Integer.valueOf(0), Integer.valueOf(this.fwD), this.eiH, bo.nullAsNil(this.val$url) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.1
 * JD-Core Version:    0.6.2
 */