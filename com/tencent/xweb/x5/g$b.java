package com.tencent.xweb.x5;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.xweb.n;
import java.util.Map;

public final class g$b
  implements n
{
  private boolean APL;
  private boolean APM;
  private String method;
  private Uri url;
  private Map<String, String> vfl;

  public g$b(WebResourceRequest paramWebResourceRequest)
  {
    AppMethodBeat.i(84824);
    this.url = paramWebResourceRequest.getUrl();
    this.APL = paramWebResourceRequest.isForMainFrame();
    this.APM = paramWebResourceRequest.hasGesture();
    this.method = paramWebResourceRequest.getMethod();
    this.vfl = paramWebResourceRequest.getRequestHeaders();
    AppMethodBeat.o(84824);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.b
 * JD-Core Version:    0.6.2
 */