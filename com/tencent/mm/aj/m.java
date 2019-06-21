package com.tencent.mm.aj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class m
{
  public static Bitmap aA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11429);
    if (!g.RP().isSDCardAvailable())
    {
      paramString1 = aeK();
      AppMethodBeat.o(11429);
    }
    while (true)
    {
      return paramString1;
      if ((paramString1 == null) || (!g.RN().QY()))
      {
        AppMethodBeat.o(11429);
        paramString1 = null;
      }
      else
      {
        String str = paramString2;
        if (paramString2 == null)
        {
          paramString2 = aB(paramString1, null);
          str = paramString2;
          if (paramString2 == null)
          {
            AppMethodBeat.o(11429);
            paramString1 = null;
          }
        }
        else
        {
          paramString2 = z.afb();
          Object localObject;
          if (paramString2.fwK.containsKey(paramString1))
          {
            localObject = (Bitmap)((WeakReference)paramString2.fwK.get(paramString1)).get();
            if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
            {
              localObject = aB(paramString1, str);
              localObject = com.tencent.mm.sdk.platformtools.d.aml(m.a.rm(paramString1 + (String)localObject));
              if (localObject == null)
              {
                ab.i("MicroMsg.BrandLogic", "not found brand icon local");
                paramString2 = null;
                label172: if (paramString2 == null)
                  break label276;
                AppMethodBeat.o(11429);
                paramString1 = paramString2;
                continue;
              }
              paramString2.g(paramString1, (Bitmap)localObject);
            }
          }
          else
          {
            while (true)
            {
              paramString2 = (WeakReference)paramString2.fwK.get(paramString1);
              if (paramString2 == null)
                break;
              paramString2 = (Bitmap)paramString2.get();
              break label172;
              localObject = aB(paramString1, str);
              localObject = com.tencent.mm.sdk.platformtools.d.aml(m.a.rm(paramString1 + (String)localObject));
              if (localObject == null)
              {
                ab.i("MicroMsg.BrandLogic", "not found brand icon local");
                break;
              }
              paramString2.g(paramString1, (Bitmap)localObject);
            }
            label276: al.d(new m.1(paramString1, str));
            AppMethodBeat.o(11429);
            paramString1 = null;
          }
        }
      }
    }
  }

  static String aB(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11431);
    if ((paramString1 == null) || (!g.RN().QY()))
    {
      paramString2 = null;
      AppMethodBeat.o(11431);
    }
    while (true)
    {
      return paramString2;
      paramString1 = z.aeR().qP(paramString1);
      if (paramString1.field_brandIconURL != null)
      {
        paramString2 = paramString1.field_brandIconURL;
        AppMethodBeat.o(11431);
      }
      else
      {
        AppMethodBeat.o(11431);
      }
    }
  }

  private static Bitmap aeK()
  {
    Object localObject1 = null;
    AppMethodBeat.i(11430);
    Object localObject2 = new BitmapFactory.Options();
    com.tencent.mm.sdk.platformtools.d.dnX();
    try
    {
      Object localObject3 = ah.getContext().getResources().openRawResource(2130839709);
      localObject1 = localObject3;
      localObject2 = BitmapFactory.decodeStream((InputStream)localObject3, null, (BitmapFactory.Options)localObject2);
      localObject1 = localObject2;
      if (localObject3 != null);
      try
      {
        ((InputStream)localObject3).close();
        localObject3 = localObject1;
        if (localObject1 != null)
          localObject3 = com.tencent.mm.sdk.platformtools.d.a(localObject1, false, localObject1.getWidth() >> 1);
        AppMethodBeat.o(11430);
        return localObject3;
      }
      catch (IOException localIOException2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BrandLogic", localIOException2, "", new Object[0]);
      }
    }
    finally
    {
      if (localObject1 == null);
    }
    try
    {
      localObject1.close();
      AppMethodBeat.o(11430);
      throw localObject4;
    }
    catch (IOException localIOException1)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.BrandLogic", localIOException1, "", new Object[0]);
    }
  }

  public static Bitmap rk(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11428);
    if ((bo.isNullOrNil(paramString)) || (!g.RP().isSDCardAvailable()) || (!g.RN().QY()))
    {
      paramString = null;
      AppMethodBeat.o(11428);
    }
    while (true)
    {
      return paramString;
      Bitmap localBitmap = z.afb().rl(paramString);
      if (localBitmap == null)
        bool = true;
      ab.i("MicroMsg.BrandLogic", "get verify user icon = %s, is null ? %s", new Object[] { paramString, String.valueOf(bool) });
      AppMethodBeat.o(11428);
      paramString = localBitmap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.m
 * JD-Core Version:    0.6.2
 */