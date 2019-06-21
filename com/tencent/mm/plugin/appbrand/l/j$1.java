package com.tencent.mm.plugin.appbrand.l;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

final class j$1
  implements HostnameVerifier
{
  j$1(HostnameVerifier paramHostnameVerifier, ArrayList paramArrayList)
  {
  }

  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    AppMethodBeat.i(108186);
    boolean bool;
    if ((this.ipb.verify(paramString, paramSSLSession)) || (j.d(this.ipc, paramString)))
    {
      bool = true;
      AppMethodBeat.o(108186);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(108186);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.j.1
 * JD-Core Version:    0.6.2
 */