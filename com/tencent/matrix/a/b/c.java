package com.tencent.matrix.a.b;

import android.app.AlarmManager.OnAlarmListener;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.WorkSource;
import com.tencent.matrix.c.c.a;
import java.util.List;
import java.util.Map;

public final class c
  implements b.c, e.b, c.a
{
  private final com.tencent.matrix.a.a.a bUD;
  final d bVj;
  private final com.tencent.matrix.a.a bVk;
  f bVl;
  a bVm;
  final Context mContext;
  private boolean mIsStart;

  public c(com.tencent.matrix.a.a parama)
  {
    this.bUD = parama.bUD;
    this.bVj = new d();
    this.bVk = parama;
    this.mContext = parama.getApplication();
  }

  private void a(com.tencent.matrix.a.a.a parama)
  {
    if (parama == null)
      throw new RuntimeException("batteryConfig is null");
    if (parama.yL())
    {
      this.bVl = new f(this, parama, new f.a()
      {
        public final void e(Runnable paramAnonymousRunnable, long paramAnonymousLong)
        {
          c.this.bVj.mDetectHandler.postDelayed(paramAnonymousRunnable, paramAnonymousLong);
        }

        public final boolean isScreenOn()
        {
          return ((PowerManager)c.this.mContext.getSystemService("power")).isScreenOn();
        }
      });
      e.a(this);
    }
    if (parama.yM())
    {
      this.bVm = new a(this, this.bUD);
      this.bVj.j(new Runnable()
      {
        public final void run()
        {
          c.this.bVm.yP();
        }
      });
      b.a(this);
    }
  }

  public final void a(final int paramInt1, final long paramLong1, long paramLong2, final long paramLong3, int paramInt2, final PendingIntent paramPendingIntent, AlarmManager.OnAlarmListener paramOnAlarmListener)
  {
    if (this.bVm == null);
    while (true)
    {
      return;
      paramPendingIntent = new Runnable()
      {
        public final void run()
        {
          a locala = c.this.bVm;
          int i = paramInt1;
          long l1 = paramLong1;
          long l2 = paramLong3;
          long l3 = paramPendingIntent;
          int j = this.bVn;
          PendingIntent localPendingIntent = this.bVz;
          Object localObject = this.bVA;
          String str1 = this.bVr;
          a.b localb;
          String str2;
          int k;
          if (locala.bUK != null)
          {
            localb = locala.bUK;
            str2 = com.tencent.matrix.d.d.formatTime("yyyy-MM-dd HH:mm", System.currentTimeMillis());
            if (localPendingIntent != null)
              break label241;
            k = -1;
          }
          while (true)
          {
            int m;
            if (localObject == null)
              m = -1;
            try
            {
              while (true)
              {
                str2 = String.format("%s onAlarmSet type:%d triggerAtMillis:%d windowMillis:%d intervalMillis:%d flags:%d operationInfo:%s operationHashCode:%d onAlarmListener:%s onAlarmListenerHashCode:%d\n%s\n\n", new Object[] { str2, Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(j), localPendingIntent, Integer.valueOf(k), localObject, Integer.valueOf(m), str1 });
                localb.cc(str2);
                localObject = new a.a(i, l1, l3, localPendingIntent, (AlarmManager.OnAlarmListener)localObject, str1);
                locala.a(((a.a)localObject).bUQ, ((a.a)localObject).bUP);
                locala.bUL.add(localObject);
                locala.yP();
                return;
                label241: k = localPendingIntent.hashCode();
                break;
                m = localObject.hashCode();
              }
            }
            catch (ClassCastException localClassCastException)
            {
              while (true)
                com.tencent.matrix.d.c.e("MicroMsg.AlarmDetector", localClassCastException.toString(), new Object[0]);
            }
          }
        }
      };
      this.bVj.j(paramPendingIntent);
    }
  }

  public final void a(final PendingIntent paramPendingIntent, final AlarmManager.OnAlarmListener paramOnAlarmListener)
  {
    paramPendingIntent = new Runnable()
    {
      public final void run()
      {
        int i = -1;
        a locala = c.this.bVm;
        PendingIntent localPendingIntent = paramPendingIntent;
        AlarmManager.OnAlarmListener localOnAlarmListener = paramOnAlarmListener;
        String str1 = this.bVr;
        a.b localb;
        String str2;
        int j;
        if (locala.bUK != null)
        {
          localb = locala.bUK;
          str2 = com.tencent.matrix.d.d.formatTime("yyyy-MM-dd HH:mm", System.currentTimeMillis());
          if (localPendingIntent != null)
            break label134;
          j = -1;
        }
        while (true)
        {
          if (localOnAlarmListener == null);
          try
          {
            while (true)
            {
              str1 = String.format("%s onAlarmRemove operationInfo:%s operationHashCode:%d onAlarmListener:%s onAlarmListenerHashCode:%d\n%s\n\n", new Object[] { str2, localPendingIntent, Integer.valueOf(j), localOnAlarmListener, Integer.valueOf(i), str1 });
              localb.cc(str1);
              locala.a(localOnAlarmListener, new a.e(localPendingIntent));
              locala.yP();
              return;
              label134: j = localPendingIntent.hashCode();
              break;
              i = localOnAlarmListener.hashCode();
            }
          }
          catch (ClassCastException localClassCastException)
          {
            while (true)
              com.tencent.matrix.d.c.e("MicroMsg.AlarmDetector", localClassCastException.toString(), new Object[0]);
          }
        }
      }
    };
    this.bVj.j(paramPendingIntent);
  }

  public final void a(final IBinder paramIBinder, final int paramInt)
  {
    if (this.bVl == null);
    while (true)
    {
      return;
      paramIBinder = new Runnable()
      {
        public final void run()
        {
          int i = 1;
          f localf = c.this.bVl;
          IBinder localIBinder = paramIBinder;
          int j = paramInt;
          long l = this.bVu;
          com.tencent.matrix.d.c.i("Matrix.WakeLockDetector", "onReleaseWakeLock token:%s", new Object[] { localIBinder });
          Object localObject;
          if (localf.bVK != null)
          {
            localObject = localf.bVK;
            str1 = localIBinder.toString();
            String str2 = com.tencent.matrix.d.d.formatTime("yyyy-MM-dd HH:mm", l);
            ((f.e)localObject).bVZ.append(str2).append(" onReleaseWakeLock token:").append(str1).append(" flags:").append(j).append("\n\n");
            ((f.e)localObject).bVY += 1;
            ((f.e)localObject).yY();
          }
          String str1 = localIBinder.toString();
          if (localf.bVD.containsKey(str1))
          {
            localObject = ((f.d)localf.bVD.get(str1)).tag;
            if (localf.bVE.containsKey(localObject))
            {
              localObject = (f.c)localf.bVE.get(localObject);
              ((f.c)localObject).yX();
              ((f.c)localObject).bVT.remove(str1);
              if (((f.c)localObject).bVT.isEmpty())
                break label252;
              if (i == 0)
                ((f.c)localObject).bVU = -1L;
            }
          }
          while (true)
          {
            localf.yU();
            localf.bVD.remove(str1);
            return;
            label252: i = 0;
            break;
            com.tencent.matrix.d.c.i("Matrix.WakeLockDetector", "onReleaseWakeLock not in mWakeLockInfoMap: %s", new Object[] { str1 });
          }
        }
      };
      this.bVj.j(paramIBinder);
    }
  }

  public final void a(final IBinder paramIBinder, final int paramInt, final String paramString1, final String paramString2, final WorkSource paramWorkSource, final String paramString3)
  {
    if (this.bVl == null);
    while (true)
    {
      return;
      paramIBinder = new Runnable()
      {
        public final void run()
        {
          f localf = c.this.bVl;
          IBinder localIBinder = paramIBinder;
          int i = paramInt;
          String str1 = paramString1;
          String str2 = this.bVr;
          long l = this.bVs;
          com.tencent.matrix.d.c.i("Matrix.WakeLockDetector", "onAcquireWakeLock token:%s tag:%s", new Object[] { localIBinder, str1 });
          Object localObject2;
          if (localf.bVK != null)
          {
            localObject1 = localf.bVK;
            localObject2 = localIBinder.toString();
            String str3 = com.tencent.matrix.d.d.formatTime("yyyy-MM-dd HH:mm", l);
            ((f.e)localObject1).bVZ.append(str3).append(" onAcquireWakeLock token:").append((String)localObject2).append(" flags:").append(i).append(" tag:").append(str1).append('\n').append(str2).append('\n');
            ((f.e)localObject1).bVY += 1;
            ((f.e)localObject1).yY();
          }
          Object localObject1 = localIBinder.toString();
          if (!localf.bVD.containsKey(localObject1))
          {
            localObject2 = new f.d((String)localObject1, str1, i, l);
            localf.bVD.put(localObject1, localObject2);
          }
          while (true)
          {
            ((f.d)localObject2).bVS.cd(str2);
            if (!localf.bVE.containsKey(str1))
              localf.bVE.put(str1, new f.c(str1));
            localObject2 = (f.c)localf.bVE.get(str1);
            boolean bool = localf.bVI.isScreenOn();
            ((f.c)localObject2).bVV = bool;
            ((f.c)localObject2).bVQ += 1;
            if (!bool)
              ((f.c)localObject2).bVR += 1;
            ((f.c)localObject2).bVT.put(localObject1, Boolean.TRUE);
            if (((f.c)localObject2).bVU < 0L)
              ((f.c)localObject2).bVU = System.currentTimeMillis();
            ((f.c)localObject2).bVS.cd(str2);
            localf.bVI.e(localf.bVJ, localf.bVF);
            return;
            localObject2 = (f.d)localf.bVD.get(localObject1);
          }
        }
      };
      this.bVj.j(paramIBinder);
    }
  }

  public final void onDetectIssue(com.tencent.matrix.c.b paramb)
  {
    this.bVk.onDetectIssue(paramb);
  }

  public final void start()
  {
    this.bVj.start();
    a(this.bUD);
    try
    {
      this.mIsStart = true;
      return;
    }
    finally
    {
    }
  }

  public final void stop()
  {
    try
    {
      this.mIsStart = false;
      e.b(this);
      b.b(this);
      this.bVj.quit();
      this.bVl = null;
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.b.c
 * JD-Core Version:    0.6.2
 */