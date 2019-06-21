package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class ak
{
  private static ak umy;
  HashMap<String, WebViewJSSDKFileItem> umz;

  static
  {
    AppMethodBeat.i(6717);
    umy = new ak();
    AppMethodBeat.o(6717);
  }

  public ak()
  {
    AppMethodBeat.i(6714);
    this.umz = new HashMap();
    AppMethodBeat.o(6714);
  }

  public static final ak cXM()
  {
    return umy;
  }

  public final WebViewJSSDKFileItem aex(String paramString)
  {
    AppMethodBeat.i(6716);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
      paramString = null;
      AppMethodBeat.o(6716);
    }
    while (true)
    {
      return paramString;
      paramString = (WebViewJSSDKFileItem)this.umz.get(paramString);
      AppMethodBeat.o(6716);
    }
  }

  public final void b(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    AppMethodBeat.i(6715);
    if ((paramWebViewJSSDKFileItem == null) || (bo.isNullOrNil(paramWebViewJSSDKFileItem.czD)))
    {
      ab.e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
      AppMethodBeat.o(6715);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", new Object[] { paramWebViewJSSDKFileItem.czD, paramWebViewJSSDKFileItem.heo });
      this.umz.put(paramWebViewJSSDKFileItem.czD, paramWebViewJSSDKFileItem);
      AppMethodBeat.o(6715);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ak
 * JD-Core Version:    0.6.2
 */