package com.tencent.matrix.trace.f;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.tencent.matrix.d.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.core.AppMethodBeat.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends e
  implements Application.ActivityLifecycleCallbacks, com.tencent.matrix.trace.e.a
{
  private final com.tencent.matrix.trace.a.a bYH;
  private long can = 0L;
  private long cao = 0L;
  private int cap;
  private boolean caq;
  private boolean car;
  private Set<String> cas;
  private long cat;
  private long cau;

  public d(com.tencent.matrix.trace.a.a parama)
  {
    this.bYH = parama;
    this.car = parama.bYC;
    HashSet localHashSet;
    if (parama.bYG == null)
    {
      if (parama.bWX == null)
      {
        localHashSet = new HashSet(Arrays.asList(new String[] { parama.bYF }));
        parama.bYG = localHashSet;
      }
    }
    else
    {
      this.cas = parama.bYG;
      if (parama.bWX != null)
        break label149;
      i = 10000;
      label87: this.cat = i;
      if (parama.bWX != null)
        break label171;
    }
    label149: label171: for (int i = 4000; ; i = parama.bWX.get(com.tencent.mrs.b.a.a.Ajn.name(), 4000))
    {
      this.cau = i;
      return;
      localHashSet = new HashSet(Arrays.asList(parama.bWX.get(com.tencent.mrs.b.a.a.Ajc.name(), parama.bYF).split(";")));
      break;
      i = parama.bWX.get(com.tencent.mrs.b.a.a.Ajm.name(), 10000);
      break label87;
    }
  }

  public final void ch(String paramString)
  {
    int i;
    long l1;
    boolean bool;
    if (this.cao == 0L)
    {
      i = 1;
      if (i == 0)
        break label276;
      if (this.can == 0L)
        this.can = (SystemClock.uptimeMillis() - com.tencent.matrix.trace.c.a.zA());
      if (!this.caq)
        break label184;
      l1 = SystemClock.uptimeMillis() - com.tencent.matrix.trace.c.a.zA();
      this.cao = l1;
      bool = false;
    }
    while (true)
    {
      label58: long l2;
      long l3;
      long[] arrayOfLong;
      if (l1 > 0L)
      {
        l2 = com.tencent.matrix.trace.c.a.zz();
        l3 = this.can;
        c.i("Matrix.StartupTracer", "[report] applicationCost:%s firstScreenCost:%s allCost:%s isWarmStartUp:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l1), Boolean.valueOf(bool) });
        arrayOfLong = new long[0];
        if ((bool) || (l1 < this.cat))
          break label329;
        paramString = AppMethodBeat.getInstance().copyData(com.tencent.matrix.trace.c.a.bZo);
        com.tencent.matrix.trace.c.a.bZo.release();
      }
      while (true)
      {
        com.tencent.matrix.d.b.zM().post(new a(paramString, l2, l3, l1, bool, com.tencent.matrix.trace.c.a.bZp));
        return;
        i = 0;
        break;
        label184: if (this.cas.contains(paramString))
        {
          this.caq = true;
          bool = false;
          l1 = 0L;
          break label58;
        }
        if (this.cas.isEmpty())
        {
          c.i("Matrix.StartupTracer", "default care activity[%s]", new Object[] { paramString });
          l1 = this.can;
          this.cao = l1;
          bool = false;
          break label58;
        }
        c.w("Matrix.StartupTracer", "pass this activity[%s] in duration of startup!", new Object[] { paramString });
        bool = false;
        l1 = 0L;
        break label58;
        label276: if (this.cap > 1)
          bool = false;
        while (true)
        {
          if (!bool)
            break label368;
          l1 = SystemClock.uptimeMillis() - com.tencent.matrix.trace.c.a.zB();
          break;
          if (SystemClock.uptimeMillis() - com.tencent.matrix.trace.c.a.zB() > 5000L)
            bool = false;
          else
            bool = true;
        }
        label329: paramString = arrayOfLong;
        if (bool)
        {
          paramString = arrayOfLong;
          if (l1 >= this.cau)
          {
            paramString = AppMethodBeat.getInstance().copyData(com.tencent.matrix.trace.c.a.bZn);
            com.tencent.matrix.trace.c.a.bZn.release();
          }
        }
      }
      label368: l1 = 0L;
    }
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.cap += 1;
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    this.cap -= 1;
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
  }

  protected final void zC()
  {
    super.zC();
    c.i("Matrix.StartupTracer", "[onAlive] isStartupEnable:%s", new Object[] { Boolean.valueOf(this.car) });
    if (this.car)
    {
      AppMethodBeat.getInstance().addListener(this);
      com.tencent.matrix.a.yK().application.registerActivityLifecycleCallbacks(this);
    }
  }

  protected final void zD()
  {
    super.zD();
    if (this.car)
    {
      AppMethodBeat.getInstance().removeListener(this);
      com.tencent.matrix.a.yK().application.unregisterActivityLifecycleCallbacks(this);
    }
  }

  final class a
    implements Runnable
  {
    long[] bZG;
    long can;
    long cav;
    long caw;
    boolean cax;
    int scene;

    a(long[] paramLong1, long arg3, long arg5, long arg7, boolean paramInt, int arg10)
    {
      this.bZG = paramLong1;
      int i;
      this.scene = i;
      this.cav = ???;
      this.can = ???;
      Object localObject;
      this.caw = localObject;
      this.cax = paramInt;
    }

    public final void run()
    {
      Object localObject1 = new LinkedList();
      if (this.bZG.length > 0)
      {
        com.tencent.matrix.trace.g.a.a(this.bZG, (LinkedList)localObject1, false, -1L);
        com.tencent.matrix.trace.g.a.a((List)localObject1, new com.tencent.matrix.trace.g.a.a()
        {
          public final boolean c(long paramAnonymousLong, int paramAnonymousInt)
          {
            if (paramAnonymousLong < paramAnonymousInt * 5);
            for (boolean bool = true; ; bool = false)
              return bool;
          }

          public final void e(List<com.tencent.matrix.trace.d.a> paramAnonymousList, int paramAnonymousInt)
          {
            c.w("Matrix.StartupTracer", "[fallback] size:%s targetSize:%s stack:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(30), paramAnonymousList });
            paramAnonymousList = paramAnonymousList.listIterator(Math.min(paramAnonymousInt, 30));
            while (paramAnonymousList.hasNext())
            {
              paramAnonymousList.next();
              paramAnonymousList.remove();
            }
          }
        });
      }
      Object localObject2 = new StringBuilder();
      Object localObject3 = new StringBuilder();
      long l1 = Math.max(this.caw, com.tencent.matrix.trace.g.a.a((LinkedList)localObject1, (StringBuilder)localObject2, (StringBuilder)localObject3));
      localObject1 = com.tencent.matrix.trace.g.a.a((List)localObject1, l1);
      if (((this.caw > d.a(d.this)) && (!this.cax)) || ((this.caw > d.b(d.this)) && (this.cax)))
        c.w("Matrix.StartupTracer", "stackKey:%s \n%s", new Object[] { localObject1, ((StringBuilder)localObject3).toString() });
      long l2 = this.cav;
      long l3 = this.can;
      boolean bool = this.cax;
      int i = this.scene;
      localObject3 = (com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class);
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject = com.tencent.matrix.d.a.a(localJSONObject, com.tencent.matrix.a.yK().application);
        localJSONObject.put("application_create", l2);
        localJSONObject.put("application_create_scene", i);
        localJSONObject.put("first_activity_create", l3);
        localJSONObject.put("startup_duration", l1);
        localJSONObject.put("is_warm_start_up", bool);
        com.tencent.matrix.c.b localb = new com/tencent/matrix/c/b;
        localb.<init>();
        localb.tag = "Trace_StartUp";
        localb.bWv = localJSONObject;
        ((com.tencent.matrix.trace.a)localObject3).onDetectIssue(localb);
        if ((l1 <= d.a(d.this)) || (bool))
          if ((l1 <= d.b(d.this)) || (!bool))
            break label427;
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject = com.tencent.matrix.d.a.a(localJSONObject, com.tencent.matrix.a.yK().application);
          localJSONObject.put("detail", com.tencent.matrix.trace.b.a.a.bYK);
          localJSONObject.put("cost", l1);
          localJSONObject.put("stack", ((StringBuilder)localObject2).toString());
          localJSONObject.put("stackKey", localObject1);
          if (bool);
          for (i = 2; ; i = 1)
          {
            localJSONObject.put("subType", i);
            localObject2 = new com/tencent/matrix/c/b;
            ((com.tencent.matrix.c.b)localObject2).<init>();
            ((com.tencent.matrix.c.b)localObject2).tag = "Trace_EvilMethod";
            ((com.tencent.matrix.c.b)localObject2).bWv = localJSONObject;
            ((com.tencent.matrix.trace.a)localObject3).onDetectIssue((com.tencent.matrix.c.b)localObject2);
            label427: return;
            localJSONException2 = localJSONException2;
            c.e("Matrix.StartupTracer", "[JSONException for StartUpReportTask error: %s", new Object[] { localJSONException2 });
            break;
          }
        }
        catch (JSONException localJSONException1)
        {
          while (true)
            c.e("Matrix.StartupTracer", "[JSONException error: %s", new Object[] { localJSONException1 });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.f.d
 * JD-Core Version:    0.6.2
 */