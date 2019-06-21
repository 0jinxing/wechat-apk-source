package com.tencent.mm.plugin.appbrand.luggage.b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.luggage.bridge.impl.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.3;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.a.c;
import com.tencent.mm.plugin.appbrand.luggage.a.a;

public final class g extends c
{
  public final void a(String paramString, a.a parama)
  {
    AppMethodBeat.i(86987);
    if (!match(paramString))
      AppMethodBeat.o(86987);
    while (true)
    {
      return;
      b localb = b.abR();
      g.2 local2 = new g.2(this, parama);
      parama = localb.pD(paramString);
      if ((parama != null) && (parama.length != 0))
      {
        local2.Q(parama);
        AppMethodBeat.o(86987);
      }
      else
      {
        localb.a(new b.3(localb, paramString, local2), paramString, null);
        AppMethodBeat.o(86987);
      }
    }
  }

  public final Bitmap b(String paramString, Rect paramRect, final a.c paramc)
  {
    Bitmap localBitmap = null;
    AppMethodBeat.i(86986);
    if (!match(paramString))
    {
      AppMethodBeat.o(86986);
      paramString = localBitmap;
      return paramString;
    }
    if (paramRect != null);
    for (paramRect = new a(paramRect.left, paramRect.top, paramRect.width(), paramRect.height()); ; paramRect = null)
    {
      localBitmap = b.abR().a(paramString, paramRect);
      if (localBitmap == null)
        b.abR().a(new b.i()
        {
          public final void abU()
          {
          }

          public final void mr()
          {
            AppMethodBeat.i(86983);
            if (paramc == null)
              AppMethodBeat.o(86983);
            while (true)
            {
              return;
              paramc.E(null);
              AppMethodBeat.o(86983);
            }
          }

          public final String wP()
          {
            return "WxaIcon";
          }

          public final void x(Bitmap paramAnonymousBitmap)
          {
            AppMethodBeat.i(86982);
            if (paramc == null)
              AppMethodBeat.o(86982);
            while (true)
            {
              return;
              if ((paramAnonymousBitmap == null) || (paramAnonymousBitmap.isRecycled()))
              {
                paramc.E(null);
                AppMethodBeat.o(86982);
              }
              else
              {
                paramc.E(paramAnonymousBitmap);
                AppMethodBeat.o(86982);
              }
            }
          }
        }
        , paramString, null, paramRect);
      AppMethodBeat.o(86986);
      paramString = localBitmap;
      break;
    }
  }

  public final boolean match(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(86985);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(86985);
    while (true)
    {
      return bool;
      paramString = paramString.toLowerCase();
      if ((paramString.startsWith("http://")) || (paramString.startsWith("https://")))
      {
        bool = true;
        AppMethodBeat.o(86985);
      }
      else
      {
        AppMethodBeat.o(86985);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.g
 * JD-Core Version:    0.6.2
 */