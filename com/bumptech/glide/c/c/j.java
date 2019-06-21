package com.bumptech.glide.c.c;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class j
  implements h
{
  private volatile Map<String, String> aEg;
  private final Map<String, List<i>> headers;

  j(Map<String, List<i>> paramMap)
  {
    AppMethodBeat.i(92080);
    this.headers = Collections.unmodifiableMap(paramMap);
    AppMethodBeat.o(92080);
  }

  private static String r(List<i> paramList)
  {
    AppMethodBeat.i(92082);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      String str = ((i)paramList.get(j)).nh();
      if (!TextUtils.isEmpty(str))
      {
        localStringBuilder.append(str);
        if (j != paramList.size() - 1)
          localStringBuilder.append(',');
      }
    }
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(92082);
    return paramList;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(92084);
    boolean bool;
    if ((paramObject instanceof j))
    {
      paramObject = (j)paramObject;
      bool = this.headers.equals(paramObject.headers);
      AppMethodBeat.o(92084);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92084);
    }
  }

  public final Map<String, String> getHeaders()
  {
    AppMethodBeat.i(92081);
    if (this.aEg == null)
    {
      HashMap localHashMap;
      try
      {
        if (this.aEg != null)
          break label121;
        localHashMap = new java/util/HashMap;
        localHashMap.<init>();
        Iterator localIterator = this.headers.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str = r((List)localEntry.getValue());
          if (!TextUtils.isEmpty(str))
            localHashMap.put(localEntry.getKey(), str);
        }
      }
      finally
      {
        AppMethodBeat.o(92081);
      }
      this.aEg = Collections.unmodifiableMap(localHashMap);
    }
    label121: Map localMap = this.aEg;
    AppMethodBeat.o(92081);
    return localMap;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(92085);
    int i = this.headers.hashCode();
    AppMethodBeat.o(92085);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(92083);
    String str = "LazyHeaders{headers=" + this.headers + '}';
    AppMethodBeat.o(92083);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.j
 * JD-Core Version:    0.6.2
 */