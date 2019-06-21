package com.tencent.matrix.resource.e;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Debug;
import android.os.HandlerThread;
import com.tencent.matrix.resource.CanaryWorkerService;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import com.tencent.mrs.b.a.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends com.tencent.matrix.c.a
{
  public final com.tencent.matrix.resource.b bXR;
  public final e bXS;
  final int bXT;
  private final d bXU;
  final c bXV;
  final c.a bXW;
  final ConcurrentLinkedQueue<DestroyedActivityInfo> bXX;
  final AtomicLong bXY;
  public final Application.ActivityLifecycleCallbacks bXZ = new a()
  {
    private int bYc = 0;
    private int bYd = 0;

    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
      b.this.bXY.incrementAndGet();
    }

    public final void onActivityDestroyed(Activity paramAnonymousActivity)
    {
      ??? = b.this;
      String str = paramAnonymousActivity.getClass().getName();
      if (((b)???).cg(str))
        com.tencent.matrix.d.c.d("Matrix.ActivityRefWatcher", "activity leak with name %s had published, just ignore", new Object[] { str });
      synchronized (b.this.bXX)
      {
        b.this.bXX.notifyAll();
        return;
        UUID localUUID = UUID.randomUUID();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("MATRIX_RESCANARY_REFKEY_").append(str).append('_').append(Long.toHexString(localUUID.getMostSignificantBits())).append(Long.toHexString(localUUID.getLeastSignificantBits()));
        paramAnonymousActivity = new DestroyedActivityInfo(localStringBuilder.toString(), paramAnonymousActivity, str, ((b)???).bXY.get());
        ((b)???).bXX.add(paramAnonymousActivity);
      }
    }

    public final void onActivityStarted(Activity paramAnonymousActivity)
    {
      if (this.bYc <= 0)
      {
        com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "we are in foreground, start watcher task.", new Object[0]);
        b.this.bXS.a(b.this.bYa, 0);
      }
      if (this.bYd < 0)
        this.bYd += 1;
      while (true)
      {
        return;
        this.bYc += 1;
      }
    }

    public final void onActivityStopped(Activity paramAnonymousActivity)
    {
      if (paramAnonymousActivity.isChangingConfigurations())
        this.bYd -= 1;
      while (true)
      {
        return;
        this.bYc -= 1;
        if (this.bYc <= 0)
        {
          com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "we are in background, stop watcher task.", new Object[0]);
          b.this.bXS.zu();
        }
      }
    }
  };
  public final e.a bYa = new e.a()
  {
    public final e.a.a zr()
    {
      if (b.this.bXX.isEmpty());
      try
      {
        label33: synchronized (b.this.bXX)
        {
          b.this.bXX.wait();
        }
        if ((Debug.isDebuggerConnected()) && (!b.this.bXR.bWQ.bWW))
        {
          com.tencent.matrix.d.c.w("Matrix.ActivityRefWatcher", "debugger is connected, to avoid fake result, detection was delayed.", new Object[0]);
          ??? = e.a.a.bYs;
        }
        while (true)
        {
          return ???;
          ??? = new WeakReference(new Object());
          com.tencent.matrix.d.c.v("Matrix.ActivityRefWatcher", "triggering gc...", new Object[0]);
          Runtime.getRuntime().gc();
          Runtime.getRuntime().runFinalization();
          com.tencent.matrix.d.c.v("Matrix.ActivityRefWatcher", "gc was triggered.", new Object[0]);
          if (((WeakReference)???).get() != null)
          {
            com.tencent.matrix.d.c.d("Matrix.ActivityRefWatcher", "system ignore our gc request, wait for next detection.", new Object[0]);
            ??? = e.a.a.bYs;
          }
          else
          {
            ??? = b.this.bXX.iterator();
            while (true)
              if (((Iterator)???).hasNext())
              {
                DestroyedActivityInfo localDestroyedActivityInfo = (DestroyedActivityInfo)((Iterator)???).next();
                if (b.this.cg(localDestroyedActivityInfo.mActivityName))
                {
                  com.tencent.matrix.d.c.v("Matrix.ActivityRefWatcher", "activity with key [%s] was already published.", new Object[] { localDestroyedActivityInfo.mActivityName });
                  ((Iterator)???).remove();
                  continue;
                }
                if (localDestroyedActivityInfo.mActivityRef.get() == null)
                {
                  com.tencent.matrix.d.c.v("Matrix.ActivityRefWatcher", "activity with key [%s] was already recycled.", new Object[] { localDestroyedActivityInfo.mKey });
                  ((Iterator)???).remove();
                  continue;
                }
                localDestroyedActivityInfo.mDetectedCount += 1;
                long l = b.this.bXY.get() - localDestroyedActivityInfo.mLastCreatedActivityCount;
                if ((localDestroyedActivityInfo.mDetectedCount < b.this.bXT) || ((l < 2L) && (!b.this.bXR.bWQ.bWW)))
                {
                  com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "activity with key [%s] should be recycled but actually still \nexists in %s times detection with %s created activities during destroy, wait for next detection to confirm.", new Object[] { localDestroyedActivityInfo.mKey, Integer.valueOf(localDestroyedActivityInfo.mDetectedCount), Long.valueOf(l) });
                  continue;
                }
                com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "activity with key [%s] was suspected to be a leaked instance.", new Object[] { localDestroyedActivityInfo.mKey });
                if (b.this.bXV != null)
                {
                  localObject3 = b.this.bXV.zs();
                  if (localObject3 != null)
                  {
                    b.this.cf(localDestroyedActivityInfo.mActivityName);
                    localObject3 = new com.tencent.matrix.resource.analyzer.model.a((File)localObject3, localDestroyedActivityInfo.mKey, localDestroyedActivityInfo.mActivityName);
                    b.this.bXW.a((com.tencent.matrix.resource.analyzer.model.a)localObject3);
                    ((Iterator)???).remove();
                    continue;
                  }
                  com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "heap dump for further analyzing activity with key [%s] was failed, just ignore.", new Object[] { localDestroyedActivityInfo.mKey });
                  ((Iterator)???).remove();
                  continue;
                }
                com.tencent.matrix.d.c.i("Matrix.ActivityRefWatcher", "lightweight mode, just report leaked activity name.", new Object[0]);
                b.this.cf(localDestroyedActivityInfo.mActivityName);
                if (b.this.bXR == null)
                  continue;
                Object localObject3 = new JSONObject();
                try
                {
                  ((JSONObject)localObject3).put("activity", localDestroyedActivityInfo.mActivityName);
                  b.this.bXR.onDetectIssue(new com.tencent.matrix.c.b((JSONObject)localObject3));
                }
                catch (JSONException localJSONException)
                {
                  while (true)
                    com.tencent.matrix.d.c.printErrStackTrace("Matrix.ActivityRefWatcher", localJSONException, "unexpected exception.", new Object[0]);
                }
              }
            ??? = e.a.a.bYs;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        break label33;
      }
    }
  };

  public b(Application paramApplication, com.tencent.matrix.resource.b paramb)
  {
    this(paramApplication, paramb, new a()
    {
      protected final c.a a(Context paramAnonymousContext, com.tencent.matrix.resource.b.a paramAnonymousa)
      {
        if (paramAnonymousa.bWV);
        for (paramAnonymousContext = super.a(paramAnonymousContext, paramAnonymousa); ; paramAnonymousContext = null)
          return paramAnonymousContext;
      }

      protected final c a(Context paramAnonymousContext, d paramAnonymousd)
      {
        if (b.this.bWQ.bWV);
        for (paramAnonymousContext = super.a(paramAnonymousContext, paramAnonymousd); ; paramAnonymousContext = null)
          return paramAnonymousContext;
      }

      protected final d aB(Context paramAnonymousContext)
      {
        if (b.this.bWQ.bWV);
        for (paramAnonymousContext = super.aB(paramAnonymousContext); ; paramAnonymousContext = null)
          return paramAnonymousContext;
      }
    });
  }

  private b(Application paramApplication, com.tencent.matrix.resource.b paramb, a parama)
  {
    super(paramApplication, paramb.getTag(), paramb);
    this.bXR = paramb;
    paramb = paramb.bWQ;
    HandlerThread localHandlerThread = com.tencent.matrix.d.b.zL();
    this.bXS = new e(paramb.bUG.get(a.a.AjJ.name(), com.tencent.matrix.resource.b.a.bWU), localHandlerThread);
    this.bXT = paramb.bUG.get(a.a.AjK.name(), 3);
    this.bXU = parama.aB(paramApplication);
    this.bXV = parama.a(paramApplication, this.bXU);
    this.bXW = parama.a(paramApplication, paramb);
    this.bXX = new ConcurrentLinkedQueue();
    this.bXY = new AtomicLong(0L);
  }

  private void zq()
  {
    this.bXS.zu();
    this.bXX.clear();
    this.bXY.set(0L);
  }

  public final void zp()
  {
    Application localApplication = this.bXR.getApplication();
    if (localApplication != null)
    {
      localApplication.unregisterActivityLifecycleCallbacks(this.bXZ);
      zq();
    }
  }

  public static class a
  {
    protected c.a a(final Context paramContext, com.tencent.matrix.resource.b.a parama)
    {
      return new c.a()
      {
        public final void a(com.tencent.matrix.resource.analyzer.model.a paramAnonymousa)
        {
          CanaryWorkerService.a(paramContext, paramAnonymousa);
        }
      };
    }

    protected c a(Context paramContext, d paramd)
    {
      return new c(paramContext, paramd);
    }

    protected d aB(Context paramContext)
    {
      return new d(paramContext);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.e.b
 * JD-Core Version:    0.6.2
 */