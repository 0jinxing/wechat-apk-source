package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class e$2
  implements f
{
  e$2(Bundle paramBundle, Context paramContext, int paramInt, String paramString, e.a parama)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(11656);
    g.Rg().b(1200, this);
    ab.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: errType = %s; errCode = %s; errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    boolean bool1 = false;
    boolean bool2 = false;
    String str1;
    Object localObject;
    if ((paramm != null) && ((paramm instanceof z)))
    {
      str1 = ((z)paramm).ajD();
      if (e.aim(str1))
      {
        bool2 = bool1;
        localObject = paramString;
      }
    }
    while (true)
    {
      try
      {
        ab.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: deepLinkUri = %s", new Object[] { str1 });
        bool2 = bool1;
        localObject = paramString;
        ab.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink gotoUri extraData: %s", new Object[] { this.uAA });
        bool2 = bool1;
        localObject = paramString;
        bool1 = e.a(this.val$context, str1, this.fwD, this.uAA, this.var);
        bool2 = bool1;
        localObject = paramString;
        h.pYm.e(11405, new Object[] { this.var, Integer.valueOf(this.fwD), Integer.valueOf(1), str1 });
        String str2 = paramString;
        bool2 = bool1;
        localObject = paramString;
        if (e.access$000())
        {
          bool2 = bool1;
          localObject = paramString;
          str2 = this.val$context.getString(2131305936);
          bool2 = bool1;
          localObject = str2;
          e.Pu();
        }
        paramString = str2;
        bool2 = bool1;
        if (this.vaq != null)
          this.vaq.a(paramInt1, paramInt2, paramString, paramm, bool2);
        AppMethodBeat.o(11656);
        return;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramString, "", new Object[] { "" });
        h.pYm.e(11405, new Object[] { this.var, Integer.valueOf(this.fwD), Integer.valueOf(0), str1 });
        paramString = (String)localObject;
        continue;
      }
      if ((this.fwD == 1) && (this.vaq != null))
      {
        h.pYm.e(11405, new Object[] { this.var, Integer.valueOf(this.fwD), Integer.valueOf(0), str1 });
        this.vaq.a(paramInt1, paramInt2, paramString, paramm, false);
        AppMethodBeat.o(11656);
      }
      else
      {
        ab.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: translate failed");
        localObject = new Intent();
        ((Intent)localObject).setFlags(268435456);
        ((Intent)localObject).setClassName(ah.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        ((Intent)localObject).putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
        ((Intent)localObject).putExtra("showShare", false);
        ab.i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink goto WebViewUI extraData: %s", new Object[] { this.uAA });
        if (this.uAA != null)
          ((Intent)localObject).putExtras(this.uAA);
        ah.getContext().startActivity((Intent)localObject);
        h.pYm.e(11405, new Object[] { this.var, Integer.valueOf(this.fwD), Integer.valueOf(0), str1 });
        bool2 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.2
 * JD-Core Version:    0.6.2
 */