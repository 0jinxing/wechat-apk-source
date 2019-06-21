package com.tencent.matrix.trace;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.matrix.trace.core.b.1;
import com.tencent.matrix.trace.core.b.2;
import com.tencent.matrix.trace.f.d;

public class a extends com.tencent.matrix.b.b
{
  private final com.tencent.matrix.trace.a.a bYu;
  public com.tencent.matrix.trace.f.b bYv;
  public d bYw;
  public com.tencent.matrix.trace.f.c bYx;
  private com.tencent.matrix.trace.f.a bYy;

  public a(com.tencent.matrix.trace.a.a parama)
  {
    this.bYu = parama;
  }

  public static AppMethodBeat zv()
  {
    return AppMethodBeat.getInstance();
  }

  public void destroy()
  {
    super.destroy();
  }

  public String getTag()
  {
    return "Trace";
  }

  public void init(Application paramApplication, com.tencent.matrix.b.c paramc)
  {
    super.init(paramApplication, paramc);
    com.tencent.matrix.d.c.i("Matrix.TracePlugin", "trace plugin init, trace config: %s", new Object[] { this.bYu.toString() });
    if (Build.VERSION.SDK_INT < 16)
    {
      com.tencent.matrix.d.c.e("Matrix.TracePlugin", "[FrameBeat] API is low Build.VERSION_CODES.JELLY_BEAN(16), TracePlugin is not supported", new Object[0]);
      unSupportPlugin();
    }
    while (true)
    {
      return;
      this.bYy = new com.tencent.matrix.trace.f.a(this.bYu);
      this.bYx = new com.tencent.matrix.trace.f.c(this.bYu);
      this.bYv = new com.tencent.matrix.trace.f.b(this.bYu);
      this.bYw = new d(this.bYu);
    }
  }

  public void onForeground(boolean paramBoolean)
  {
    super.onForeground(paramBoolean);
    if (!isSupported());
    while (true)
    {
      return;
      if (this.bYx != null)
        this.bYx.onForeground(paramBoolean);
    }
  }

  public void start()
  {
    super.start();
    if (!isSupported())
      com.tencent.matrix.d.c.w("Matrix.TracePlugin", "[start] Plugin is unSupported!", new Object[0]);
    while (true)
    {
      return;
      com.tencent.matrix.d.c.w("Matrix.TracePlugin", "start!", new Object[0]);
      Runnable local1 = new Runnable()
      {
        public final void run()
        {
          boolean bool1 = true;
          com.tencent.matrix.trace.core.b localb;
          boolean bool2;
          boolean bool3;
          label265: boolean bool4;
          label275: boolean bool5;
          if (!com.tencent.matrix.trace.core.b.zx().bZi)
          {
            localb = com.tencent.matrix.trace.core.b.zx();
            com.tencent.matrix.trace.a.a locala = a.a(a.this);
            if (Thread.currentThread() != Looper.getMainLooper().getThread())
              throw new AssertionError("must be init in main thread!");
            localb.bZi = true;
            localb.bYH = locala;
            localb.bsZ = Choreographer.getInstance();
            localb.bYZ = com.tencent.matrix.trace.core.b.reflectObject(localb.bsZ, "mLock");
            localb.bZa = ((Object[])com.tencent.matrix.trace.core.b.reflectObject(localb.bsZ, "mCallbackQueues"));
            localb.bZc = com.tencent.matrix.trace.core.b.d(localb.bZa[0], "addCallbackLocked", new Class[] { Long.TYPE, Object.class, Object.class });
            localb.bZd = com.tencent.matrix.trace.core.b.d(localb.bZa[1], "addCallbackLocked", new Class[] { Long.TYPE, Object.class, Object.class });
            localb.bZb = com.tencent.matrix.trace.core.b.d(localb.bZa[2], "addCallbackLocked", new Class[] { Long.TYPE, Object.class, Object.class });
            localb.bZe = ((Long)com.tencent.matrix.trace.core.b.reflectObject(localb.bsZ, "mFrameIntervalNanos")).longValue();
            com.tencent.matrix.trace.core.a.a(new b.1(localb));
            if (locala.bYE)
              localb.a(new b.2(localb));
            if (localb.bYZ != null)
              break label406;
            bool2 = true;
            if (localb.bZa != null)
              break label412;
            bool3 = true;
            if (localb.bZc != null)
              break label418;
            bool4 = true;
            if (localb.bZb != null)
              break label424;
            bool5 = true;
            label285: if (localb.bZd != null)
              break label430;
          }
          while (true)
          {
            com.tencent.matrix.d.c.i("Matrix.UIThreadMonitor", "[UIThreadMonitor] %s %s %s %s %s frameIntervalNanos:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool1), Long.valueOf(localb.bZe) });
            AppMethodBeat.getInstance().onStart();
            com.tencent.matrix.trace.core.b.zx().onStart();
            a.b(a.this).zE();
            a.c(a.this).zE();
            a.d(a.this).zE();
            a.e(a.this).zE();
            return;
            label406: bool2 = false;
            break;
            label412: bool3 = false;
            break label265;
            label418: bool4 = false;
            break label275;
            label424: bool5 = false;
            break label285;
            label430: bool1 = false;
          }
        }
      };
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        local1.run();
      }
      else
      {
        com.tencent.matrix.d.c.w("Matrix.TracePlugin", "start TracePlugin in Thread[%s] but not in mainThread!", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        com.tencent.matrix.d.b.zK().post(local1);
      }
    }
  }

  public void stop()
  {
    super.stop();
    if (!isSupported())
      com.tencent.matrix.d.c.w("Matrix.TracePlugin", "[stop] Plugin is unSupported!", new Object[0]);
    while (true)
    {
      return;
      com.tencent.matrix.d.c.w("Matrix.TracePlugin", "stop!", new Object[0]);
      Runnable local2 = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.getInstance().onStop();
          com.tencent.matrix.trace.core.b.zx().onStop();
          a.b(a.this).zF();
          a.c(a.this).zF();
          a.d(a.this).zF();
          a.e(a.this).zF();
        }
      };
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        local2.run();
      }
      else
      {
        com.tencent.matrix.d.c.w("Matrix.TracePlugin", "stop TracePlugin in Thread[%s] but not in mainThread!", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        com.tencent.matrix.d.b.zK().post(local2);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.trace.a
 * JD-Core Version:    0.6.2
 */