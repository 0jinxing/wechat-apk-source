package com.tencent.smtt.sdk;

import android.net.Uri;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.r;
import java.util.Map;

class ad$f
  implements com.tencent.smtt.export.external.interfaces.WebResourceRequest
{
  android.webkit.WebResourceRequest a;

  ad$f(android.webkit.WebResourceRequest paramWebResourceRequest)
  {
    this.a = paramWebResourceRequest;
  }

  public String getMethod()
  {
    AppMethodBeat.i(64219);
    String str = this.a.getMethod();
    AppMethodBeat.o(64219);
    return str;
  }

  public Map<String, String> getRequestHeaders()
  {
    AppMethodBeat.i(64220);
    Map localMap = this.a.getRequestHeaders();
    AppMethodBeat.o(64220);
    return localMap;
  }

  public Uri getUrl()
  {
    AppMethodBeat.i(64221);
    Uri localUri = this.a.getUrl();
    AppMethodBeat.o(64221);
    return localUri;
  }

  public boolean hasGesture()
  {
    AppMethodBeat.i(64222);
    boolean bool = this.a.hasGesture();
    AppMethodBeat.o(64222);
    return bool;
  }

  public boolean isForMainFrame()
  {
    AppMethodBeat.i(64223);
    boolean bool = this.a.isForMainFrame();
    AppMethodBeat.o(64223);
    return bool;
  }

  public boolean isRedirect()
  {
    AppMethodBeat.i(64224);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = r.a(this.a, "isRedirect");
      if (!(localObject instanceof Boolean));
    }
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(64224);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ad.f
 * JD-Core Version:    0.6.2
 */