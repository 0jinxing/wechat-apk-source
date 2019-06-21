package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class ct
  implements HostnameVerifier
{
  private String a;

  public ct(String paramString)
  {
    this.a = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(98667);
    if ((TextUtils.isEmpty(this.a)) || (!(paramObject instanceof ct)))
      AppMethodBeat.o(98667);
    while (true)
    {
      return bool;
      paramObject = ((ct)paramObject).a;
      if (TextUtils.isEmpty(paramObject))
      {
        AppMethodBeat.o(98667);
      }
      else
      {
        bool = this.a.equals(paramObject);
        AppMethodBeat.o(98667);
      }
    }
  }

  public final boolean verify(String paramString, SSLSession paramSSLSession)
  {
    AppMethodBeat.i(98666);
    boolean bool = HttpsURLConnection.getDefaultHostnameVerifier().verify(this.a, paramSSLSession);
    AppMethodBeat.o(98666);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ct
 * JD-Core Version:    0.6.2
 */