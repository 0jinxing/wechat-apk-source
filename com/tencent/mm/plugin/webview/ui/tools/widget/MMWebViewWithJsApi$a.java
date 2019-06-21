package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class MMWebViewWithJsApi$a
{
  public static MMWebViewWithJsApi fv(Context paramContext)
  {
    AppMethodBeat.i(138444);
    paramContext = fw(paramContext);
    AppMethodBeat.o(138444);
    return paramContext;
  }

  public static MMWebViewWithJsApi fw(Context paramContext)
  {
    AppMethodBeat.i(10029);
    MMWebViewWithJsApi.fu(paramContext);
    paramContext = new MMWebViewWithJsApi(paramContext);
    MMWebViewWithJsApi.a(paramContext);
    AppMethodBeat.o(10029);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a
 * JD-Core Version:    0.6.2
 */