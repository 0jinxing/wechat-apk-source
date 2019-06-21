package com.tencent.mm.modelcontrol;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class c
  implements com.tencent.mm.model.at
{
  public static boolean a(PInt paramPInt1, PInt paramPInt2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(78096);
    paramPInt1.value = 0;
    int i = bo.getInt(((a)g.K(a.class)).Nu().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      ab.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
      AppMethodBeat.o(78096);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      boolean bool2 = com.tencent.mm.sdk.platformtools.at.isWifi(ah.getContext());
      if ((i == 2) && (!bool2))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
        AppMethodBeat.o(78096);
        bool1 = false;
      }
      else if (com.tencent.mm.sdk.platformtools.at.is2G(ah.getContext()))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
        AppMethodBeat.o(78096);
        bool1 = false;
      }
      else
      {
        paramPInt2 = ((a)g.K(a.class)).Nu().getValue("SnsAdSightNotAutoDownloadTimeRange");
        ab.i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: ".concat(String.valueOf(paramPInt2)));
        if (b.rR(paramPInt2))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
          if (i == 2);
          for (i = 2; ; i = 1)
          {
            paramPInt1.value = i;
            AppMethodBeat.o(78096);
            bool1 = false;
            break;
          }
        }
        ab.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
        AppMethodBeat.o(78096);
      }
    }
  }

  public static boolean a(PInt paramPInt1, PInt paramPInt2, PInt paramPInt3)
  {
    boolean bool1 = true;
    AppMethodBeat.i(78095);
    paramPInt1.value = 0;
    int i = bo.getInt(((a)g.K(a.class)).Nu().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      ab.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video");
      AppMethodBeat.o(78095);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      boolean bool2 = com.tencent.mm.sdk.platformtools.at.isWifi(ah.getContext());
      if ((i == 2) && (!bool2))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video.");
        AppMethodBeat.o(78095);
        bool1 = false;
      }
      else if (com.tencent.mm.sdk.platformtools.at.is2G(ah.getContext()))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video.");
        AppMethodBeat.o(78095);
        bool1 = false;
      }
      else
      {
        paramPInt2 = ((a)g.K(a.class)).Nu().getValue("SnsSightNoAutoDownload");
        if (!bo.isNullOrNil(paramPInt2))
        {
          try
          {
            ab.i("MicroMsg.SubCoreAutoDownload", "dynamicConfigValSeq ".concat(String.valueOf(paramPInt2)));
            Object localObject = new java/text/SimpleDateFormat;
            ((SimpleDateFormat)localObject).<init>("yyyyMMddHHmmss");
            Date localDate = new java/util/Date;
            localDate.<init>();
            long l1 = bo.getLong(((SimpleDateFormat)localObject).format(localDate), 0L) - ((int)b.afB() - 8) * 60L / 1000L;
            localObject = paramPInt2.split(",");
            long l2 = bo.getLong(localObject[0], 0L);
            if ((l1 <= bo.getLong(localObject[1], 0L)) && (l1 >= l2))
            {
              ab.i("MicroMsg.SubCoreAutoDownload", "config settings can not auto download SNS short video");
              paramPInt3.value = 1;
              AppMethodBeat.o(78095);
              bool1 = false;
            }
          }
          catch (Exception paramPInt3)
          {
            ab.e("MicroMsg.SubCoreAutoDownload", "paser error %s msg: %s", new Object[] { paramPInt2, paramPInt3.getMessage() });
          }
        }
        else
        {
          paramPInt2 = ((a)g.K(a.class)).Nu().getValue("SnsSightNotAutoDownloadTimeRange");
          ab.i("MicroMsg.BusyTimeControlLogic", "SnsSightNotAutoDownloadTimeRange value: ".concat(String.valueOf(paramPInt2)));
          if (b.rR(paramPInt2))
          {
            ab.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download(but need check again) SNS short video");
            if (i == 2);
            for (i = 2; ; i = 1)
            {
              paramPInt1.value = i;
              AppMethodBeat.o(78095);
              bool1 = false;
              break;
            }
          }
          ab.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download.");
          AppMethodBeat.o(78095);
        }
      }
    }
  }

  public static c afC()
  {
    try
    {
      AppMethodBeat.i(78091);
      c localc = (c)q.Y(c.class);
      AppMethodBeat.o(78091);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean afD()
  {
    AppMethodBeat.i(78093);
    boolean bool;
    if (b.afz())
    {
      ab.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C image.");
      bool = false;
      AppMethodBeat.o(78093);
    }
    int i;
    Context localContext;
    while (true)
    {
      return bool;
      i = bo.getInt(((a)g.K(a.class)).Nu().getValue("ChatImgAutoDownload"), 1);
      if (i == 3)
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "settings is not auto download C2C image. ChatImgAutoDownload : ".concat(String.valueOf(i)));
        bool = false;
        AppMethodBeat.o(78093);
      }
      else
      {
        localContext = ah.getContext();
        if ((i == 2) && (com.tencent.mm.sdk.platformtools.at.isWifi(localContext)))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
          bool = true;
          AppMethodBeat.o(78093);
        }
        else
        {
          if ((i != 1) || (!com.tencent.mm.sdk.platformtools.at.isWifi(localContext)))
            break;
          ab.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
          bool = true;
          AppMethodBeat.o(78093);
        }
      }
    }
    long l1 = bo.getInt(((a)g.K(a.class)).Nu().getValue("ChatImgAutoDownloadMax"), 0);
    long l2 = bo.a((Long)g.RP().Ry().get(ac.a.xJY, null), 0L);
    long l3 = bo.anl((String)DateFormat.format("M", System.currentTimeMillis()));
    long l4 = bo.a((Long)g.RP().Ry().get(ac.a.xJZ, null), 0L);
    ab.d("MicroMsg.SubCoreAutoDownload", "currentmonth " + l3 + " month " + l4 + " maxcount " + l1 + " current " + l2 + " downloadMode: " + i);
    if (l3 != l4)
    {
      ab.i("MicroMsg.SubCoreAutoDownload", "update month %d ", new Object[] { Long.valueOf(l3) });
      g.RP().Ry().set(ac.a.xJY, Long.valueOf(0L));
      g.RP().Ry().set(ac.a.xJZ, Long.valueOf(l3));
      l2 = 0L;
    }
    while (true)
    {
      if ((l2 > l1) && (l1 > 0L))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "this month had auto download " + l2 + " C2C image, can not auto download.");
        bool = false;
        AppMethodBeat.o(78093);
        break;
      }
      if ((i == 1) && ((com.tencent.mm.sdk.platformtools.at.isWifi(localContext)) || (com.tencent.mm.sdk.platformtools.at.is3G(localContext)) || (com.tencent.mm.sdk.platformtools.at.is4G(localContext))))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "it is wifi or 3,4G now, auto download C2C image.");
        bool = true;
        AppMethodBeat.o(78093);
        break;
      }
      ab.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C image.");
      bool = false;
      AppMethodBeat.o(78093);
      break;
    }
  }

  public static boolean afE()
  {
    AppMethodBeat.i(78094);
    String str = ((a)g.K(a.class)).Nu().getValue("SnsImgPreLoadingAroundTimeLimit");
    ab.i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: ".concat(String.valueOf(str)));
    boolean bool;
    if (b.rR(str))
    {
      ab.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
      bool = false;
      AppMethodBeat.o(78094);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
      bool = true;
      AppMethodBeat.o(78094);
    }
  }

  public static boolean u(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(78092);
    if (parambi == null)
    {
      ab.w("MicroMsg.SubCoreAutoDownload", "this message is null, can not auto download.");
      AppMethodBeat.o(78092);
    }
    while (true)
    {
      return bool;
      if (!parambi.drE())
      {
        ab.w("MicroMsg.SubCoreAutoDownload", "this message is not image, please tell cash.");
        AppMethodBeat.o(78092);
      }
      else if (!v(parambi))
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download C2C image.");
        AppMethodBeat.o(78092);
      }
      else
      {
        bool = afD();
        AppMethodBeat.o(78092);
      }
    }
  }

  public static boolean v(bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(78097);
    if (parambi == null)
    {
      ab.w("MicroMsg.SubCoreAutoDownload", "this message is null.");
      AppMethodBeat.o(78097);
    }
    while (true)
    {
      return bool;
      parambi = bf.oE(parambi.dqJ);
      if (parambi == null)
      {
        ab.i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
        AppMethodBeat.o(78097);
        bool = true;
      }
      else
      {
        parambi = parambi.fmD;
        if (bo.isNullOrNil(parambi))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
          AppMethodBeat.o(78097);
          bool = true;
        }
        else if (b.rR(parambi))
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : ".concat(String.valueOf(parambi)));
          AppMethodBeat.o(78097);
        }
        else
        {
          ab.i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: ".concat(String.valueOf(parambi)));
          AppMethodBeat.o(78097);
          bool = true;
        }
      }
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcontrol.c
 * JD-Core Version:    0.6.2
 */