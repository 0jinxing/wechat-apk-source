package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

public final class e
  implements b
{
  private MMWebView fow;
  private d uDd;

  public e(MMWebView paramMMWebView, d paramd)
  {
    this.fow = paramMMWebView;
    this.uDd = paramd;
  }

  public final boolean afM(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(9019);
    if (this.fow != null)
      this.fow.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", null);
    paramString = paramString.substring(27);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.JsApiResultHandler", "SetResultHandler handleUrl fail, value is null");
      AppMethodBeat.o(9019);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = paramString.indexOf("&");
      if (i <= 0)
      {
        ab.e("MicroMsg.JsApiResultHandler", "SetResultHandler, handleUrl fail, invalid splitorIdx = %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(9019);
        bool = false;
        continue;
      }
      String str = paramString.substring(0, i);
      try
      {
        paramString = Base64.decode(paramString.substring(i + 1), 0);
        if (paramString == null)
        {
          paramString = localObject;
          ab.i("MicroMsg.JsApiResultHandler", "SetResultHandler, scene = %s, result = %s", new Object[] { str, paramString });
          this.uDd.keep_setReturnValue(str, paramString);
          AppMethodBeat.o(9019);
          bool = true;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.JsApiResultHandler", "SetResultHandler decodeBase64 failed");
          paramString = null;
          continue;
          paramString = new String(paramString);
        }
      }
    }
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(9018);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(9018);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://private/setresult/");
      AppMethodBeat.o(9018);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.e
 * JD-Core Version:    0.6.2
 */