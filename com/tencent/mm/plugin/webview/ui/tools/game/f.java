package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class f
{
  private static JSONObject aJ(Map<Integer, Object> paramMap)
  {
    AppMethodBeat.i(8704);
    JSONObject localJSONObject = new JSONObject();
    if (paramMap == null)
      AppMethodBeat.o(8704);
    while (true)
    {
      return localJSONObject;
      try
      {
        Iterator localIterator = paramMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          Integer localInteger = (Integer)localIterator.next();
          localJSONObject.put(String.valueOf(localInteger), paramMap.get(localInteger));
        }
      }
      catch (Exception paramMap)
      {
        AppMethodBeat.o(8704);
      }
    }
  }

  public static Map<Integer, Object> aO(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(8705);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject == null)
      AppMethodBeat.o(8705);
    while (true)
    {
      return localHashMap;
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int i = bo.getInt(str, -1);
        if (i == -1)
          ab.i("MicroMsg.GameWebReportUtil", "reportData key error");
        else
          localHashMap.put(Integer.valueOf(i), paramJSONObject.opt(str));
      }
      AppMethodBeat.o(8705);
    }
  }

  public static void y(String paramString, Map<Integer, Object> paramMap)
  {
    AppMethodBeat.i(8703);
    Object localObject;
    if (ah.doF())
    {
      localObject = g.agh(paramString);
      paramMap.put(Integer.valueOf(e.b.uDF), Long.valueOf(((g)localObject).uDL - ((g)localObject).startTime));
      paramMap.put(Integer.valueOf(e.b.uDG), Long.valueOf(((g)localObject).uDM - ((g)localObject).startTime));
      paramMap.put(Integer.valueOf(e.b.uDH), Long.valueOf(((g)localObject).uDN - ((g)localObject).uDM));
      paramMap.put(Integer.valueOf(e.b.uDI), Long.valueOf(((g)localObject).uDP - ((g)localObject).uDO));
      paramMap.put(Integer.valueOf(e.b.uDJ), Long.valueOf(((g)localObject).uDR - ((g)localObject).uDQ));
      e.x(paramString, paramMap);
      AppMethodBeat.o(8703);
    }
    while (true)
    {
      return;
      localObject = new Bundle();
      ((Bundle)localObject).putString("report_data", aJ(paramMap).toString());
      ((Bundle)localObject).putString("url", paramString);
      com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:tools", (Parcelable)localObject, f.a.class, null);
      AppMethodBeat.o(8703);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.f
 * JD-Core Version:    0.6.2
 */