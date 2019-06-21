package com.tencent.mm.plugin.webview.stub;

import android.os.Bundle;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewStubProxyUI$5
  implements e
{
  WebViewStubProxyUI$5(WebViewStubProxyUI paramWebViewStubProxyUI)
  {
  }

  public final boolean IZ(int paramInt)
  {
    AppMethodBeat.i(7074);
    WebViewStubProxyUI.a(this.uqn).IZ(paramInt);
    AppMethodBeat.o(7074);
    return false;
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(7086);
    WebViewStubProxyUI.a(this.uqn).W(paramBundle);
    AppMethodBeat.o(7086);
  }

  public final void X(Bundle paramBundle)
  {
    AppMethodBeat.i(7091);
    WebViewStubProxyUI.a(this.uqn).X(paramBundle);
    AppMethodBeat.o(7091);
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(7076);
    WebViewStubProxyUI.a(this.uqn).a(paramc);
    AppMethodBeat.o(7076);
    return false;
  }

  public final boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(7077);
    ab.i("MicroMsg.callbackerWrapper", "onHandleEnd in callbackerWrapper");
    this.uqn.uqh = WebViewStubProxyUI.afc(paramString2);
    this.uqn.runOnUiThread(new WebViewStubProxyUI.5.1(this, paramString1, paramString2, paramBundle, paramBoolean));
    AppMethodBeat.o(7077);
    return false;
  }

  public final void afd(String paramString)
  {
    AppMethodBeat.i(7087);
    WebViewStubProxyUI.a(this.uqn).afd(paramString);
    AppMethodBeat.o(7087);
  }

  public final IBinder asBinder()
  {
    return null;
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7075);
    WebViewStubProxyUI.a(this.uqn).c(paramInt, paramBundle);
    AppMethodBeat.o(7075);
    return false;
  }

  public final String cYY()
  {
    AppMethodBeat.i(7078);
    String str = WebViewStubProxyUI.a(this.uqn).cYY();
    AppMethodBeat.o(7078);
    return str;
  }

  public final String cYZ()
  {
    AppMethodBeat.i(7080);
    String str = WebViewStubProxyUI.a(this.uqn).cYZ();
    AppMethodBeat.o(7080);
    return str;
  }

  public final int cZa()
  {
    AppMethodBeat.i(7081);
    int i = WebViewStubProxyUI.a(this.uqn).cZa();
    AppMethodBeat.o(7081);
    return i;
  }

  public final void cZb()
  {
    AppMethodBeat.i(7085);
    WebViewStubProxyUI.a(this.uqn).cZb();
    AppMethodBeat.o(7085);
  }

  public final void cZc()
  {
    AppMethodBeat.i(7088);
    if (WebViewStubProxyUI.a(this.uqn) == null)
      AppMethodBeat.o(7088);
    while (true)
    {
      return;
      WebViewStubProxyUI.a(this.uqn).cZc();
      AppMethodBeat.o(7088);
    }
  }

  public final Bundle dj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7094);
    paramString1 = WebViewStubProxyUI.a(this.uqn).dj(paramString1, paramString2);
    AppMethodBeat.o(7094);
    return paramString1;
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7090);
    paramBundle = WebViewStubProxyUI.a(this.uqn).g(paramInt, paramBundle);
    AppMethodBeat.o(7090);
    return paramBundle;
  }

  public final String getCurrentUrl()
  {
    AppMethodBeat.i(7079);
    String str = WebViewStubProxyUI.a(this.uqn).getCurrentUrl();
    AppMethodBeat.o(7079);
    return str;
  }

  public final void hd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7089);
    WebViewStubProxyUI.a(this.uqn).hd(paramString1, paramString2);
    AppMethodBeat.o(7089);
  }

  public final void he(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7093);
    WebViewStubProxyUI.a(this.uqn).he(paramString1, paramString2);
    AppMethodBeat.o(7093);
  }

  public final void nJ(boolean paramBoolean)
  {
    AppMethodBeat.i(7082);
    WebViewStubProxyUI.a(this.uqn).nJ(paramBoolean);
    AppMethodBeat.o(7082);
  }

  public final void nK(boolean paramBoolean)
  {
    AppMethodBeat.i(7083);
    WebViewStubProxyUI.a(this.uqn).nK(paramBoolean);
    AppMethodBeat.o(7083);
  }

  public final void nL(boolean paramBoolean)
  {
    AppMethodBeat.i(7092);
    WebViewStubProxyUI.a(this.uqn).nL(paramBoolean);
    AppMethodBeat.o(7092);
  }

  public final void q(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7084);
    WebViewStubProxyUI.a(this.uqn).q(paramInt, paramBundle);
    AppMethodBeat.o(7084);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.5
 * JD-Core Version:    0.6.2
 */