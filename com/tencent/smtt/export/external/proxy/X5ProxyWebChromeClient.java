package com.tencent.smtt.export.external.proxy;

import com.tencent.smtt.export.external.WebViewWizardBase;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;

public abstract class X5ProxyWebChromeClient extends ProxyWebChromeClient
{
  public X5ProxyWebChromeClient(WebViewWizardBase paramWebViewWizardBase)
  {
    this.mWebChromeClient = ((IX5WebChromeClient)paramWebViewWizardBase.newInstance("com.tencent.smtt.webkit.WebChromeClient"));
  }

  public X5ProxyWebChromeClient(IX5WebChromeClient paramIX5WebChromeClient)
  {
    setWebChromeClient(paramIX5WebChromeClient);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.proxy.X5ProxyWebChromeClient
 * JD-Core Version:    0.6.2
 */