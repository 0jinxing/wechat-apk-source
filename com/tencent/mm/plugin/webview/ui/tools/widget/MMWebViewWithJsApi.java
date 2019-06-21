package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;
import com.tencent.xweb.s;

public class MMWebViewWithJsApi extends MMWebView
{
  private k uJK;
  private boolean uJL;

  public MMWebViewWithJsApi(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMWebViewWithJsApi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMWebViewWithJsApi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(10030);
    this.uJL = true;
    dKG();
    getSettings().setJavaScriptEnabled(true);
    getSettings().dUj();
    setWebChromeClient(new i(this));
    setWebViewClient(new k(this));
    paramContext = getSettings().getUserAgentString();
    if (!u.akj(paramContext))
    {
      paramContext = u.bh(getContext(), paramContext);
      getSettings().setUserAgentString(paramContext);
    }
    AppMethodBeat.o(10030);
  }

  public d getJsapi()
  {
    if (this.uJK != null);
    for (d locald = this.uJK.uDd; ; locald = null)
      return locald;
  }

  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(10033);
    if (this.uJK != null)
    {
      this.uJK.of(true);
      this.uJK.agc("");
    }
    super.loadData(paramString1, paramString2, paramString3);
    AppMethodBeat.o(10033);
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(10034);
    if (this.uJK != null)
    {
      this.uJK.of(true);
      this.uJK.agc("");
    }
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(10034);
  }

  public void loadUrl(String paramString)
  {
    AppMethodBeat.i(10035);
    if (this.uJK != null)
    {
      this.uJK.of(false);
      if (this.uJK.agc(paramString));
    }
    else
    {
      super.loadUrl(paramString);
    }
    AppMethodBeat.o(10035);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(10032);
    super.onDetachedFromWindow();
    if ((this.uJK != null) && (this.uJL))
      this.uJK.cleanup();
    AppMethodBeat.o(10032);
  }

  public void setCleanOnDetached(boolean paramBoolean)
  {
    this.uJL = paramBoolean;
  }

  public void setWebViewClient(s params)
  {
    AppMethodBeat.i(10031);
    super.setWebViewClient(params);
    if ((params instanceof k))
    {
      this.uJK = ((k)params);
      AppMethodBeat.o(10031);
    }
    while (true)
    {
      return;
      this.uJK = null;
      AppMethodBeat.o(10031);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi
 * JD-Core Version:    0.6.2
 */