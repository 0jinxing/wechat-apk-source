package com.tencent.mm.plugin.wepkg;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.f;
import com.tencent.mm.plugin.wepkg.model.g;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static boolean enable;
  private static Map<String, f> uVs;
  private static int uVt;

  static
  {
    AppMethodBeat.i(63363);
    uVs = new HashMap();
    enable = true;
    uVt = 0;
    AppMethodBeat.o(63363);
  }

  public static void Dp(String paramString)
  {
    AppMethodBeat.i(63356);
    uVs.remove(paramString);
    AppMethodBeat.o(63356);
  }

  private static boolean ahv(String paramString)
  {
    AppMethodBeat.i(63353);
    boolean bool;
    if (!WepkgMainProcessService.isLive())
    {
      d.b("", new b.2());
      com.tencent.mm.plugin.wepkg.utils.a.b("EnterWeb", paramString, d.aid(paramString), null, 0L, 0L, com.tencent.mm.plugin.wepkg.utils.a.Kl(10));
      bool = false;
      AppMethodBeat.o(63353);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(63353);
    }
  }

  public static boolean ahw(String paramString)
  {
    AppMethodBeat.i(63357);
    boolean bool = uVs.containsKey(paramString);
    AppMethodBeat.o(63357);
    return bool;
  }

  public static f ahx(String paramString)
  {
    AppMethodBeat.i(63359);
    String str1 = d.aid(paramString);
    if (uVs.containsKey(str1))
    {
      f localf = (f)uVs.get(str1);
      String str2 = d.aie(paramString);
      if ((localf != null) && (localf.uWY != null) && (str2.equalsIgnoreCase(localf.uWY.cSx)))
      {
        ab.i("MicroMsg.WePkgLoader", "memory has pkgid:%s record, version:%s", new Object[] { localf.uWY.eBS, localf.uWY.version });
        AppMethodBeat.o(63359);
        paramString = localf;
      }
    }
    while (true)
    {
      return paramString;
      paramString = g.ahU(paramString);
      if (paramString != null)
        uVs.put(str1, paramString);
      AppMethodBeat.o(63359);
    }
  }

  public static String ahy(String paramString)
  {
    AppMethodBeat.i(63361);
    try
    {
      String str = Uri.parse(paramString).getQueryParameter("wepkg_rid");
      paramString = str;
      AppMethodBeat.o(63361);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.WePkgLoader", "getWePkgRid, url: %s, exception: ", new Object[] { paramString, localException.getMessage() });
        paramString = null;
        AppMethodBeat.o(63361);
      }
    }
  }

  public static String ahz(String paramString)
  {
    AppMethodBeat.i(63362);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(63362);
    }
    while (true)
    {
      return paramString;
      if (paramString.equals(bo.nullAsNil(a.dga())))
      {
        paramString = a.dgb();
        AppMethodBeat.o(63362);
      }
      else
      {
        paramString = (f)uVs.get(paramString);
        if ((paramString != null) && (paramString.uWY != null))
        {
          paramString = paramString.uWY.version;
          AppMethodBeat.o(63362);
        }
        else
        {
          paramString = "";
          AppMethodBeat.o(63362);
        }
      }
    }
  }

  public static f bN(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(63358);
    ab.d("MicroMsg.WePkgLoader", "load, url: %s", new Object[] { paramString });
    if (!ahv(paramString))
    {
      ab.e("MicroMsg.WePkgLoader", "wepkg service is dead, start");
      h.pYm.k(859L, 36L, 1L);
      AppMethodBeat.o(63358);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!enable())
      {
        ab.e("MicroMsg.WePkgLoader", "load enable false");
        AppMethodBeat.o(63358);
        paramString = localObject;
      }
      else
      {
        String str = d.aid(paramString);
        if (paramBoolean)
        {
          ab.d("MicroMsg.WePkgLoader", "updateWePkg Bgn: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
          d.aNS().aa(new b.3(str));
        }
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(63358);
          paramString = localObject;
        }
        else
        {
          paramString = ahx(paramString);
          AppMethodBeat.o(63358);
        }
      }
    }
  }

  public static void biO()
  {
    AppMethodBeat.i(63351);
    dgd();
    a.biO();
    AppMethodBeat.o(63351);
  }

  public static void dgd()
  {
    AppMethodBeat.i(63352);
    if (!WepkgMainProcessService.isLive())
      d.b("", new b.1());
    AppMethodBeat.o(63352);
  }

  public static void dge()
  {
    AppMethodBeat.i(63354);
    if (uVt == 0)
      a.sg();
    uVt += 1;
    AppMethodBeat.o(63354);
  }

  public static int dgf()
  {
    return uVt;
  }

  public static void dgg()
  {
    AppMethodBeat.i(63355);
    int i = uVt - 1;
    uVt = i;
    if (i == 0)
    {
      uVs.clear();
      a.sg();
    }
    AppMethodBeat.o(63355);
  }

  public static void dgh()
  {
    enable = false;
  }

  public static boolean enable()
  {
    boolean bool = false;
    AppMethodBeat.i(63360);
    if (!enable)
      AppMethodBeat.o(63360);
    while (true)
    {
      return bool;
      if (com.tencent.mm.plugin.game.commlib.a.bDh())
      {
        ab.i("MicroMsg.WePkgLoader", "config wepkg disable");
        enable = false;
        AppMethodBeat.o(63360);
      }
      else
      {
        SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("we_pkg_sp", 4);
        if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean("disable_we_pkg", false)))
        {
          ab.i("MicroMsg.WePkgLoader", "white screen, disable wepkg");
          enable = false;
          AppMethodBeat.o(63360);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(63360);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b
 * JD-Core Version:    0.6.2
 */