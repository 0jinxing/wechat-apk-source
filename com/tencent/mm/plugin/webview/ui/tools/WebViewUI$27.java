package com.tencent.mm.plugin.webview.ui.tools;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.a;
import com.tencent.mm.plugin.webview.model.an;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class WebViewUI$27
  implements f.a
{
  WebViewUI$27(WebViewUI paramWebViewUI)
  {
  }

  public final void aYk()
  {
    int i = 2;
    boolean bool1 = false;
    AppMethodBeat.i(7849);
    try
    {
      if (this.uxp.icy.cZd())
      {
        if ((this.uxp.dax()) || (this.uxp.day()))
          j = WebViewUI.i(this.uxp);
        while (true)
        {
          k = i;
          if (j > 0)
          {
            if (j <= 4)
              break label550;
            k = i;
          }
          WebViewUI.c(this.uxp, k);
          this.uxp.X(true, true);
          if ((this.uxp.pzf == null) || (this.uxp.icz == null) || (this.uxp.uhz == null))
            break label503;
          String str1 = this.uxp.pzf.getUrl();
          if ((bo.isNullOrNil(str1)) || (!WebViewUI.j(this.uxp).add(str1)))
            break label503;
          GeneralControlWrapper localGeneralControlWrapper = this.uxp.icz.cZT();
          if ((localGeneralControlWrapper.vxG & 0x200) <= 0)
            break;
          bool2 = true;
          ab.d("MicroMsg.GeneralControlWrapper", "allowUploadHosts, ret = ".concat(String.valueOf(bool2)));
          if (bool2)
          {
            localObject = this.uxp.uhz;
            ab.i("MicroMsg.JsApiHandler", "getAllHostsInPage, ready(%s).", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).ready) });
            if ((((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).uFo != null) && (((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).ready))
              ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.b("sys:get_all_hosts", new HashMap(), ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).uFv, ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject).uFw) + ")", null);
          }
          if ((localGeneralControlWrapper.vxG & 0x400) <= 0)
            break label461;
          bool2 = true;
          ab.d("MicroMsg.GeneralControlWrapper", "allowUploadHTML, ret = ".concat(String.valueOf(bool2)));
          if (!bool2)
            break label467;
          this.uxp.uhz.ob(false);
          AppMethodBeat.o(7849);
          return;
          if ((!bo.isNullOrNil(this.uxp.cOG)) && (a.uet.matcher(this.uxp.cOG).matches()))
            j = this.uxp.icy.gw(16388, 2);
          else
            j = this.uxp.icy.gw(16384, 2);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "onLoadJsApiFinished, ex = " + localException.getMessage());
        int j = 2;
        continue;
        boolean bool2 = false;
        continue;
        label461: bool2 = false;
        continue;
        label467: Object localObject = this.uxp.uwP;
        if (bo.isNullOrNil(localException))
          bool2 = bool1;
        while (true)
        {
          if (bool2)
            this.uxp.uhz.ob(true);
          label503: AppMethodBeat.o(7849);
          break;
          String str2 = Uri.parse(localException).getHost();
          bool2 = bool1;
          if (!bo.isNullOrNil(str2))
            bool2 = ((an)localObject).umF.remove(str2);
        }
        label550: int k = j;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.27
 * JD-Core Version:    0.6.2
 */