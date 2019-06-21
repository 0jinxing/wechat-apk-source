package com.tencent.mm.plugin.appbrand.h;

import android.webkit.ValueCallback;
import java.net.URL;

public abstract interface i extends j
{
  public abstract void a(URL paramURL, String paramString, ValueCallback<String> paramValueCallback);

  public abstract void a(URL paramURL, String paramString1, String paramString2, String paramString3, ValueCallback<String> paramValueCallback);

  public abstract void addJavascriptInterface(Object paramObject, String paramString);

  public abstract <T extends j> T af(Class<T> paramClass);

  public abstract void destroy();

  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);

  public abstract void setJsExceptionHandler(h paramh);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.i
 * JD-Core Version:    0.6.2
 */