package com.tencent.mm.at.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

public final class b
  implements com.tencent.mm.at.a.c.b
{
  public final com.tencent.mm.at.a.d.b sE(String paramString)
  {
    AppMethodBeat.i(116082);
    ab.d("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data from url:%s", new Object[] { paramString });
    try
    {
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramString);
      localObject1 = (HttpURLConnection)((URL)localObject1).openConnection();
      ((HttpURLConnection)localObject1).setConnectTimeout(15000);
      ((HttpURLConnection)localObject1).setReadTimeout(20000);
      if (localObject1 == null)
        ab.i("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "open connection failed.");
      if (((HttpURLConnection)localObject1).getResponseCode() >= 300)
      {
        ((HttpURLConnection)localObject1).disconnect();
        ab.w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
        AppMethodBeat.o(116082);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        Object localObject2 = ((HttpURLConnection)localObject1).getInputStream();
        paramString = ((HttpURLConnection)localObject1).getContentType();
        localObject2 = e.y((InputStream)localObject2);
        ((HttpURLConnection)localObject1).disconnect();
        paramString = new com.tencent.mm.at.a.d.b((byte[])localObject2, paramString);
        AppMethodBeat.o(116082);
      }
    }
    catch (InterruptedException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
        paramString = new com.tencent.mm.at.a.d.b(null, null);
        AppMethodBeat.o(116082);
      }
    }
    catch (UnknownHostException paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
    catch (SSLHandshakeException paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
    catch (SocketException paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
    catch (SocketTimeoutException paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
    catch (IOException paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
    catch (Exception paramString)
    {
      while (true)
        ab.e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(paramString) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b.b
 * JD-Core Version:    0.6.2
 */