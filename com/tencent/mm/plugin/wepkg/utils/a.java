package com.tencent.mm.plugin.wepkg.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.c;
import com.tencent.mm.game.report.api.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wepkg.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String Kl(int paramInt)
  {
    AppMethodBeat.i(63626);
    Object localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("subCode", paramInt);
      localObject1 = URLEncoder.encode(((JSONObject)localObject1).toString(), "UTF-8");
      AppMethodBeat.o(63626);
      return localObject1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(63626);
      }
    }
    catch (JSONException localJSONException)
    {
      label39: break label39;
    }
  }

  public static String aic(String paramString)
  {
    AppMethodBeat.i(63625);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(63625);
    }
    while (true)
    {
      return paramString;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("url", paramString);
        paramString = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
        AppMethodBeat.o(63625);
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.WePkgReport", paramString.getMessage());
        paramString = "";
        AppMethodBeat.o(63625);
      }
      catch (UnsupportedEncodingException paramString)
      {
        while (true)
          ab.e("MicroMsg.WePkgReport", paramString.getMessage());
      }
    }
  }

  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5)
  {
    AppMethodBeat.i(63622);
    ab.d("MicroMsg.WePkgReport", "reportWepkgLogicKv, scene = %s, url = %s, pkgId = %s, version = %s, resultCode = %d, costTime = %d, extInfo = %s", new Object[] { paramString1, paramString2, paramString3, paramString4, Long.valueOf(paramLong1), Long.valueOf(paramLong2), paramString5 });
    try
    {
      if (bo.isNullOrNil(paramString5))
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("netType", at.gB(ah.getContext()));
        localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
        paramString5 = (String)localObject;
        localObject = paramString5;
        str3 = paramString2;
      }
    }
    catch (Exception localException1)
    {
      try
      {
        Object localObject;
        if (!bo.isNullOrNil(paramString2))
        {
          str3 = URLEncoder.encode(paramString2, "UTF-8");
          localObject = paramString5;
        }
        while (true)
        {
          h.pYm.e(13980, new Object[] { paramString1, str3, paramString3, paramString4, Long.valueOf(paramLong1), localObject, Long.valueOf(paramLong2) });
          AppMethodBeat.o(63622);
          return;
          str3 = URLDecoder.decode(paramString5, "UTF-8");
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(str3);
          ((JSONObject)localObject).put("netType", at.gB(ah.getContext()));
          localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
          paramString5 = (String)localObject;
          break;
          localException1 = localException1;
          String str1 = paramString5;
          str3 = paramString2;
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          String str2 = paramString5;
          String str3 = paramString2;
        }
      }
    }
  }

  public static void c(String paramString1, int paramInt, String paramString2, long paramLong)
  {
    AppMethodBeat.i(63623);
    com.tencent.mm.plugin.wepkg.b.a locala = b.dgn().ahC(paramString1);
    if (locala != null)
    {
      paramString1 = q(new Object[] { paramString1, locala.field_version, Integer.valueOf(0), Integer.valueOf(paramInt), Integer.valueOf(0), Integer.valueOf(0), paramString2, "", locala.field_oldVersion, Integer.valueOf(4), Long.valueOf(paramLong), Integer.valueOf(locala.field_pkgSize) });
      c.eBG.a(new d(14229, paramString1));
    }
    AppMethodBeat.o(63623);
  }

  public static String q(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(63624);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 11; i++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i])).append(',');
    localStringBuilder.append(String.valueOf(paramArrayOfObject[11]));
    paramArrayOfObject = localStringBuilder.toString();
    AppMethodBeat.o(63624);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.a
 * JD-Core Version:    0.6.2
 */