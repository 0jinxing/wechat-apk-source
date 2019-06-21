package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.xweb.WebView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.a.c;

public final class f
{
  private static int uFW;
  private static String uFX;
  private static final String uFY;
  private static String uGa;
  private com.tencent.mm.plugin.webview.stub.d icy;
  public boolean uCf;
  private f.a uFS;
  private boolean uFT;
  public boolean uFU;
  public String uFV;
  private final ap uFZ;
  private d uhz;
  private WebView urJ;

  static
  {
    AppMethodBeat.i(9036);
    uFW = -1;
    uFX = null;
    uFY = b.eSj + "/jscache/";
    uGa = "window.addEventListener('load', requestInjectJS, false); function requestInjectJS() { console.log('weixin://preInjectJSBridge/start');}";
    AppMethodBeat.o(9036);
  }

  public f(WebView paramWebView, com.tencent.mm.plugin.webview.stub.d paramd, d paramd1, f.a parama, boolean paramBoolean)
  {
    this(paramWebView, paramd, paramd1, parama, paramBoolean, false);
  }

  public f(WebView paramWebView, com.tencent.mm.plugin.webview.stub.d paramd, d paramd1, f.a parama, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(9024);
    this.uFT = false;
    this.uFU = false;
    this.uFV = null;
    this.uFZ = new ap(new f.4(this), true);
    this.urJ = paramWebView;
    this.icy = paramd;
    this.uhz = paramd1;
    this.uFS = parama;
    this.uFT = paramBoolean1;
    this.uCf = paramBoolean2;
    ab.d("MicroMsg.JsLoader", "JsLoader <init>, withoutDelay = %b,isWebViewPreload %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    ab.i("MicroMsg.JsLoader", "JsLoader <init>, jsapi: %d, this: %d", new Object[] { Integer.valueOf(paramd1.hashCode()), Integer.valueOf(hashCode()) });
    AppMethodBeat.o(9024);
  }

  public f(WebView paramWebView, d paramd, f.a parama)
  {
    this(paramWebView, null, paramd, parama, true);
  }

  private String agu(String paramString)
  {
    AppMethodBeat.i(9030);
    ab.i("MicroMsg.JsLoader", "tryCopyAsset: %s", new Object[] { paramString });
    Object localObject;
    String str;
    if (uFX != null)
    {
      localObject = uFX;
      str = uFY + (String)localObject + "/" + paramString;
      if (!e.ct(str))
        break label104;
      AppMethodBeat.o(9030);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      localObject = com.tencent.mm.sdk.platformtools.f.REV.substring(0, Math.min(com.tencent.mm.sdk.platformtools.f.REV.length(), 8));
      uFX = (String)localObject;
      break;
      label104: com.tencent.mm.plugin.webview.preload.a.ae(86, 1L);
      localObject = new File(uFY).listFiles(new f.3(this, (String)localObject));
      if ((localObject != null) && (localObject.length > 0))
      {
        int i = localObject.length;
        for (int j = 0; j < i; j++)
          e.t(localObject[j]);
      }
      e.cx(str);
      try
      {
        hm(paramString, str);
        com.tencent.mm.plugin.webview.preload.a.ae(87, 1L);
        AppMethodBeat.o(9030);
        paramString = str;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.JsLoader", "tryCopyAsset, failed, ", new Object[] { paramString });
        paramString = null;
        AppMethodBeat.o(9030);
      }
    }
  }

  public static boolean c(WebView paramWebView)
  {
    AppMethodBeat.i(9028);
    if (uFW == -1)
      uFW = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHW, 0);
    boolean bool;
    if ((((uFW & 0x1) != 0) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.DEBUG)) && (paramWebView.supportFeature(2002)))
    {
      bool = true;
      AppMethodBeat.o(9028);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(9028);
      bool = false;
    }
  }

  private String dcr()
  {
    AppMethodBeat.i(9029);
    ab.i("MicroMsg.JsLoader", "WXJS: %s", new Object[] { "jsapi/wxjs.js" });
    try
    {
      String str1 = new java/lang/String;
      str1.<init>(c.toByteArray(ah.getContext().getAssets().open("jsapi/wxjs.js")));
      String str2 = str1;
      if (!TextUtils.isEmpty(this.uhz.uFw))
      {
        ab.i("MicroMsg.JsLoader", "getWXJS, ranDomStr = %s, jsapi: %d, jsLoader: %d", new Object[] { this.uhz.uFw, Integer.valueOf(this.uhz.hashCode()), Integer.valueOf(hashCode()) });
        str2 = str1.replaceFirst("\\$\\{dgtVerifyRandomStr\\}", this.uhz.uFw).replaceFirst("\\$\\{dgtVerifyEnabled\\}", "true");
      }
      AppMethodBeat.o(9029);
      return str2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsLoader", "tryInterceptBridgeScriptRequest, failed, ", new Object[] { localException });
        String str3 = "";
        AppMethodBeat.o(9029);
      }
    }
  }

  private void dct()
  {
    AppMethodBeat.i(9033);
    if (!this.uFZ.doT())
    {
      this.uFZ.stopTimer();
      ab.i("MicroMsg.JsLoader", "tryStopTimer success");
    }
    AppMethodBeat.o(9033);
  }

  private static void hm(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9031);
    InputStream localInputStream = ah.getContext().getAssets().open(paramString1);
    paramString1 = new FileOutputStream(paramString2);
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = localInputStream.read(arrayOfByte);
      if (i <= 0)
        break;
      paramString1.write(arrayOfByte, 0, i);
    }
    localInputStream.close();
    paramString1.close();
    ab.i("MicroMsg.JsLoader", "copy asset to:".concat(String.valueOf(paramString2)));
    AppMethodBeat.o(9031);
  }

  public final void dbY()
  {
    AppMethodBeat.i(9026);
    ab.v("MicroMsg.JsLoader", "onPageStarted");
    dct();
    if (this.uhz != null)
      this.uhz.nZ(false);
    AppMethodBeat.o(9026);
  }

  public final void dbZ()
  {
    AppMethodBeat.i(9027);
    ab.v("MicroMsg.JsLoader", "onPageFinished");
    dcs();
    AppMethodBeat.o(9027);
  }

  public final void dcq()
  {
    this.uCf = false;
  }

  public final void dcs()
  {
    AppMethodBeat.i(9032);
    if ((!this.uFZ.doT()) || (!this.uFT));
    try
    {
      if (this.icy.g(106, null) != null)
        this.uFT = true;
      label43: ap localap = this.uFZ;
      long l;
      if (this.uFT)
      {
        l = 0L;
        localap.ae(l, l);
        ab.i("MicroMsg.JsLoader", "tryStartTimer success %b", new Object[] { Boolean.valueOf(this.uFT) });
        AppMethodBeat.o(9032);
      }
      while (true)
      {
        return;
        l = 1000L;
        break;
        ab.i("MicroMsg.JsLoader", "timer running");
        AppMethodBeat.o(9032);
      }
    }
    catch (Exception localException)
    {
      break label43;
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(9025);
    ab.v("MicroMsg.JsLoader", "detach");
    this.urJ = null;
    this.uhz = null;
    this.uFS = null;
    AppMethodBeat.o(9025);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.f
 * JD-Core Version:    0.6.2
 */