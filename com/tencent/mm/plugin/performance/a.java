package com.tencent.mm.plugin.performance;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements Application.ActivityLifecycleCallbacks
{
  public static final a peX;
  public boolean aFV;
  public boolean caA;
  public Handler handler;
  private long mLastTime;
  HandlerThread oAl;
  public a.a peW;
  public volatile boolean peY;
  private HashMap<String, Long> peZ;
  private HashMap<Integer, Long> pfa;

  static
  {
    AppMethodBeat.i(111038);
    peX = new a();
    AppMethodBeat.o(111038);
  }

  private a()
  {
    AppMethodBeat.i(111024);
    this.oAl = new HandlerThread("PowerTest");
    this.peW = new a.a(this);
    this.peY = false;
    this.caA = false;
    this.peZ = new HashMap();
    this.pfa = new HashMap();
    AppMethodBeat.o(111024);
  }

  private static Set<a.c> AK(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(111030);
    HashSet localHashSet = new HashSet();
    String str = String.format("/proc/%s/task/", new Object[] { Integer.valueOf(paramInt) });
    Object localObject1 = new File(str);
    if (((File)localObject1).isDirectory())
    {
      localObject1 = ((File)localObject1).listFiles();
      if (localObject1 == null)
        AppMethodBeat.o(111030);
    }
    while (true)
    {
      return localHashSet;
      int j = localObject1.length;
      label74: Object localObject2;
      if (i < j)
        localObject2 = localObject1[i];
      try
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = getStringFromFile(str + ((File)localObject2).getName() + "/stat");
        if (localObject3 != null)
        {
          localObject2 = ((String)localObject3).replaceAll("\n", "").split(" ");
          localObject3 = new com/tencent/mm/plugin/performance/a$c;
          ((a.c)localObject3).<init>((byte)0);
          ((a.c)localObject3).tid = bo.ank(localObject2[0]);
          ((a.c)localObject3).name = localObject2[1].replace("(", "").replace(")", "");
          if (((a.c)localObject3).tid == paramInt)
            ((a.c)localObject3).name = "main";
          if (bo.isNullOrNil(((a.c)localObject3).name))
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("unKnow-");
            ((a.c)localObject3).name = ((a.c)localObject3).tid;
          }
          ((a.c)localObject3).pfd = eT(((a.c)localObject3).tid, paramInt);
          localHashSet.add(localObject3);
        }
        label270: i++;
        break label74;
        AppMethodBeat.o(111030);
      }
      catch (Exception localException)
      {
        break label270;
      }
    }
  }

  private List<a.c> a(int paramInt, a.b paramb, List<a.c> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(111028);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = AK(paramInt).iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      a.c localc = (a.c)localIterator.next();
      localObject = paramInt + "#" + localc.tid;
      if (!paramBoolean)
      {
        this.peZ.put(localObject, Long.valueOf(localc.pfd));
      }
      else
      {
        if (this.peZ.containsKey(localObject));
        for (long l = ((Long)this.peZ.get(localObject)).longValue(); ; l = 0L)
        {
          if ((l == 0L) && (localc.pfd > 0L))
            ab.w("MicroMsg.PowerTest", "[dumpThread] new Thread? %s", new Object[] { localc });
          localc.pfe = (localc.pfd - l);
          if (localc.pfe <= 0L)
            break;
          paramb.pff += localc.pfe;
          localLinkedList.add(localc);
          break;
        }
      }
    }
    Collections.sort(localLinkedList, new a.1(this));
    localIterator = localLinkedList.iterator();
    for (paramInt = 0; localIterator.hasNext(); paramInt++)
    {
      localObject = (a.c)localIterator.next();
      if (((float)((a.c)localObject).pfe >= (float)paramb.pff * 0.1F) && (paramInt < 12))
        paramList.add(localObject);
    }
    AppMethodBeat.o(111028);
    return paramList;
  }

  private static void a(long paramLong1, long paramLong2, HashMap<a.b, List<a.c>> paramHashMap)
  {
    AppMethodBeat.i(111026);
    StringBuilder localStringBuilder = new StringBuilder(" \n");
    localStringBuilder.append("********************************* PowerTest ******************************\n");
    localStringBuilder.append(String.format("during:%smin", new Object[] { Long.valueOf(paramLong2) })).append("    diff:").append(paramLong1).append(String.format("    average:%s/min", new Object[] { Long.valueOf(paramLong1 / paramLong2) })).append("\n");
    localStringBuilder.append("*****************************微信各进程耗电信息*****************************\n");
    paramHashMap = paramHashMap.entrySet().iterator();
    while (paramHashMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramHashMap.next();
      Object localObject2 = (a.b)((Map.Entry)localObject1).getKey();
      if (((a.b)localObject2).pff > 0L)
      {
        localStringBuilder.append("| *").append(((a.b)localObject2).toString()).append("\n");
        localObject1 = ((List)((Map.Entry)localObject1).getValue()).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a.c)((Iterator)localObject1).next();
          localStringBuilder.append("|    -> ").append(((a.c)localObject2).toString()).append("\n");
        }
      }
    }
    localStringBuilder.append("********************************************************************\n");
    ab.i("MicroMsg.PowerTest", localStringBuilder.toString());
    AppMethodBeat.o(111026);
  }

  private void a(Set<a.b> paramSet, boolean paramBoolean)
  {
    AppMethodBeat.i(111027);
    Iterator localIterator = g(paramSet).iterator();
    while (localIterator.hasNext())
    {
      a.b localb = (a.b)localIterator.next();
      if (paramBoolean)
      {
        if (this.pfa.containsKey(Integer.valueOf(localb.pid)));
        for (long l = ((Long)this.pfa.get(Integer.valueOf(localb.pid))).longValue(); ; l = 0L)
        {
          localb.pfe = (localb.pfd - l);
          paramSet.add(localb);
          break;
        }
      }
      this.pfa.put(Integer.valueOf(localb.pid), Long.valueOf(localb.pfd));
    }
    AppMethodBeat.o(111027);
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(111032);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localBufferedReader = new java/io/BufferedReader;
      InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
      localInputStreamReader.<init>(paramInputStream, "UTF-8");
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
      AppMethodBeat.o(111032);
      throw paramInputStream;
      localBufferedReader.close();
      paramInputStream = localStringBuilder.toString();
      AppMethodBeat.o(111032);
      return paramInputStream;
    }
    finally
    {
      while (true)
        BufferedReader localBufferedReader = null;
    }
  }

  private static long eT(int paramInt1, int paramInt2)
  {
    long l1 = -1L;
    AppMethodBeat.i(111031);
    Object localObject;
    if (paramInt1 == 0)
      localObject = String.format("/proc/%s/stat", new Object[] { Integer.valueOf(paramInt2) });
    try
    {
      localObject = getStringFromFile((String)localObject);
      if (localObject == null)
        AppMethodBeat.o(111031);
      while (true)
      {
        return l1;
        localObject = String.format("/proc/%s/task/%s/stat", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
        break;
        localObject = ((String)localObject).split(" ");
        long l2 = bo.anl(localObject[13]);
        long l3 = bo.anl(localObject[14]);
        long l4 = bo.anl(localObject[15]);
        long l5 = bo.anl(localObject[16]);
        l1 = l5 + (l2 + l3 + l4);
        AppMethodBeat.o(111031);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(111031);
    }
  }

  private static Set<a.b> g(Set<a.b> paramSet)
  {
    int i = 0;
    AppMethodBeat.i(111029);
    Object localObject1 = new File("/proc/");
    if (((File)localObject1).isDirectory())
    {
      localObject1 = ((File)localObject1).listFiles();
      if (localObject1 == null)
        AppMethodBeat.o(111029);
    }
    while (true)
    {
      return paramSet;
      int j = localObject1.length;
      label46: Object localObject2;
      if (i < j)
        localObject2 = localObject1[i];
      try
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = getStringFromFile("/proc/" + localObject2.getName() + "/stat");
        if (str != null)
        {
          localObject3 = str.replaceAll("\n", "").split(" ");
          a.b localb = new com/tencent/mm/plugin/performance/a$b;
          localb.<init>((byte)0);
          localb.pid = bo.ank(localObject3[0]);
          localb.name = localObject3[1].replace("(", "").replace(")", "");
          if ((localb.name.contains("ncent.mm")) || (localb.name.contains(".mm:")))
          {
            localb.pfd = eT(0, localb.pid);
            paramSet.add(localb);
            ab.i("MicroMsg.PowerTest", "[getAllSelfProcess] file:%s content:%s", new Object[] { localObject2.getName(), str });
          }
        }
        label239: i++;
        break label46;
        AppMethodBeat.o(111029);
      }
      catch (Exception localException)
      {
        break label239;
      }
    }
  }

  // ERROR //
  private static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: ldc_w 444
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 100	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 101	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_1
    //   15: new 446	java/io/FileInputStream
    //   18: astore_0
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 449	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   24: aload_0
    //   25: invokestatic 451	com/tencent/mm/plugin/performance/a:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   28: astore_1
    //   29: aload_0
    //   30: invokevirtual 452	java/io/FileInputStream:close	()V
    //   33: ldc_w 444
    //   36: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aload_1
    //   40: areturn
    //   41: astore_1
    //   42: aconst_null
    //   43: astore_0
    //   44: aload_0
    //   45: ifnull +7 -> 52
    //   48: aload_0
    //   49: invokevirtual 452	java/io/FileInputStream:close	()V
    //   52: ldc_w 444
    //   55: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: athrow
    //   60: astore_1
    //   61: goto -17 -> 44
    //
    // Exception table:
    //   from	to	target	type
    //   15	24	41	finally
    //   24	29	60	finally
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
    AppMethodBeat.i(111025);
    if (this.caA)
      AppMethodBeat.o(111025);
    while (true)
    {
      return;
      ab.i("MicroMsg.PowerTest", "come back Foreground! isHasRunAtBackground:%s", new Object[] { Boolean.valueOf(this.peY) });
      this.handler.removeCallbacks(this.peW);
      if ((this.peY) && (!this.peW.pfc))
      {
        this.peW.pfc = true;
        this.handler.post(this.peW);
      }
      AppMethodBeat.o(111025);
    }
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.a
 * JD-Core Version:    0.6.2
 */