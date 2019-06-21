package com.tencent.matrix.trace.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.matrix.d.c;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppMethodBeat
{
  public static final int METHOD_ID_DISPATCH = 1048574;
  private static final int METHOD_ID_MAX = 1048575;
  private static final int STATUS_DEFAULT = 2147483647;
  private static final int STATUS_EXPIRED_START = -2;
  private static final int STATUS_OUT_RELEASE = -3;
  private static final int STATUS_READY = 1;
  private static final int STATUS_STARTED = 2;
  private static final int STATUS_STOPPED = -1;
  private static final String TAG = "Matrix.AppMethodBeat";
  private static boolean assertIn;
  private static Runnable checkStartExpiredRunnable;
  private static boolean isPauseUpdateTime;
  private static HashSet<com.tencent.matrix.trace.e.a> listeners;
  private static long[] sBuffer;
  private static volatile long sCurrentDiffTime;
  private static volatile long sDiffTime;
  private static Set<String> sFocusActivitySet;
  private static String sFocusedActivity;
  private static Handler sHandler;
  private static int sIndex;
  private static a sIndexRecordHead = null;
  private static AppMethodBeat sInstance = new AppMethodBeat();
  private static int sLastIndex;
  private static Thread sMainThread;
  private static HandlerThread sTimerUpdateThread;
  private static Runnable sUpdateDiffTimeRunnable;
  private static volatile int status = 2147483647;
  private static Object statusLock = new Object();
  private static Object updateTimeLock;

  static
  {
    sBuffer = new long[1000000];
    sIndex = 0;
    sLastIndex = -1;
    assertIn = false;
    long l = SystemClock.uptimeMillis();
    sCurrentDiffTime = l;
    sDiffTime = l;
    sMainThread = Looper.getMainLooper().getThread();
    sTimerUpdateThread = com.tencent.matrix.d.b.cj("matrix_time_update_thread");
    sHandler = new Handler(sTimerUpdateThread.getLooper());
    sFocusActivitySet = new HashSet();
    sFocusedActivity = "default";
    listeners = new HashSet();
    updateTimeLock = new Object();
    isPauseUpdateTime = false;
    checkStartExpiredRunnable = null;
    sHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.access$000();
      }
    }
    , 15000L);
    sUpdateDiffTimeRunnable = new Runnable()
    {
      public final void run()
      {
        while (true)
        {
          try
          {
            if ((!AppMethodBeat.isPauseUpdateTime) && (AppMethodBeat.status >= 0))
            {
              AppMethodBeat.access$302(SystemClock.uptimeMillis() - AppMethodBeat.sDiffTime);
              SystemClock.sleep(5L);
              continue;
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            c.e("Matrix.AppMethodBeat", localInterruptedException.toString(), new Object[0]);
            return;
          }
          synchronized (AppMethodBeat.updateTimeLock)
          {
            AppMethodBeat.updateTimeLock.wait();
          }
        }
      }
    };
  }

  public static void at(Activity arg0, boolean paramBoolean)
  {
    String str = ???.getClass().getName();
    if (paramBoolean)
    {
      sFocusedActivity = str;
      if (sFocusActivitySet.add(str))
      {
        synchronized (listeners)
        {
          Iterator localIterator = listeners.iterator();
          if (localIterator.hasNext())
            ((com.tencent.matrix.trace.e.a)localIterator.next()).ch(str);
        }
        if (!paramBoolean)
          break label102;
        ??? = "attach";
        c.i("Matrix.AppMethodBeat", "[at] Activity[%s] has %s focus!", new Object[] { localObject, ??? });
      }
    }
    label102: 
    do
    {
      return;
      ??? = "detach";
      break;
      if (sFocusedActivity.equals(localObject))
        sFocusedActivity = "default";
    }
    while (!sFocusActivitySet.remove(localObject));
    if (paramBoolean);
    for (??? = "attach"; ; ??? = "detach")
    {
      c.i("Matrix.AppMethodBeat", "[at] Activity[%s] has %s focus!", new Object[] { localObject, ??? });
      break;
    }
  }

  private static void checkPileup(int paramInt)
  {
    a locala = sIndexRecordHead;
    while ((locala != null) && ((locala.index == paramInt) || ((locala.index == -1) && (sLastIndex == 999999))))
    {
      locala.bYN = false;
      c.w("Matrix.AppMethodBeat", "[checkPileup] %s", new Object[] { locala.toString() });
      locala = locala.bYM;
      sIndexRecordHead = locala;
    }
  }

  private static void dispatchBegin()
  {
    sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
    isPauseUpdateTime = false;
    synchronized (updateTimeLock)
    {
      updateTimeLock.notifyAll();
      return;
    }
  }

  private static void dispatchEnd()
  {
    isPauseUpdateTime = true;
  }

  public static long getDiffTime()
  {
    return sDiffTime;
  }

  public static String getFocusedActivity()
  {
    return sFocusedActivity;
  }

  public static AppMethodBeat getInstance()
  {
    return sInstance;
  }

  public static void i(int paramInt)
  {
    if (status < 0);
    while (paramInt >= 1048575)
      return;
    if (status == 2147483647);
    while (true)
    {
      synchronized (statusLock)
      {
        if (status == 2147483647)
        {
          realExecute();
          status = 1;
        }
        if ((Thread.currentThread() != sMainThread) || (assertIn))
          break;
        assertIn = true;
        if (sIndex < 1000000)
        {
          mergeData(paramInt, sIndex, true);
          sIndex += 1;
          assertIn = false;
        }
      }
      sIndex = -1;
    }
  }

  public static boolean isRealTrace()
  {
    if (status > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void mergeData(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    long l1 = 0L;
    if (paramBoolean)
      l1 = -9223372036854775808L;
    long l2 = paramInt1;
    long l3 = sCurrentDiffTime;
    sBuffer[paramInt2] = (l1 | l2 << 43 | l3 & 0xFFFFFFFF);
    checkPileup(paramInt2);
    sLastIndex = paramInt2;
  }

  public static void o(int paramInt)
  {
    if (status < 0)
      return;
    if ((paramInt < 1048575) && (Thread.currentThread() == sMainThread))
    {
      if (sIndex >= 1000000)
        break label49;
      mergeData(paramInt, sIndex, false);
    }
    while (true)
    {
      sIndex += 1;
      break;
      break;
      label49: sIndex = -1;
    }
  }

  private static void realExecute()
  {
    c.i("Matrix.AppMethodBeat", "[realExecute] timestamp:%s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    sCurrentDiffTime = SystemClock.uptimeMillis() - sDiffTime;
    sHandler.removeCallbacksAndMessages(null);
    sHandler.postDelayed(sUpdateDiffTimeRunnable, 5L);
    Handler localHandler = sHandler;
    Runnable local3 = new Runnable()
    {
      public final void run()
      {
        synchronized (AppMethodBeat.statusLock)
        {
          if ((AppMethodBeat.status == 2147483647) || (AppMethodBeat.status == 1))
            AppMethodBeat.access$202(-2);
          return;
        }
      }
    };
    checkStartExpiredRunnable = local3;
    localHandler.postDelayed(local3, 15000L);
    com.tencent.matrix.trace.c.a.zy();
    a.a(new a.a()
    {
      public final void dispatchEnd()
      {
        super.dispatchEnd();
        AppMethodBeat.access$800();
      }

      public final void dispatchStart()
      {
        super.dispatchStart();
        AppMethodBeat.access$700();
      }

      public final boolean isValid()
      {
        if (AppMethodBeat.status > 0);
        for (boolean bool = true; ; bool = false)
          return bool;
      }
    });
  }

  private static void realRelease()
  {
    synchronized (statusLock)
    {
      if (status == 2147483647)
      {
        c.i("Matrix.AppMethodBeat", "[realRelease] timestamp:%s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        sHandler.removeCallbacksAndMessages(null);
        sTimerUpdateThread.quit();
        sBuffer = null;
        status = -3;
      }
      return;
    }
  }

  private static <T> T reflectObject(Object paramObject, String paramString)
  {
    try
    {
      paramString = paramObject.getClass().getDeclaredField(paramString);
      paramString.setAccessible(true);
      paramObject = paramString.get(paramObject);
      return paramObject;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        c.e("Matrix.AppMethodBeat", paramObject.toString(), new Object[0]);
        paramObject = null;
      }
    }
  }

  public void addListener(com.tencent.matrix.trace.e.a parama)
  {
    synchronized (listeners)
    {
      listeners.add(parama);
      return;
    }
  }

  public long[] copyData(a parama)
  {
    return copyData(parama, new a(sIndex - 1));
  }

  public long[] copyData(a parama1, a parama2)
  {
    long l = System.currentTimeMillis();
    long[] arrayOfLong = new long[0];
    Object localObject1 = arrayOfLong;
    try
    {
      if (parama1.bYN)
      {
        localObject1 = arrayOfLong;
        if (parama2.bYN)
        {
          localObject1 = arrayOfLong;
          int i = Math.max(0, parama1.index);
          localObject1 = arrayOfLong;
          int j = Math.max(0, parama2.index);
          if (j > i)
          {
            j = j - i + 1;
            localObject1 = arrayOfLong;
            arrayOfLong = new long[j];
            localObject1 = arrayOfLong;
            System.arraycopy(sBuffer, i, arrayOfLong, 0, j);
            localObject1 = arrayOfLong;
          }
          while (true)
          {
            return localObject1;
            localObject1 = arrayOfLong;
            if (j < i)
            {
              localObject1 = arrayOfLong;
              arrayOfLong = new long[j + 1 + (sBuffer.length - i)];
              localObject1 = arrayOfLong;
              System.arraycopy(sBuffer, i, arrayOfLong, 0, sBuffer.length - i);
              localObject1 = arrayOfLong;
              System.arraycopy(sBuffer, 0, arrayOfLong, sBuffer.length - i, j + 1);
              localObject1 = arrayOfLong;
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        c.e("Matrix.AppMethodBeat", localException.toString(), new Object[0]);
        c.i("Matrix.AppMethodBeat", "[copyData] [%s:%s] cost:%sms", new Object[] { Integer.valueOf(Math.max(0, parama1.index)), Integer.valueOf(parama2.index), Long.valueOf(System.currentTimeMillis() - l) });
        continue;
        c.i("Matrix.AppMethodBeat", "[copyData] [%s:%s] cost:%sms", new Object[] { Integer.valueOf(Math.max(0, parama1.index)), Integer.valueOf(parama2.index), Long.valueOf(System.currentTimeMillis() - l) });
        localObject1 = localException;
      }
    }
    finally
    {
      c.i("Matrix.AppMethodBeat", "[copyData] [%s:%s] cost:%sms", new Object[] { Integer.valueOf(Math.max(0, parama1.index)), Integer.valueOf(parama2.index), Long.valueOf(System.currentTimeMillis() - l) });
    }
  }

  public boolean isAlive()
  {
    if (status >= 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public a maskIndex(String paramString)
  {
    Object localObject;
    if (sIndexRecordHead == null)
    {
      localObject = new a(sIndex - 1);
      sIndexRecordHead = (a)localObject;
      ((a)localObject).source = paramString;
      paramString = sIndexRecordHead;
    }
    while (true)
    {
      return paramString;
      a locala1 = new a(sIndex - 1);
      locala1.source = paramString;
      paramString = sIndexRecordHead;
      localObject = null;
      while (true)
      {
        if (paramString == null)
          break label129;
        if (locala1.index <= paramString.index)
        {
          if (localObject == null)
          {
            paramString = sIndexRecordHead;
            sIndexRecordHead = locala1;
            locala1.bYM = paramString;
            paramString = locala1;
            break;
          }
          paramString = ((a)localObject).bYM;
          ((a)localObject).bYM = locala1;
          locala1.bYM = paramString;
          paramString = locala1;
          break;
        }
        a locala2 = paramString.bYM;
        localObject = paramString;
        paramString = locala2;
      }
      label129: ((a)localObject).bYM = locala1;
      paramString = locala1;
    }
  }

  public void onStart()
  {
    synchronized (statusLock)
    {
      if ((status >= 2) || (status < -2))
        break label88;
      sHandler.removeCallbacks(checkStartExpiredRunnable);
      if (sBuffer == null)
      {
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localRuntimeException.<init>("Matrix.AppMethodBeat sBuffer == null");
        throw localRuntimeException;
      }
    }
    c.i("Matrix.AppMethodBeat", "[onStart] preStatus:%s", new Object[] { Integer.valueOf(status), com.tencent.matrix.trace.g.b.getStack() });
    status = 2;
    while (true)
    {
      return;
      label88: c.w("Matrix.AppMethodBeat", "[onStart] current status:%s", new Object[] { Integer.valueOf(status) });
    }
  }

  public void onStop()
  {
    synchronized (statusLock)
    {
      if (status == 2)
      {
        c.i("Matrix.AppMethodBeat", "[onStop] %s", new Object[] { com.tencent.matrix.trace.g.b.getStack() });
        status = -1;
        return;
      }
      c.w("Matrix.AppMethodBeat", "[onStop] current status:%s", new Object[] { Integer.valueOf(status) });
    }
  }

  public void printIndexRecord()
  {
    StringBuilder localStringBuilder = new StringBuilder(" \n");
    for (a locala = sIndexRecordHead; locala != null; locala = locala.bYM)
      localStringBuilder.append(locala).append("\n");
    c.i("Matrix.AppMethodBeat", "[printIndexRecord] %s", new Object[] { localStringBuilder.toString() });
  }

  public void removeListener(com.tencent.matrix.trace.e.a parama)
  {
    synchronized (listeners)
    {
      listeners.remove(parama);
      return;
    }
  }

  public static final class a
  {
    a bYM;
    public boolean bYN = true;
    public int index;
    public String source;

    public a()
    {
      this.bYN = false;
    }

    public a(int paramInt)
    {
      this.index = paramInt;
    }

    public final void release()
    {
      this.bYN = false;
      Object localObject1 = AppMethodBeat.sIndexRecordHead;
      Object localObject2 = null;
      while (true)
      {
        if (localObject1 != null)
        {
          if (localObject1 != this)
            break label49;
          if (localObject2 == null)
            break label38;
          localObject2.bYM = ((a)localObject1).bYM;
        }
        while (true)
        {
          ((a)localObject1).bYM = null;
          return;
          label38: AppMethodBeat.access$1002(((a)localObject1).bYM);
        }
        label49: a locala = ((a)localObject1).bYM;
        localObject2 = localObject1;
        localObject1 = locala;
      }
    }

    public final String toString()
    {
      return "index:" + this.index + ",\tisValid:" + this.bYN + " source:" + this.source;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.core.AppMethodBeat
 * JD-Core Version:    0.6.2
 */