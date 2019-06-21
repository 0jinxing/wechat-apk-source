package com.tencent.magicbrush.c;

import android.view.Choreographer;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115988);
    synchronized (this.bUx)
    {
      a.a(this.bUx, Choreographer.getInstance());
      a.a(this.bUx);
      if (a.b(this.bUx))
      {
        c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in MainThread...[start in resume mode]", new Object[0]);
        a.d(this.bUx).postFrameCallback(a.c(this.bUx));
      }
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in MainThread...[done]", new Object[0]);
      AppMethodBeat.o(115988);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c.a.1
 * JD-Core Version:    0.6.2
 */