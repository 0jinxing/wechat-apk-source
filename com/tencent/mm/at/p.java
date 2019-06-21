package com.tencent.mm.at;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class p
  implements c.c
{
  p.c fGA;
  boolean fGB;
  List<p.c> fGz;

  public p()
  {
    AppMethodBeat.i(78399);
    this.fGz = new LinkedList();
    this.fGA = null;
    this.fGB = false;
    AppMethodBeat.o(78399);
  }

  static String sw(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(78403);
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.UrlImageCacheService", "encode result is null: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(78403);
        paramString = localObject;
        return paramString;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        ab.e("MicroMsg.UrlImageCacheService", "try encode unsupport character: ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(78403);
        paramString = localObject;
        continue;
        paramString = new StringBuilder();
        paramString.append(e.evi);
        int i = localUnsupportedEncodingException.length();
        int j = 0;
        while (j < i)
        {
          paramString.append('/');
          if (j + 20 < i)
          {
            paramString.append(localUnsupportedEncodingException.substring(j, j + 20));
            j += 20;
          }
          else
          {
            paramString.append(localUnsupportedEncodingException.substring(j, i));
            j = i;
          }
        }
        paramString = paramString.toString();
        AppMethodBeat.o(78403);
      }
    }
  }

  public final void C(Bitmap paramBitmap)
  {
    AppMethodBeat.i(78404);
    if (paramBitmap == null)
    {
      ab.e("MicroMsg.UrlImageCacheService", "load from url failed: " + this.fGA.url);
      this.fGA = null;
      ahr();
      AppMethodBeat.o(78404);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.UrlImageCacheService", "load from %s successed", new Object[] { this.fGA.url });
      new p.2(this).execute(new p.b[] { new p.b(sw(this.fGA.url), paramBitmap) });
      if (!this.fGB)
      {
        o.ahk();
        c.h(this.fGA.url, paramBitmap);
        this.fGA.fGD.i(this.fGA.url, paramBitmap);
      }
      this.fGA = null;
      ahr();
      AppMethodBeat.o(78404);
    }
  }

  public final void a(String paramString, p.a parama)
  {
    AppMethodBeat.i(78400);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
    {
      ab.e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
      AppMethodBeat.o(78400);
    }
    while (true)
    {
      return;
      if ((this.fGA != null) && (this.fGA.url.equals(paramString)) && (this.fGA.fGD == parama))
      {
        ab.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
        AppMethodBeat.o(78400);
      }
      else
      {
        Iterator localIterator = this.fGz.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            p.c localc = (p.c)localIterator.next();
            if ((localc.url.equals(paramString)) && (localc.fGD == parama))
            {
              ab.e("MicroMsg.UrlImageCacheService", "url and callback is loading");
              AppMethodBeat.o(78400);
              break;
            }
          }
        this.fGz.add(new p.c(paramString, parama));
        ahr();
        AppMethodBeat.o(78400);
      }
    }
  }

  final void ahr()
  {
    AppMethodBeat.i(78402);
    if ((this.fGA != null) || (this.fGz.size() == 0))
    {
      ab.d("MicroMsg.UrlImageCacheService", "task is downing or no more task");
      AppMethodBeat.o(78402);
    }
    while (true)
    {
      return;
      this.fGA = ((p.c)this.fGz.get(0));
      this.fGz.remove(0);
      this.fGB = false;
      o.ahk();
      Bitmap localBitmap = c.kR(this.fGA.url);
      if (localBitmap != null)
      {
        ab.d("MicroMsg.UrlImageCacheService", "find bitmap in cache of " + this.fGA.url);
        if (!this.fGB)
          this.fGA.fGD.i(this.fGA.url, localBitmap);
        this.fGA = null;
        break;
      }
      new p.1(this).execute(new String[] { this.fGA.url });
      AppMethodBeat.o(78402);
    }
  }

  public final void b(String paramString, p.a parama)
  {
    AppMethodBeat.i(78401);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
    {
      ab.e("MicroMsg.UrlImageCacheService", "url is null or nil, or callback is null");
      AppMethodBeat.o(78401);
    }
    while (true)
    {
      return;
      if ((this.fGA != null) && (this.fGA.url.equals(paramString)) && (this.fGA.fGD == parama))
      {
        this.fGB = true;
        ab.i("MicroMsg.UrlImageCacheService", "cancel task that is loading, url:%s", new Object[] { paramString });
        AppMethodBeat.o(78401);
      }
      else
      {
        Iterator localIterator = this.fGz.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            p.c localc = (p.c)localIterator.next();
            if ((localc.url.equals(paramString)) && (localc.fGD == parama))
            {
              ab.i("MicroMsg.UrlImageCacheService", "cancel task, url:%s", new Object[] { paramString });
              this.fGz.remove(localc);
              AppMethodBeat.o(78401);
              break;
            }
          }
        AppMethodBeat.o(78401);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.p
 * JD-Core Version:    0.6.2
 */