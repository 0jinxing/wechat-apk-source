package com.tencent.xweb.xwalk.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class g$d$1
  implements HostnameVerifier
{
  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    AppMethodBeat.i(85492);
    boolean bool;
    if (paramString.contains("dldir1.qq.com"))
    {
      bool = true;
      AppMethodBeat.o(85492);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85492);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.g.d.1
 * JD-Core Version:    0.6.2
 */