package com.tencent.mm.plugin.appbrand.luggage.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.jsapi.w;
import com.tencent.mm.protocal.protobuf.bzx;

public final class b
  implements w
{
  public final void a(Context paramContext, String paramString, bzx parambzx)
  {
    AppMethodBeat.i(132095);
    Intent localIntent = new Intent().putExtra("rawUrl", paramString).putExtra(AppBrandProcessProxyUI.huY, paramString);
    localIntent.putExtra("rawUrl", paramString);
    if (parambzx != null)
    {
      localIntent.putExtra("show_native_web_view", parambzx.wYS);
      localIntent.putExtra("KRightBtn", parambzx.wYT);
    }
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(132095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.b
 * JD-Core Version:    0.6.2
 */