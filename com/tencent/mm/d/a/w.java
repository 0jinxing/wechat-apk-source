package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8ScriptException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.ConcurrentLinkedQueue;

class w
  implements d
{
  private static final ThreadLocal<w> chH;
  private final Thread ciK;
  private final ConcurrentLinkedQueue<Runnable> ciL;
  private boolean ciM;
  private d.a ciN;
  private boolean mPaused;

  static
  {
    AppMethodBeat.i(113918);
    chH = new ThreadLocal();
    AppMethodBeat.o(113918);
  }

  w()
  {
    AppMethodBeat.i(113906);
    this.ciK = Thread.currentThread();
    this.ciL = new ConcurrentLinkedQueue();
    AppMethodBeat.o(113906);
  }

  public static w CE()
  {
    AppMethodBeat.i(113905);
    if (chH.get() != null)
    {
      localObject = new RuntimeException("Only one Looper may be created per thread");
      AppMethodBeat.o(113905);
      throw ((Throwable)localObject);
    }
    Object localObject = new w();
    chH.set(localObject);
    AppMethodBeat.o(113905);
    return localObject;
  }

  private boolean isPaused()
  {
    try
    {
      boolean bool = this.mPaused;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void n(Runnable paramRunnable)
  {
    AppMethodBeat.i(113917);
    try
    {
      paramRunnable.run();
      AppMethodBeat.o(113917);
      return;
    }
    catch (V8ScriptException paramRunnable)
    {
      while (true)
      {
        if (this.ciN != null)
          this.ciN.b(paramRunnable);
        AppMethodBeat.o(113917);
      }
    }
    catch (UndeclaredThrowableException paramRunnable)
    {
      while (true)
      {
        ab.e("MicroMsg.V8JSRuntimeLooper", "runTask UndeclaredThrowableException: %s %s", new Object[] { paramRunnable, paramRunnable.getCause() });
        AppMethodBeat.o(113917);
      }
    }
  }

  protected void CA()
  {
  }

  public final boolean Cs()
  {
    AppMethodBeat.i(113908);
    boolean bool;
    if (Thread.currentThread().getId() == this.ciK.getId())
    {
      bool = true;
      AppMethodBeat.o(113908);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113908);
    }
  }

  protected boolean Cx()
  {
    AppMethodBeat.i(113914);
    boolean bool = this.ciL.isEmpty();
    AppMethodBeat.o(113914);
    return bool;
  }

  protected void Cy()
  {
    AppMethodBeat.i(113916);
    while (true)
    {
      Runnable localRunnable = (Runnable)this.ciL.poll();
      if (localRunnable == null)
        break;
      n(localRunnable);
    }
    AppMethodBeat.o(113916);
  }

  protected void Cz()
  {
    AppMethodBeat.i(113915);
    ab.i("MicroMsg.V8JSRuntimeLooper", "loop end");
    AppMethodBeat.o(113915);
  }

  public final void a(d.a parama)
  {
    this.ciN = parama;
  }

  // ERROR //
  public final void g(Runnable paramRunnable, long paramLong)
  {
    // Byte code:
    //   0: ldc 142
    //   2: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: ifnonnull +9 -> 15
    //   9: ldc 142
    //   11: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   14: return
    //   15: lload_2
    //   16: lconst_0
    //   17: lcmp
    //   18: ifeq +20 -> 38
    //   21: new 144	java/lang/IllegalStateException
    //   24: dup
    //   25: ldc 146
    //   27: invokespecial 147	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   30: astore_1
    //   31: ldc 142
    //   33: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aload_1
    //   37: athrow
    //   38: aload_0
    //   39: monitorenter
    //   40: aload_0
    //   41: getfield 149	com/tencent/mm/d/a/w:ciM	Z
    //   44: ifeq +20 -> 64
    //   47: ldc 99
    //   49: ldc 151
    //   51: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_0
    //   55: monitorexit
    //   56: ldc 142
    //   58: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: goto -47 -> 14
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_0
    //   67: getfield 54	com/tencent/mm/d/a/w:ciL	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   70: aload_1
    //   71: invokevirtual 155	java/util/concurrent/ConcurrentLinkedQueue:offer	(Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload_0
    //   76: getfield 54	com/tencent/mm/d/a/w:ciL	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   79: astore 4
    //   81: aload 4
    //   83: monitorenter
    //   84: aload_0
    //   85: getfield 54	com/tencent/mm/d/a/w:ciL	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   88: invokevirtual 158	java/lang/Object:notify	()V
    //   91: aload 4
    //   93: monitorexit
    //   94: aload_0
    //   95: invokevirtual 160	com/tencent/mm/d/a/w:CA	()V
    //   98: ldc 142
    //   100: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -89 -> 14
    //   106: astore_1
    //   107: aload_0
    //   108: monitorexit
    //   109: ldc 142
    //   111: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aload_1
    //   115: athrow
    //   116: astore_1
    //   117: aload 4
    //   119: monitorexit
    //   120: ldc 142
    //   122: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aload_1
    //   126: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   40	56	106	finally
    //   64	66	106	finally
    //   107	109	106	finally
    //   84	94	116	finally
    //   117	120	116	finally
  }

  public final void loop()
  {
    AppMethodBeat.i(113907);
    ab.i("MicroMsg.V8JSRuntimeLooper", "loop start");
    while (!this.ciK.isInterrupted())
      synchronized (this.ciL)
      {
        while (true)
          if (!isPaused())
          {
            boolean bool = Cx();
            if (!bool);
          }
          else
          {
            try
            {
              this.ciL.wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              ab.i("MicroMsg.V8JSRuntimeLooper", "wait interrupted ; loop end");
              this.ciK.interrupt();
            }
          }
        Cy();
      }
    try
    {
      this.ciM = true;
      Cz();
      AppMethodBeat.o(113907);
      return;
    }
    finally
    {
      AppMethodBeat.o(113907);
    }
  }

  public final void m(Runnable arg1)
  {
    AppMethodBeat.i(113909);
    if (??? == null)
    {
      AppMethodBeat.o(113909);
      return;
    }
    while (true)
    {
      try
      {
        if (this.ciM)
        {
          ab.i("MicroMsg.V8JSRuntimeLooper", "schedule but looper end");
          AppMethodBeat.o(113909);
          break;
        }
        if (Thread.currentThread().getId() == this.ciK.getId())
        {
          n(???);
          CA();
          AppMethodBeat.o(113909);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(113909);
      }
      this.ciL.offer(???);
      synchronized (this.ciL)
      {
        this.ciL.notify();
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(113911);
    ab.i("MicroMsg.V8JSRuntimeLooper", "pause");
    try
    {
      this.mPaused = true;
      return;
    }
    finally
    {
      AppMethodBeat.o(113911);
    }
  }

  public final void quit()
  {
    AppMethodBeat.i(113913);
    ab.i("MicroMsg.V8JSRuntimeLooper", "quit");
    this.ciK.interrupt();
    AppMethodBeat.o(113913);
  }

  public final void resume()
  {
    AppMethodBeat.i(113912);
    ab.i("MicroMsg.V8JSRuntimeLooper", "resume");
    this.mPaused = false;
    synchronized (this.ciL)
    {
      this.ciL.notify();
      AppMethodBeat.o(113912);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.w
 * JD-Core Version:    0.6.2
 */