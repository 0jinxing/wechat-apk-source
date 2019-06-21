package com.tencent.mm.plugin.appbrand.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  private static String DA(String paramString)
  {
    AppMethodBeat.i(132569);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(132569);
    }
    while (true)
    {
      return paramString;
      try
      {
        String str = bo.nullAsNil(q.encode(paramString));
        paramString = str;
        AppMethodBeat.o(132569);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.AppBrand.ReportUtil", "safeEncode, given %s, e %s", new Object[] { paramString, localException });
        paramString = "";
        AppMethodBeat.o(132569);
      }
    }
  }

  public static Object[] k(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(132570);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length <= 0))
    {
      paramArrayOfObject = new Object[0];
      AppMethodBeat.o(132570);
    }
    while (true)
    {
      return paramArrayOfObject;
      Object[] arrayOfObject = new Object[paramArrayOfObject.length];
      int i = paramArrayOfObject.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        Object localObject1 = paramArrayOfObject[j];
        Object localObject2;
        if (localObject1 == null)
          localObject2 = "";
        while (true)
        {
          arrayOfObject[k] = String.valueOf(localObject2);
          j++;
          k++;
          break;
          localObject2 = localObject1;
          if ((localObject1 instanceof String))
            if (!((String)localObject1).contains(","))
            {
              localObject2 = localObject1;
              if (!((String)localObject1).contains("/"));
            }
            else
            {
              localObject2 = DA((String)localObject1);
            }
        }
      }
      AppMethodBeat.o(132570);
      paramArrayOfObject = arrayOfObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.i
 * JD-Core Version:    0.6.2
 */