package com.tencent.xweb.sys;

import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.WebResourceRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.a.a;
import com.tencent.xweb.n;
import java.util.Map;

public final class c$e
  implements n
{
  private boolean APL;
  private boolean APM;
  a APN;
  private String method;
  private Uri url;
  private Map<String, String> vfl;

  public c$e(WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(84658);
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.url = paramWebResourceRequest.getUrl();
      this.APL = paramWebResourceRequest.isForMainFrame();
      this.APM = paramWebResourceRequest.hasGesture();
      this.method = paramWebResourceRequest.getMethod();
      this.vfl = paramWebResourceRequest.getRequestHeaders();
      this.APN = new a(this);
    }
    AppMethodBeat.o(84658);
  }

  public final String getMethod()
  {
    return this.method;
  }

  public final Map<String, String> getRequestHeaders()
  {
    return this.vfl;
  }

  public final Uri getUrl()
  {
    return this.url;
  }

  public final boolean hasGesture()
  {
    return this.APM;
  }

  public final boolean isForMainFrame()
  {
    return this.APL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.sys.c.e
 * JD-Core Version:    0.6.2
 */