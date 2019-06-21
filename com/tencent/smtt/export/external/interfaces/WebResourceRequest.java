package com.tencent.smtt.export.external.interfaces;

import android.net.Uri;
import java.util.Map;

public abstract interface WebResourceRequest
{
  public abstract String getMethod();

  public abstract Map<String, String> getRequestHeaders();

  public abstract Uri getUrl();

  public abstract boolean hasGesture();

  public abstract boolean isForMainFrame();

  public abstract boolean isRedirect();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.WebResourceRequest
 * JD-Core Version:    0.6.2
 */