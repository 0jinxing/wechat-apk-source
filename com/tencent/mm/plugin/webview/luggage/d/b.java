package com.tencent.mm.plugin.webview.luggage.d;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Map;

public final class b
  implements WebResourceRequest
{
  private String bOr;
  private boolean mIsRedirect;
  private Uri mUri;
  private boolean ulB;
  private boolean ulC;
  private Map<String, String> ulD;

  public b(Uri paramUri, boolean paramBoolean1, boolean paramBoolean2, String paramString, Map<String, String> paramMap)
  {
    this.mUri = paramUri;
    this.ulB = paramBoolean1;
    this.mIsRedirect = false;
    this.ulC = paramBoolean2;
    this.bOr = paramString;
    this.ulD = paramMap;
  }

  public final String getMethod()
  {
    return this.bOr;
  }

  public final Map<String, String> getRequestHeaders()
  {
    return this.ulD;
  }

  public final Uri getUrl()
  {
    return this.mUri;
  }

  public final boolean hasGesture()
  {
    return this.ulC;
  }

  public final boolean isForMainFrame()
  {
    return this.ulB;
  }

  public final boolean isRedirect()
  {
    return this.mIsRedirect;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.b
 * JD-Core Version:    0.6.2
 */