package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.io.File;
import java.io.IOException;

public final class l
{
  public static boolean BK(String paramString)
  {
    AppMethodBeat.i(131477);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = true;
      AppMethodBeat.o(131477);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131477);
    }
  }

  public static String a(com.tencent.luggage.sdk.a.a.a parama, String paramString, boolean paramBoolean)
  {
    String str1 = null;
    String str2 = null;
    AppMethodBeat.i(131476);
    if (parama == null)
    {
      AppMethodBeat.o(131476);
      parama = str2;
    }
    while (true)
    {
      return parama;
      String str3 = parama.getAppId();
      if (bo.isNullOrNil(paramString))
      {
        if (!paramBoolean)
        {
          AppMethodBeat.o(131476);
          parama = str2;
        }
        else
        {
          parama.a(1, null, new Object[0]);
          if (parama.asE() == null)
          {
            ab.e("MicroMsg.ShareHelper", "tryToGetLocalFilePath NULL fs with appId(%s)", new Object[] { parama.getAppId() });
            AppMethodBeat.o(131476);
            parama = str2;
          }
          else
          {
            paramString = parama.asE().yh("share_" + System.currentTimeMillis());
            if (paramString == null)
            {
              AppMethodBeat.o(131476);
              parama = str2;
            }
            else
            {
              str2 = j.w(paramString.dMD());
              paramString = new Bundle();
              paramString.putInt("action", 1);
              f.a("com.tencent.mm", paramString, a.class, null);
              parama.xR().a(new l.1(str2, parama));
              parama = "delayLoadFile://".concat(String.valueOf(str2));
              AppMethodBeat.o(131476);
            }
          }
        }
      }
      else
      {
        if (paramString.startsWith("wxfile://"))
        {
          paramString = parama.asE().yg(paramString);
          parama = str1;
          if (paramString != null)
            if (paramString.exists())
              break label258;
          label258: for (parama = str1; ; parama = "file://" + paramString.getAbsolutePath())
          {
            AppMethodBeat.o(131476);
            break;
          }
        }
        if ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")))
        {
          str1 = AppBrandLocalMediaObjectManager.genMediaFilePath(str3, "share_" + System.currentTimeMillis());
          parama = s.j(parama.xL(), paramString);
          if ((parama != null) && (!parama.isRecycled()))
          {
            try
            {
              d.a(parama, 100, Bitmap.CompressFormat.PNG, str1, true);
              if ((parama != null) && (!parama.isRecycled()))
              {
                ab.i("MicroMsg.ShareHelper", "bitmap recycle %s", new Object[] { parama });
                parama.recycle();
              }
              parama = "file://".concat(String.valueOf(str1));
              AppMethodBeat.o(131476);
              continue;
            }
            catch (IOException paramString)
            {
              while (true)
              {
                ab.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", new Object[] { paramString });
                if ((parama != null) && (!parama.isRecycled()))
                {
                  ab.i("MicroMsg.ShareHelper", "bitmap recycle %s", new Object[] { parama });
                  parama.recycle();
                }
              }
            }
            finally
            {
              if ((parama != null) && (!parama.isRecycled()))
              {
                ab.i("MicroMsg.ShareHelper", "bitmap recycle %s", new Object[] { parama });
                parama.recycle();
              }
              AppMethodBeat.o(131476);
            }
          }
          else
          {
            AppMethodBeat.o(131476);
            parama = str2;
          }
        }
        else
        {
          AppMethodBeat.o(131476);
          parama = str2;
        }
      }
    }
  }

  public static String getRealPath(String paramString)
  {
    AppMethodBeat.i(131478);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(131478);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("file://"))
      {
        paramString = paramString.replace("file://", "");
        AppMethodBeat.o(131478);
      }
      else if (paramString.startsWith("delayLoadFile://"))
      {
        paramString = paramString.replace("delayLoadFile://", "");
        AppMethodBeat.o(131478);
      }
      else
      {
        AppMethodBeat.o(131478);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.l
 * JD-Core Version:    0.6.2
 */