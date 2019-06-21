package com.tencent.mm.plugin.performance.elf;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Debug;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractProcessChecker extends BroadcastReceiver
{
  private static HandlerThread pfg;
  boolean caA = true;
  ak pfh;
  a pfi = new a((byte)0);
  private long pfj = -1L;

  public AbstractProcessChecker()
  {
    HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("ProcessChecker");
    pfg = localHandlerThread;
    localHandlerThread.start();
    this.pfh = new ak(pfg.getLooper());
    int i;
    if (!com.tencent.mm.protocal.d.vxp)
    {
      long l = ah.doB().getLong("MicroMsg.AbstractProcessChecker", 0L);
      ab.i("MicroMsg.AbstractProcessChecker", "[updateProcessTime] last process durTime:%sms", new Object[] { Long.valueOf(l) });
      if (l > 0L)
      {
        if (ah.bqo())
        {
          i = (int)(l / 7200000L);
          if (i >= 36)
            e.pXa.a(959L, 46L, 1L, false);
        }
        else
        {
          i = (int)(l / 600000L);
          e.pXa.e(16338, new Object[] { ah.getProcessName(), Integer.valueOf(i), Integer.valueOf(1) });
        }
      }
      else
      {
        if (this.pfj < 0L)
        {
          this.pfj = System.currentTimeMillis();
          ah.doB().edit().putLong("MicroMsg.AbstractProcessChecker", 0L).commit();
        }
        this.pfh.postDelayed(new AbstractProcessChecker.2(this), 600000L);
      }
    }
    else
    {
      ((Application)ah.getContext()).registerActivityLifecycleCallbacks(this.pfi);
      if (ElfCallUpReceiver.pfn <= 0)
        break label286;
      eU(Process.myPid(), ElfCallUpReceiver.pfn);
    }
    while (true)
    {
      return;
      e.pXa.a(959L, i + 10, 1L, false);
      break;
      label286: ab.w(getTag(), "not processElf call up!");
    }
  }

  protected static int U(Map<String, Integer> paramMap)
  {
    Object localObject = Looper.getMainLooper().getThread().getThreadGroup();
    Thread[] arrayOfThread = new Thread[((ThreadGroup)localObject).activeCount() * 2];
    int i = ((ThreadGroup)localObject).enumerate(arrayOfThread);
    int j = 0;
    int k = 0;
    if (j < i)
    {
      localObject = arrayOfThread[j].getName();
      if (bo.isNullOrNil((String)localObject))
        break label125;
      localObject = ((String)localObject).replaceAll("-?[0-9]\\d*", "?");
      if (paramMap.containsKey(localObject))
      {
        paramMap.put(localObject, Integer.valueOf(((Integer)paramMap.get(localObject)).intValue() + 1));
        label98: k++;
      }
    }
    label125: 
    while (true)
    {
      j++;
      break;
      paramMap.put(localObject, Integer.valueOf(1));
      break label98;
      return k;
    }
  }

  private static String bZn()
  {
    String str1 = String.format("/proc/%s/status", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      String[] arrayOfString = getStringFromFile(str1).trim().split("\n");
      int i = arrayOfString.length;
      int j = 0;
      if (j < i)
      {
        str1 = arrayOfString[j];
        if (!str1.startsWith("VmSize"));
      }
      while (true)
      {
        return str1;
        j++;
        break;
        str1 = arrayOfString[12];
      }
    }
    catch (Exception localException)
    {
      while (true)
        String str2 = "";
    }
  }

  protected static long bZo()
  {
    String str = String.format("/proc/%s/schedstat", new Object[] { Integer.valueOf(Process.myPid()) });
    try
    {
      str = getStringFromFile(str);
      if (str == null);
      for (l = -1L; ; l = bo.anl(str.replaceAll("\n", "").split(" ")[2]))
        return l;
    }
    catch (Exception localException)
    {
      while (true)
        long l = -2L;
    }
  }

  private static String convertStreamToString(InputStream paramInputStream)
  {
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
      throw paramInputStream;
      localBufferedReader.close();
      return localStringBuilder.toString();
    }
    finally
    {
      while (true)
        BufferedReader localBufferedReader = null;
    }
  }

  public static String getProcessName()
  {
    return ah.getProcessName();
  }

  // ERROR //
  private static String getStringFromFile(String paramString)
  {
    // Byte code:
    //   0: new 336	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 339	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_0
    //   9: new 341	java/io/FileInputStream
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: invokespecial 344	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   18: aload_1
    //   19: invokestatic 346	com/tencent/mm/plugin/performance/elf/AbstractProcessChecker:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   22: astore_0
    //   23: aload_1
    //   24: invokevirtual 347	java/io/FileInputStream:close	()V
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +7 -> 40
    //   36: aload_1
    //   37: invokevirtual 347	java/io/FileInputStream:close	()V
    //   40: aload_0
    //   41: athrow
    //   42: astore_0
    //   43: goto -11 -> 32
    //
    // Exception table:
    //   from	to	target	type
    //   9	18	29	finally
    //   18	23	42	finally
  }

  private void jI(boolean paramBoolean)
  {
    ElfCheckResponse localElfCheckResponse = new ElfCheckResponse(isEnable(), bZm(), paramBoolean, bZj(), ah.getProcessName(), ElfCallUpReceiver.class.getName());
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("processId", Process.myPid());
    localElfCheckResponse.DA = ((Bundle)localObject);
    localObject = new Intent("ACTION_ELF_CHECK_RESPONSE");
    ((Intent)localObject).putExtra("MicroMsg.ElfCheckResponse", localElfCheckResponse);
    ah.getContext().sendBroadcast((Intent)localObject);
  }

  public static long zJ()
  {
    Matcher localMatcher = Pattern.compile("\\d+").matcher(bZn());
    if (localMatcher.find());
    for (long l = bo.ank(localMatcher.group()); ; l = -1L)
      return l;
  }

  protected abstract boolean Q(long paramLong1, long paramLong2);

  protected abstract void awE();

  protected boolean bZj()
  {
    return true;
  }

  protected final void bZk()
  {
    if ((!this.caA) && (!this.pfi.isResume))
    {
      jI(true);
      throw new RuntimeException(bZl());
    }
    ab.w("MicroMsg.AbstractProcessChecker", "pass this kill! app is on foreground!");
    e.pXa.a(959L, 6L, 1L, true);
    jI(false);
  }

  protected String bZl()
  {
    return String.format("ProcessEfl found exception!kill process[%s] %s %s %s", new Object[] { Integer.valueOf(Process.myPid()), Long.valueOf(zJ()), Long.valueOf(Debug.getNativeHeapSize()), Long.valueOf(Runtime.getRuntime().totalMemory()) });
  }

  protected abstract long bZm();

  protected final boolean bZp()
  {
    Iterator localIterator = ((ActivityManager)ah.getContext().getSystemService("activity")).getRunningServices(50).iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator.next();
      if (localRunningServiceInfo.foreground)
        ab.i(getTag(), "foreground service:%s process:%s ", new Object[] { localRunningServiceInfo.service, localRunningServiceInfo.process });
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected void eU(int paramInt1, int paramInt2)
  {
  }

  protected String getTag()
  {
    return "AbstractProcessChecker";
  }

  protected abstract boolean isEnable();

  public void jJ(boolean paramBoolean)
  {
    this.caA = paramBoolean;
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction() == "ACTION_ELF_CHECK")
      this.pfh.post(new AbstractProcessChecker.1(this, paramIntent));
    while (true)
    {
      return;
      if (paramIntent.getAction() == "android.intent.action.SCREEN_OFF")
        awE();
    }
  }

  protected void start()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("ACTION_ELF_CHECK");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    ah.getContext().registerReceiver(this, localIntentFilter);
  }

  final class a
    implements Application.ActivityLifecycleCallbacks
  {
    boolean isResume = true;
    String pfl = "";
    boolean pfm = false;

    private a()
    {
    }

    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      AppMethodBeat.i(111042);
      if (paramActivity.getClass().getSimpleName().endsWith("WeChatSplashActivity"))
      {
        this.pfm = true;
        ab.i(AbstractProcessChecker.this.getTag(), "WeChatSplashActivity was created!");
      }
      AppMethodBeat.o(111042);
    }

    public final void onActivityDestroyed(Activity paramActivity)
    {
    }

    public final void onActivityPaused(Activity paramActivity)
    {
      AppMethodBeat.i(111044);
      if (bo.isNullOrNil(this.pfl))
        this.pfl = paramActivity.getClass().getName();
      AppMethodBeat.o(111044);
    }

    public final void onActivityResumed(Activity paramActivity)
    {
      AppMethodBeat.i(111043);
      this.pfl = paramActivity.getClass().getName();
      this.isResume = true;
      AppMethodBeat.o(111043);
    }

    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
    }

    public final void onActivityStarted(Activity paramActivity)
    {
    }

    public final void onActivityStopped(Activity paramActivity)
    {
      AppMethodBeat.i(111045);
      if (bo.isNullOrNil(this.pfl))
        this.pfl = paramActivity.getClass().getName();
      this.isResume = false;
      AppMethodBeat.o(111045);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.AbstractProcessChecker
 * JD-Core Version:    0.6.2
 */