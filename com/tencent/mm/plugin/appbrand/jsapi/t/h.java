package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import org.json.JSONObject;

public final class h extends c
{
  public static final int CTRL_INDEX = 300;
  public static final String NAME = "updateHTMLWebView";

  public final boolean c(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    boolean bool = false;
    AppMethodBeat.i(131677);
    if (!(paramView instanceof a))
      AppMethodBeat.o(131677);
    while (true)
    {
      return bool;
      parame = paramJSONObject.optString("src", "");
      ab.i("URL", parame);
      if (!TextUtils.isEmpty(parame))
        break;
      AppMethodBeat.o(131677);
      bool = true;
    }
    paramView = ((a)paramView).getWebView();
    if ((parame.indexOf("#") >= 0) && (!TextUtils.isEmpty(paramView.getUrl())))
      paramView.evaluateJavascript(String.format("window.location=\"%s\"", new Object[] { parame }), null);
    while (true)
    {
      AppMethodBeat.o(131677);
      bool = true;
      break;
      paramView.loadUrl(parame);
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(131678);
    int i = paramJSONObject.getInt("htmlId");
    AppMethodBeat.o(131678);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.h
 * JD-Core Version:    0.6.2
 */