package com.tencent.mm.plugin.appbrand.r;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public final class r
{
  public static String E(Map<String, String> paramMap)
  {
    AppMethodBeat.i(93784);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    localStringBuffer.append(aLD());
    localStringBuffer.append("/app.html?");
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuffer.append("&");
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      localStringBuffer.append((String)localEntry.getValue());
    }
    if (!paramMap.containsKey("sessionId"))
    {
      localStringBuffer.append("&");
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append(com.tencent.mm.plugin.websearch.api.aa.HP(bo.ank((String)paramMap.get("scene"))));
    }
    paramMap = localStringBuffer.toString();
    AppMethodBeat.o(93784);
    return paramMap;
  }

  // ERROR //
  public static Properties J(File paramFile)
  {
    // Byte code:
    //   0: ldc 105
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 107	java/util/Properties
    //   8: dup
    //   9: invokespecial 108	java/util/Properties:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: ifnull +30 -> 44
    //   17: aload_0
    //   18: invokevirtual 113	java/io/File:isFile	()Z
    //   21: ifeq +23 -> 44
    //   24: new 115	java/io/FileInputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_0
    //   30: invokespecial 118	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_2
    //   34: astore_0
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 122	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   40: aload_2
    //   41: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   44: ldc 105
    //   46: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: aload_1
    //   50: areturn
    //   51: astore_3
    //   52: aconst_null
    //   53: astore_2
    //   54: aload_2
    //   55: astore_0
    //   56: ldc 129
    //   58: aload_3
    //   59: ldc 131
    //   61: iconst_0
    //   62: anewarray 4	java/lang/Object
    //   65: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: aload_2
    //   69: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   72: goto -28 -> 44
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_0
    //   78: aload_0
    //   79: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   82: ldc 105
    //   84: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_2
    //   88: athrow
    //   89: astore_2
    //   90: goto -12 -> 78
    //   93: astore_3
    //   94: goto -40 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   24	33	51	java/lang/Exception
    //   24	33	75	finally
    //   35	40	89	finally
    //   56	68	89	finally
    //   35	40	93	java/lang/Exception
  }

  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    AppMethodBeat.i(93786);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()));
    localHashMap.put("platform", "android");
    localHashMap.put("version", String.valueOf(aLE()));
    String str;
    if (paramBoolean)
    {
      str = "1";
      localHashMap.put("isHomePage", str);
      localHashMap.put("netType", com.tencent.mm.plugin.websearch.api.aa.bVP());
      if (!TextUtils.isEmpty(paramString))
        localHashMap.put("extParams", paramString);
      paramString = com.tencent.mm.model.c.c.abi().ll("100192");
      if ((!paramString.isValid()) || (!"1".equals(paramString.dru().get("openSearchSuggestion"))))
        break label247;
    }
    label247: for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WxaFTSExportLogic", "genFTSParams scene = %d, isHomePage = %b, type = %d, isSug = %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (bool)
        localHashMap.put("isSug", "1");
      AppMethodBeat.o(93786);
      return localHashMap;
      str = "0";
      break;
    }
  }

  public static String aLD()
  {
    AppMethodBeat.i(93781);
    Object localObject = new File(afT(), "wxa_fts/res");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath();
    AppMethodBeat.o(93781);
    return localObject;
  }

  public static int aLE()
  {
    AppMethodBeat.i(93783);
    int i = Integer.valueOf(J(new File(aLD(), "config.conf")).getProperty("version", "0")).intValue();
    AppMethodBeat.o(93783);
    return i;
  }

  public static final boolean aNU()
  {
    AppMethodBeat.i(93787);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100223");
    boolean bool;
    if (localc.isValid())
      if (bo.getInt((String)localc.dru().get("switchWeAppTemplate"), 0) == 1)
      {
        AppMethodBeat.o(93787);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(93787);
      bool = false;
      continue;
      AppMethodBeat.o(93787);
      bool = false;
    }
  }

  public static final boolean aNV()
  {
    AppMethodBeat.i(93788);
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100435");
    boolean bool;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      if ((bo.getInt((String)((Map)localObject).get("forceClose"), 0) == 0) && (bo.getInt((String)((Map)localObject).get("open"), 0) == 1))
      {
        AppMethodBeat.o(93788);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(93788);
      bool = false;
      continue;
      AppMethodBeat.o(93788);
      bool = false;
    }
  }

  private static String afT()
  {
    AppMethodBeat.i(93780);
    String str = e.eSk.replace("/data/user/0", "/data/data");
    AppMethodBeat.o(93780);
    return str;
  }

  public static Map<String, String> d(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    AppMethodBeat.i(93785);
    Map localMap = a(paramInt1, paramBoolean, paramInt2, "");
    AppMethodBeat.o(93785);
    return localMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.r
 * JD-Core Version:    0.6.2
 */