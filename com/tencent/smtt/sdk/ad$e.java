package com.tencent.smtt.sdk;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import java.util.Map;

class ad$e
  implements WebResourceRequest
{
  private String b;
  private boolean c;
  private boolean d;
  private boolean e;
  private String f;
  private Map<String, String> g;

  public ad$e(String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, Map<String, String> paramMap)
  {
    this.b = paramBoolean1;
    this.c = paramBoolean2;
    this.d = paramBoolean3;
    this.e = paramString2;
    this.f = paramMap;
    Object localObject;
    this.g = localObject;
  }

  public String getMethod()
  {
    return this.f;
  }

  public Map<String, String> getRequestHeaders()
  {
    return this.g;
  }

  public Uri getUrl()
  {
    AppMethodBeat.i(64218);
    Uri localUri = Uri.parse(this.b);
    AppMethodBeat.o(64218);
    return localUri;
  }

  public boolean hasGesture()
  {
    return this.e;
  }

  public boolean isForMainFrame()
  {
    return this.c;
  }

  public boolean isRedirect()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.e
 * JD-Core Version:    0.6.2
 */