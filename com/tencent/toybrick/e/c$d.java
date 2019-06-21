package com.tencent.toybrick.e;

import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.c.f;
import com.tencent.toybrick.g.b;
import java.lang.ref.WeakReference;

public final class c$d
  implements Runnable
{
  private WeakReference<b> AHl;
  private WeakReference<f> AHn;
  private c.b AHo;
  private Object object;

  public c$d(c paramc, f paramf, b paramb, c.b paramb1)
  {
    AppMethodBeat.i(113238);
    this.AHn = new WeakReference(paramf);
    this.AHl = new WeakReference(paramb);
    this.AHo = paramb1;
    AppMethodBeat.o(113238);
  }

  public final void run()
  {
    AppMethodBeat.i(113239);
    b localb = (b)this.AHl.get();
    Object localObject = (f)this.AHn.get();
    if ((localb != null) && (localObject != null))
    {
      this.object = localb.dSA();
      localObject = new Message();
      ((Message)localObject).what = 3;
      ((Message)localObject).obj = this;
      c.a(this.AHi).sendMessage((Message)localObject);
    }
    AppMethodBeat.o(113239);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.c.d
 * JD-Core Version:    0.6.2
 */