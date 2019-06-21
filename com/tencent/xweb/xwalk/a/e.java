package com.tencent.xweb.xwalk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xwalk.core.Log;

public final class e
{
  private static Map<String, c> ASJ;

  static
  {
    AppMethodBeat.i(4182);
    ASJ = new HashMap();
    AppMethodBeat.o(4182);
  }

  public static c avu(String paramString)
  {
    AppMethodBeat.i(4179);
    if (paramString.isEmpty())
    {
      paramString = null;
      AppMethodBeat.o(4179);
    }
    while (true)
    {
      return paramString;
      paramString = (c)ASJ.get(paramString);
      AppMethodBeat.o(4179);
    }
  }

  public static boolean dVP()
  {
    AppMethodBeat.i(4178);
    if (ASJ.size() == 0)
    {
      Log.i("XWalkPluginMgr", "initPlugins");
      Object localObject = new b();
      ASJ.put("FullScreenVideo", localObject);
      localObject = new a();
      ASJ.put("FileReader", localObject);
    }
    AppMethodBeat.o(4178);
    return true;
  }

  public static List<c> dVQ()
  {
    AppMethodBeat.i(4180);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ASJ.entrySet().iterator();
    while (localIterator.hasNext())
      localArrayList.add(((Map.Entry)localIterator.next()).getValue());
    AppMethodBeat.o(4180);
    return localArrayList;
  }

  public static String dVR()
  {
    AppMethodBeat.i(4181);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = ASJ.entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      c localc = (c)((Map.Entry)((Iterator)localObject).next()).getValue();
      if (localc != null)
        localStringBuilder.append(localc.dVM()).append(" = ").append(localc.ASG).append(", ");
    }
    localObject = localStringBuilder.toString();
    AppMethodBeat.o(4181);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.e
 * JD-Core Version:    0.6.2
 */