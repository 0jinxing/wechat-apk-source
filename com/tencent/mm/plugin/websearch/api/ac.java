package com.tencent.mm.plugin.websearch.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class ac
{
  private static f fur;
  private static HashMap<String, com.tencent.mm.storage.ac.a> uao;
  private static Map<String, JSONObject> uap;
  private static u uaq;
  private static HashMap<String, Long> uar;
  private static String uas;

  static
  {
    AppMethodBeat.i(124165);
    uao = new HashMap();
    uap = new HashMap();
    uao.put("zh_CN", com.tencent.mm.storage.ac.a.xQY);
    uao.put("zh_HK", com.tencent.mm.storage.ac.a.xRa);
    uao.put("zh_TW", com.tencent.mm.storage.ac.a.xQZ);
    uao.put("en", com.tencent.mm.storage.ac.a.xRb);
    uao.put("ar", com.tencent.mm.storage.ac.a.xRc);
    uao.put("de", com.tencent.mm.storage.ac.a.xRd);
    uao.put("de_DE", com.tencent.mm.storage.ac.a.xRe);
    uao.put("es", com.tencent.mm.storage.ac.a.xRf);
    uao.put("fr", com.tencent.mm.storage.ac.a.xRg);
    uao.put("he", com.tencent.mm.storage.ac.a.xRh);
    uao.put("hi", com.tencent.mm.storage.ac.a.xRi);
    uao.put("id", com.tencent.mm.storage.ac.a.xRj);
    uao.put("in", com.tencent.mm.storage.ac.a.xRk);
    uao.put("it", com.tencent.mm.storage.ac.a.xRl);
    uao.put("iw", com.tencent.mm.storage.ac.a.xRm);
    uao.put("ja", com.tencent.mm.storage.ac.a.xRn);
    uao.put("ko", com.tencent.mm.storage.ac.a.xRo);
    uao.put("lo", com.tencent.mm.storage.ac.a.xRp);
    uao.put("ms", com.tencent.mm.storage.ac.a.xRq);
    uao.put("my", com.tencent.mm.storage.ac.a.xRr);
    uao.put("pl", com.tencent.mm.storage.ac.a.xRs);
    uao.put("pt", com.tencent.mm.storage.ac.a.xRt);
    uao.put("ru", com.tencent.mm.storage.ac.a.xRu);
    uao.put("th", com.tencent.mm.storage.ac.a.xRv);
    uao.put("tr", com.tencent.mm.storage.ac.a.xRw);
    uao.put("vi", com.tencent.mm.storage.ac.a.xRx);
    uas = "";
    fur = new ac.1();
    AppMethodBeat.o(124165);
  }

  public static boolean Ig(int paramInt)
  {
    AppMethodBeat.i(124156);
    if (uar == null)
      uar = new HashMap();
    String str = aa.gw(ah.getContext());
    Object localObject;
    if ((uas == null) || (uas.equalsIgnoreCase(str)))
    {
      Long localLong = (Long)uar.get(str);
      localObject = localLong;
      if (localLong == null)
        localObject = Long.valueOf(0L);
      if (System.currentTimeMillis() - ((Long)localObject).longValue() < 600000L)
        AppMethodBeat.o(124156);
    }
    for (boolean bool = false; ; bool = true)
    {
      while (true)
      {
        return bool;
        long l = System.currentTimeMillis();
        uar.put(str, Long.valueOf(l));
        ab.i("MicroMsg.WebSearch.WebSearchConfigLogic", "startToRequestConfig %s %d %d", new Object[] { str, Integer.valueOf(paramInt), Long.valueOf(0L) });
        localObject = (String)g.RP().Ry().get(adK(str), null);
        try
        {
          if (!bo.isNullOrNil((String)localObject))
          {
            localObject = adJ((String)localObject);
            if (localObject != null)
              break label201;
            localObject = ac.a.uav;
            if (localObject != ac.a.uat)
              break label241;
            AppMethodBeat.o(124156);
            bool = false;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ac.a locala = null;
            continue;
            label201: if (locala.optLong("updateTime") + locala.optLong("timevalSec") * 1000L < System.currentTimeMillis())
              locala = ac.a.uau;
            else
              locala = ac.a.uat;
          }
        }
      }
      label241: uas = str;
      if (uaq != null)
      {
        g.Rg().c(uaq);
        uaq = null;
      }
      uaq = new u(paramInt);
      g.Rg().a(1948, fur);
      g.Rg().a(uaq, 0);
      AppMethodBeat.o(124156);
    }
  }

  private static JSONObject adJ(String paramString)
  {
    AppMethodBeat.i(124157);
    if ((uap.containsKey(paramString)) && (uap.get(paramString) != null))
    {
      paramString = (JSONObject)uap.get(paramString);
      AppMethodBeat.o(124157);
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        uap.put(paramString, localJSONObject);
        AppMethodBeat.o(124157);
        paramString = localJSONObject;
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", paramString, "", new Object[0]);
        paramString = null;
        AppMethodBeat.o(124157);
      }
    }
  }

  private static com.tencent.mm.storage.ac.a adK(String paramString)
  {
    AppMethodBeat.i(124158);
    com.tencent.mm.storage.ac.a locala = (com.tencent.mm.storage.ac.a)uao.get(paramString);
    paramString = locala;
    if (locala == null)
      paramString = com.tencent.mm.storage.ac.a.xRb;
    AppMethodBeat.o(124158);
    return paramString;
  }

  public static JSONObject adL(String paramString)
  {
    Object localObject1 = null;
    JSONObject localJSONObject = null;
    AppMethodBeat.i(124160);
    String str1 = aa.gw(ah.getContext());
    Object localObject4 = localJSONObject;
    try
    {
      str2 = (String)g.RP().Ry().get(adK(str1), null);
      localObject4 = localJSONObject;
      if (!bo.isNullOrNil(str2))
      {
        localObject4 = localJSONObject;
        localObject1 = adJ(str2).optJSONObject("data").optJSONObject(paramString);
        localObject4 = "Config Storage";
        if (localObject1 != null)
          break label190;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          String str2 = cVj();
          if (str2 != null)
          {
            localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>(str2);
            localJSONObject = localJSONObject.optJSONObject("data").optJSONObject(paramString);
            localObject4 = localJSONObject;
            localObject1 = "Asset";
            if (localObject4 == null)
            {
              localObject4 = new JSONObject();
              ab.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfigKeyObj %s %s %s", new Object[] { str1, paramString, localObject1 });
              AppMethodBeat.o(124160);
              return localObject4;
              localException1 = localException1;
              localObject2 = localObject4;
              localObject4 = "";
            }
          }
        }
        catch (Exception localException2)
        {
          localObject3 = localObject4;
          localObject4 = localObject2;
          localObject2 = localObject3;
          continue;
          continue;
        }
        label190: Object localObject3 = localObject2;
        Object localObject2 = localObject4;
        localObject4 = localObject3;
      }
    }
  }

  public static String adM(String paramString)
  {
    Object localObject1 = null;
    JSONObject localJSONObject = null;
    AppMethodBeat.i(124161);
    String str1 = aa.gw(ah.getContext());
    Object localObject3 = localJSONObject;
    try
    {
      str2 = (String)g.RP().Ry().get(adK(str1), null);
      localObject3 = localJSONObject;
      if (!bo.isNullOrNil(str2))
      {
        localObject3 = localJSONObject;
        localObject1 = adJ(str2);
        localObject3 = "Config Storage";
        if (localObject1 != null)
          break label185;
      }
    }
    catch (Exception localException1)
    {
      label185: 
      while (true)
        try
        {
          String str2 = cVj();
          if (str2 != null)
          {
            localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>(str2);
            localObject3 = "Asset";
            localObject1 = localJSONObject;
            if (localObject1 == null)
            {
              localObject1 = new JSONObject();
              ab.i("MicroMsg.WebSearch.WebSearchConfigLogic", "getWebSearchConfigMetaKeyObj %s %s %s", new Object[] { str1, paramString, localObject3 });
              paramString = ((JSONObject)localObject1).opt(paramString);
              if (paramString == null)
              {
                paramString = "";
                AppMethodBeat.o(124161);
                return paramString;
                localException1 = localException1;
                Object localObject2 = localObject3;
                localObject3 = "";
              }
            }
          }
        }
        catch (Exception localException2)
        {
          continue;
          paramString = paramString.toString();
          AppMethodBeat.o(124161);
          continue;
        }
    }
  }

  public static String adN(String paramString)
  {
    AppMethodBeat.i(124163);
    JSONObject localJSONObject = adL("entranceWording");
    if (localJSONObject != null)
    {
      paramString = localJSONObject.optString(paramString);
      AppMethodBeat.o(124163);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(124163);
    }
  }

  // ERROR //
  private static String cVj()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc_w 383
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 201	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   11: invokevirtual 389	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: astore_1
    //   15: aload_1
    //   16: ldc_w 391
    //   19: invokestatic 201	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   22: invokestatic 207	com/tencent/mm/sdk/platformtools/aa:gw	(Landroid/content/Context;)Ljava/lang/String;
    //   25: invokestatic 394	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   28: invokevirtual 397	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   31: invokevirtual 403	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   34: astore_2
    //   35: aload_2
    //   36: astore_1
    //   37: aload_2
    //   38: invokestatic 407	com/tencent/mm/sdk/platformtools/bo:I	(Ljava/io/InputStream;)Ljava/lang/String;
    //   41: astore_3
    //   42: aload_3
    //   43: astore_1
    //   44: aload_2
    //   45: invokestatic 411	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   48: ldc_w 383
    //   51: invokestatic 187	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: aload_1
    //   55: areturn
    //   56: astore_3
    //   57: aconst_null
    //   58: astore_2
    //   59: aload_2
    //   60: astore_1
    //   61: ldc 236
    //   63: aload_3
    //   64: aload_3
    //   65: invokevirtual 414	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 342	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload_2
    //   76: invokestatic 411	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   79: aload_0
    //   80: astore_1
    //   81: goto -33 -> 48
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_1
    //   88: invokestatic 411	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   91: ldc_w 383
    //   94: invokestatic 187	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_2
    //   98: athrow
    //   99: astore_2
    //   100: goto -13 -> 87
    //   103: astore_3
    //   104: goto -45 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   15	35	56	java/lang/Exception
    //   15	35	84	finally
    //   37	42	99	finally
    //   61	75	99	finally
    //   37	42	103	java/lang/Exception
  }

  private static ac.a gT(String paramString1, String paramString2)
  {
    AppMethodBeat.i(124159);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString2);
      localJSONObject.put("updateTime", System.currentTimeMillis());
      paramString2 = localJSONObject.toString();
      g.RP().Ry().set(adK(paramString1), paramString2);
      try
      {
        paramString1 = new org/json/JSONObject;
        paramString1.<init>(paramString2);
        uap.put(paramString2, paramString1);
        paramString1 = ac.a.uat;
        AppMethodBeat.o(124159);
        return paramString1;
      }
      catch (JSONException paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", paramString1, "", new Object[0]);
      }
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        paramString1 = ac.a.uav;
        AppMethodBeat.o(124159);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ac
 * JD-Core Version:    0.6.2
 */