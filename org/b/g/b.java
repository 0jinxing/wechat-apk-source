package org.b.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public static <K, V> String x(Map<K, V> paramMap)
  {
    AppMethodBeat.i(77305);
    if (paramMap == null)
    {
      paramMap = "";
      AppMethodBeat.o(77305);
    }
    while (true)
    {
      return paramMap;
      if (!paramMap.isEmpty())
        break;
      paramMap = "{}";
      AppMethodBeat.o(77305);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (true)
    {
      if (!localIterator.hasNext())
      {
        paramMap = "{" + localStringBuilder.substring(1) + "}";
        AppMethodBeat.o(77305);
        break;
      }
      paramMap = (Map.Entry)localIterator.next();
      localStringBuilder.append(String.format(", %s -> %s ", new Object[] { paramMap.getKey().toString(), paramMap.getValue().toString() }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     org.b.g.b
 * JD-Core Version:    0.6.2
 */