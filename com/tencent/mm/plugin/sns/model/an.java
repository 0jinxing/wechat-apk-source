package com.tencent.mm.plugin.sns.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class an
{
  private static final Map<String, String> qMG;

  static
  {
    AppMethodBeat.i(36599);
    qMG = new HashMap();
    AppMethodBeat.o(36599);
  }

  public static String fZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36597);
    if (paramString2 == null)
    {
      paramString1 = "";
      AppMethodBeat.o(36597);
    }
    while (true)
    {
      return paramString1;
      boolean bool = Looper.getMainLooper().equals(Looper.myLooper());
      Object localObject;
      if ((bool) && (qMG.containsKey(paramString1 + paramString2)))
      {
        localObject = (String)qMG.get(paramString1 + paramString2);
        if (!bo.isNullOrNil((String)localObject))
        {
          AppMethodBeat.o(36597);
          paramString1 = (String)localObject;
        }
      }
      else
      {
        String str = g.x(paramString2.getBytes());
        localObject = new StringBuffer(paramString1);
        if (str.length() > 0)
        {
          ((StringBuffer)localObject).append(str.charAt(0));
          ((StringBuffer)localObject).append("/");
        }
        if (str.length() >= 2)
        {
          ((StringBuffer)localObject).append(str.charAt(1));
          ((StringBuffer)localObject).append("/");
        }
        if (bool)
          qMG.put(paramString1 + paramString2, ((StringBuffer)localObject).toString());
        paramString1 = ((StringBuffer)localObject).toString();
        AppMethodBeat.o(36597);
      }
    }
  }

  public static void release()
  {
    try
    {
      AppMethodBeat.i(36598);
      qMG.clear();
      AppMethodBeat.o(36598);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.an
 * JD-Core Version:    0.6.2
 */