package com.tencent.mm.plugin.webview.ui.tools.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private static final Map<Integer, Map<Integer, Object>> uDt;

  static
  {
    AppMethodBeat.i(8701);
    uDt = new HashMap();
    AppMethodBeat.o(8701);
  }

  public static String aI(Map<Integer, Object> paramMap)
  {
    AppMethodBeat.i(8700);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      paramMap = "";
      AppMethodBeat.o(8700);
    }
    while (true)
    {
      return paramMap;
      int i = ((Integer)Collections.max(paramMap.keySet())).intValue();
      int j = ((Integer)Collections.min(paramMap.keySet())).intValue();
      i = Math.min(i, 200);
      StringBuffer localStringBuffer = new StringBuffer();
      while (j <= i)
      {
        Object localObject = paramMap.get(Integer.valueOf(j));
        if (localObject != null)
          localStringBuffer.append(localObject);
        localStringBuffer.append(",");
        j++;
      }
      if (localStringBuffer.length() > 0)
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      paramMap = localStringBuffer.toString();
      AppMethodBeat.o(8700);
    }
  }

  public static void agf(String paramString)
  {
    AppMethodBeat.i(8699);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8699);
    while (true)
    {
      return;
      paramString = (Map)uDt.remove(Integer.valueOf(paramString.hashCode()));
      if ((paramString == null) || (paramString.isEmpty()))
      {
        AppMethodBeat.o(8699);
      }
      else
      {
        boolean bool = ((Boolean)paramString.remove(Integer.valueOf(e.b.uDE))).booleanValue();
        paramString = aI(paramString);
        ab.i("MicroMsg.GameWebReport", "report web performance. isReportNow: %b, reportData: [%s]", new Object[] { Boolean.valueOf(bool), paramString });
        h.pYm.a(16142, paramString, bool, false);
        AppMethodBeat.o(8699);
      }
    }
  }

  public static void x(String paramString, Map<Integer, Object> paramMap)
  {
    AppMethodBeat.i(8698);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(8698);
    while (true)
    {
      return;
      uDt.put(Integer.valueOf(paramString.hashCode()), paramMap);
      AppMethodBeat.o(8698);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.e
 * JD-Core Version:    0.6.2
 */