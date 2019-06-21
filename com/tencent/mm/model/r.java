package com.tencent.mm.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.kernel.g;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class r
{
  public static String YA()
  {
    AppMethodBeat.i(59743);
    g.RQ();
    String str = (String)g.RP().Ry().get(42, null);
    AppMethodBeat.o(59743);
    return str;
  }

  public static String YB()
  {
    AppMethodBeat.i(59744);
    g.RQ();
    String str = (String)g.RP().Ry().get(4, null);
    AppMethodBeat.o(59744);
    return str;
  }

  public static String YC()
  {
    AppMethodBeat.i(59745);
    String str = YA();
    if (!bo.isNullOrNil(str))
      AppMethodBeat.o(59745);
    while (true)
    {
      return str;
      str = Yz();
      AppMethodBeat.o(59745);
    }
  }

  public static int YD()
  {
    AppMethodBeat.i(59746);
    g.RQ();
    Integer localInteger = (Integer)g.RP().Ry().get(7, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(59746);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(59746);
    }
  }

  public static long YE()
  {
    AppMethodBeat.i(59747);
    g.RQ();
    Long localLong = (Long)g.RP().Ry().get(147457, null);
    long l;
    if (localLong == null)
    {
      l = 0L;
      AppMethodBeat.o(59747);
    }
    while (true)
    {
      return l;
      l = localLong.longValue();
      AppMethodBeat.o(59747);
    }
  }

  public static int YF()
  {
    AppMethodBeat.i(59748);
    g.RQ();
    Integer localInteger = (Integer)g.RP().Ry().get(40, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(59748);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(59748);
    }
  }

  public static int YG()
  {
    AppMethodBeat.i(59749);
    g.RQ();
    Integer localInteger = (Integer)g.RP().Ry().get(339975, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(59749);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(59749);
    }
  }

  public static boolean YH()
  {
    AppMethodBeat.i(59750);
    boolean bool;
    if ((YF() & 0x4000) != 0)
    {
      bool = true;
      AppMethodBeat.o(59750);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59750);
    }
  }

  public static boolean YI()
  {
    AppMethodBeat.i(59751);
    boolean bool;
    if ((YF() & 0x8000) != 0)
    {
      bool = true;
      AppMethodBeat.o(59751);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59751);
    }
  }

  public static void YJ()
  {
    AppMethodBeat.i(59752);
    int i = YF();
    g.RQ();
    g.RP().Ry().set(40, Integer.valueOf(i | 0x8000));
    AppMethodBeat.o(59752);
  }

  public static int YK()
  {
    AppMethodBeat.i(59753);
    g.RQ();
    Integer localInteger = (Integer)g.RP().Ry().get(34, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(59753);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(59753);
    }
  }

  public static boolean YL()
  {
    AppMethodBeat.i(59754);
    if ((YD() & 0x40000) != 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.ConfigStorageLogic", "isGooglePay: %s  User Status: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(YD()) });
      AppMethodBeat.o(59754);
      return bool;
    }
  }

  public static boolean YM()
  {
    boolean bool = true;
    AppMethodBeat.i(59755);
    g.RQ();
    g.RP().Ry().dsb();
    if (YG() == 1)
      AppMethodBeat.o(59755);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59755);
    }
  }

  public static boolean YN()
  {
    AppMethodBeat.i(59756);
    g.RQ();
    g.RP().Ry().dsb();
    boolean bool;
    if (YG() == 2)
    {
      bool = true;
      AppMethodBeat.o(59756);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59756);
    }
  }

  public static boolean YO()
  {
    AppMethodBeat.i(59757);
    g.RQ();
    g.RP().Ry().dsb();
    boolean bool;
    if (YG() == 4)
    {
      bool = true;
      AppMethodBeat.o(59757);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59757);
    }
  }

  public static boolean YP()
  {
    AppMethodBeat.i(59758);
    boolean bool;
    if ((YK() & 0x20) == 0)
    {
      bool = true;
      AppMethodBeat.o(59758);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59758);
    }
  }

  public static boolean YQ()
  {
    AppMethodBeat.i(59759);
    boolean bool;
    if ((YD() & 0x1000) != 0)
    {
      bool = true;
      AppMethodBeat.o(59759);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59759);
    }
  }

  public static boolean YR()
  {
    AppMethodBeat.i(59760);
    bq localbq = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XU().RA("@t.qq.com");
    boolean bool;
    if ((localbq != null) && (localbq.isEnable()))
    {
      bool = true;
      AppMethodBeat.o(59760);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59760);
    }
  }

  public static boolean YS()
  {
    AppMethodBeat.i(59761);
    boolean bool;
    if ((YK() & 0x2) == 0)
    {
      bool = true;
      AppMethodBeat.o(59761);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59761);
    }
  }

  public static boolean YT()
  {
    AppMethodBeat.i(59762);
    boolean bool;
    if ((YK() & 0x10) == 0)
    {
      bool = true;
      AppMethodBeat.o(59762);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59762);
    }
  }

  public static boolean YU()
  {
    AppMethodBeat.i(59763);
    boolean bool;
    if ((YK() & 0x80) == 0)
    {
      bool = true;
      AppMethodBeat.o(59763);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59763);
    }
  }

  public static boolean YV()
  {
    AppMethodBeat.i(59764);
    boolean bool;
    if ((YK() & 0x80000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59764);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59764);
    }
  }

  public static boolean YW()
  {
    AppMethodBeat.i(59765);
    boolean bool;
    if ((YK() & 0x40000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59765);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59765);
    }
  }

  public static boolean YX()
  {
    AppMethodBeat.i(59766);
    boolean bool;
    if ((YK() & 0x2000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59766);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59766);
    }
  }

  public static boolean YY()
  {
    AppMethodBeat.i(59767);
    boolean bool;
    if ((YK() & 0x10000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59767);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59767);
    }
  }

  public static boolean YZ()
  {
    AppMethodBeat.i(59768);
    boolean bool;
    if ((YK() & 0x8000000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59768);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59768);
    }
  }

  public static int Yy()
  {
    AppMethodBeat.i(59740);
    g.RQ();
    Integer localInteger = (Integer)g.RP().Ry().get(9, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(59740);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(59740);
    }
  }

  public static String Yz()
  {
    AppMethodBeat.i(59742);
    g.RQ();
    String str = (String)g.RP().Ry().get(2, null);
    AppMethodBeat.o(59742);
    return str;
  }

  public static boolean Za()
  {
    AppMethodBeat.i(59769);
    g.RQ();
    String str = (String)g.RP().Ry().get(65825, null);
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(59769);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (str.equals("0"))
      {
        AppMethodBeat.o(59769);
        bool = false;
      }
      else
      {
        try
        {
          long l = bo.c(Long.valueOf(bo.getLong(str, 0L)));
          if (l != 0L)
            break label99;
          AppMethodBeat.o(59769);
          bool = false;
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(59769);
          bool = false;
        }
        continue;
        label99: bool = true;
        AppMethodBeat.o(59769);
      }
    }
  }

  public static boolean Zb()
  {
    AppMethodBeat.i(59770);
    boolean bool;
    if ((YK() & 0x1) == 0)
    {
      bool = true;
      AppMethodBeat.o(59770);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59770);
    }
  }

  public static boolean Zc()
  {
    AppMethodBeat.i(59771);
    boolean bool;
    if ((YD() & 0x20000) == 0)
    {
      bool = true;
      AppMethodBeat.o(59771);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59771);
    }
  }

  public static ad Zd()
  {
    AppMethodBeat.i(59772);
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(Yz());
    if ((localObject != null) && ((int)((a)localObject).ewQ > 0))
      AppMethodBeat.o(59772);
    while (true)
    {
      return localObject;
      ad localad = new ad();
      g.RQ();
      String str = (String)g.RP().Ry().get(2, null);
      g.RQ();
      localObject = (String)g.RP().Ry().get(4, null);
      localad.setUsername(str);
      localad.iB((String)localObject);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().Z(localad);
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
      AppMethodBeat.o(59772);
    }
  }

  public static boolean Ze()
  {
    AppMethodBeat.i(59774);
    g.RQ();
    boolean bool;
    if (new p(bo.h((Integer)g.RP().Ry().get(9, null))).longValue() != 0L)
    {
      bool = true;
      AppMethodBeat.o(59774);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59774);
    }
  }

  public static Boolean Zf()
  {
    AppMethodBeat.i(59778);
    if (!g.RK())
    {
      ab.e("MicroMsg.ConfigStorageLogic", "mmcore has not ready");
      localObject = Boolean.FALSE;
      AppMethodBeat.o(59778);
      return localObject;
    }
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(6, null);
    g.RQ();
    if ((bo.e((Boolean)g.RP().Ry().get(340241, null)) == true) && (!bo.isNullOrNil((String)localObject)))
      if (!((String)localObject).startsWith("+"))
        break label147;
    label147: for (localObject = av.Ps((String)localObject); ; localObject = "86")
    {
      if (localObject == "86")
      {
        localObject = Boolean.FALSE;
        AppMethodBeat.o(59778);
        break;
      }
      localObject = Boolean.TRUE;
      AppMethodBeat.o(59778);
      break;
      localObject = Boolean.FALSE;
      AppMethodBeat.o(59778);
      break;
    }
  }

  public static Map<String, String> Zg()
  {
    AppMethodBeat.i(59779);
    HashMap localHashMap = new HashMap();
    localHashMap.put("login_weixin_username", Yz());
    g.RQ();
    localHashMap.put("login_user_name", (String)g.RP().Ry().get(ac.a.xVa, null));
    g.RQ();
    localHashMap.put("last_avatar_path", (String)g.RP().Ry().get(ac.a.xVb, null));
    g.RQ();
    localHashMap.put("last_login_bind_mobile", (String)g.RP().Ry().get(6, null));
    g.RQ();
    localHashMap.put("last_login_bind_email", (String)g.RP().Ry().get(5, null));
    g.RQ();
    localHashMap.put("last_login_bind_qq", String.valueOf(g.RP().Ry().get(9, null)));
    g.RQ();
    localHashMap.put("last_login_use_voice", String.valueOf(g.RP().Ry().get(40, null)));
    AppMethodBeat.o(59779);
    return localHashMap;
  }

  public static boolean g(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(59775);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.e("MicroMsg.ConfigStorageLogic", "canSendRawImage, invalid argument");
      paramBoolean = false;
      AppMethodBeat.o(59775);
    }
    while (true)
    {
      return paramBoolean;
      if ((paramString2 != null) && (paramString2.length() > 0) && ((ad.aou(paramString2)) || (ad.aow(paramString2))))
      {
        paramBoolean = false;
        AppMethodBeat.o(59775);
      }
      else
      {
        paramString2 = new BitmapFactory.Options();
        label98: int i;
        if ((paramString1 == null) || (paramString1.length() == 0))
        {
          ab.e("MicroMsg.ConfigStorageLogic", "isSmallImg, invalid argument");
          i = 0;
        }
        while (true)
        {
          if (i == 0)
            break label221;
          ab.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : true. isSmallImg");
          paramBoolean = true;
          AppMethodBeat.o(59775);
          break;
          if (com.tencent.mm.vfs.e.asZ(paramString1) < 65536L)
          {
            i = 1;
          }
          else
          {
            paramString2.inJustDecodeBounds = true;
            MMBitmapFactory.decodeFile(paramString1, paramString2);
            d1 = paramString2.outWidth;
            d2 = paramString2.outHeight;
            if ((d1 >= 100.0D) || (d2 >= 100.0D))
              break label98;
            ab.i("MicroMsg.ConfigStorageLogic", "isSmallImg : true, width = " + d1 + ", height = " + d2);
            i = 1;
          }
        }
        label221: double d1 = paramString2.outWidth;
        double d2 = paramString2.outHeight;
        if ((d1 / d2 >= 2.5D) || (d2 / d1 >= 2.5D))
        {
          long l = com.tencent.mm.vfs.e.asZ(paramString1);
          if (l < 26214400L)
          {
            ab.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : true, width height ratio > %s, imgSize:[%s]", new Object[] { Double.valueOf(2.5D), Long.valueOf(l) });
            paramBoolean = true;
            AppMethodBeat.o(59775);
          }
          else
          {
            ab.i("MicroMsg.ConfigStorageLogic", "canSendRawImage : false, width height ratio > %s, imgSize:[%s]", new Object[] { Double.valueOf(2.5D), Long.valueOf(l) });
            paramBoolean = false;
            AppMethodBeat.o(59775);
          }
        }
        else if (!paramBoolean)
        {
          paramBoolean = true;
          AppMethodBeat.o(59775);
        }
        else
        {
          paramBoolean = false;
          AppMethodBeat.o(59775);
        }
      }
    }
  }

  public static String getUserBindEmail()
  {
    AppMethodBeat.i(59741);
    g.RQ();
    String str = bo.nullAsNil((String)g.RP().Ry().get(5, null));
    AppMethodBeat.o(59741);
    return str;
  }

  public static boolean ku(int paramInt)
  {
    if ((paramInt & 0x2000) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void l(Map<String, String> paramMap)
  {
    AppMethodBeat.i(59776);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localStringBuilder.append(String.format(Locale.US, "%s\n%s\n", new Object[] { paramMap.getKey(), paramMap.getValue() }));
    }
    g.RQ();
    if (g.RP() != null)
    {
      g.RQ();
      if (g.RP().Ry() != null)
      {
        g.RQ();
        g.RP().Ry().set(327682, localStringBuilder.toString());
      }
    }
    AppMethodBeat.o(59776);
  }

  public static void m(Map<String, String> paramMap)
  {
    AppMethodBeat.i(59777);
    paramMap.clear();
    g.RQ();
    if (g.RP() != null)
    {
      g.RQ();
      if (g.RP().Ry() != null);
    }
    else
    {
      ab.d("MicroMsg.ConfigStorageLogic", "acc stg is null");
      AppMethodBeat.o(59777);
    }
    while (true)
    {
      return;
      g.RQ();
      Object localObject = (String)g.RP().Ry().get(327682, null);
      if (localObject == null)
      {
        AppMethodBeat.o(59777);
      }
      else
      {
        localObject = ((String)localObject).split("\n");
        if (localObject.length % 2 != 0)
        {
          ab.e("MicroMsg.ConfigStorageLogic", "key and value not match, len: " + String.valueOf(localObject.length));
          AppMethodBeat.o(59777);
        }
        else
        {
          for (int i = 0; i < localObject.length; i += 2)
            paramMap.put(localObject[i], localObject[(i + 1)]);
          AppMethodBeat.o(59777);
        }
      }
    }
  }

  public static boolean mG(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(59739);
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(59739);
    while (true)
    {
      return bool;
      String str = Yz();
      if ((str == null) || (str.length() <= 0))
      {
        ab.e("MicroMsg.ConfigStorageLogic", "get userinfo fail");
        AppMethodBeat.o(59739);
      }
      else
      {
        bool = str.equals(paramString);
        AppMethodBeat.o(59739);
      }
    }
  }

  public static j.b r(int paramInt, String paramString)
  {
    AppMethodBeat.i(59773);
    switch (paramInt)
    {
    default:
      paramString = null;
    case 18:
    case 2:
    }
    while (true)
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XL().c(paramString);
      AppMethodBeat.o(59773);
      return paramString;
      paramString = new com.tencent.mm.az.j(paramString, 2);
      continue;
      paramString = new com.tencent.mm.az.j(paramString, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.r
 * JD-Core Version:    0.6.2
 */