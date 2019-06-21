package com.tencent.xweb.x5;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.xweb.n;
import java.util.Map;

public final class a$e
  implements WebResourceRequest
{
  public n AQp;

  private a$e(n paramn)
  {
    this.AQp = paramn;
  }

  public static WebResourceRequest a(n paramn)
  {
    AppMethodBeat.i(84782);
    if (paramn == null)
    {
      paramn = null;
      AppMethodBeat.o(84782);
    }
    while (true)
    {
      return paramn;
      paramn = new e(paramn);
      AppMethodBeat.o(84782);
    }
  }

  public final String getMethod()
  {
    AppMethodBeat.i(84786);
    String str = this.AQp.getMethod();
    AppMethodBeat.o(84786);
    return str;
  }

  public final Map<String, String> getRequestHeaders()
  {
    AppMethodBeat.i(84787);
    Map localMap = this.AQp.getRequestHeaders();
    AppMethodBeat.o(84787);
    return localMap;
  }

  public final Uri getUrl()
  {
    AppMethodBeat.i(84783);
    Uri localUri = this.AQp.getUrl();
    AppMethodBeat.o(84783);
    return localUri;
  }

  public final boolean hasGesture()
  {
    AppMethodBeat.i(84785);
    boolean bool = this.AQp.hasGesture();
    AppMethodBeat.o(84785);
    return bool;
  }

  public final boolean isForMainFrame()
  {
    AppMethodBeat.i(84784);
    boolean bool = this.AQp.isForMainFrame();
    AppMethodBeat.o(84784);
    return bool;
  }

  public final boolean isRedirect()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a.e
 * JD-Core Version:    0.6.2
 */