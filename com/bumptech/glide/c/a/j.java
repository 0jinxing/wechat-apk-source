package com.bumptech.glide.c.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.c.a;
import com.bumptech.glide.c.c.h;
import com.bumptech.glide.h.c;
import com.bumptech.glide.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class j
  implements d<InputStream>
{
  static final j.b azq;
  private final com.bumptech.glide.c.c.g azr;
  private final int azs;
  private final j.b azt;
  private HttpURLConnection azu;
  private InputStream azv;
  private volatile boolean isCancelled;

  static
  {
    AppMethodBeat.i(91724);
    azq = new j.a();
    AppMethodBeat.o(91724);
  }

  public j(com.bumptech.glide.c.c.g paramg, int paramInt)
  {
    this(paramg, paramInt, azq);
  }

  private j(com.bumptech.glide.c.c.g paramg, int paramInt, j.b paramb)
  {
    this.azr = paramg;
    this.azs = paramInt;
    this.azt = paramb;
  }

  private InputStream a(URL paramURL1, int paramInt, URL paramURL2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(91722);
    int i;
    while (true)
    {
      if (paramInt >= 5)
      {
        paramURL1 = new com.bumptech.glide.c.e("Too many (> 5) redirects!");
        AppMethodBeat.o(91722);
        throw paramURL1;
      }
      if (paramURL2 != null)
        try
        {
          if (paramURL1.toURI().equals(paramURL2.toURI()))
          {
            paramURL2 = new com/bumptech/glide/c/e;
            paramURL2.<init>("In re-direct loop");
            AppMethodBeat.o(91722);
            throw paramURL2;
          }
        }
        catch (URISyntaxException paramURL2)
        {
        }
      this.azu = this.azt.b(paramURL1);
      paramURL2 = paramMap.entrySet().iterator();
      while (paramURL2.hasNext())
      {
        localObject = (Map.Entry)paramURL2.next();
        this.azu.addRequestProperty((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
      }
      this.azu.setConnectTimeout(this.azs);
      this.azu.setReadTimeout(this.azs);
      this.azu.setUseCaches(false);
      this.azu.setDoInput(true);
      this.azu.setInstanceFollowRedirects(false);
      this.azu.connect();
      this.azv = this.azu.getInputStream();
      if (this.isCancelled)
      {
        paramURL1 = null;
        AppMethodBeat.o(91722);
        return paramURL1;
      }
      i = this.azu.getResponseCode();
      if (i / 100 == 2)
      {
        j = 1;
        label241: if (j == 0)
          break label335;
        paramURL1 = this.azu;
        if (!TextUtils.isEmpty(paramURL1.getContentEncoding()))
          break label298;
        paramInt = paramURL1.getContentLength();
      }
      for (this.azv = c.b(paramURL1.getInputStream(), paramInt); ; this.azv = paramURL1.getInputStream())
      {
        paramURL1 = this.azv;
        AppMethodBeat.o(91722);
        break;
        j = 0;
        break label241;
        label298: if (Log.isLoggable("HttpUrlFetcher", 3))
          new StringBuilder("Got non empty content encoding: ").append(paramURL1.getContentEncoding());
      }
      label335: if (i / 100 == 3);
      for (int j = 1; ; j = 0)
      {
        if (j == 0)
          break label418;
        paramURL2 = this.azu.getHeaderField("Location");
        if (!TextUtils.isEmpty(paramURL2))
          break;
        paramURL1 = new com.bumptech.glide.c.e("Received empty or null redirect url");
        AppMethodBeat.o(91722);
        throw paramURL1;
      }
      Object localObject = new URL(paramURL1, paramURL2);
      cleanup();
      paramInt++;
      paramURL2 = paramURL1;
      paramURL1 = (URL)localObject;
    }
    label418: if (i == -1)
    {
      paramURL1 = new com.bumptech.glide.c.e(i);
      AppMethodBeat.o(91722);
      throw paramURL1;
    }
    paramURL1 = new com.bumptech.glide.c.e(this.azu.getResponseMessage(), i);
    AppMethodBeat.o(91722);
    throw paramURL1;
  }

  public final void a(com.bumptech.glide.g paramg, d.a<? super InputStream> parama)
  {
    AppMethodBeat.i(91721);
    long l = com.bumptech.glide.h.e.ok();
    while (true)
    {
      try
      {
        com.bumptech.glide.c.c.g localg = this.azr;
        if (localg.aEc == null)
        {
          URL localURL = new java/net/URL;
          if (TextUtils.isEmpty(localg.aEb))
          {
            String str = localg.aEa;
            paramg = str;
            if (TextUtils.isEmpty(str))
              paramg = ((URL)i.d(localg.url, "Argument must not be null")).toString();
            localg.aEb = Uri.encode(paramg, "@#&=*+-_.,:!?()/~'%;$");
          }
          localURL.<init>(localg.aEb);
          localg.aEc = localURL;
        }
        parama.S(a(localg.aEc, 0, null, this.azr.aDZ.getHeaders()));
        return;
      }
      catch (IOException paramg)
      {
        Log.isLoggable("HttpUrlFetcher", 3);
        parama.b(paramg);
        if (Log.isLoggable("HttpUrlFetcher", 2))
        {
          new StringBuilder("Finished http url fetcher fetch in ").append(com.bumptech.glide.h.e.q(l));
          AppMethodBeat.o(91721);
          continue;
        }
      }
      finally
      {
        if (Log.isLoggable("HttpUrlFetcher", 2))
          new StringBuilder("Finished http url fetcher fetch in ").append(com.bumptech.glide.h.e.q(l));
        AppMethodBeat.o(91721);
      }
      AppMethodBeat.o(91721);
    }
  }

  public final void cancel()
  {
    this.isCancelled = true;
  }

  public final void cleanup()
  {
    AppMethodBeat.i(91723);
    if (this.azv != null);
    try
    {
      this.azv.close();
      label20: if (this.azu != null)
        this.azu.disconnect();
      this.azu = null;
      AppMethodBeat.o(91723);
      return;
    }
    catch (IOException localIOException)
    {
      break label20;
    }
  }

  public final Class<InputStream> mg()
  {
    return InputStream.class;
  }

  public final a mh()
  {
    return a.ayE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.j
 * JD-Core Version:    0.6.2
 */