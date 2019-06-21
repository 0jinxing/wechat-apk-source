package com.tencent.mm.d.a;

import android.os.Process;
import com.eclipsesource.v8.MultiContextV8;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Locker;
import com.eclipsesource.v8.V8ScriptException;
import com.eclipsesource.v8.utils.MemoryManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class a
  implements c
{
  private static int chl = 0;
  private MultiContextV8 chm;
  private d chn;
  private CountDownLatch cho;
  private MemoryManager chp;
  private x chq;
  f chr;
  String chs;
  byte[] cht;
  private final Map<Integer, h> chu;
  private final ConcurrentLinkedQueue<Runnable> chv;
  private volatile int mTid = -1;

  a()
  {
    this(null, null);
  }

  a(final String paramString, byte[] paramArrayOfByte)
  {
    this.chs = paramString;
    this.cht = paramArrayOfByte;
    this.chu = new HashMap();
    this.chv = new ConcurrentLinkedQueue();
    paramString = new CountDownLatch(1);
    this.cho = new CountDownLatch(1);
    int i = chl;
    chl = i + 1;
    new Thread(String.format("JSRuntimeLooper#%d", new Object[] { Integer.valueOf(i) }))
    {
      public final void run()
      {
        AppMethodBeat.i(113796);
        a.a(a.this, Process.myTid());
        a.a(a.this, a.this.Cp());
        a.b(a.this).a(new a.2.1(this));
        paramString.countDown();
        a.c(a.this).countDown();
        long l = System.currentTimeMillis();
        ab.i("MicroMsg.AbstractJSRuntime", "prepareV8WhenThreadStart");
        a.a(a.this, a.this.Co());
        a.a(a.this, new x(a.a(a.this)));
        a.d(a.this);
        a.a(a.this, a.a(a.this).createMemoryManager());
        ab.i("MicroMsg.AbstractJSRuntime", "v8 init cost:%d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        V8Locker localV8Locker = a.a(a.this).getV8Locker();
        if (localV8Locker.hasLock())
        {
          ab.i("MicroMsg.AbstractJSRuntime", "has lock release");
          localV8Locker.release();
        }
        localV8Locker.acquire();
        a.b(a.this).loop();
        a.e(a.this);
        a.f(a.this).release();
        a.d(a.this);
        a.this.Cq();
        AppMethodBeat.o(113796);
      }
    }
    .start();
    try
    {
      paramString.await(5000L, TimeUnit.MILLISECONDS);
      return;
    }
    catch (InterruptedException paramString)
    {
      while (true)
        ab.i("MicroMsg.AbstractJSRuntime", "init latch.await InterruptedException:%s", new Object[] { paramString });
    }
  }

  private void Ct()
  {
    if ((this.chn == null) && (this.cho != null))
      ab.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper null");
    try
    {
      this.cho.await(30000L, TimeUnit.MILLISECONDS);
      ab.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread but looper assigned");
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        ab.i("MicroMsg.AbstractJSRuntime", "scheduleToJSThread latch.await InterruptedException:%s", new Object[] { localInterruptedException });
    }
  }

  private void a(V8ScriptException paramV8ScriptException)
  {
    h localh = (h)this.chu.get(Integer.valueOf(paramV8ScriptException.getContextTag()));
    if (localh != null)
      localh.C(paramV8ScriptException.getJSMessage(), paramV8ScriptException.getJSStackTrace());
    while (true)
    {
      return;
      ab.w("MicroMsg.AbstractJSRuntime", "publishJSException jsHandler null");
    }
  }

  abstract MultiContextV8 Co();

  abstract d Cp();

  abstract void Cq();

  public final f Cr()
  {
    if (this.chr == null)
      this.chr = new s();
    return this.chr;
  }

  public final boolean Cs()
  {
    return this.chn.Cs();
  }

  public final void a(int paramInt, h paramh)
  {
    this.chu.put(Integer.valueOf(paramInt), paramh);
  }

  public final void f(Runnable paramRunnable, long paramLong)
  {
    Ct();
    this.chn.g(paramRunnable, paramLong);
  }

  public final long getIsolatePtr()
  {
    return this.chm.getIsolatePtr();
  }

  public final l gm(final int paramInt)
  {
    return new l(this, Cr(), new l.a()
    {
      public final V8Context Cu()
      {
        AppMethodBeat.i(113794);
        if (a.a(a.this) == null)
        {
          localObject = new IllegalStateException("createContext mV8 not ready!");
          AppMethodBeat.o(113794);
          throw ((Throwable)localObject);
        }
        Object localObject = a.a(a.this).createContext(paramInt);
        AppMethodBeat.o(113794);
        return localObject;
      }
    });
  }

  public final void k(Runnable paramRunnable)
  {
    Ct();
    this.chn.m(paramRunnable);
  }

  public final void l(Runnable paramRunnable)
  {
    this.chv.add(paramRunnable);
  }

  public final void pause()
  {
    this.chn.pause();
  }

  public final void quit()
  {
    this.chn.quit();
    this.mTid = -1;
  }

  public final void resume()
  {
    this.chn.resume();
  }

  public final void setThreadPriority(int paramInt)
  {
    int i = this.mTid;
    if (i > 0);
    try
    {
      Process.setThreadPriority(i, paramInt);
      ab.d("MicroMsg.AbstractJSRuntime", "setThreadPriority priority=%d tid=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.AbstractJSRuntime", localException, "setThreadPriority priority=%d tid=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    }
  }

  public final void waitForDebugger(String paramString)
  {
    m localm = new m(this.chm, this);
    localm.cid.k(new m.1(localm, paramString));
    localm.cid.l(new m.2(localm));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.a
 * JD-Core Version:    0.6.2
 */