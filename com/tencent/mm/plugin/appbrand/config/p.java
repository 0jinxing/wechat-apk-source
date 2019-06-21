package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentValues;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.luggage.sdk.customize.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ai.a;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.protocal.protobuf.ey;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class p extends k
{
  private static volatile p hhE;

  public static AppBrandRecentTaskInfo a(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    AppMethodBeat.i(129890);
    Object localObject = f.auO().d(paramString2, new String[] { "appId", "nickname", "shortNickname", "smallHeadURL", "appInfo", "versionInfo" });
    int i = 0;
    int j;
    if (localObject == null)
    {
      j = 0;
      i = j;
      label64: j = 0;
      if (localObject != null)
        break label234;
      j = 0;
    }
    while (true)
    {
      long l2;
      long l3;
      label112: label126: String str4;
      while (true)
      {
        long l1 = 0L;
        if (localObject != null)
          break label251;
        l2 = 0L;
        l1 = l2;
        l3 = 0L;
        l2 = l3;
        if (j.a.np(paramInt))
        {
          if (localObject != null)
            break label264;
          l2 = 0L;
        }
        String str1 = String.valueOf(paramString1);
        if (localObject != null)
          break label277;
        paramString1 = "";
        if (localObject != null)
          break label286;
        String str2 = "";
        label135: if (localObject != null)
          break label296;
        str4 = "";
        label144: if (localObject != null)
          break label306;
        localObject = "";
        paramString1 = new AppBrandRecentTaskInfo(str1, paramString2, paramString1, str2, str4, (String)localObject, i, paramInt, j, l1, l2, ((s)f.E(s.class)).aF(paramString2, paramInt), paramLong);
        AppMethodBeat.o(129890);
        return paramString1;
        try
        {
          j = ((WxaAttributes)localObject).ayJ().fmr;
        }
        catch (NullPointerException localNullPointerException1)
        {
          ab.e("MicroMsg.WxaAttrStorageHelper", "assembleRecentInfo, NULL appInfo, username = %s", new Object[] { paramString2 });
        }
      }
      break label64;
      try
      {
        while (true)
        {
          label234: int k = ((WxaAttributes)localObject).ayL().axy;
          j = k;
          break;
          try
          {
            while (true)
            {
              label251: l2 = ((WxaAttributes)localObject).ayJ().haQ;
              break;
              try
              {
                label264: l2 = ((WxaAttributes)localObject).ayJ().haR;
                break label112;
                label277: paramString1 = ((WxaAttributes)localObject).field_appId;
                break label126;
                label286: String str3 = ((WxaAttributes)localObject).field_nickname;
                break label135;
                label296: str4 = ((WxaAttributes)localObject).field_shortNickname;
                break label144;
                label306: localObject = ((WxaAttributes)localObject).field_smallHeadURL;
              }
              catch (NullPointerException localNullPointerException2)
              {
                l2 = l3;
              }
            }
          }
          catch (NullPointerException localNullPointerException3)
          {
          }
        }
      }
      catch (NullPointerException localNullPointerException4)
      {
      }
    }
  }

  public static p ayH()
  {
    AppMethodBeat.i(129883);
    if (hhE == null);
    try
    {
      if (hhE == null)
      {
        localp = new com/tencent/mm/plugin/appbrand/config/p;
        localp.<init>();
        hhE = localp;
      }
      p localp = hhE;
      AppMethodBeat.o(129883);
      return localp;
    }
    finally
    {
      AppMethodBeat.o(129883);
    }
  }

  private static AppBrandSysConfigWC c(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(129893);
    if (paramWxaAttributes != null);
    while (true)
    {
      try
      {
        localObject1 = new com/tencent/mm/plugin/appbrand/config/p$1;
        ((p.1)localObject1).<init>();
        localObject1 = (AppBrandSysConfigLU)((ai.a)localObject1).newInstance();
        ((AppBrandSysConfigLU)localObject1).cwz = paramWxaAttributes.field_nickname;
        ((AppBrandSysConfigLU)localObject1).hgW = paramWxaAttributes.field_smallHeadURL;
        ((AppBrandSysConfigLU)localObject1).appId = paramWxaAttributes.field_appId;
        ((AppBrandSysConfigLU)localObject1).hgX = paramWxaAttributes.ayK().hib.hgX;
        ((AppBrandSysConfigLU)localObject1).bQv = paramWxaAttributes.ayK().hib.bQv;
        ((AppBrandSysConfigLU)localObject1).bQy = paramWxaAttributes.ayK().hib.bQy;
        ((AppBrandSysConfigLU)localObject1).bQz = paramWxaAttributes.ayK().hib.bQz;
        ((AppBrandSysConfigLU)localObject1).bQA = paramWxaAttributes.ayK().hib.bQA;
        ((AppBrandSysConfigLU)localObject1).bQB = paramWxaAttributes.ayK().hib.bQB;
        ((AppBrandSysConfigLU)localObject1).bQC = paramWxaAttributes.ayK().hib.bQC;
        ((AppBrandSysConfigLU)localObject1).bQx = paramWxaAttributes.ayK().hib.bQx;
        ((AppBrandSysConfigLU)localObject1).bQw = paramWxaAttributes.ayK().hib.bQw;
        ((AppBrandSysConfigLU)localObject1).bQD = paramWxaAttributes.ayK().hib.hif;
        ((AppBrandSysConfigLU)localObject1).bQE = paramWxaAttributes.ayK().hib.hig;
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQF = ((ArrayList)com.tencent.luggage.g.c.c((List)localObject2, paramWxaAttributes.ayJ().hhT));
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQG = ((ArrayList)com.tencent.luggage.g.c.c((List)localObject2, paramWxaAttributes.ayJ().hhU));
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQI = ((ArrayList)com.tencent.luggage.g.c.c((List)localObject2, paramWxaAttributes.ayJ().hhW));
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQH = ((ArrayList)com.tencent.luggage.g.c.c((List)localObject2, paramWxaAttributes.ayJ().hhV));
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQJ = ((ArrayList)com.tencent.luggage.g.c.c((List)localObject2, paramWxaAttributes.ayJ().hhX));
        localObject2 = new com/tencent/mm/protocal/protobuf/ey;
        ((ey)localObject2).<init>();
        ((AppBrandSysConfigLU)localObject1).bQR = ((ey)localObject2);
        ((AppBrandSysConfigLU)localObject1).bQR.vGQ = paramWxaAttributes.ayJ().haQ;
        ((AppBrandSysConfigLU)localObject1).bQR.vGX = paramWxaAttributes.ayJ().hhR;
        ((AppBrandSysConfigLU)localObject1).hhb = paramWxaAttributes.ayK().hib.hhb;
        ((AppBrandSysConfigLU)localObject1).hhc = paramWxaAttributes.ayK().hib.hhc;
        ((AppBrandSysConfigLU)localObject1).bQK = paramWxaAttributes.ayK().hib.bQK;
        ((AppBrandSysConfigLU)localObject1).bQQ = new String[] { paramWxaAttributes.field_roundedSquareIconURL, paramWxaAttributes.field_brandIconURL, paramWxaAttributes.field_bigHeadURL };
        ((AppBrandSysConfigLU)localObject1).nickname = paramWxaAttributes.field_nickname;
        ((AppBrandSysConfigLU)localObject1).bQM = paramWxaAttributes.ayK().hib.bQM;
        paramWxaAttributes = (AppBrandSysConfigWC)localObject1;
        if (paramWxaAttributes != null)
        {
          paramWxaAttributes.bQL = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("ClientBenchmarkLevel", -1);
          localObject1 = paramWxaAttributes.appId;
          localObject2 = ((b)com.tencent.luggage.a.e.B(b.class)).xH();
          if ((bo.isNullOrNil((String)localObject1)) || (localObject2 == null))
          {
            bool = false;
            paramWxaAttributes.bQp = bool;
            paramWxaAttributes.bQq = "1".equals(f.xH().get(paramWxaAttributes.appId + "_PerformancePanelEnabled", "0"));
          }
        }
        else
        {
          AppMethodBeat.o(129893);
          return paramWxaAttributes;
        }
      }
      catch (Exception paramWxaAttributes)
      {
        Object localObject1;
        Object localObject2;
        ab.e("MicroMsg.WxaAttrStorageHelper", "assembleSysConfig, <init> e = %s", new Object[] { paramWxaAttributes });
        AppMethodBeat.o(129893);
        paramWxaAttributes = null;
        continue;
        boolean bool = Boolean.parseBoolean(((c)localObject2).get((String)localObject1 + "_AppDebugEnabled", "false"));
        continue;
      }
      paramWxaAttributes = null;
    }
  }

  public static boolean k(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(129888);
    paramBoolean = f.auO().k(paramString, paramInt, paramBoolean);
    AppMethodBeat.o(129888);
    return paramBoolean;
  }

  public static void release()
  {
    try
    {
      hhE = null;
      return;
    }
    finally
    {
    }
  }

  // ERROR //
  public static u zh(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 407
    //   5: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 353	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifne +9 -> 21
    //   15: invokestatic 411	com/tencent/mm/kernel/g:RK	()Z
    //   18: ifne +13 -> 31
    //   21: ldc_w 407
    //   24: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_1
    //   28: astore_0
    //   29: aload_0
    //   30: areturn
    //   31: invokestatic 28	com/tencent/mm/plugin/appbrand/app/f:auO	()Lcom/tencent/mm/plugin/appbrand/config/q;
    //   34: aload_0
    //   35: bipush 9
    //   37: anewarray 30	java/lang/String
    //   40: dup
    //   41: iconst_0
    //   42: ldc 32
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: ldc 34
    //   49: aastore
    //   50: dup
    //   51: iconst_2
    //   52: ldc_w 413
    //   55: aastore
    //   56: dup
    //   57: iconst_3
    //   58: ldc_w 415
    //   61: aastore
    //   62: dup
    //   63: iconst_4
    //   64: ldc_w 417
    //   67: aastore
    //   68: dup
    //   69: iconst_5
    //   70: ldc 42
    //   72: aastore
    //   73: dup
    //   74: bipush 6
    //   76: ldc 40
    //   78: aastore
    //   79: dup
    //   80: bipush 7
    //   82: ldc_w 419
    //   85: aastore
    //   86: dup
    //   87: bipush 8
    //   89: ldc_w 421
    //   92: aastore
    //   93: invokevirtual 48	com/tencent/mm/plugin/appbrand/config/q:d	(Ljava/lang/String;[Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes;
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +200 -> 298
    //   101: new 423	com/tencent/mm/plugin/appbrand/config/u
    //   104: dup
    //   105: invokespecial 424	com/tencent/mm/plugin/appbrand/config/u:<init>	()V
    //   108: astore_1
    //   109: aload_1
    //   110: aload_0
    //   111: putfield 427	com/tencent/mm/plugin/appbrand/config/u:username	Ljava/lang/String;
    //   114: aload_1
    //   115: aload_2
    //   116: getfield 122	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_appId	Ljava/lang/String;
    //   119: putfield 428	com/tencent/mm/plugin/appbrand/config/u:appId	Ljava/lang/String;
    //   122: aload_1
    //   123: aload_2
    //   124: getfield 125	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_nickname	Ljava/lang/String;
    //   127: putfield 429	com/tencent/mm/plugin/appbrand/config/u:nickname	Ljava/lang/String;
    //   130: aload_1
    //   131: aload_2
    //   132: getfield 432	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_signature	Ljava/lang/String;
    //   135: putfield 434	com/tencent/mm/plugin/appbrand/config/u:signature	Ljava/lang/String;
    //   138: aload_1
    //   139: aload_2
    //   140: getfield 296	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_brandIconURL	Ljava/lang/String;
    //   143: putfield 437	com/tencent/mm/plugin/appbrand/config/u:hix	Ljava/lang/String;
    //   146: aload_1
    //   147: aload_2
    //   148: invokevirtual 165	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayK	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$d;
    //   151: getfield 440	com/tencent/mm/plugin/appbrand/config/WxaAttributes$d:hic	Ljava/util/List;
    //   154: putfield 441	com/tencent/mm/plugin/appbrand/config/u:hic	Ljava/util/List;
    //   157: aload_2
    //   158: invokevirtual 106	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayL	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$e;
    //   161: ifnonnull +80 -> 241
    //   164: iconst_m1
    //   165: istore_3
    //   166: aload_1
    //   167: iload_3
    //   168: putfield 444	com/tencent/mm/plugin/appbrand/config/u:bQl	I
    //   171: aload_1
    //   172: aload_2
    //   173: invokevirtual 448	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayM	()Ljava/util/List;
    //   176: putfield 451	com/tencent/mm/plugin/appbrand/config/u:hhP	Ljava/util/List;
    //   179: aload_1
    //   180: aload_2
    //   181: invokevirtual 84	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayJ	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$a;
    //   184: getfield 90	com/tencent/mm/plugin/appbrand/config/WxaAttributes$a:fmr	I
    //   187: putfield 454	com/tencent/mm/plugin/appbrand/config/u:bQe	I
    //   190: aload_1
    //   191: aload_2
    //   192: invokevirtual 84	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayJ	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$a;
    //   195: getfield 457	com/tencent/mm/plugin/appbrand/config/WxaAttributes$a:hgD	I
    //   198: putfield 458	com/tencent/mm/plugin/appbrand/config/u:hgD	I
    //   201: aload_1
    //   202: aload_2
    //   203: invokevirtual 84	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayJ	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$a;
    //   206: getfield 461	com/tencent/mm/plugin/appbrand/config/WxaAttributes$a:hgE	Ljava/lang/String;
    //   209: putfield 462	com/tencent/mm/plugin/appbrand/config/u:hgE	Ljava/lang/String;
    //   212: aload_2
    //   213: getfield 465	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_registerSource	Ljava/lang/String;
    //   216: invokestatic 353	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   219: ifeq +54 -> 273
    //   222: ldc 60
    //   224: astore_0
    //   225: aload_1
    //   226: aload_0
    //   227: putfield 468	com/tencent/mm/plugin/appbrand/config/u:fwb	Ljava/lang/String;
    //   230: ldc_w 407
    //   233: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: aload_1
    //   237: astore_0
    //   238: goto -209 -> 29
    //   241: aload_2
    //   242: invokevirtual 106	com/tencent/mm/plugin/appbrand/config/WxaAttributes:ayL	()Lcom/tencent/mm/plugin/appbrand/config/WxaAttributes$e;
    //   245: getfield 469	com/tencent/mm/plugin/appbrand/config/WxaAttributes$e:bQl	I
    //   248: istore_3
    //   249: goto -83 -> 166
    //   252: astore 4
    //   254: ldc 92
    //   256: ldc_w 471
    //   259: iconst_1
    //   260: anewarray 96	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload_0
    //   266: aastore
    //   267: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: goto -58 -> 212
    //   273: new 473	org/json/JSONObject
    //   276: astore_0
    //   277: aload_0
    //   278: aload_2
    //   279: getfield 465	com/tencent/mm/plugin/appbrand/config/WxaAttributes:field_registerSource	Ljava/lang/String;
    //   282: invokespecial 476	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   285: aload_0
    //   286: ldc_w 478
    //   289: ldc 60
    //   291: invokevirtual 481	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   294: astore_0
    //   295: goto -70 -> 225
    //   298: ldc_w 407
    //   301: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   304: aload_1
    //   305: astore_0
    //   306: goto -277 -> 29
    //   309: astore_0
    //   310: goto -80 -> 230
    //
    // Exception table:
    //   from	to	target	type
    //   179	212	252	java/lang/NullPointerException
    //   212	222	309	java/lang/Exception
    //   225	230	309	java/lang/Exception
    //   273	295	309	java/lang/Exception
  }

  public static com.tencent.mm.plugin.appbrand.backgroundfetch.a zi(String paramString)
  {
    AppMethodBeat.i(129891);
    if (f.auO() != null)
    {
      WxaAttributes localWxaAttributes = f.auO().d(paramString, new String[0]);
      if (localWxaAttributes != null)
      {
        paramString = new com.tencent.mm.plugin.appbrand.backgroundfetch.a();
        paramString.hbV = localWxaAttributes.ayK().hib.hbV;
        paramString.hbW = localWxaAttributes.ayK().hib.hbW;
        paramString.hbX = localWxaAttributes.ayK().hib.hbX;
        AppMethodBeat.o(129891);
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(129891);
    }
  }

  public static AppBrandSysConfigWC zj(String paramString)
  {
    AppMethodBeat.i(129892);
    paramString = f.auO().e(paramString, new String[0]);
    if (paramString != null)
    {
      paramString = c(paramString);
      AppMethodBeat.o(129892);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(129892);
    }
  }

  public static long zk(String paramString)
  {
    AppMethodBeat.i(129894);
    paramString = f.auO().d(paramString, new String[] { "appInfo" });
    long l;
    if ((paramString == null) || (paramString.ayJ() == null))
    {
      l = 0L;
      AppMethodBeat.o(129894);
    }
    while (true)
    {
      return l;
      l = paramString.ayJ().haQ;
      AppMethodBeat.o(129894);
    }
  }

  public static String[] zl(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129895);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129895);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      WxaAttributes localWxaAttributes = f.auO().d(paramString, new String[] { "roundedSquareIconURL", "bigHeadURL" });
      if (localWxaAttributes == null)
      {
        AppMethodBeat.o(129895);
        paramString = localObject;
      }
      else
      {
        paramString = new String[2];
        paramString[0] = localWxaAttributes.field_roundedSquareIconURL;
        paramString[1] = localWxaAttributes.field_bigHeadURL;
        AppMethodBeat.o(129895);
      }
    }
  }

  public static String zm(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129896);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129896);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = f.auO().d(paramString, new String[] { "appId" });
      if (paramString == null)
      {
        AppMethodBeat.o(129896);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.field_appId;
        AppMethodBeat.o(129896);
      }
    }
  }

  public static String zn(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129897);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129897);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = f.auO().e(paramString, new String[] { "nickname" });
      if (paramString == null)
      {
        AppMethodBeat.o(129897);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.field_nickname;
        AppMethodBeat.o(129897);
      }
    }
  }

  public static String zo(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(129898);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(129898);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = f.auO().e(paramString, new String[] { "username" });
      if (paramString == null)
      {
        AppMethodBeat.o(129898);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.field_username;
        AppMethodBeat.o(129898);
      }
    }
  }

  public static void zp(String paramString)
  {
    AppMethodBeat.i(129899);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129899);
    while (true)
    {
      return;
      q localq = f.auO();
      if (!bo.isNullOrNil(paramString))
      {
        ContentValues localContentValues = new ContentValues(2);
        localContentValues.put("syncVersion", "");
        localContentValues.put("syncTimeSecond", Long.valueOf(0L));
        localq.bSd.update("WxaAttributesTable", localContentValues, String.format(Locale.US, "%s=?", new Object[] { "username" }), new String[] { paramString });
      }
      AppMethodBeat.o(129899);
    }
  }

  public static void zq(String paramString)
  {
    AppMethodBeat.i(129900);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(129900);
    while (true)
    {
      return;
      WxaAttributes localWxaAttributes = new WxaAttributes();
      localWxaAttributes.field_username = paramString;
      f.auO().a(localWxaAttributes, new String[] { "username" });
      AppMethodBeat.o(129900);
    }
  }

  public final void a(k.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(129886);
    if (parama == null)
      AppMethodBeat.o(129886);
    while (true)
    {
      return;
      f.auO().a(parama, paramLooper);
      AppMethodBeat.o(129886);
    }
  }

  public final void b(String paramString, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(129884);
    f.auO().b(paramString, paramInt, paramObject);
    AppMethodBeat.o(129884);
  }

  public final void c(k.a parama)
  {
    AppMethodBeat.i(129885);
    a(parama, m.aNS().oAl.getLooper());
    AppMethodBeat.o(129885);
  }

  public final void d(k.a parama)
  {
    AppMethodBeat.i(129887);
    if (parama == null)
      AppMethodBeat.o(129887);
    while (true)
    {
      return;
      f.auO().d(parama);
      AppMethodBeat.o(129887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.p
 * JD-Core Version:    0.6.2
 */