package com.tencent.mm.plugin.appbrand.dynamic.b;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.c;
import com.tencent.mm.modelappbrand.a.b.j;
import com.tencent.mm.plugin.appbrand.dynamic.j.c;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.xweb.o;
import java.io.IOException;
import java.io.InputStream;

public final class a
{
  private static final b.j hmo;

  static
  {
    AppMethodBeat.i(10768);
    hmo = new b.c();
    AppMethodBeat.o(10768);
  }

  public static Bitmap bM(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(10767);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(10767);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      String str1 = LaunchParcel.Cm(paramString2);
      if (bo.isNullOrNil(str1))
      {
        AppMethodBeat.o(10767);
        paramString1 = localObject;
      }
      else
      {
        String str2 = paramString1 + '#' + str1;
        paramString2 = hmo.kR(str2);
        if ((paramString2 != null) && (!paramString2.isRecycled()))
        {
          AppMethodBeat.o(10767);
          paramString1 = paramString2;
        }
        else
        {
          paramString2 = c.bS(paramString1, str1);
          if (paramString2 != null);
          try
          {
            if (paramString2.mInputStream != null)
            {
              int i = paramString2.mInputStream.available();
              if (i > 0);
            }
            else
            {
              if (paramString2 != null)
                bo.b(paramString2.mInputStream);
              AppMethodBeat.o(10767);
              paramString1 = localObject;
              continue;
            }
            paramString1 = d.decodeStream(paramString2.mInputStream);
            if ((paramString1 != null) && (!paramString1.isRecycled()))
            {
              hmo.c(str2, paramString1);
              if (paramString2 != null)
                bo.b(paramString2.mInputStream);
              AppMethodBeat.o(10767);
            }
            else
            {
              if (paramString2 != null)
                bo.b(paramString2.mInputStream);
              AppMethodBeat.o(10767);
              paramString1 = localObject;
            }
          }
          catch (IOException paramString1)
          {
            while (true)
            {
              ab.e("MicroMsg.CanvasImageCache", "try decode icon e = %s", new Object[] { paramString1 });
              if (paramString2 != null)
                bo.b(paramString2.mInputStream);
            }
          }
          finally
          {
            if (paramString2 != null)
              bo.b(paramString2.mInputStream);
            AppMethodBeat.o(10767);
          }
        }
      }
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.b.a
 * JD-Core Version:    0.6.2
 */