package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.c;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class af$a
{
  public static Bundle cXG()
  {
    AppMethodBeat.i(6659);
    String str = g.Nv().O("WebViewConfig", "oauthHostPath");
    ab.d("MicroMsg.OauthAuthorizeLogic", "getOauthHostPaths : %s", new Object[] { str });
    Bundle localBundle = new Bundle();
    localBundle.putString("oauth_host_paths", str);
    AppMethodBeat.o(6659);
    return localBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.a
 * JD-Core Version:    0.6.2
 */