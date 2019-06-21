package com.tencent.matrix.resource;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Process;
import com.tencent.matrix.d.c;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class MatrixJobIntentService extends Service
{
  static final HashMap<ComponentName, h> Ef = new HashMap();
  static final Object sLock = new Object();
  boolean Ed = false;
  final ArrayList<d> Ee;
  h bWA;
  a bWB;
  b bWz;
  boolean mDestroyed = false;
  boolean mStopped = false;

  public MatrixJobIntentService()
  {
    if (Build.VERSION.SDK_INT >= 26);
    for (this.Ee = null; ; this.Ee = new ArrayList())
      return;
  }

  private static h a(Context paramContext, ComponentName paramComponentName, boolean paramBoolean, int paramInt)
  {
    h localh = (h)Ef.get(paramComponentName);
    Object localObject = localh;
    if (localh == null)
    {
      if (Build.VERSION.SDK_INT < 26)
        break label69;
      if (!paramBoolean)
        throw new IllegalArgumentException("Can't be here without a job id");
    }
    label69: for (paramContext = new g(paramContext, paramComponentName, paramInt); ; paramContext = new c(paramContext, paramComponentName))
    {
      Ef.put(paramComponentName, paramContext);
      localObject = paramContext;
      return localObject;
    }
  }

  private static void a(Context paramContext, ComponentName paramComponentName, int paramInt, Intent paramIntent)
  {
    if (paramIntent == null)
      throw new IllegalArgumentException("work must not be null");
    synchronized (sLock)
    {
      paramContext = a(paramContext, paramComponentName, true, paramInt);
      paramContext.fV(paramInt);
      paramContext.m(paramIntent);
      return;
    }
  }

  public static void a(Context paramContext, Class paramClass, int paramInt, Intent paramIntent)
  {
    a(paramContext, new ComponentName(paramContext, paramClass), paramInt, paramIntent);
  }

  @TargetApi(11)
  final void bb(boolean paramBoolean)
  {
    if (this.bWB == null)
    {
      this.bWB = new a();
      if ((this.bWA != null) && (paramBoolean))
        this.bWA.zl();
      this.bWB.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
  }

  protected abstract void l(Intent paramIntent);

  public IBinder onBind(Intent paramIntent)
  {
    if (this.bWz != null);
    for (paramIntent = this.bWz.zj(); ; paramIntent = null)
      return paramIntent;
  }

  public void onCreate()
  {
    super.onCreate();
    if (Build.VERSION.SDK_INT >= 26)
      this.bWz = new f(this);
    for (this.bWA = null; ; this.bWA = a(this, new ComponentName(this, getClass()), false, 0))
    {
      return;
      this.bWz = null;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.Ee != null);
    synchronized (this.Ee)
    {
      this.mDestroyed = true;
      this.bWA.zm();
      return;
    }
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (this.Ee != null)
      this.bWA.zk();
    while (true)
    {
      synchronized (this.Ee)
      {
        ArrayList localArrayList2 = this.Ee;
        d locald = new com/tencent/matrix/resource/MatrixJobIntentService$d;
        if (paramIntent != null)
        {
          locald.<init>(this, paramIntent, paramInt2);
          localArrayList2.add(locald);
          bb(true);
          paramInt1 = 3;
          return paramInt1;
        }
        paramIntent = new Intent();
      }
      paramInt1 = 2;
    }
  }

  final void zh()
  {
    if (this.Ee != null);
    synchronized (this.Ee)
    {
      this.bWB = null;
      if ((this.Ee != null) && (!this.Ee.isEmpty()))
        bb(false);
      while (this.mDestroyed)
        return;
      this.bWA.zm();
    }
  }

  final e zi()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.bWz != null)
      localObject2 = this.bWz.zi();
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (this.Ee != null)
      {
        synchronized (this.Ee)
        {
          if ((this.Ee != null) && (!this.Ee.isEmpty()))
            localObject2 = (e)this.Ee.remove(0);
        }
        Object localObject4 = localObject1;
      }
    }
  }

  final class a extends AsyncTask<Void, Void, Void>
  {
    a()
    {
    }
  }

  static abstract interface b
  {
    public abstract MatrixJobIntentService.e zi();

    public abstract IBinder zj();
  }

  static final class c extends MatrixJobIntentService.h
  {
    private final PowerManager.WakeLock bWD;
    private final PowerManager.WakeLock bWE;
    boolean bWF;
    boolean bWG;
    private final Context mContext;

    c(Context paramContext, ComponentName paramComponentName)
    {
      super();
      this.mContext = paramContext.getApplicationContext();
      if (this.mContext.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) == 0)
      {
        paramContext = (PowerManager)paramContext.getSystemService("power");
        this.bWD = paramContext.newWakeLock(1, paramComponentName.getClassName() + ":launch");
        this.bWD.setReferenceCounted(false);
        this.bWE = paramContext.newWakeLock(1, paramComponentName.getClassName() + ":run");
        this.bWE.setReferenceCounted(false);
      }
      while (true)
      {
        return;
        c.w("Matrix.JobIntentService", "it would be better to grant WAKE_LOCK permission to your app so that tinker can use WakeLock to keep system awake.", new Object[0]);
        this.bWE = null;
        this.bWD = null;
      }
    }

    final void m(Intent paramIntent)
    {
      paramIntent = new Intent(paramIntent);
      paramIntent.setComponent(this.mComponentName);
      try
      {
        if (this.mContext.startService(paramIntent) != null);
        try
        {
          if (!this.bWF)
          {
            this.bWF = true;
            if ((!this.bWG) && (this.bWD != null))
              this.bWD.acquire(60000L);
          }
          return;
        }
        finally
        {
        }
      }
      catch (Throwable paramIntent)
      {
        while (true)
          c.printErrStackTrace("Matrix.JobIntentService", paramIntent, "Exception occurred.", new Object[0]);
      }
    }

    public final void zk()
    {
      try
      {
        this.bWF = false;
        return;
      }
      finally
      {
      }
    }

    public final void zl()
    {
      try
      {
        if (!this.bWG)
        {
          this.bWG = true;
          if (this.bWE != null)
            this.bWE.acquire(600000L);
          if (this.bWD != null)
            this.bWD.release();
        }
        return;
      }
      finally
      {
      }
    }

    public final void zm()
    {
      try
      {
        if (this.bWG)
        {
          if ((this.bWF) && (this.bWD != null))
            this.bWD.acquire(60000L);
          this.bWG = false;
          if (this.bWE != null)
            this.bWE.release();
        }
        return;
      }
      finally
      {
      }
    }
  }

  final class d
    implements MatrixJobIntentService.e
  {
    final int bWH;
    final Intent mIntent;

    d(Intent paramInt, int arg3)
    {
      this.mIntent = paramInt;
      int i;
      this.bWH = i;
    }

    public final void complete()
    {
      MatrixJobIntentService.this.stopSelf(this.bWH);
    }

    public final Intent getIntent()
    {
      return this.mIntent;
    }
  }

  static abstract interface e
  {
    public abstract void complete();

    public abstract Intent getIntent();
  }

  static final class f extends JobServiceEngine
    implements MatrixJobIntentService.b
  {
    final MatrixJobIntentService bWI;
    JobParameters bWJ;
    final Object mLock = new Object();

    f(MatrixJobIntentService paramMatrixJobIntentService)
    {
      super();
      this.bWI = paramMatrixJobIntentService;
    }

    public final boolean onStartJob(JobParameters paramJobParameters)
    {
      synchronized (this.mLock)
      {
        this.bWJ = paramJobParameters;
        this.bWI.bb(false);
        return true;
      }
    }

    public final boolean onStopJob(JobParameters paramJobParameters)
    {
      paramJobParameters = this.bWI;
      if (paramJobParameters.bWB != null)
        paramJobParameters.bWB.cancel(paramJobParameters.Ed);
      paramJobParameters.mStopped = true;
      synchronized (this.mLock)
      {
        this.bWJ = null;
        return true;
      }
    }

    public final MatrixJobIntentService.e zi()
    {
      Object localObject1 = null;
      synchronized (this.mLock)
      {
        if (this.bWJ == null)
          ??? = localObject1;
        while (true)
        {
          return ???;
          try
          {
            JobWorkItem localJobWorkItem = this.bWJ.dequeueWork();
            ??? = localObject1;
            if (localJobWorkItem == null)
              continue;
            ??? = localObject1;
            if (localJobWorkItem.getIntent() == null)
              continue;
            localJobWorkItem.getIntent().setExtrasClassLoader(this.bWI.getClassLoader());
            ??? = new a(localJobWorkItem);
          }
          catch (Throwable localThrowable)
          {
            c.printErrStackTrace("JobServiceEngineImpl", localThrowable, "exception occurred.", new Object[0]);
            ??? = localObject1;
          }
        }
      }
    }

    public final IBinder zj()
    {
      return getBinder();
    }

    final class a
      implements MatrixJobIntentService.e
    {
      final JobWorkItem bWK;

      a(JobWorkItem arg2)
      {
        Object localObject;
        this.bWK = localObject;
      }

      public final void complete()
      {
        synchronized (MatrixJobIntentService.f.this.mLock)
        {
          if (MatrixJobIntentService.f.this.bWJ != null)
            MatrixJobIntentService.f.this.bWJ.completeWork(this.bWK);
          return;
        }
      }

      public final Intent getIntent()
      {
        return this.bWK.getIntent();
      }
    }
  }

  static final class g extends MatrixJobIntentService.h
  {
    private final JobInfo bWM;
    private final JobScheduler bWN;

    g(Context paramContext, ComponentName paramComponentName, int paramInt)
    {
      super();
      fV(paramInt);
      this.bWM = new JobInfo.Builder(paramInt, this.mComponentName).setOverrideDeadline(0L).build();
      this.bWN = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
    }

    final void m(Intent paramIntent)
    {
      this.bWN.enqueue(this.bWM, new JobWorkItem(paramIntent));
    }
  }

  static abstract class h
  {
    boolean bWO;
    int bWP;
    final ComponentName mComponentName;

    h(ComponentName paramComponentName)
    {
      this.mComponentName = paramComponentName;
    }

    final void fV(int paramInt)
    {
      if (!this.bWO)
      {
        this.bWO = true;
        this.bWP = paramInt;
      }
      while (this.bWP == paramInt)
        return;
      throw new IllegalArgumentException("Given job ID " + paramInt + " is different than previous " + this.bWP);
    }

    abstract void m(Intent paramIntent);

    public void zk()
    {
    }

    public void zl()
    {
    }

    public void zm()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.MatrixJobIntentService
 * JD-Core Version:    0.6.2
 */