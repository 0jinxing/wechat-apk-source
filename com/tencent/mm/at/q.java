package com.tencent.mm.at;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
{
  private static String[] fGE = null;

  public static boolean ahs()
  {
    boolean bool = true;
    AppMethodBeat.i(78405);
    if (fGE == null)
      aht();
    if ((Build.VERSION.SDK_INT >= 14) && (fGE != null) && (fGE.length > 0) && (com.tencent.mm.compatible.e.q.etn.esF == 1))
      AppMethodBeat.o(78405);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78405);
    }
  }

  private static void aht()
  {
    AppMethodBeat.i(78406);
    try
    {
      String str = ((a)g.K(a.class)).Nu().getValue("BizEnableWebpUrl");
      ab.d("MicroMsg.WebpUtil", "initCdnUrlList, urllist: %s", new Object[] { str });
      if (!bo.isNullOrNil(str))
      {
        fGE = str.split(";");
        ab.d("MicroMsg.WebpUtil", "initCdnUrlList, CDN_URL_LIST.length: %d", new Object[] { Integer.valueOf(fGE.length) });
      }
      AppMethodBeat.o(78406);
      return;
    }
    catch (b localb)
    {
      while (true)
      {
        ab.w("MicroMsg.WebpUtil", "initCdnUrlList fail, AccountNotReady");
        AppMethodBeat.o(78406);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.d("MicroMsg.WebpUtil", "initCdnUrlList error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(78406);
      }
    }
  }

  private static int ahu()
  {
    AppMethodBeat.i(78410);
    Context localContext = ah.getContext();
    int i;
    if (at.isWifi(localContext))
    {
      i = 1;
      AppMethodBeat.o(78410);
    }
    while (true)
    {
      return i;
      if (at.is4G(localContext))
      {
        i = 4;
        AppMethodBeat.o(78410);
      }
      else if (at.is3G(localContext))
      {
        i = 3;
        AppMethodBeat.o(78410);
      }
      else if (at.is2G(localContext))
      {
        i = 2;
        AppMethodBeat.o(78410);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(78410);
      }
    }
  }

  public static String lG(int paramInt)
  {
    AppMethodBeat.i(78411);
    String str = String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(ahu()), Integer.valueOf(2) });
    AppMethodBeat.o(78411);
    return str;
  }

  public static String lH(int paramInt)
  {
    AppMethodBeat.i(78412);
    String str = String.format("System=android-%d,ClientVersion=%d,NetworkType=%d,Scene=%d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(paramInt), Integer.valueOf(ahu()), Integer.valueOf(1) });
    AppMethodBeat.o(78412);
    return str;
  }

  public static String sA(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(78413);
    try
    {
      boolean bool = sx(paramString);
      if (!bool)
      {
        AppMethodBeat.o(78413);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        paramString = Uri.parse(paramString).getQueryParameter("wxtype").toLowerCase();
        bool = bo.isNullOrNil(paramString);
        if (bool)
        {
          AppMethodBeat.o(78413);
          paramString = localObject;
        }
        else
        {
          paramString = paramString.toLowerCase();
          AppMethodBeat.o(78413);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(78413);
        paramString = localObject;
      }
    }
  }

  private static boolean sx(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(78407);
    int j;
    if ((fGE != null) && (fGE.length > 0) && (!bo.isNullOrNil(paramString)))
    {
      String[] arrayOfString = fGE;
      int i = arrayOfString.length;
      j = 0;
      if (j < i)
        if (paramString.startsWith(arrayOfString[j]))
        {
          bool = true;
          AppMethodBeat.o(78407);
        }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(78407);
    }
  }

  public static String sy(String paramString)
  {
    AppMethodBeat.i(78408);
    if ((fGE == null) || (fGE.length == 0))
    {
      ab.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, cdn url is null");
      aht();
    }
    if (!sx(paramString))
    {
      ab.d("MicroMsg.WebpUtil", "addWebpURLIfNecessary, is not cdn url");
      AppMethodBeat.o(78408);
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject = Uri.parse(paramString);
        String str1 = ((Uri)localObject).getQueryParameter("wxtype");
        boolean bool = bo.isNullOrNil(str1);
        if (bool)
        {
          AppMethodBeat.o(78408);
          continue;
        }
        String str2 = str1.toLowerCase();
        if (!str2.equals("gif"))
        {
          bool = str2.contains("gif");
          if (!bool);
        }
        else
        {
          AppMethodBeat.o(78408);
          continue;
        }
        str1 = ((Uri)localObject).getQueryParameter("tp");
        if (!bo.isNullOrNil(str1))
        {
          bool = str1.equals("webp");
          if (bool)
          {
            AppMethodBeat.o(78408);
            continue;
          }
        }
        if (bo.isNullOrNil(str2))
          break label192;
        localObject = ((Uri)localObject).buildUpon().appendQueryParameter("tp", "webp").build().toString();
        paramString = (String)localObject;
        AppMethodBeat.o(78408);
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(78408);
      }
      continue;
      label192: AppMethodBeat.o(78408);
    }
  }

  public static boolean sz(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(78409);
    try
    {
      boolean bool2 = bo.isNullOrNil(paramString);
      if (bool2)
        AppMethodBeat.o(78409);
      while (true)
      {
        return bool1;
        bool2 = sx(paramString);
        if (!bool2)
        {
          AppMethodBeat.o(78409);
        }
        else
        {
          paramString = Uri.parse(paramString).getQueryParameter("tp");
          if (bo.isNullOrNil(paramString))
            break;
          bool2 = paramString.equals("webp");
          if (!bool2)
            break;
          bool1 = true;
          AppMethodBeat.o(78409);
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(78409);
        continue;
        AppMethodBeat.o(78409);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.q
 * JD-Core Version:    0.6.2
 */