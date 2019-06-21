package com.tencent.mm.d.a;

import android.os.Looper;
import com.eclipsesource.v8.V8ScriptException;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h
  implements d
{
  private final h.a chA;
  private d.a chz;
  private final Looper mLooper;

  h(Looper paramLooper)
  {
    AppMethodBeat.i(113805);
    this.chz = null;
    this.mLooper = paramLooper;
    this.chA = new h.a(this, paramLooper);
    AppMethodBeat.o(113805);
  }

  public final boolean Cs()
  {
    AppMethodBeat.i(113807);
    boolean bool;
    if (this.mLooper.getThread().getId() == Thread.currentThread().getId())
    {
      bool = true;
      AppMethodBeat.o(113807);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(113807);
    }
  }

  public final void a(d.a parama)
  {
    this.chz = parama;
  }

  final void c(V8ScriptException paramV8ScriptException)
  {
    AppMethodBeat.i(113811);
    if (this.chz != null)
      this.chz.b(paramV8ScriptException);
    AppMethodBeat.o(113811);
  }

  public final void g(Runnable paramRunnable, long paramLong)
  {
    AppMethodBeat.i(113809);
    this.chA.postDelayed(paramRunnable, paramLong);
    AppMethodBeat.o(113809);
  }

  public final void loop()
  {
    AppMethodBeat.i(113806);
    Looper.loop();
    AppMethodBeat.o(113806);
  }

  public final void m(Runnable paramRunnable)
  {
    AppMethodBeat.i(113808);
    if (paramRunnable == null)
      AppMethodBeat.o(113808);
    while (true)
    {
      return;
      if (Thread.currentThread().getId() == this.mLooper.getThread().getId())
      {
        try
        {
          paramRunnable.run();
          AppMethodBeat.o(113808);
        }
        catch (V8ScriptException paramRunnable)
        {
          c(paramRunnable);
          AppMethodBeat.o(113808);
        }
      }
      else
      {
        this.chA.post(paramRunnable);
        AppMethodBeat.o(113808);
      }
    }
  }

  public final void pause()
  {
  }

  public final void quit()
  {
    AppMethodBeat.i(113810);
    this.mLooper.quitSafely();
    AppMethodBeat.o(113810);
  }

  public final void resume()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.h
 * JD-Core Version:    0.6.2
 */