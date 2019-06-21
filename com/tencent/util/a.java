package com.tencent.util;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a
{
  private static int COUNT;
  private static final String TAG;
  private static Map<String, Long> startTimeMap;
  private static Map<String, List<Long>> totalTimeMap;

  static
  {
    AppMethodBeat.i(86572);
    TAG = a.class.getSimpleName();
    startTimeMap = new HashMap();
    totalTimeMap = new HashMap();
    COUNT = 10;
    AppMethodBeat.o(86572);
  }

  public static void auz(String paramString)
  {
    AppMethodBeat.i(86570);
    if ((TextUtils.isEmpty(paramString)) || (startTimeMap.get(paramString) == null))
    {
      AppMethodBeat.o(86570);
      return;
    }
    Object localObject = (List)totalTimeMap.get(paramString);
    if (localObject == null)
    {
      localObject = new ArrayList();
      totalTimeMap.put(paramString, localObject);
    }
    while (true)
    {
      ((List)localObject).add(Long.valueOf(System.currentTimeMillis() - ((Long)startTimeMap.get(paramString)).longValue()));
      if (((List)localObject).size() >= COUNT)
      {
        new StringBuilder("[time]").append(paramString).append(": ").append(getTotalTime((List)localObject) / ((List)localObject).size()).append("ms");
        ((List)localObject).clear();
      }
      AppMethodBeat.o(86570);
      break;
    }
  }

  public static void benchStart(String paramString)
  {
    AppMethodBeat.i(86569);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(86569);
    while (true)
    {
      return;
      startTimeMap.put(paramString, Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(86569);
    }
  }

  private static long getTotalTime(List<Long> paramList)
  {
    long l = 0L;
    AppMethodBeat.i(86571);
    if (paramList == null)
      AppMethodBeat.o(86571);
    while (true)
    {
      return l;
      paramList = paramList.iterator();
      for (l = 0L; paramList.hasNext(); l = ((Long)paramList.next()).longValue() + l);
      AppMethodBeat.o(86571);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.util.a
 * JD-Core Version:    0.6.2
 */