package com.tencent.mm.plugin.websearch.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.g.a.mr;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.axy;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.json.JSONObject;

public final class aa
{
  private static Map<Integer, ao> tZX;
  private static Map<Integer, k> tZY;
  private static int tZZ;

  static
  {
    AppMethodBeat.i(124148);
    tZX = new HashMap();
    tZY = new HashMap();
    tZX.put(Integer.valueOf(2), new ao("wxa_fts/res", "wxa_fts_template.zip", ""));
    tZX.put(Integer.valueOf(1), new ao("fts_browse/res", "wrd_template.zip", "browse"));
    tZX.put(Integer.valueOf(0), new ao("fts/res", "fts_template.zip", ""));
    Map localMap = tZY;
    HR(0);
    localMap.put(Integer.valueOf(0), ag.cVn());
    localMap = tZY;
    HR(1);
    localMap.put(Integer.valueOf(1), ag.cVn());
    localMap = tZY;
    HR(2);
    localMap.put(Integer.valueOf(2), ag.cVn());
    AppMethodBeat.o(124148);
  }

  public static String E(Map<String, String> paramMap)
  {
    AppMethodBeat.i(138740);
    paramMap = d(paramMap, 0);
    AppMethodBeat.o(138740);
    return paramMap;
  }

  public static final String HP(int paramInt)
  {
    AppMethodBeat.i(124092);
    Object localObject = new StringBuilder().append(paramInt).append("_");
    g.RN();
    localObject = p.getString(com.tencent.mm.kernel.a.QF()) + "_" + System.currentTimeMillis();
    AppMethodBeat.o(124092);
    return localObject;
  }

  public static ao HQ(int paramInt)
  {
    AppMethodBeat.i(124093);
    ao localao = (ao)tZX.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(124093);
    return localao;
  }

  private static String HR(int paramInt)
  {
    AppMethodBeat.i(124094);
    Object localObject = (ao)tZX.get(Integer.valueOf(paramInt));
    localObject = ((ao)localObject).aLD() + "/app.html";
    AppMethodBeat.o(124094);
    return localObject;
  }

  public static boolean HS(int paramInt)
  {
    AppMethodBeat.i(124098);
    boolean bool;
    if (paramInt == 2)
    {
      bool = true;
      AppMethodBeat.o(124098);
    }
    while (true)
    {
      return bool;
      bool = ((ao)tZX.get(Integer.valueOf(paramInt))).cVD();
      AppMethodBeat.o(124098);
    }
  }

  public static int HT(int paramInt)
  {
    AppMethodBeat.i(124099);
    Object localObject1 = (ao)tZX.get(Integer.valueOf(paramInt));
    Object localObject2;
    if (TextUtils.isEmpty(((ao)localObject1).ubg))
      localObject2 = "config.conf";
    while (true)
    {
      AssetManager localAssetManager = ah.getContext().getAssets();
      Properties localProperties = new Properties();
      localObject1 = null;
      Object localObject3 = null;
      try
      {
        localObject2 = localAssetManager.open((String)localObject2);
        localObject3 = localObject2;
        localObject1 = localObject2;
        localProperties.load((InputStream)localObject2);
        bo.b((Closeable)localObject2);
        paramInt = Integer.valueOf(localProperties.getProperty("version", "1")).intValue();
        AppMethodBeat.o(124099);
        return paramInt;
        localObject2 = ((ao)localObject1).ubg + "/config.conf";
      }
      catch (Exception localException)
      {
        while (true)
        {
          localObject1 = localObject3;
          ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localException, localException.getMessage(), new Object[0]);
          bo.b(localObject3);
        }
      }
      finally
      {
        bo.b((Closeable)localObject1);
        AppMethodBeat.o(124099);
      }
    }
  }

  public static boolean HU(int paramInt)
  {
    AppMethodBeat.i(124100);
    ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "isFTSH5TemplateAvail exportType:%d, use search default.", new Object[] { Integer.valueOf(paramInt) });
    if (((ao)tZX.get(Integer.valueOf(paramInt))).afW() > 1)
      AppMethodBeat.o(124100);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(124100);
    }
  }

  public static int HV(int paramInt)
  {
    AppMethodBeat.i(124101);
    paramInt = ((ao)tZX.get(Integer.valueOf(paramInt))).afW();
    AppMethodBeat.o(124101);
    return paramInt;
  }

  public static void HW(int paramInt)
  {
    tZZ = paramInt;
  }

  // ERROR //
  private static boolean HX(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 245
    //   4: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 172	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   10: invokevirtual 178	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   13: astore_2
    //   14: getstatic 27	com/tencent/mm/plugin/websearch/api/aa:tZX	Ljava/util/Map;
    //   17: iload_0
    //   18: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: invokeinterface 136 2 0
    //   26: checkcast 37	com/tencent/mm/plugin/websearch/api/ao
    //   29: invokevirtual 248	com/tencent/mm/plugin/websearch/api/ao:cVC	()Ljava/lang/String;
    //   32: astore_3
    //   33: getstatic 27	com/tencent/mm/plugin/websearch/api/aa:tZX	Ljava/util/Map;
    //   36: iload_0
    //   37: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   40: invokeinterface 136 2 0
    //   45: checkcast 37	com/tencent/mm/plugin/websearch/api/ao
    //   48: astore 4
    //   50: aload 4
    //   52: getfield 158	com/tencent/mm/plugin/websearch/api/ao:ubg	Ljava/lang/String;
    //   55: invokestatic 164	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   58: ifeq +44 -> 102
    //   61: aload 4
    //   63: getfield 251	com/tencent/mm/plugin/websearch/api/ao:ubf	Ljava/lang/String;
    //   66: astore 4
    //   68: aload_3
    //   69: invokestatic 255	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   72: ifne +11 -> 83
    //   75: aload 4
    //   77: invokestatic 255	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   80: ifeq +59 -> 139
    //   83: ldc 215
    //   85: ldc_w 257
    //   88: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: ldc 245
    //   93: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: iconst_0
    //   97: istore 5
    //   99: iload 5
    //   101: ireturn
    //   102: new 89	java/lang/StringBuilder
    //   105: dup
    //   106: invokespecial 90	java/lang/StringBuilder:<init>	()V
    //   109: aload 4
    //   111: getfield 158	com/tencent/mm/plugin/websearch/api/ao:ubg	Ljava/lang/String;
    //   114: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: ldc_w 263
    //   120: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload 4
    //   125: getfield 251	com/tencent/mm/plugin/websearch/api/ao:ubf	Ljava/lang/String;
    //   128: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: astore 4
    //   136: goto -68 -> 68
    //   139: aload_2
    //   140: aload 4
    //   142: invokevirtual 187	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   145: astore 4
    //   147: aload 4
    //   149: ifnonnull +43 -> 192
    //   152: ldc 215
    //   154: ldc_w 265
    //   157: invokestatic 268	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   160: ldc 245
    //   162: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: iconst_0
    //   166: istore 5
    //   168: goto -69 -> 99
    //   171: astore 4
    //   173: ldc 215
    //   175: aload 4
    //   177: ldc 43
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aconst_null
    //   187: astore 4
    //   189: goto -42 -> 147
    //   192: new 270	com/tencent/mm/vfs/b
    //   195: dup
    //   196: aload_3
    //   197: invokespecial 273	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   200: astore_3
    //   201: aload_3
    //   202: invokevirtual 276	com/tencent/mm/vfs/b:exists	()Z
    //   205: ifeq +8 -> 213
    //   208: aload_3
    //   209: invokevirtual 279	com/tencent/mm/vfs/b:delete	()Z
    //   212: pop
    //   213: aload_3
    //   214: invokevirtual 283	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   217: invokevirtual 286	com/tencent/mm/vfs/b:mkdirs	()Z
    //   220: pop
    //   221: aload_3
    //   222: invokestatic 292	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   225: astore_3
    //   226: aload_3
    //   227: astore_1
    //   228: aload_1
    //   229: ifnull +95 -> 324
    //   232: aload 4
    //   234: aload_1
    //   235: invokestatic 296	com/tencent/mm/plugin/websearch/api/aa:copyFile	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   238: aload 4
    //   240: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   243: aload_1
    //   244: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   247: iconst_1
    //   248: istore 5
    //   250: ldc 245
    //   252: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: goto -156 -> 99
    //   258: astore_3
    //   259: ldc 215
    //   261: aload_3
    //   262: ldc 43
    //   264: iconst_0
    //   265: anewarray 4	java/lang/Object
    //   268: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: goto -43 -> 228
    //   274: astore_3
    //   275: ldc 215
    //   277: aload_3
    //   278: ldc 43
    //   280: iconst_0
    //   281: anewarray 4	java/lang/Object
    //   284: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   287: aload 4
    //   289: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   292: aload_1
    //   293: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   296: ldc 245
    //   298: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: iconst_0
    //   302: istore 5
    //   304: goto -205 -> 99
    //   307: astore_3
    //   308: aload 4
    //   310: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   313: aload_1
    //   314: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   317: ldc 245
    //   319: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: aload_3
    //   323: athrow
    //   324: aload 4
    //   326: invokestatic 197	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   329: ldc 245
    //   331: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: iconst_0
    //   335: istore 5
    //   337: goto -238 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   139	147	171	java/io/IOException
    //   221	226	258	java/io/FileNotFoundException
    //   232	238	274	java/io/IOException
    //   232	238	307	finally
    //   275	287	307	finally
  }

  public static String HY(int paramInt)
  {
    AppMethodBeat.i(124104);
    String str = ((ao)tZX.get(Integer.valueOf(paramInt))).cVC();
    AppMethodBeat.o(124104);
    return str;
  }

  public static void HZ(int paramInt)
  {
    AppMethodBeat.i(124105);
    ((ao)tZX.get(Integer.valueOf(paramInt))).cVA();
    AppMethodBeat.o(124105);
  }

  public static String Ia(int paramInt)
  {
    AppMethodBeat.i(124106);
    String str = ((ao)tZX.get(Integer.valueOf(paramInt))).aLD();
    AppMethodBeat.o(124106);
    return str;
  }

  public static String Ib(int paramInt)
  {
    AppMethodBeat.i(124107);
    String str = ((ao)tZX.get(Integer.valueOf(Ie(paramInt)))).aLD();
    AppMethodBeat.o(124107);
    return str;
  }

  public static String Ic(int paramInt)
  {
    AppMethodBeat.i(124108);
    String str = ((ao)tZX.get(Integer.valueOf(Ie(paramInt)))).ubf;
    AppMethodBeat.o(124108);
    return str;
  }

  public static int Id(int paramInt)
  {
    AppMethodBeat.i(124109);
    paramInt = ((ao)tZX.get(Integer.valueOf(Ie(paramInt)))).afW();
    AppMethodBeat.o(124109);
    return paramInt;
  }

  private static int Ie(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = -1;
    case 1:
    case 2:
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      continue;
      paramInt = 1;
    }
  }

  public static String If(int paramInt)
  {
    AppMethodBeat.i(124110);
    String str = k(new b(((ao)tZX.get(Integer.valueOf(paramInt))).aLD(), "config_data.conf")).getProperty("kv_set", "");
    AppMethodBeat.o(124110);
    return str;
  }

  public static long Xq(String paramString)
  {
    AppMethodBeat.i(124130);
    long l;
    if (TextUtils.isEmpty(paramString))
    {
      l = 0L;
      AppMethodBeat.o(124130);
    }
    while (true)
    {
      return l;
      l = new BigInteger(paramString).longValue();
      ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
      AppMethodBeat.o(124130);
    }
  }

  public static long a(Map<String, Object> paramMap, String paramString, long paramLong)
  {
    AppMethodBeat.i(124140);
    paramMap = t(paramMap, paramString);
    if (bo.isNullOrNil(paramMap))
      AppMethodBeat.o(124140);
    while (true)
    {
      return paramLong;
      try
      {
        long l = Long.valueOf(paramMap).longValue();
        paramLong = l;
        AppMethodBeat.o(124140);
      }
      catch (Exception paramMap)
      {
        AppMethodBeat.o(124140);
      }
    }
  }

  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    AppMethodBeat.i(124117);
    paramString = a(paramInt1, paramBoolean, paramInt2, paramString, "");
    AppMethodBeat.o(124117);
    return paramString;
  }

  private static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124118);
    paramString1 = a(paramInt1, paramBoolean, paramInt2, paramString1, "", "", "", "", "", paramString2);
    AppMethodBeat.o(124118);
    return paramString1;
  }

  private static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(124119);
    paramString1 = a(paramInt1, paramBoolean, paramInt2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, "");
    AppMethodBeat.o(124119);
    return paramString1;
  }

  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    AppMethodBeat.i(124115);
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString2))
      localHashMap.put("searchId", paramString2);
    if (!TextUtils.isEmpty(paramString3))
      localHashMap.put("sessionId", paramString3);
    if (!TextUtils.isEmpty(paramString6))
      localHashMap.put("subSessionId", paramString6);
    if (!TextUtils.isEmpty(paramString4))
      localHashMap.put("query", paramString4);
    if (!TextUtils.isEmpty(paramString5))
      localHashMap.put("sceneActionType", paramString5);
    if (!TextUtils.isEmpty(paramString8))
      localHashMap.put("pRequestId", paramString8);
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()));
    localHashMap.put("platform", "android");
    if (!TextUtils.isEmpty(paramString7))
      localHashMap.put("poiInfo", paramString7);
    if (!TextUtils.isEmpty(paramString1))
      localHashMap.put("extParams", paramString1);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    boolean bool7;
    switch (paramInt1)
    {
    default:
      paramString1 = String.valueOf(HV(0));
      localHashMap.put("version", paramString1);
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      bool5 = false;
      bool6 = false;
      switch (paramInt1)
      {
      default:
        bool7 = bool4;
        bool3 = bool6;
        bool1 = bool2;
        label400: ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "genFTSParams scene=%d isHomePage=%b type=%d %b %b %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool1), Boolean.valueOf(bool7), Boolean.valueOf(bool3) });
        if (bool1)
          localHashMap.put("isSug", "1");
        if (bool7)
          localHashMap.put("isLocalSug", "1");
        if (bool3)
          localHashMap.put("isMostSearchBiz", "1");
        if (!paramBoolean)
          localHashMap.put("isHomePage", "0");
        break;
      case 300:
      case 33:
      case 3:
      case 14:
      case 20:
      case 22:
      case 6:
      case 9:
      case 11:
      case 24:
      }
      break;
    case 21:
    }
    while (true)
    {
      float f1 = com.tencent.mm.bz.a.dm(ah.getContext());
      float f2 = f1;
      if (f1 != 1.0F)
      {
        f2 = f1;
        if (f1 != 0.875F)
        {
          f2 = f1;
          if (f1 != 1.125F)
          {
            f2 = f1;
            if (f1 != 1.25F)
            {
              f2 = f1;
              if (f1 != 1.375F)
              {
                f2 = f1;
                if (f1 != 1.625F)
                {
                  f2 = f1;
                  if (f1 != 1.875F)
                  {
                    f2 = f1;
                    if (f1 != 2.025F)
                      f2 = 1.0F;
                  }
                }
              }
            }
          }
        }
      }
      localHashMap.put("fontRatio", String.valueOf(f2));
      localHashMap.put("netType", bVP());
      if (com.tencent.mm.aw.a.aie())
      {
        paramString1 = com.tencent.mm.aw.a.aih();
        if (paramString1 != null)
          localHashMap.put("musicSnsId", paramString1.fJU);
      }
      AppMethodBeat.o(124115);
      return localHashMap;
      paramString1 = String.valueOf(HV(1));
      break;
      paramString1 = ac.adL("mixGlobal");
      if (paramBoolean)
      {
        bool1 = bool2;
        bool3 = bool6;
        bool7 = bool4;
        if (paramString1.optInt("mixSugSwitch", 0) != 1)
          break label400;
      }
      while (true)
      {
        bool1 = true;
        bool3 = bool6;
        bool7 = bool4;
        break;
        if (paramInt2 == 1)
        {
          bool1 = bool2;
          bool3 = bool6;
          bool7 = bool4;
          if (paramString1.optInt("bizSugSwitch", 0) != 1)
            break;
          continue;
        }
        if (paramInt2 == 8)
        {
          bool1 = bool2;
          bool3 = bool6;
          bool7 = bool4;
          if (paramString1.optInt("snsSugSwitch", 0) != 1)
            break;
          continue;
        }
        if (paramInt2 == 1024)
        {
          bool1 = bool2;
          bool3 = bool6;
          bool7 = bool4;
          if (paramString1.optInt("novelSugSwitch", 0) != 1)
            break;
          continue;
        }
        if (paramInt2 == 512)
        {
          bool1 = bool2;
          bool3 = bool6;
          bool7 = bool4;
          if (paramString1.optInt("musicSugSwitch", 0) != 1)
            break;
          continue;
        }
        if ((paramInt2 != 384) && (paramInt2 != 256))
        {
          bool1 = bool2;
          bool3 = bool6;
          bool7 = bool4;
          if (paramInt2 != 128)
            break;
        }
        bool1 = bool2;
        bool3 = bool6;
        bool7 = bool4;
        if (paramString1.optInt("emotionSugSwitch", 0) != 1)
          break;
        continue;
        bool4 = bool1;
        if (paramInt2 == 1)
        {
          bool4 = bool1;
          if (ac.adL("bizTab").optInt("bizSugSwitch", 0) == 1)
            bool4 = true;
        }
        bool1 = bool4;
        if (paramInt2 == 2)
        {
          bool1 = bool4;
          if (ac.adL("articleTab").optInt("sugSwitch", 0) == 1)
            bool1 = true;
        }
        bool6 = bool1;
        bool4 = bool3;
        if (paramInt2 == 8)
        {
          paramString1 = ac.adL("snsTab");
          if (paramString1.optInt("sugSwitch", 0) == 1)
            bool1 = true;
          bool6 = bool1;
          bool4 = bool3;
          if (paramString1.optInt("localSugSwitch", 0) == 1)
          {
            bool4 = true;
            bool6 = bool1;
          }
        }
        bool1 = bool6;
        if (!paramBoolean)
        {
          bool1 = bool6;
          if (paramInt2 == 4)
          {
            bool1 = bool6;
            if (ac.adL("bizTab").optInt("bizServiceSugSwitch", 0) == 1)
              bool1 = true;
          }
        }
        bool6 = bool5;
        if (paramInt2 == 1)
        {
          bool6 = bool5;
          if (ac.adL("bizTab").optInt("mfsBizSwitch", 0) == 1)
            bool6 = true;
        }
        bool5 = bool1;
        if (paramInt2 == 1024)
        {
          bool5 = bool1;
          if (ac.adL("novelTab").optInt("sugSwitch", 0) == 1)
            bool5 = true;
        }
        bool1 = bool5;
        if (paramInt2 == 512)
        {
          bool1 = bool5;
          if (ac.adL("musicTab").optInt("sugSwitch", 0) == 1)
            bool1 = true;
        }
        bool5 = bool1;
        if (paramInt2 == 384)
        {
          bool5 = bool1;
          if (ac.adL("emotionTab").optInt("sugSwitch", 0) == 1)
            bool5 = true;
        }
        bool1 = bool5;
        bool3 = bool6;
        bool7 = bool4;
        if (paramInt2 != 0)
          break;
        bool1 = bool5;
        bool3 = bool6;
        bool7 = bool4;
        if (!paramBoolean)
          break;
        bool1 = bool5;
        bool3 = bool6;
        bool7 = bool4;
        if (ac.adL("mixGlobal").optInt("mixSugSwitch", 0) != 1)
          break;
        bool1 = true;
        bool3 = bool6;
        bool7 = bool4;
        break;
        bool1 = bool2;
        bool3 = bool6;
        bool7 = bool4;
        if (ac.adL("bizEntry").optInt("sugSwitch") != 1)
          break;
        continue;
        bool1 = bool2;
        bool3 = bool6;
        bool7 = bool4;
        if (ac.adL("bizUnionTopEntry").optInt("sugSwitch") != 1)
          break;
      }
      bool1 = bool2;
      bool3 = bool6;
      bool7 = bool4;
      if (paramInt2 != 384)
        break label400;
      bool1 = bool2;
      bool3 = bool6;
      bool7 = bool4;
      if (ac.adL("emoticonMall").optInt("sugSwitch", 0) != 1)
        break label400;
      bool1 = true;
      bool3 = bool6;
      bool7 = bool4;
      break label400;
      localHashMap.put("isHomePage", "1");
    }
  }

  public static void a(Activity paramActivity, chv paramchv)
  {
    AppMethodBeat.i(124146);
    Intent localIntent = new Intent();
    try
    {
      localIntent.putExtra("key_context", paramchv.toByteArray());
      label26: if (lN(paramchv.xgG))
      {
        e(paramActivity, ".ui.video.fs.TopStoryFSVideoUI", localIntent);
        AppMethodBeat.o(124146);
      }
      while (true)
      {
        return;
        e(paramActivity, ".ui.video.list.TopStoryListVideoUI", localIntent);
        AppMethodBeat.o(124146);
      }
    }
    catch (IOException localIOException)
    {
      break label26;
    }
  }

  public static void a(Context paramContext, chv paramchv)
  {
    AppMethodBeat.i(124147);
    Intent localIntent = new Intent();
    try
    {
      localIntent.putExtra("key_context", paramchv.toByteArray());
      label26: if (lN(paramchv.xgG))
      {
        d(paramContext, ".ui.video.fs.TopStoryFSVideoUI", localIntent);
        AppMethodBeat.o(124147);
      }
      while (true)
      {
        return;
        d(paramContext, ".ui.video.list.TopStoryListVideoUI", localIntent);
        AppMethodBeat.o(124147);
      }
    }
    catch (IOException localIOException)
    {
      break label26;
    }
  }

  public static void a(Context paramContext, String paramString1, Intent paramIntent, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(124121);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WebSearch.WebSearchApiLogic", "openNews intent is null, or context is null");
      AppMethodBeat.o(124121);
      return;
    }
    Intent localIntent = az(paramIntent);
    localIntent.putExtra("ftsbizscene", 21);
    localIntent.putExtra("ftsQuery", paramString1);
    if (paramString2 != null)
      localIntent.putExtra("title", paramString2);
    localIntent.putExtra("isWebwx", paramString1);
    localIntent.putExtra("ftscaneditable", false);
    localIntent.putExtra("key_load_js_without_delay", true);
    if (TextUtils.isEmpty(paramString5));
    for (paramIntent = HP(21); ; paramIntent = paramString5)
    {
      if (TextUtils.isEmpty(paramString6))
        paramString6 = HP(21);
      while (true)
      {
        paramString1 = a(21, false, 2, paramString3, paramString4, paramIntent, paramString1, "2", paramString6, "", "");
        if (!bo.isNullOrNil(""))
          paramString1.put("redPointMsgId", "");
        localIntent.putExtra("rawUrl", d(paramString1, 1));
        localIntent.putExtra("sessionId", paramIntent);
        localIntent.putExtra("customize_status_bar_color", Color.parseColor("#F2F2F2"));
        localIntent.putExtra("status_bar_style", "black");
        com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.fts.FTSWebViewUI", localIntent);
        AppMethodBeat.o(124121);
        break;
      }
    }
  }

  public static void a(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(124129);
    paramIntent.putExtra("ftsbizscene", paramInt);
    Map localMap = d(paramInt, false, 384);
    String str = HP(bo.ank((String)localMap.get("scene")));
    localMap.put("sessionId", str);
    paramIntent.putExtra("sessionId", str);
    paramIntent.putExtra("rawUrl", d(localMap, 0));
    paramIntent.putExtra("ftsType", 384);
    AppMethodBeat.o(124129);
  }

  public static void a(b paramb, int paramInt)
  {
    AppMethodBeat.i(124144);
    a(paramb, paramInt, false);
    AppMethodBeat.o(124144);
  }

  public static void a(b paramb, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(124145);
    Object localObject = HY(paramInt);
    if (bo.isNullOrNil((String)localObject))
    {
      ab.w("MicroMsg.WebSearch.WebSearchApiLogic", "initTemplateFolder outputZipFilePath nil! type:%d, ftsTemplateFolder:%s", new Object[] { Integer.valueOf(paramInt), j.w(paramb.dMD()) });
      AppMethodBeat.o(124145);
    }
    while (true)
      while (true)
      {
        return;
        if (!paramb.exists())
          paramb.mkdirs();
        b localb = new b(paramb, ".nomedia");
        if (!localb.exists());
        try
        {
          localb.createNewFile();
          localObject = new b((String)localObject);
          if (HX(paramInt))
          {
            i = bo.hU(j.w(((b)localObject).dMD()), ((b)localObject).getParent());
            if (i < 0)
            {
              ab.e("MicroMsg.WebSearch.WebSearchApiLogic", "unzip fail, ret = " + i + ", zipFilePath = " + j.w(((b)localObject).dMD()) + ", unzipPath = " + ((b)localObject).getParent());
              if ((paramBoolean) || (paramInt != 0) || (HS(paramInt)))
                break label309;
              ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "init template fail, try again , ftsTemplateFolder %s, type %d", new Object[] { paramb, Integer.valueOf(paramInt) });
              paramBoolean = true;
            }
          }
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localIOException, "create nomedia file error", new Object[0]);
            continue;
            HZ(paramInt);
            int i = HV(paramInt);
            ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "Unzip Path%s version=%d", new Object[] { ((b)localObject).getParent(), Integer.valueOf(i) });
            continue;
            ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "copy template file from asset fail %s", new Object[] { j.w(((b)localObject).dMD()) });
          }
          label309: AppMethodBeat.o(124145);
        }
      }
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, String paramString5, int paramInt2, String paramString6)
  {
    AppMethodBeat.i(124133);
    mr localmr = new mr();
    localmr.cIx.query = paramString4;
    localmr.cIx.cvF = paramString2;
    localmr.cIx.cIy = paramString3;
    localmr.cIx.scene = paramInt1;
    localmr.cIx.cIz = paramString1;
    localmr.cIx.cIB = paramString5;
    localmr.cIx.cIC = paramInt2;
    localmr.cIx.cIA = paramString6;
    com.tencent.mm.sdk.b.a.xxA.m(localmr);
    AppMethodBeat.o(124133);
  }

  public static axy abJ()
  {
    AppMethodBeat.i(124112);
    try
    {
      Object localObject1 = (String)g.RP().Ry().get(67591, null);
      axy localaxy;
      if (localObject1 != null)
      {
        localaxy = new com/tencent/mm/protocal/protobuf/axy;
        localaxy.<init>();
        localObject1 = ((String)localObject1).split(",");
        localaxy.wfG = Integer.valueOf(localObject1[0]).intValue();
        localaxy.wfJ = Integer.valueOf(localObject1[1]).intValue();
        localaxy.vRq = (Integer.valueOf(localObject1[2]).intValue() / 1000000.0F);
        localaxy.vRp = (Integer.valueOf(localObject1[3]).intValue() / 1000000.0F);
        ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localaxy.vRq), Float.valueOf(localaxy.vRp) });
        AppMethodBeat.o(124112);
      }
      while (true)
      {
        return localaxy;
        ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is null, lbsContent is null!");
        AppMethodBeat.o(124112);
        localaxy = null;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(124112);
        Object localObject2 = null;
      }
    }
  }

  public static void adH(String paramString)
  {
    AppMethodBeat.i(124125);
    g.RS().aa(new aa.2(paramString));
    AppMethodBeat.o(124125);
  }

  public static void adI(String paramString)
  {
    AppMethodBeat.i(124134);
    ms localms = new ms();
    localms.cID.scene = 201;
    localms.cID.cvF = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localms);
    AppMethodBeat.o(124134);
  }

  public static String an(Map<String, ? extends Object> paramMap)
  {
    AppMethodBeat.i(124136);
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localStringBuffer.append((String)paramMap.getKey());
      localStringBuffer.append("=");
      if (paramMap.getValue() != null)
        localStringBuffer.append(paramMap.getValue().toString());
      localStringBuffer.append("&");
    }
    paramMap = localStringBuffer.substring(0, localStringBuffer.length() - 1).toString();
    AppMethodBeat.o(124136);
    return paramMap;
  }

  private static Intent az(Intent paramIntent)
  {
    AppMethodBeat.i(124113);
    if (paramIntent == null)
    {
      paramIntent = null;
      AppMethodBeat.o(124113);
    }
    while (true)
    {
      return paramIntent;
      paramIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      paramIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      paramIntent.putExtra("neverGetA8Key", true);
      AppMethodBeat.o(124113);
    }
  }

  public static String bVP()
  {
    AppMethodBeat.i(124111);
    String str;
    if (at.isWifi(ah.getContext()))
    {
      str = "wifi";
      AppMethodBeat.o(124111);
    }
    while (true)
    {
      return str;
      if (at.is4G(ah.getContext()))
      {
        str = "4g";
        AppMethodBeat.o(124111);
      }
      else if (at.is3G(ah.getContext()))
      {
        str = "3g";
        AppMethodBeat.o(124111);
      }
      else if (at.is2G(ah.getContext()))
      {
        str = "2g";
        AppMethodBeat.o(124111);
      }
      else if (!at.isConnected(ah.getContext()))
      {
        str = "fail";
        AppMethodBeat.o(124111);
      }
      else
      {
        str = "";
        AppMethodBeat.o(124111);
      }
    }
  }

  public static String bx(int paramInt, String paramString)
  {
    AppMethodBeat.i(124126);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt));
    localHashMap.put("type", "64");
    localHashMap.put("lang", com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()));
    localHashMap.put("platform", "android");
    localHashMap.put("version", String.valueOf(((ao)tZX.get(Integer.valueOf(2))).afW()));
    localHashMap.put("isHomePage", "0");
    localHashMap.put("isSug", "1");
    localHashMap.put("netType", bVP());
    localHashMap.put("WASessionId", paramString);
    localHashMap.put("sessionId", paramString);
    localHashMap.put("subSessionId", paramString);
    localHashMap.put("isPreload", "1");
    paramString = d(localHashMap, 2);
    AppMethodBeat.o(124126);
    return paramString;
  }

  public static String cUZ()
  {
    AppMethodBeat.i(124095);
    tZX.get(Integer.valueOf(1));
    AppMethodBeat.o(124095);
    return "app.html";
  }

  public static String cVa()
  {
    AppMethodBeat.i(124096);
    tZX.get(Integer.valueOf(1));
    AppMethodBeat.o(124096);
    return "config.conf";
  }

  public static void cVb()
  {
    AppMethodBeat.i(124097);
    Iterator localIterator = tZY.values().iterator();
    while (localIterator.hasNext())
      localIterator.next();
    AppMethodBeat.o(124097);
  }

  public static int cVc()
  {
    return tZZ;
  }

  public static Intent cVd()
  {
    AppMethodBeat.i(124114);
    Intent localIntent = az(new Intent());
    AppMethodBeat.o(124114);
    return localIntent;
  }

  public static void cVe()
  {
    AppMethodBeat.i(124122);
    lL(0L);
    AppMethodBeat.o(124122);
  }

  public static String cVf()
  {
    AppMethodBeat.i(124124);
    String str = HP(-1);
    Map localMap = d(-1, true, 0);
    localMap.put("sessionId", str);
    localMap.put("inputMarginTop", "32");
    localMap.put("inputMarginLeftRight", "24");
    localMap.put("inputHeight", "48");
    localMap.put("isPreload", "1");
    str = d(localMap, 0);
    AppMethodBeat.o(124124);
    return str;
  }

  public static boolean cVg()
  {
    boolean bool = true;
    AppMethodBeat.i(124132);
    JSONObject localJSONObject = ac.adL("snsContactMatch");
    if (localJSONObject != null)
      if (localJSONObject.optInt("matchSwitch") == 1)
        AppMethodBeat.o(124132);
    while (true)
    {
      return bool;
      AppMethodBeat.o(124132);
      bool = false;
      continue;
      AppMethodBeat.o(124132);
      bool = false;
    }
  }

  public static int cVh()
  {
    AppMethodBeat.i(124135);
    JSONObject localJSONObject = ac.adL("snsContactMatch");
    int i;
    if (localJSONObject != null)
    {
      i = localJSONObject.optInt("queryUtfLenLimit");
      AppMethodBeat.o(124135);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(124135);
    }
  }

  public static boolean cVi()
  {
    AppMethodBeat.i(124143);
    boolean bool = f.CLIENT_VERSION.endsWith("0F");
    AppMethodBeat.o(124143);
    return bool;
  }

  private static void copyFile(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(124103);
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    AppMethodBeat.o(124103);
  }

  public static int d(Map<String, Object> paramMap, String paramString, int paramInt)
  {
    AppMethodBeat.i(124139);
    paramMap = t(paramMap, paramString);
    if (bo.isNullOrNil(paramMap))
      AppMethodBeat.o(124139);
    while (true)
    {
      return paramInt;
      try
      {
        int i = Integer.valueOf(paramMap).intValue();
        paramInt = i;
        AppMethodBeat.o(124139);
      }
      catch (Exception paramMap)
      {
        AppMethodBeat.o(124139);
      }
    }
  }

  public static String d(Map<String, String> paramMap, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(124128);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    String str = HQ(paramInt).aLD();
    Object localObject1 = new StringBuilder();
    Object localObject2 = aj.cVp();
    if (paramInt == 1)
    {
      j = 2;
      if (!((aj)localObject2).Ii(j))
        break label217;
    }
    label217: for (int j = i; ; j = 0)
    {
      paramMap.put("isOpenPreload", j);
      localStringBuffer.append(str);
      if (paramMap.size() <= 0)
        break label395;
      localObject1 = localStringBuffer.append("/");
      HQ(paramInt);
      ((StringBuffer)localObject1).append("app.html?");
      localObject2 = paramMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        localStringBuffer.append((String)((Map.Entry)localObject1).getKey());
        localStringBuffer.append("=");
        localStringBuffer.append((String)((Map.Entry)localObject1).getValue());
        localStringBuffer.append("&");
      }
      j = 1;
      break;
    }
    localObject1 = (String)paramMap.get("sessionId");
    if (!paramMap.containsKey("sessionId"))
    {
      localObject1 = HP(bo.ank((String)paramMap.get("scene")));
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append((String)localObject1);
      localStringBuffer.append("&");
    }
    if (!paramMap.containsKey("subSessionId"))
    {
      localStringBuffer.append("subSessionId");
      localStringBuffer.append("=");
      localStringBuffer.append((String)localObject1);
      localStringBuffer.append("&");
    }
    localStringBuffer.append("wechatVersion");
    localStringBuffer.append("=");
    localStringBuffer.append(com.tencent.mm.protocal.d.vxo);
    localStringBuffer.append("&");
    paramMap = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    AppMethodBeat.o(124128);
    while (true)
    {
      return paramMap;
      label395: paramMap = localStringBuffer.append("/");
      HQ(paramInt);
      paramMap.append("app.html");
      paramMap = localStringBuffer.toString();
      AppMethodBeat.o(124128);
    }
  }

  public static Map<String, String> d(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(124116);
    Map localMap = a(paramInt1, paramBoolean, paramInt2, "");
    AppMethodBeat.o(124116);
    return localMap;
  }

  public static void d(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(124141);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = ah.doz() + ".plugin.topstory";
      localObject = paramString;
      if (paramString.startsWith("."))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = str + paramString;
      }
      paramIntent.setClassName(ah.getPackageName(), (String)localObject);
      Class.forName((String)localObject, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(paramIntent);
        AppMethodBeat.o(124141);
      }
      while (true)
      {
        return;
        paramIntent.addFlags(268435456);
        paramContext.startActivity(paramIntent);
        AppMethodBeat.o(124141);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(124141);
      }
    }
  }

  private static void e(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(124142);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = ah.doz() + ".plugin.topstory";
      localObject = paramString;
      if (paramString.startsWith("."))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = str + paramString;
      }
      paramIntent.setClassName(ah.getPackageName(), (String)localObject);
      Class.forName((String)localObject, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
        ((Activity)paramContext).startActivityForResult(paramIntent, 10001);
      AppMethodBeat.o(124142);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
        AppMethodBeat.o(124142);
      }
    }
  }

  // ERROR //
  public static boolean j(Activity paramActivity, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc_w 1085
    //   5: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ldc_w 1087
    //   12: invokestatic 1093	android/support/v4/content/b:checkSelfPermission	(Landroid/content/Context;Ljava/lang/String;)I
    //   15: istore_3
    //   16: iload_3
    //   17: ifne +60 -> 77
    //   20: getstatic 1099	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   23: sipush 15104
    //   26: iconst_2
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: iload_1
    //   33: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: iconst_2
    //   40: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: invokevirtual 1102	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   47: ldc_w 1085
    //   50: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: iload_2
    //   54: ireturn
    //   55: astore_0
    //   56: ldc 215
    //   58: aload_0
    //   59: ldc 43
    //   61: iconst_0
    //   62: anewarray 4	java/lang/Object
    //   65: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: ldc_w 1085
    //   71: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: goto -21 -> 53
    //   77: getstatic 1099	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   80: sipush 15104
    //   83: iconst_2
    //   84: anewarray 4	java/lang/Object
    //   87: dup
    //   88: iconst_0
    //   89: iload_1
    //   90: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: aastore
    //   94: dup
    //   95: iconst_1
    //   96: iconst_1
    //   97: invokestatic 35	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: aastore
    //   101: invokevirtual 1102	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   104: aload_0
    //   105: ldc_w 1087
    //   108: invokestatic 1107	android/support/v4/app/a:a	(Landroid/app/Activity;Ljava/lang/String;)Z
    //   111: ifeq +20 -> 131
    //   114: ldc 215
    //   116: ldc_w 1109
    //   119: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: ldc_w 1085
    //   125: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: goto -75 -> 53
    //   131: ldc 215
    //   133: ldc_w 1111
    //   136: invokestatic 261	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: aload_0
    //   140: iconst_1
    //   141: anewarray 387	java/lang/String
    //   144: dup
    //   145: iconst_0
    //   146: ldc_w 1087
    //   149: aastore
    //   150: bipush 73
    //   152: invokestatic 1114	android/support/v4/app/a:a	(Landroid/app/Activity;[Ljava/lang/String;I)V
    //   155: ldc_w 1085
    //   158: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: iconst_0
    //   162: istore_2
    //   163: goto -110 -> 53
    //   166: astore_0
    //   167: ldc 215
    //   169: aload_0
    //   170: ldc 43
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: goto -24 -> 155
    //
    // Exception table:
    //   from	to	target	type
    //   8	16	55	java/lang/Exception
    //   20	47	166	java/lang/Exception
    //   56	68	166	java/lang/Exception
    //   77	122	166	java/lang/Exception
    //   131	155	166	java/lang/Exception
  }

  public static Properties k(b paramb)
  {
    AppMethodBeat.i(124091);
    Properties localProperties = new Properties();
    Object localObject;
    b localb;
    if ((paramb != null) && (paramb.isFile()))
    {
      localObject = null;
      localb = null;
    }
    try
    {
      paramb = com.tencent.mm.vfs.e.p(paramb);
      localb = paramb;
      localObject = paramb;
      localProperties.load(paramb);
      bo.b(paramb);
      AppMethodBeat.o(124091);
      return localProperties;
    }
    catch (Exception paramb)
    {
      while (true)
      {
        localObject = localb;
        ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", paramb, "", new Object[0]);
        bo.b(localb);
      }
    }
    finally
    {
      bo.b((Closeable)localObject);
      AppMethodBeat.o(124091);
    }
    throw paramb;
  }

  public static void lL(long paramLong)
  {
    AppMethodBeat.i(124123);
    aj.cVp().cVq();
    g.RS().m(new aa.1(), paramLong);
    AppMethodBeat.o(124123);
  }

  public static boolean lM(long paramLong)
  {
    AppMethodBeat.i(124131);
    ab.i("MicroMsg.WebSearch.WebSearchApiLogic", "rec updateRedDotTimestamp %d", new Object[] { Long.valueOf(paramLong) });
    g.RP().Ry().set(ac.a.xVd, Long.valueOf(paramLong));
    AppMethodBeat.o(124131);
    return false;
  }

  private static boolean lN(long paramLong)
  {
    if (paramLong == 100203L);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String t(Map<String, Object> paramMap, String paramString)
  {
    AppMethodBeat.i(124137);
    if (paramMap.containsKey(paramString))
      if (paramMap.get(paramString) != null)
      {
        paramMap = paramMap.get(paramString).toString();
        AppMethodBeat.o(124137);
      }
    while (true)
    {
      return paramMap;
      paramMap = "";
      AppMethodBeat.o(124137);
      continue;
      paramMap = "";
      AppMethodBeat.o(124137);
    }
  }

  public static boolean u(Map<String, Object> paramMap, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(124138);
    paramMap = t(paramMap, paramString);
    if (bo.isNullOrNil(paramMap))
      AppMethodBeat.o(124138);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = "1".equals(paramMap);
        if (bool2)
        {
          bool1 = true;
          AppMethodBeat.o(124138);
        }
        else
        {
          bool2 = "0".equals(paramMap);
          if (bool2)
          {
            AppMethodBeat.o(124138);
          }
          else
          {
            bool2 = Boolean.valueOf(paramMap).booleanValue();
            bool1 = bool2;
            AppMethodBeat.o(124138);
          }
        }
      }
      catch (Exception paramMap)
      {
        AppMethodBeat.o(124138);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.aa
 * JD-Core Version:    0.6.2
 */