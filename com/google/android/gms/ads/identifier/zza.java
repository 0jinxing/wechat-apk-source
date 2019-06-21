package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class zza extends Thread
{
  zza(AdvertisingIdClient paramAdvertisingIdClient, Map paramMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115339);
    new zzc();
    Object localObject1 = this.zzl;
    Object localObject2 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
    Iterator localIterator = ((Map)localObject1).keySet().iterator();
    while (localIterator.hasNext())
    {
      str3 = (String)localIterator.next();
      ((Uri.Builder)localObject2).appendQueryParameter(str3, (String)((Map)localObject1).get(str3));
    }
    String str3 = ((Uri.Builder)localObject2).build().toString();
    try
    {
      localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(str3);
      localObject1 = (HttpURLConnection)((URL)localObject1).openConnection();
      try
      {
        int i = ((HttpURLConnection)localObject1).getResponseCode();
        if ((i < 200) || (i >= 300))
        {
          int j = String.valueOf(str3).length();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(j + 65);
          ((StringBuilder)localObject2).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(str3);
        }
        return;
      }
      finally
      {
        ((HttpURLConnection)localObject1).disconnect();
        AppMethodBeat.o(115339);
      }
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      while (true)
      {
        String str1 = localIndexOutOfBoundsException.getMessage();
        new StringBuilder(String.valueOf(str3).length() + 32 + String.valueOf(str1).length()).append("Error while parsing ping URL: ").append(str3).append(". ").append(str1);
        AppMethodBeat.o(115339);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        String str2 = localRuntimeException.getMessage();
        new StringBuilder(String.valueOf(str3).length() + 27 + String.valueOf(str2).length()).append("Error while pinging URL: ").append(str3).append(". ").append(str2);
        AppMethodBeat.o(115339);
      }
    }
    catch (IOException localIOException)
    {
      label257: break label257;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.zza
 * JD-Core Version:    0.6.2
 */