package com.tencent.mm.plugin.appbrand.luggage.b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tencent.luggage.bridge.impl.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.page.s;

public final class o extends a
  implements com.tencent.mm.plugin.appbrand.d.b
{
  private final com.tencent.mm.plugin.appbrand.i gPI;

  public o(com.tencent.mm.plugin.appbrand.i parami)
  {
    this.gPI = parami;
  }

  public final void a(String paramString, a.a parama)
  {
    AppMethodBeat.i(87001);
    byte[] arrayOfByte = new byte[0];
    Object localObject = arrayOfByte;
    if (match(paramString))
    {
      localObject = Uri.parse(paramString);
      paramString = ((Uri)localObject).getQueryParameter("appId");
      String str = ((Uri)localObject).getQueryParameter("path");
      localObject = arrayOfByte;
      if (paramString != null)
      {
        localObject = arrayOfByte;
        if (paramString.length() != 0)
        {
          localObject = arrayOfByte;
          if (str != null)
          {
            localObject = arrayOfByte;
            if (str.length() != 0)
            {
              paramString = aw.d(this.gPI, Uri.decode(str));
              localObject = com.tencent.luggage.g.i.k(paramString);
              com.tencent.luggage.g.i.b(paramString);
            }
          }
        }
      }
    }
    if (parama != null)
      parama.Q((byte[])localObject);
    AppMethodBeat.o(87001);
  }

  public final boolean a(c paramc, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(86999);
    if ((paramc == null) || (paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(86999);
    while (true)
    {
      return bool;
      if ((!paramString.startsWith("wxapkg://")) && (!paramString.startsWith("http://")) && (!paramString.startsWith("https://")) && (!paramString.startsWith("wxfile://")) && (!paramString.contains("://")))
      {
        bool = true;
        AppMethodBeat.o(86999);
      }
      else
      {
        AppMethodBeat.o(86999);
      }
    }
  }

  public final Bitmap b(String paramString, Rect paramRect, a.c paramc)
  {
    paramc = null;
    AppMethodBeat.i(86998);
    if (!match(paramString))
    {
      AppMethodBeat.o(86998);
      paramString = paramc;
    }
    while (true)
    {
      return paramString;
      Object localObject = Uri.parse(paramString);
      paramString = ((Uri)localObject).getQueryParameter("appId");
      localObject = ((Uri)localObject).getQueryParameter("path");
      if ((paramString == null) || (paramString.length() == 0) || (localObject == null) || (((String)localObject).length() == 0))
      {
        AppMethodBeat.o(86998);
        paramString = paramc;
      }
      else
      {
        paramc = s.j(this.gPI, Uri.decode((String)localObject));
        paramString = paramc;
        if (paramRect != null)
          paramString = new com.tencent.mm.plugin.appbrand.luggage.a.b(paramRect.left, paramRect.top, paramRect.width(), paramRect.height()).y(paramc);
        AppMethodBeat.o(86998);
      }
    }
  }

  public final String b(c paramc, String paramString)
  {
    AppMethodBeat.i(87000);
    if (!a(paramc, paramString))
      AppMethodBeat.o(87000);
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("wxapkg://");
      localStringBuilder.append("icon?");
      localStringBuilder.append("appId=");
      localStringBuilder.append(paramc.getAppId());
      localStringBuilder.append("&");
      localStringBuilder.append("path=");
      localStringBuilder.append(Uri.encode(paramString));
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(87000);
    }
  }

  public final boolean match(String paramString)
  {
    AppMethodBeat.i(86997);
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("wxapkg://")))
    {
      bool = true;
      AppMethodBeat.o(86997);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86997);
    }
  }

  public final String wP()
  {
    return "WxaPkgImageReader";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.o
 * JD-Core Version:    0.6.2
 */