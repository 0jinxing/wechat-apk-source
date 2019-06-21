package com.tencent.magicbrush.c;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a
  implements Choreographer.FrameCallback, Runnable
{
  private a$a(a parama)
  {
  }

  public final void doFrame(long paramLong)
  {
    AppMethodBeat.i(115990);
    this.bUx.bUv.f(this);
    AppMethodBeat.o(115990);
  }

  public final void run()
  {
    AppMethodBeat.i(115991);
    this.bUx.bsZ.postFrameCallback(this.bUx.bUw);
    this.bUx.doFrame(System.nanoTime());
    AppMethodBeat.o(115991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c.a.a
 * JD-Core Version:    0.6.2
 */