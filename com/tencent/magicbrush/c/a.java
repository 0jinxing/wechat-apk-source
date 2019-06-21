package com.tencent.magicbrush.c;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements Choreographer.FrameCallback
{
  private volatile MBRuntime bSg;
  private boolean bUt;
  private volatile boolean bUu;
  com.tencent.magicbrush.handler.a bUv;
  a.a bUw;
  Choreographer bsZ;

  public a(MBRuntime paramMBRuntime, com.tencent.magicbrush.handler.a parama)
  {
    this(paramMBRuntime, parama, (byte)0);
  }

  private a(MBRuntime paramMBRuntime, com.tencent.magicbrush.handler.a parama, byte paramByte)
  {
    AppMethodBeat.i(115992);
    this.bUt = false;
    this.bUu = false;
    this.bUw = new a.a(this, (byte)0);
    this.bSg = paramMBRuntime;
    this.bUv = parama;
    c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in JsThread...", new Object[0]);
    parama.f(new a.2(this));
    AppMethodBeat.o(115992);
  }

  public final void destroy()
  {
    try
    {
      AppMethodBeat.i(115995);
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "Destroying AnimationFrameHandler", new Object[0]);
      pause();
      this.bsZ = null;
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "Destroy AnimationFrameHandler, done.", new Object[0]);
      AppMethodBeat.o(115995);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void doFrame(long paramLong)
  {
    AppMethodBeat.i(115996);
    if ((this.bUt) && (this.bsZ != null))
    {
      if (!this.bUu)
        this.bsZ.postFrameCallback(this);
      this.bSg.notifyAnimationFrame(paramLong / 1000000.0D);
    }
    AppMethodBeat.o(115996);
  }

  public final void pause()
  {
    try
    {
      AppMethodBeat.i(115994);
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "Pausing AnimationFrameHandler", new Object[0]);
      this.bUt = false;
      if (this.bsZ != null)
        if (this.bUu)
        {
          this.bsZ.removeFrameCallback(this.bUw);
          AppMethodBeat.o(115994);
        }
      while (true)
      {
        return;
        this.bsZ.removeFrameCallback(this);
        AppMethodBeat.o(115994);
      }
    }
    finally
    {
    }
  }

  public final void resume()
  {
    try
    {
      AppMethodBeat.i(115993);
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "Resuming AnimationFrameHandler", new Object[0]);
      this.bUt = true;
      if (this.bsZ != null)
        if (this.bUu)
        {
          this.bsZ.removeFrameCallback(this.bUw);
          this.bsZ.postFrameCallback(this.bUw);
          AppMethodBeat.o(115993);
        }
      while (true)
      {
        return;
        this.bsZ.removeFrameCallback(this);
        this.bsZ.postFrameCallback(this);
        AppMethodBeat.o(115993);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c.a
 * JD-Core Version:    0.6.2
 */