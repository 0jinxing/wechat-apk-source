package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import java.io.File;

final class e$a
  implements e.b
{
  public final com.tencent.mm.vending.j.a h(i parami, String paramString)
  {
    AppMethodBeat.i(114359);
    File localFile = parami.asE().yg(paramString);
    if (localFile == null)
    {
      parami = null;
      AppMethodBeat.o(114359);
      return parami;
    }
    parami = new BitmapFactory.Options();
    parami.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(localFile.getAbsolutePath(), parami);
    paramString = new e.c((byte)0);
    paramString.width = parami.outWidth;
    paramString.height = parami.outHeight;
    paramString.type = com.tencent.luggage.e.a.a.f(parami);
    if (com.tencent.luggage.e.a.a.e(parami));
    for (parami = com.tencent.luggage.e.a.a.fO(com.tencent.luggage.e.a.a.bJ(localFile.getAbsolutePath())); ; parami = "up")
    {
      paramString.hfh = parami;
      parami = com.tencent.mm.vending.j.a.F(e.e.hQg, paramString);
      AppMethodBeat.o(114359);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.e.a
 * JD-Core Version:    0.6.2
 */