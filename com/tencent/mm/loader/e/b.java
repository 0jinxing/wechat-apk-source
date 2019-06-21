package com.tencent.mm.loader.e;

import com.tencent.mm.loader.d.b.b;
import com.tencent.mm.loader.f.f;
import com.tencent.mm.loader.h.a.a;
import com.tencent.mm.loader.h.b.1;
import com.tencent.mm.loader.h.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;

public final class b extends com.tencent.mm.loader.d.b<String>
{
  public final void a(a<String> parama, f paramf, b.b paramb)
  {
    ab.d("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data from url:%s", new Object[] { parama });
    try
    {
      parama = (String)parama.value();
      paramf = new java/net/URL;
      paramf.<init>(parama);
      Object localObject = (HttpURLConnection)paramf.openConnection();
      ((HttpURLConnection)localObject).setConnectTimeout(15000);
      ((HttpURLConnection)localObject).setReadTimeout(20000);
      if (localObject == null)
        ab.i("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", "open connection failed.");
      if (((HttpURLConnection)localObject).getResponseCode() >= 300)
      {
        ((HttpURLConnection)localObject).disconnect();
        ab.w("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
      }
      for (parama = null; ; parama = new com.tencent.mm.loader.h.b(paramf, parama, (f.a)localObject))
      {
        paramb.a(parama);
        return;
        paramf = ((HttpURLConnection)localObject).getInputStream();
        parama = ((HttpURLConnection)localObject).getContentType();
        paramf = d.a(paramf, false);
        ((HttpURLConnection)localObject).disconnect();
        localObject = new com/tencent/mm/loader/h/b$1;
        ((b.1)localObject).<init>(paramf);
      }
    }
    catch (InterruptedException parama)
    {
      while (true)
      {
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
        paramb.onError();
      }
    }
    catch (UnknownHostException parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
    catch (SSLHandshakeException parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
    catch (SocketException parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
    catch (SocketTimeoutException parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
    catch (IOException parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
    catch (Exception parama)
    {
      while (true)
        ab.e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", new Object[] { bo.l(parama) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.b
 * JD-Core Version:    0.6.2
 */