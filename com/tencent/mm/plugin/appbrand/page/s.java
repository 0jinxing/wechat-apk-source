package com.tencent.mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.c;
import com.tencent.mm.modelappbrand.a.b.j;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.io.InputStream;

public final class s
{
  private static final b.j isz;

  static
  {
    AppMethodBeat.i(87156);
    isz = new b.c();
    AppMethodBeat.o(87156);
  }

  public static Bitmap j(i parami, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(87155);
    if (parami == null)
    {
      AppMethodBeat.o(87155);
      parami = localObject;
    }
    while (true)
    {
      return parami;
      String str1 = l.yj(paramString);
      if (bo.isNullOrNil(str1))
      {
        AppMethodBeat.o(87155);
        parami = localObject;
      }
      else
      {
        String str2 = parami.hashCode() + 35 + str1;
        paramString = isz.kR(str2);
        if ((paramString != null) && (!paramString.isRecycled()))
        {
          AppMethodBeat.o(87155);
          parami = paramString;
        }
        else
        {
          paramString = aw.d(parami, str1);
          if (paramString != null);
          try
          {
            int i = paramString.available();
            if (i <= 0)
            {
              if (paramString != null)
                bo.b(paramString);
              AppMethodBeat.o(87155);
              parami = localObject;
            }
            else
            {
              parami = d.decodeStream(paramString);
              if ((parami != null) && (!parami.isRecycled()))
              {
                isz.c(str2, parami);
                if (paramString != null)
                  bo.b(paramString);
                AppMethodBeat.o(87155);
              }
              else
              {
                if (paramString != null)
                  bo.b(paramString);
                AppMethodBeat.o(87155);
                parami = localObject;
              }
            }
          }
          catch (IOException parami)
          {
            while (true)
            {
              ab.e("MicroMsg.AppBrandPageIconCache", "try decode icon e = %s", new Object[] { parami });
              if (paramString != null)
                bo.b(paramString);
            }
          }
          finally
          {
            if (paramString != null)
              bo.b(paramString);
            AppMethodBeat.o(87155);
          }
        }
      }
    }
    throw parami;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.s
 * JD-Core Version:    0.6.2
 */