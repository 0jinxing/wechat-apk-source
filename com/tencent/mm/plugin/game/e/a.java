package com.tencent.mm.plugin.game.e;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.c;
import com.tencent.mm.game.report.api.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class a
{
  private static String ndY = "";

  public static String K(Map<String, String> paramMap)
  {
    AppMethodBeat.i(111688);
    if (paramMap.size() == 0)
    {
      paramMap = "";
      AppMethodBeat.o(111688);
    }
    while (true)
    {
      return paramMap;
      JSONObject localJSONObject = new JSONObject();
      Iterator localIterator = paramMap.entrySet().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label107;
        paramMap = (Map.Entry)localIterator.next();
        try
        {
          localJSONObject.put((String)paramMap.getKey(), paramMap.getValue());
        }
        catch (Exception paramMap)
        {
          ab.e("MicroMsg.GameReportUtil", paramMap.getMessage());
          paramMap = "";
          AppMethodBeat.o(111688);
        }
      }
      continue;
      try
      {
        label107: paramMap = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
        AppMethodBeat.o(111688);
      }
      catch (Exception paramMap)
      {
        ab.e("MicroMsg.GameReportUtil", paramMap.getMessage());
        paramMap = "";
        AppMethodBeat.o(111688);
      }
    }
  }

  public static void Oh(String paramString)
  {
    ndY = paramString;
  }

  public static String T(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(111689);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString2, paramString3);
      paramString3 = localJSONObject;
      paramString2 = paramString1;
      if (paramString3 != null)
        paramString2 = ez(paramString1, paramString3.toString());
      paramString1 = kY(paramString2);
      AppMethodBeat.o(111689);
      return paramString1;
    }
    catch (Exception paramString2)
    {
      while (true)
      {
        ab.e("MicroMsg.GameReportUtil", paramString2.getMessage());
        paramString3 = null;
      }
    }
  }

  public static void a(int paramInt1, int paramInt2, int paramInt3, long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(111685);
    paramString1 = d.b(14683, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong1), paramString1, null, paramString2, Long.valueOf(paramLong2), Long.valueOf(paramLong3), null });
    c.eBG.a(paramString1);
    AppMethodBeat.o(111685);
  }

  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString1, int paramInt4, String paramString2)
  {
    AppMethodBeat.i(111684);
    ab.i("MicroMsg.GameReportUtil", "reportExposureInfo : " + paramInt1 + " , " + paramInt2 + " , " + paramInt3 + " , 1 , 0 , " + bo.nullAsNil(paramString1) + " , " + paramInt4 + " , 0 , " + bo.nullAsNil(null) + " , " + bo.nullAsNil(null) + " , " + bo.nullAsNil(paramString2));
    h localh = h.pYm;
    int i = bo.getInt(null, 0);
    int j;
    if (at.is3G(paramContext))
      j = 4;
    while (true)
    {
      localh.e(13384, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(1), Integer.valueOf(0), paramString1, Integer.valueOf(paramInt4), Integer.valueOf(0), null, Integer.valueOf(i), Integer.valueOf(j), paramString2 });
      AppMethodBeat.o(111684);
      return;
      if (at.is4G(paramContext))
        j = 5;
      else
        switch (at.getNetType(paramContext))
        {
        case 1:
        case 2:
        case 3:
        case 4:
        default:
          j = 6;
          break;
        case -1:
          j = 255;
          break;
        case 0:
          j = 1;
          break;
        case 5:
          j = 2;
          break;
        case 6:
          j = 3;
        }
    }
  }

  public static void aL(int paramInt, String paramString)
  {
    AppMethodBeat.i(111686);
    d locald = new d();
    locald.eBH = paramInt;
    locald.eBI = paramString;
    c.eBG.a(locald);
    AppMethodBeat.o(111686);
  }

  private static String ez(String paramString1, String paramString2)
  {
    AppMethodBeat.i(111690);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(111690);
    while (true)
    {
      return paramString2;
      JSONObject localJSONObject = null;
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString1);
        paramString1 = (String)localObject;
        try
        {
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramString2);
          if (paramString1 == null)
            break label107;
          localObject = paramString1.keys();
          while (true)
          {
            if (!((Iterator)localObject).hasNext())
              break label107;
            try
            {
              paramString2 = (String)((Iterator)localObject).next();
              localJSONObject.put(paramString2, paramString1.opt(paramString2));
            }
            catch (Exception paramString1)
            {
              paramString2 = "";
              AppMethodBeat.o(111690);
            }
          }
        }
        catch (JSONException paramString1)
        {
          paramString2 = "";
          AppMethodBeat.o(111690);
        }
        continue;
        label107: paramString2 = localJSONObject.toString();
        AppMethodBeat.o(111690);
      }
      catch (Exception paramString1)
      {
        while (true)
          paramString1 = localJSONObject;
      }
    }
  }

  public static String kY(String paramString)
  {
    AppMethodBeat.i(111687);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(111687);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLEncoder.encode(paramString, "UTF-8");
        AppMethodBeat.o(111687);
      }
      catch (Exception localException)
      {
        while (true)
        {
          paramString = "";
          ab.e("MicroMsg.GameReportUtil", localException.getMessage());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.e.a
 * JD-Core Version:    0.6.2
 */