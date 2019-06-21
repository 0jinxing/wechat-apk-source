package com.tencent.mm.plugin.websearch.a;

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

public final class a
{
  public static String E(Map<String, String> paramMap)
  {
    AppMethodBeat.i(91361);
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
    AppMethodBeat.o(91361);
    return paramMap;
  }

  // ERROR //
  private static Properties J(File paramFile)
  {
    // Byte code:
    //   0: ldc 105
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 107	java/util/Properties
    //   8: dup
    //   9: invokespecial 108	java/util/Properties:<init>	()V
    //   12: astore_1
    //   13: aload_0
    //   14: invokevirtual 113	java/io/File:isFile	()Z
    //   17: ifeq +23 -> 40
    //   20: new 115	java/io/FileInputStream
    //   23: astore_2
    //   24: aload_2
    //   25: aload_0
    //   26: invokespecial 118	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   29: aload_2
    //   30: astore_0
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 122	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   36: aload_2
    //   37: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   40: ldc 105
    //   42: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: aload_1
    //   46: areturn
    //   47: astore_3
    //   48: aconst_null
    //   49: astore_2
    //   50: aload_2
    //   51: astore_0
    //   52: ldc 129
    //   54: aload_3
    //   55: ldc 131
    //   57: iconst_0
    //   58: anewarray 4	java/lang/Object
    //   61: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_2
    //   65: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   68: goto -28 -> 40
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_0
    //   74: aload_0
    //   75: invokestatic 127	com/tencent/mm/a/e:p	(Ljava/io/InputStream;)V
    //   78: ldc 105
    //   80: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_2
    //   84: athrow
    //   85: astore_2
    //   86: goto -12 -> 74
    //   89: astore_3
    //   90: goto -40 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   20	29	47	java/lang/Exception
    //   20	29	71	finally
    //   31	36	85	finally
    //   52	64	85	finally
    //   31	36	89	java/lang/Exception
  }

  public static String aLD()
  {
    AppMethodBeat.i(91358);
    Object localObject = new File(afT(), "wxa_fts/res");
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = ((File)localObject).getAbsolutePath();
    AppMethodBeat.o(91358);
    return localObject;
  }

  private static int aLE()
  {
    AppMethodBeat.i(91360);
    int i = Integer.valueOf(J(new File(aLD(), "config.conf")).getProperty("version", "0")).intValue();
    AppMethodBeat.o(91360);
    return i;
  }

  private static String afT()
  {
    AppMethodBeat.i(91357);
    String str = e.eSk.replace("/data/user/0", "/data/data");
    AppMethodBeat.o(91357);
    return str;
  }

  public static Map<String, String> bA(int paramInt, String paramString)
  {
    AppMethodBeat.i(91362);
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt));
    localHashMap.put("type", "64");
    localHashMap.put("lang", com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()));
    localHashMap.put("platform", "android");
    localHashMap.put("version", String.valueOf(aLE()));
    localHashMap.put("isHomePage", "0");
    if (!TextUtils.isEmpty(paramString))
      localHashMap.put("extParams", paramString);
    paramString = com.tencent.mm.model.c.c.abi().ll("100192");
    if ((paramString.isValid()) && ("1".equals(paramString.dru().get("openSearchSuggestion"))));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WxaFTSExportLogic", "genFTSParams scene = %d, isHomePage = %b, type = %d, isSug = %b", new Object[] { Integer.valueOf(paramInt), Boolean.FALSE, Integer.valueOf(64), Boolean.valueOf(bool) });
      if (bool)
        localHashMap.put("isSug", "1");
      AppMethodBeat.o(91362);
      return localHashMap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.a.a
 * JD-Core Version:    0.6.2
 */