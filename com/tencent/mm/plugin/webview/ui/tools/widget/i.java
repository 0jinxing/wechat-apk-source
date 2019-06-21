package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.g;
import com.tencent.xweb.l;

public class i extends l
{
  private Activity czX;
  private int uwu;

  public i(MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    AppMethodBeat.i(9912);
    this.uwu = 0;
    this.czX = ((Activity)paramMMWebViewWithJsApi.getContext());
    AppMethodBeat.o(9912);
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.h paramh)
  {
    AppMethodBeat.i(9915);
    this.uwu += 1;
    c localc;
    boolean bool;
    if (this.uwu > 2)
    {
      localc = com.tencent.mm.ui.base.h.a(this.czX, paramString2, "", this.czX.getString(2131305700), this.czX.getString(2131296994), new i.3(this, paramh), new i.4(this, paramh), 2131690208);
      if (localc == null)
        break label139;
      localc.setCanceledOnTouchOutside(false);
      localc.qZ(false);
      bool = true;
      AppMethodBeat.o(9915);
    }
    while (true)
    {
      return bool;
      localc = com.tencent.mm.ui.base.h.a(this.czX, paramString2, "", this.czX.getString(2131296994), new i.5(this, paramh));
      break;
      label139: bool = super.a(paramWebView, paramString1, paramString2, paramh);
      AppMethodBeat.o(9915);
    }
  }

  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, g paramg)
  {
    AppMethodBeat.i(9917);
    boolean bool = super.a(paramWebView, paramString1, paramString2, paramString3, paramg);
    AppMethodBeat.o(9917);
    return bool;
  }

  public final boolean b(WebView paramWebView, String paramString1, String paramString2, com.tencent.xweb.h paramh)
  {
    AppMethodBeat.i(9916);
    this.uwu += 1;
    c localc;
    boolean bool;
    if (this.uwu > 2)
    {
      localc = com.tencent.mm.ui.base.h.a(this.czX, paramString2, "", this.czX.getString(2131305700), this.czX.getString(2131296994), new i.6(this, paramh), new i.7(this, paramh), 2131689792);
      if (localc == null)
        break label159;
      localc.setCancelable(false);
      localc.setCanceledOnTouchOutside(false);
      bool = true;
      AppMethodBeat.o(9916);
    }
    while (true)
    {
      return bool;
      localc = com.tencent.mm.ui.base.h.a(this.czX, false, paramString2, "", this.czX.getString(2131296994), this.czX.getString(2131296868), new i.8(this, paramh), new i.9(this, paramh));
      break;
      label159: bool = super.b(paramWebView, paramString1, paramString2, paramh);
      AppMethodBeat.o(9916);
    }
  }

  public void d(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(9913);
    super.d(paramWebView, paramString);
    AppMethodBeat.o(9913);
  }

  protected void onClose()
  {
    AppMethodBeat.i(9918);
    this.czX.finish();
    AppMethodBeat.o(9918);
  }

  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    AppMethodBeat.i(9914);
    com.tencent.mm.ui.base.h.a(this.czX, false, this.czX.getString(2131305707, new Object[] { paramString }), this.czX.getString(2131305708), this.czX.getString(2131296994), this.czX.getString(2131296868), new i.1(this, paramCallback, paramString), new i.2(this, paramCallback, paramString));
    AppMethodBeat.o(9914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.i
 * JD-Core Version:    0.6.2
 */