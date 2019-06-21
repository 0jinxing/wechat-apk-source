package com.google.android.gms.common.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapUtils
{
  public static <K, V> K getKeyFromMap(Map<K, V> paramMap, K paramK)
  {
    AppMethodBeat.i(90250);
    if (paramMap.containsKey(paramK))
    {
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramMap = localIterator.next();
        if (paramMap.equals(paramK))
          AppMethodBeat.o(90250);
      }
    }
    while (true)
    {
      return paramMap;
      paramMap = null;
      AppMethodBeat.o(90250);
    }
  }

  public static void writeStringMapToJson(StringBuilder paramStringBuilder, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(90249);
    paramStringBuilder.append("{");
    Iterator localIterator = paramHashMap.keySet().iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (i == 0)
        paramStringBuilder.append(",");
      String str2;
      while (true)
      {
        str2 = (String)paramHashMap.get(str1);
        paramStringBuilder.append("\"").append(str1).append("\":");
        if (str2 != null)
          break label103;
        paramStringBuilder.append("null");
        break;
        i = 0;
      }
      label103: paramStringBuilder.append("\"").append(str2).append("\"");
    }
    paramStringBuilder.append("}");
    AppMethodBeat.o(90249);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.MapUtils
 * JD-Core Version:    0.6.2
 */