package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class u
{
  public static Map<String, String> amt(String paramString)
  {
    AppMethodBeat.i(52007);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(52007);
    }
    while (true)
    {
      return paramString;
      HashMap localHashMap = new HashMap();
      for (Object localObject1 : paramString.split("\n"))
        if ((localObject1 != null) && (localObject1.length() > 0))
        {
          Object localObject2 = localObject1.trim().split("=", 2);
          if ((localObject2 != null) && (localObject2.length >= 2))
          {
            localObject1 = localObject2[0];
            localObject2 = localObject2[1];
            if ((localObject1 != null) && (localObject1.length() > 0) && (localObject1.matches("^[a-zA-Z0-9_.]*")))
              localHashMap.put(localObject1, localObject2);
          }
        }
      AppMethodBeat.o(52007);
      paramString = localHashMap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.u
 * JD-Core Version:    0.6.2
 */