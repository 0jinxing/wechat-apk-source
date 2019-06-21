package com.tencent.magicbrush.c;

import android.os.Looper;
import android.view.Choreographer;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2
  implements Runnable
{
  a$2(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(115989);
    if (Looper.myLooper() == null)
    {
      c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in JsThread...[Looper missing]", new Object[0]);
      a.e(this.bUx);
      AppMethodBeat.o(115989);
    }
    while (true)
    {
      return;
      synchronized (this.bUx)
      {
        a.a(this.bUx, Choreographer.getInstance());
        if (a.b(this.bUx))
        {
          c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in JsThread...[start in resume mode]", new Object[0]);
          a.d(this.bUx).postFrameCallback(this.bUx);
        }
        c.c.i("MicroMsg.MagicBrush.AnimationFrameHandler", "MBRuntime trying to use Choreographer in JsThread...[done]", new Object[0]);
        AppMethodBeat.o(115989);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.c.a.2
 * JD-Core Version:    0.6.2
 */