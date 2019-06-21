package com.tencent.mm.plugin.performance.b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
  implements Application.ActivityLifecycleCallbacks
{
  private long pfX;

  public static int bZs()
  {
    int i = 0;
    AppMethodBeat.i(111085);
    Object localObject1 = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      localObject1 = getStringFromFile((String)localObject1).trim().split("\n");
      int j = localObject1.length;
      k = 0;
      if (k < j)
      {
        Object localObject2 = localObject1[k];
        if (((String)localObject2).startsWith("Threads"))
        {
          localObject2 = Pattern.compile("\\d+").matcher((CharSequence)localObject2);
          if (((Matcher)localObject2).find())
          {
            k = bo.ank(((Matcher)localObject2).group());
            AppMethodBeat.o(111085);
          }
        }
      }
      while (true)
      {
        return k;
        k++;
        break;
        ab.w("MicroMsg.ThreadWatchDog", "[getProcessThreadCount] Wrong!", new Object[] { localObject1[24] });
        k = bo.ank(localObject1[24].trim());
        AppMethodBeat.o(111085);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(111085);
        int k = i;
      }
    }
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(111086);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localBufferedReader = new java/io/BufferedReader;
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream);
      localBufferedReader.<init>(localInputStreamReader);
      try
      {
        while (true)
        {
          paramInputStream = localBufferedReader.readLine();
          if (paramInputStream == null)
            break;
          localStringBuilder.append(paramInputStream).append('\n');
        }
      }
      finally
      {
      }
      if (localBufferedReader != null)
        localBufferedReader.close();
      AppMethodBeat.o(111086);
      throw paramInputStream;
      localBufferedReader.close();
      paramInputStream = localStringBuilder.toString();
      AppMethodBeat.o(111086);
      return paramInputStream;
    }
    finally
    {
      while (true)
        BufferedReader localBufferedReader = null;
    }
  }

  public static int cy(List<b.a> paramList)
  {
    AppMethodBeat.i(138544);
    Object localObject1 = new HashMap();
    Object localObject2 = Looper.getMainLooper().getThread().getThreadGroup();
    Object localObject3 = new Thread[((ThreadGroup)localObject2).activeCount() * 2];
    int i = ((ThreadGroup)localObject2).enumerate((Thread[])localObject3);
    int j = 0;
    int k = 0;
    if (j < i)
    {
      localObject2 = localObject3[j].getName();
      if (bo.isNullOrNil((String)localObject2))
        break label225;
      localObject2 = ((String)localObject2).replaceAll("-?[0-9]\\d*", "?");
      if (((Map)localObject1).containsKey(localObject2))
      {
        ((Map)localObject1).put(localObject2, Integer.valueOf(((Integer)((Map)localObject1).get(localObject2)).intValue() + 1));
        label113: k++;
      }
    }
    label225: 
    while (true)
    {
      j++;
      break;
      ((Map)localObject1).put(localObject2, Integer.valueOf(1));
      break label113;
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        paramList.add(new b.a((String)((Map.Entry)localObject3).getKey(), ((Integer)((Map.Entry)localObject3).getValue()).intValue()));
      }
      Collections.sort(paramList, new b.1());
      AppMethodBeat.o(138544);
      return k;
    }
  }

  // ERROR //
  private static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: ldc 246
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 248	java/io/File
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 251	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: new 253	java/io/FileInputStream
    //   17: astore_0
    //   18: aload_0
    //   19: aload_1
    //   20: invokespecial 256	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   23: aload_0
    //   24: invokestatic 258	com/tencent/mm/plugin/performance/b/b:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   27: astore_1
    //   28: aload_0
    //   29: invokevirtual 259	java/io/FileInputStream:close	()V
    //   32: ldc 246
    //   34: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: aload_1
    //   38: areturn
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_0
    //   42: aload_0
    //   43: ifnull +7 -> 50
    //   46: aload_0
    //   47: invokevirtual 259	java/io/FileInputStream:close	()V
    //   50: ldc 246
    //   52: invokestatic 95	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aload_1
    //   56: athrow
    //   57: astore_1
    //   58: goto -16 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   14	23	39	finally
    //   23	28	57	finally
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
  }

  public final void onActivityPaused(Activity paramActivity)
  {
  }

  public final void onActivityResumed(Activity paramActivity)
  {
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
    AppMethodBeat.i(111084);
    int i;
    if (SystemClock.uptimeMillis() - this.pfX >= 10000L)
    {
      this.pfX = SystemClock.uptimeMillis();
      i = 1;
    }
    int j;
    while (true)
      label272: if (i != 0)
      {
        long l = SystemClock.uptimeMillis();
        LinkedList localLinkedList;
        try
        {
          localLinkedList = new java/util/LinkedList;
          localLinkedList.<init>();
          j = bZs();
          i = cy(localLinkedList);
          if (j <= 500)
            break label187;
          e.pXa.a(960L, 101L, 1L, true);
          paramActivity = new java/lang/RuntimeException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("MicroMsg.ThreadWatchDog");
          paramActivity.<init>(String.format("\nThreadOver[%s:%s]: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLinkedList.toString() }));
          AppMethodBeat.o(111084);
          throw paramActivity;
        }
        finally
        {
          ab.d("MicroMsg.ThreadWatchDog", "[wang] Cost:%s", new Object[] { Long.valueOf(SystemClock.uptimeMillis() - l) });
          AppMethodBeat.o(111084);
        }
        i = 0;
        continue;
        label187: if (j > 300)
        {
          e.pXa.X(16470, String.format("ThreadOver[%s:%s]: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLinkedList.toString() }));
          e.pXa.a(960L, 100L, 1L, true);
          if (i <= 500)
            break label387;
          e.pXa.a(960L, 104L, 1L, true);
          ab.w("MicroMsg.ThreadWatchDog", "[wang][%s:%s]:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localLinkedList.toString() });
          ab.d("MicroMsg.ThreadWatchDog", "[wang] Cost:%s", new Object[] { Long.valueOf(SystemClock.uptimeMillis() - l) });
          AppMethodBeat.o(111084);
        }
      }
    while (true)
    {
      return;
      if (j > 200)
      {
        e.pXa.a(960L, 102L, 1L, true);
        break;
      }
      if (j <= 150)
        break;
      e.pXa.a(960L, 103L, 1L, true);
      break;
      label387: if (i > 300)
      {
        e.pXa.a(960L, 105L, 1L, true);
        break label272;
      }
      if (i > 200)
      {
        e.pXa.a(960L, 106L, 1L, true);
        break label272;
      }
      if (i <= 150)
        break label272;
      e.pXa.a(960L, 107L, 1L, true);
      break label272;
      AppMethodBeat.o(111084);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.b.b
 * JD-Core Version:    0.6.2
 */