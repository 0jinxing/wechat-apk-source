package com.tencent.luggage.sdk.customize.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.w;
import com.tencent.mm.protocal.protobuf.bzx;

public final class FullSdkExternalToolsHelper
  implements w
{
  public final void a(Context paramContext, String paramString, bzx parambzx)
  {
    AppMethodBeat.i(101630);
    d.d("Luggage.FullSdkExternalToolsHelper", "open webview activity url: %s", new Object[] { paramString });
    parambzx = new Intent(paramContext, FullSdkExternalToolsHelper.SimpleWebViewActivity.class);
    parambzx.putExtra("_url_", paramString);
    if (!(paramContext instanceof Activity))
      parambzx.addFlags(268435456);
    paramContext.startActivity(parambzx);
    AppMethodBeat.o(101630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.customize.impl.FullSdkExternalToolsHelper
 * JD-Core Version:    0.6.2
 */