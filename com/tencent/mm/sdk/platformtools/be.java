package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class be
{
  public static String aS(Map<String, String> paramMap)
  {
    AppMethodBeat.i(52263);
    if (paramMap == null)
    {
      paramMap = null;
      AppMethodBeat.o(52263);
    }
    while (true)
    {
      return paramMap;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("~SEMI_XML~");
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Object localObject = (Map.Entry)paramMap.next();
        String str = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        if (localObject != null)
        {
          int i = str.length();
          int j = ((String)localObject).length();
          localStringBuilder.append((char)(i >> 16)).append((char)i).append(str);
          localStringBuilder.append((char)(j >> 16)).append((char)j).append((String)localObject);
        }
      }
      paramMap = localStringBuilder.toString();
      AppMethodBeat.o(52263);
    }
  }

  public static Map<String, String> amR(String paramString)
  {
    AppMethodBeat.i(52264);
    if ((paramString == null) || (!paramString.startsWith("~SEMI_XML~")))
    {
      paramString = null;
      AppMethodBeat.o(52264);
    }
    while (true)
    {
      return paramString;
      String str1 = paramString.substring(10);
      paramString = new HashMap();
      int i = str1.length();
      int j = 0;
      while (true)
        if (j < i - 4)
        {
          int k = j + 1;
          try
          {
            int m = str1.charAt(j);
            j = k + 1;
            k = (m << 16) + str1.charAt(k) + j;
            String str2 = str1.substring(j, k);
            j = k + 1;
            m = str1.charAt(k);
            k = j + 1;
            j = (m << 16) + str1.charAt(j) + k;
            paramString.put(str2, str1.substring(k, j));
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.SemiXml", localException, "", new Object[0]);
          }
        }
      AppMethodBeat.o(52264);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.be
 * JD-Core Version:    0.6.2
 */