package com.tencent.mm.bs;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static boolean f(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(79961);
    if (paramContext == null)
      AppMethodBeat.o(79961);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      Map localMap = fW(paramContext);
      for (int i = 0; i < 9; i++)
      {
        String str = paramArrayOfString[i];
        paramContext = (Integer)localMap.get(str);
        if (paramContext != null)
        {
          ab.i("MicroMsg.ProcessOperator", "killProcess(pid : %s, process : %s)", new Object[] { paramContext, str });
          Process.killProcess(paramContext.intValue());
        }
      }
      AppMethodBeat.o(79961);
    }
  }

  private static Map<String, Integer> fW(Context paramContext)
  {
    AppMethodBeat.i(79960);
    HashMap localHashMap = new HashMap();
    if (paramContext != null)
      try
      {
        Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (localIterator.hasNext())
        {
          paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          localHashMap.put(paramContext.processName, Integer.valueOf(paramContext.pid));
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.ProcessOperator", paramContext, "", new Object[0]);
      }
    AppMethodBeat.o(79960);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bs.a
 * JD-Core Version:    0.6.2
 */