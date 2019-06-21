package com.tencent.mm.performance.a;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  implements Application.ActivityLifecycleCallbacks, Runnable
{
  private static final a gfY;
  private volatile String activity;
  public boolean caA = true;
  private boolean gfZ = true;
  private int gga = 0;
  public int ggb;
  public int ggc;
  private long ggd = 0L;
  private boolean gge = false;

  static
  {
    AppMethodBeat.i(76881);
    gfY = new a();
    AppMethodBeat.o(76881);
  }

  private boolean anA()
  {
    AppMethodBeat.i(76877);
    long l = SystemClock.uptimeMillis();
    if (l - this.ggd > 5000L);
    for (boolean bool = true; ; bool = false)
    {
      this.ggd = l;
      AppMethodBeat.o(76877);
      return bool;
    }
  }

  public static a any()
  {
    return gfY;
  }

  private void anz()
  {
    AppMethodBeat.i(76873);
    d.xDG.execute(new a.1(this));
    AppMethodBeat.o(76873);
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(76875);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
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
        paramInputStream = localBufferedReader;
      }
      if (paramInputStream != null)
        paramInputStream.close();
      AppMethodBeat.o(76875);
      throw localObject1;
      localBufferedReader.close();
      paramInputStream = localObject1.toString();
      AppMethodBeat.o(76875);
      return paramInputStream;
    }
    finally
    {
      while (true)
        paramInputStream = null;
    }
  }

  // ERROR //
  private static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: ldc 122
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 124	java/io/File
    //   8: dup
    //   9: aload_0
    //   10: invokespecial 127	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: new 129	java/io/FileInputStream
    //   17: astore_0
    //   18: aload_0
    //   19: aload_1
    //   20: invokespecial 132	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   23: aload_0
    //   24: invokestatic 134	com/tencent/mm/performance/a/a:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   27: astore_1
    //   28: aload_0
    //   29: invokevirtual 135	java/io/FileInputStream:close	()V
    //   32: ldc 122
    //   34: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: aload_1
    //   38: areturn
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_0
    //   42: aload_0
    //   43: ifnull +7 -> 50
    //   46: aload_0
    //   47: invokevirtual 135	java/io/FileInputStream:close	()V
    //   50: ldc 122
    //   52: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
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

  private static String getVmSize()
  {
    AppMethodBeat.i(76874);
    String str1 = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      String[] arrayOfString = getStringFromFile(str1).trim().split("\n");
      int i = arrayOfString.length;
      int j = 0;
      if (j < i)
      {
        str1 = arrayOfString[j];
        boolean bool = str1.startsWith("VmSize");
        if (bool)
          AppMethodBeat.o(76874);
      }
      while (true)
      {
        return str1;
        j++;
        break;
        ab.w("MicroMsg.MemoryWatchDog", "[getVmSize] Wrong!", new Object[] { arrayOfString[12] });
        str1 = arrayOfString[12];
        AppMethodBeat.o(76874);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(76874);
      }
    }
  }

  public final a df(boolean paramBoolean)
  {
    AppMethodBeat.i(76872);
    long l = System.currentTimeMillis();
    a locala = new a();
    if (this.activity != null)
      locala.activity = this.activity;
    locala.ggn = this.ggb;
    locala.ggo = this.ggc;
    try
    {
      if ((Build.VERSION.SDK_INT >= 23) && (paramBoolean))
      {
        localObject1 = new android/os/Debug$MemoryInfo;
        ((Debug.MemoryInfo)localObject1).<init>();
        Debug.getMemoryInfo((Debug.MemoryInfo)localObject1);
        locala.map = ((Debug.MemoryInfo)localObject1).getMemoryStats();
      }
      Object localObject1 = Pattern.compile("\\d+").matcher(getVmSize());
      if (((Matcher)localObject1).find())
        locala.ggg = bo.ank(((Matcher)localObject1).group());
      locala.ggh = Debug.getNativeHeapSize();
      locala.ggi = Debug.getNativeHeapAllocatedSize();
      locala.ggj = Debug.getNativeHeapFreeSize();
      locala.ggk = Runtime.getRuntime().totalMemory();
      locala.ggl = Runtime.getRuntime().freeMemory();
      locala.ggm = Runtime.getRuntime().maxMemory();
      return locala;
    }
    finally
    {
      locala.ggp = (System.currentTimeMillis() - l);
      if ((locala.ggp > 30L) && (this.gfZ))
      {
        this.gga += 1;
        if (this.gga > 10)
          this.gfZ = false;
      }
      AppMethodBeat.o(76872);
    }
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
    AppMethodBeat.i(76878);
    this.activity = paramActivity.getClass().getSimpleName();
    if (anA())
      if (this.gfZ)
      {
        ab.i("MicroMsg.MemoryWatchDog", "[onActivityResumed] activity:%s %s", new Object[] { this.activity, df(false) });
        AppMethodBeat.o(76878);
      }
    while (true)
    {
      return;
      anz();
      AppMethodBeat.o(76878);
    }
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
    AppMethodBeat.i(76879);
    if (anA())
      if (this.gfZ)
      {
        ab.i("MicroMsg.MemoryWatchDog", "[onActivityStopped] activity:%s %s", new Object[] { paramActivity.getClass().getSimpleName(), df(false) });
        AppMethodBeat.o(76879);
      }
    while (true)
    {
      return;
      anz();
      AppMethodBeat.o(76879);
    }
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(76880);
    Object localObject1 = df(true);
    ab.i("MicroMsg.MemoryWatchDog", "[AutoCheck] %s", new Object[] { localObject1 });
    Object localObject2 = new ArrayList();
    Object localObject3 = new IDKey();
    ((IDKey)localObject3).SetID(959);
    ((IDKey)localObject3).SetValue(1L);
    if (((a)localObject1).ggk - ((a)localObject1).ggl < 104857600L)
    {
      ((IDKey)localObject3).SetKey(120);
      ((ArrayList)localObject2).add(localObject3);
      localObject3 = new IDKey();
      ((IDKey)localObject3).SetID(959);
      ((IDKey)localObject3).SetValue(1L);
      if (((a)localObject1).ggi >= 104857600L)
        break label706;
      ((IDKey)localObject3).SetKey(131);
      label133: ((ArrayList)localObject2).add(localObject3);
      localObject3 = new IDKey();
      ((IDKey)localObject3).SetID(959);
      ((IDKey)localObject3).SetValue(1L);
      if (((a)localObject1).ggg >= 2097152)
        break label871;
      ((IDKey)localObject3).SetKey(142);
      label181: ((ArrayList)localObject2).add(localObject3);
      localObject3 = new IDKey();
      ((IDKey)localObject3).SetID(959);
      ((IDKey)localObject3).SetValue(1L);
      ((IDKey)localObject3).SetKey(151);
      ((ArrayList)localObject2).add(localObject3);
      com.tencent.mm.plugin.report.e.pXa.b((ArrayList)localObject2, false);
      int j = Integer.decode(f.CLIENT_VERSION).intValue();
      int k = i;
      if ((j & 0xFF) >= 48)
      {
        k = i;
        if ((j & 0xFF) <= 95)
          k = 1;
      }
      if ((k == 0) && (!this.gge) && (((a)localObject1).ggg > 3984588.8F))
      {
        com.tencent.mm.plugin.report.e.pXa.g("MicroMsg.MemoryWatchDog", ((a)localObject1).toString(), null);
        localObject3 = com.tencent.mm.plugin.report.e.pXa;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("| Activity:\t ").append(((a)localObject1).activity).append("\n| VmSize:\t ").append(((a)localObject1).ggg).append("kB\n| Dalvik:\t memClass=").append(((a)localObject1).ggn).append(", memLargeClass=").append(((a)localObject1).ggo).append("b, TalMemory=").append(((a)localObject1).ggk).append("b, FreeMemory=").append(((a)localObject1).ggl).append("b, MaxMemory=").append(((a)localObject1).ggm).append("b\n| NATIVE:\t HeapSize=").append(((a)localObject1).ggh).append("b, AllocatedSize=").append(((a)localObject1).ggi).append("b, FreeSize=").append(((a)localObject1).ggj).append("b\n");
        ((com.tencent.mm.plugin.report.e)localObject3).X(17068, ((StringBuilder)localObject2).toString());
        this.gge = true;
      }
      localObject1 = d.xDG;
      if (!this.caA)
        break label997;
    }
    label706: label997: for (long l = 300000L; ; l = 1800000L)
    {
      ((com.tencent.mm.sdk.g.a.e)localObject1).p(this, l);
      AppMethodBeat.o(76880);
      return;
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 209715200L)
      {
        ((IDKey)localObject3).SetKey(121);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 314572800L)
      {
        ((IDKey)localObject3).SetKey(122);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 419430400L)
      {
        ((IDKey)localObject3).SetKey(123);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 524288000L)
      {
        ((IDKey)localObject3).SetKey(124);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 629145600L)
      {
        ((IDKey)localObject3).SetKey(125);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 734003200L)
      {
        ((IDKey)localObject3).SetKey(126);
        break;
      }
      if (((a)localObject1).ggk - ((a)localObject1).ggl < 838860800L)
      {
        ((IDKey)localObject3).SetKey(127);
        break;
      }
      ((IDKey)localObject3).SetKey(128);
      break;
      if (((a)localObject1).ggi < 209715200L)
      {
        ((IDKey)localObject3).SetKey(132);
        break label133;
      }
      if (((a)localObject1).ggi < 314572800L)
      {
        ((IDKey)localObject3).SetKey(133);
        break label133;
      }
      if (((a)localObject1).ggi < 419430400L)
      {
        ((IDKey)localObject3).SetKey(134);
        break label133;
      }
      if (((a)localObject1).ggi < 524288000L)
      {
        ((IDKey)localObject3).SetKey(135);
        break label133;
      }
      if (((a)localObject1).ggi < 629145600L)
      {
        ((IDKey)localObject3).SetKey(136);
        break label133;
      }
      if (((a)localObject1).ggi < 734003200L)
      {
        ((IDKey)localObject3).SetKey(137);
        break label133;
      }
      if (((a)localObject1).ggi < 838860800L)
      {
        ((IDKey)localObject3).SetKey(138);
        break label133;
      }
      ((IDKey)localObject3).SetKey(139);
      break label133;
      label871: if (((a)localObject1).ggg < 2516582.5F)
      {
        ((IDKey)localObject3).SetKey(143);
        break label181;
      }
      if (((a)localObject1).ggg < 2936012.8F)
      {
        ((IDKey)localObject3).SetKey(144);
        break label181;
      }
      if (((a)localObject1).ggg < 3145728.0F)
      {
        ((IDKey)localObject3).SetKey(145);
        break label181;
      }
      if (((a)localObject1).ggg < 3565158.5F)
      {
        ((IDKey)localObject3).SetKey(146);
        break label181;
      }
      if (((a)localObject1).ggg < 3984588.8F)
      {
        ((IDKey)localObject3).SetKey(147);
        break label181;
      }
      ((IDKey)localObject3).SetKey(148);
      break label181;
    }
  }

  public static final class a
  {
    String activity;
    int ggg;
    long ggh;
    long ggi;
    long ggj;
    long ggk;
    long ggl;
    long ggm;
    long ggn;
    long ggo;
    long ggp;
    long ggq;
    Map<String, String> map;

    public a()
    {
      AppMethodBeat.i(76869);
      this.activity = "default";
      this.ggq = Thread.currentThread().getId();
      AppMethodBeat.o(76869);
    }

    private static String q(Map<String, String> paramMap)
    {
      AppMethodBeat.i(76871);
      if (paramMap == null)
      {
        paramMap = "null";
        AppMethodBeat.o(76871);
      }
      while (true)
      {
        return paramMap;
        StringBuilder localStringBuilder = new StringBuilder();
        paramMap = paramMap.entrySet().iterator();
        while (paramMap.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)paramMap.next();
          if ((!((String)localEntry.getKey()).equals("java-heap")) && (!((String)localEntry.getKey()).equals("native-heap")))
            localStringBuilder.append(((String)localEntry.getKey()).replaceFirst("summary.", "")).append("=").append((String)localEntry.getValue()).append(", ");
        }
        localStringBuilder.delete(localStringBuilder.length() - 2, localStringBuilder.length());
        paramMap = localStringBuilder.toString();
        AppMethodBeat.o(76871);
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(76870);
      Object localObject = new StringBuilder(" \n");
      ((StringBuilder)localObject).append(String.format(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemoryInfo(%s) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", new Object[] { Long.valueOf(this.ggq) })).append("\n| Activity:\t ").append(this.activity).append("\n| VmSize:\t ").append(this.ggg).append("kB\n| Dalvik:\t memClass=").append(this.ggn).append(", memLargeClass=").append(this.ggo).append("b, TalMemory=").append(this.ggk).append("b, FreeMemory=").append(this.ggl).append("b, MaxMemory=").append(this.ggm).append("b\n| NATIVE:\t HeapSize=").append(this.ggh).append("b, AllocatedSize=").append(this.ggi).append("b, FreeSize=").append(this.ggj).append("b\n| Stats:\t ").append(q(this.map)).append("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> END(cost:").append(this.ggp).append("ms) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(76870);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.a.a
 * JD-Core Version:    0.6.2
 */