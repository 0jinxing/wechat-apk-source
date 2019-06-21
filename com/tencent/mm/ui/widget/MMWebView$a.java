package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;

public final class MMWebView$a
{
  public static MMWebView g(Context paramContext, View paramView)
  {
    boolean bool = true;
    AppMethodBeat.i(107938);
    MMWebView.il(paramContext);
    paramContext = (MMWebView)paramView.findViewById(2131827552);
    paramContext.inited = true;
    if (paramContext.getX5WebViewExtension() != null);
    while (true)
    {
      MMWebView.e(paramContext, bool);
      AppMethodBeat.o(107938);
      return paramContext;
      bool = false;
    }
  }

  public static MMWebView im(Context paramContext)
  {
    AppMethodBeat.i(107935);
    try
    {
      ab.i("MMWebView", "TRACE_ORDER:MMWebView.java");
      WebView.initWebviewCore(paramContext, MMWebView.zNq, "tools", null);
      MMWebView.il(paramContext);
      MMWebView localMMWebView = new com/tencent/mm/ui/widget/MMWebView;
      localMMWebView.<init>(paramContext, null, 0, WebView.d.ANd);
      localMMWebView.inited = true;
      MMWebView.b(localMMWebView, localMMWebView.getIsX5Kernel());
      AppMethodBeat.o(107935);
      paramContext = localMMWebView;
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(107935);
        paramContext = null;
      }
    }
  }

  public static MMWebView in(Context paramContext)
  {
    AppMethodBeat.i(107936);
    ab.i("MMWebView", "TRACE_ORDER:MMWebView.java");
    WebView.initWebviewCore(paramContext, MMWebView.zNq, "tools", null);
    MMWebView.il(paramContext);
    paramContext = new MMWebView(paramContext);
    paramContext.inited = true;
    MMWebView.c(paramContext, paramContext.getIsX5Kernel());
    AppMethodBeat.o(107936);
    return paramContext;
  }

  public static MMWebView n(Activity paramActivity, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(107937);
    MMWebView.il(paramActivity);
    paramActivity = (MMWebView)paramActivity.findViewById(paramInt);
    paramActivity.inited = true;
    if (paramActivity.getX5WebViewExtension() != null);
    while (true)
    {
      MMWebView.d(paramActivity, bool);
      AppMethodBeat.o(107937);
      return paramActivity;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMWebView.a
 * JD-Core Version:    0.6.2
 */