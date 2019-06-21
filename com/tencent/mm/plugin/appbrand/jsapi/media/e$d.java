package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;

final class e$d
  implements e.b
{
  public final com.tencent.mm.vending.j.a h(i parami, String paramString)
  {
    AppMethodBeat.i(114360);
    paramString = aw.d(parami, paramString);
    e.c localc;
    boolean bool;
    if (paramString != null)
    {
      paramString.mark(0);
      parami = new BitmapFactory.Options();
      parami.inJustDecodeBounds = true;
      BitmapFactory.decodeStream(paramString, new Rect(), parami);
      localc = new e.c((byte)0);
      localc.width = parami.outWidth;
      localc.height = parami.outHeight;
      localc.type = com.tencent.luggage.e.a.a.f(parami);
      bool = com.tencent.luggage.e.a.a.e(parami);
    }
    try
    {
      paramString.reset();
      label89: if (bool)
      {
        parami = com.tencent.luggage.e.a.a.fO(com.tencent.luggage.e.a.a.j(paramString));
        localc.hfh = parami;
        bo.b(paramString);
        parami = com.tencent.mm.vending.j.a.F(e.e.hQg, localc);
        AppMethodBeat.o(114360);
      }
      while (true)
      {
        return parami;
        parami = "up";
        break;
        parami = com.tencent.mm.vending.j.a.cW(e.e.hQe);
        AppMethodBeat.o(114360);
      }
    }
    catch (IOException parami)
    {
      break label89;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.e.d
 * JD-Core Version:    0.6.2
 */