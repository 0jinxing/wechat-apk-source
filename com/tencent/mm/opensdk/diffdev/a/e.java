package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public final class e
{
  public static byte[] a(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(128045);
    if ((paramString == null) || (paramString.length() == 0))
    {
      Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
      AppMethodBeat.o(128045);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = new DefaultHttpClient();
      paramString = new HttpGet(paramString);
      try
      {
        HttpConnectionParams.setSoTimeout(((HttpClient)localObject2).getParams(), 60000);
        paramString = ((HttpClient)localObject2).execute(paramString);
        if (paramString.getStatusLine().getStatusCode() != 200)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("httpGet fail, status code = ");
          Log.e("MicroMsg.SDK.NetUtil", paramString.getStatusLine().getStatusCode());
          AppMethodBeat.o(128045);
          paramString = localObject1;
        }
        else
        {
          paramString = EntityUtils.toByteArray(paramString.getEntity());
          AppMethodBeat.o(128045);
        }
      }
      catch (Exception paramString)
      {
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, Exception ex = " + paramString.getMessage());
        AppMethodBeat.o(128045);
        paramString = localObject1;
      }
      catch (IncompatibleClassChangeError paramString)
      {
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, IncompatibleClassChangeError ex = " + paramString.getMessage());
        AppMethodBeat.o(128045);
        paramString = localObject1;
      }
      catch (Throwable paramString)
      {
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, Throwable ex = " + paramString.getMessage());
        AppMethodBeat.o(128045);
        paramString = localObject1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.diffdev.a.e
 * JD-Core Version:    0.6.2
 */