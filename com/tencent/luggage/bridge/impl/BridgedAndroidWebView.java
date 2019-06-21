package com.tencent.luggage.bridge.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import com.tencent.luggage.bridge.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BridgedAndroidWebView extends BridgedAndroidWebViewBase
{
  private o bOA;
  private WebViewClient bOQ;
  private WebChromeClient bOR;

  public BridgedAndroidWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BridgedAndroidWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(90752);
    this.bOQ = new BridgedAndroidWebView.1(this);
    this.bOR = new BridgedAndroidWebView.2(this);
    this.bOA = new o(this);
    setWebViewClient(this.bOQ);
    setWebChromeClient(this.bOR);
    AppMethodBeat.o(90752);
  }

  public o getBridge()
  {
    return this.bOA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.bridge.impl.BridgedAndroidWebView
 * JD-Core Version:    0.6.2
 */