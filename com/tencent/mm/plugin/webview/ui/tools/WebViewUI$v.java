package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.OpenWebview.Resp;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.b;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$v
  implements b
{
  private final String uxR = "weixin://openapi/openwebview/result?";

  private WebViewUI$v(WebViewUI paramWebViewUI)
  {
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(7972);
    Object localObject = new OpenWebview.Resp();
    paramString = Uri.parse(paramString);
    ((OpenWebview.Resp)localObject).result = paramString.getQuery();
    ((OpenWebview.Resp)localObject).errCode = bo.getInt(paramString.getQueryParameter("errCode"), 0);
    ((OpenWebview.Resp)localObject).errStr = paramString.getQueryParameter("errMsg");
    ((OpenWebview.Resp)localObject).transaction = this.uxp.getIntent().getStringExtra("transaction_for_openapi_openwebview");
    String str = paramString.getQueryParameter("appid");
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.WebViewUI", "SDKOpenWebViewResultHandler handleUrl, appId is null");
      AppMethodBeat.o(7972);
    }
    while (true)
    {
      return true;
      paramString = new Bundle();
      ((OpenWebview.Resp)localObject).toBundle(paramString);
      p.at(paramString);
      localObject = new MMessageActV2.Args();
      try
      {
        ((MMessageActV2.Args)localObject).targetPkgName = this.uxp.icy.afi(str);
        ((MMessageActV2.Args)localObject).bundle = paramString;
        ab.d("MicroMsg.WebViewUI", "SDKOpenWebViewResultHandler, handleUrl, sendResp:%s", new Object[] { localObject });
        MMessageActV2.send(this.uxp, (MMessageActV2.Args)localObject);
        this.uxp.finish();
        AppMethodBeat.o(7972);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.WebViewUI", paramString, "", new Object[0]);
        AppMethodBeat.o(7972);
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(7971);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(7971);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://openapi/openwebview/result?");
      AppMethodBeat.o(7971);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.v
 * JD-Core Version:    0.6.2
 */